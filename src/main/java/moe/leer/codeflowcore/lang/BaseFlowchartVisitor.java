package moe.leer.codeflowcore.lang;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.Compass;
import moe.leer.codeflowcore.FlowchartConfig;
import moe.leer.codeflowcore.graph.*;
import moe.leer.codeflowcore.lang.parser.CodeFlowBaseVisitor;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.util.ANTLRUtil;
import moe.leer.codeflowcore.util.ParseUtil;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static moe.leer.codeflowcore.exception.TodoException.TODO;
import static moe.leer.codeflowcore.graph.Flowchart.trueLabel;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.compassLink;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.to;
import static moe.leer.codeflowcore.util.SomeUtil.*;

/**
 * @author leer
 * Created at 12/17/19 1:57 PM
 */
public class BaseFlowchartVisitor extends CodeFlowBaseVisitor<FlowchartFragment> {
  private static Logger logger = LoggerFactory.getLogger(FlowchartFragment.class);

  // node -> function names
  public Map<FlowchartNode, List<String>> functionCallNodes = new HashMap<>(8);
  // function name -> graph, subFragments should become a field of FlowchartFragment,
  // but only root fragment may have sub fragments, so here is ok
  public Map<String, FlowchartFragment> subFragments = new HashMap<>(8);

  // fixme remove useless
  // label name -> block
  public Map<String, FlowchartFragment> labeledFragments = new HashMap<>(8);

  public boolean isExpressionAFunctionCall(CodeFlowParser.ExpressionContext expressionContext) {
    return grepFunctionCallContext(expressionContext) != null;
  }

  protected CodeFlowParser.FunctionCallContext grepFunctionCallContext(CodeFlowParser.ExpressionContext expressionContext) {
    CodeFlowParser.FunctionCallContext rst = null;
    if (expressionContext == null) return null;
    if (expressionContext.expression() != null) {
      for (CodeFlowParser.ExpressionContext exp : expressionContext.expression()) {
        rst = grepFunctionCallContext(exp);
        if (rst != null) return rst;
      }
    }
    return expressionContext.functionCall();
  }

  @Override
  public FlowchartFragment visitProgram(CodeFlowParser.ProgramContext ctx) {
    return super.visitProgram(ctx);
  }

  public FlowchartFragment linkStatements(ParserRuleContext ctx) {
    if (ctx instanceof CodeFlowParser.BlockStatementsContext || ctx instanceof CodeFlowParser.TopLevelStmtsContext) {
      List<CodeFlowParser.BlockStatementContext> blockStatements;
      if (ctx instanceof CodeFlowParser.BlockStatementsContext) {
        blockStatements = ((CodeFlowParser.BlockStatementsContext) ctx).blockStatement();
      } else {
        blockStatements = ((CodeFlowParser.TopLevelStmtsContext) ctx).blockStatement();
      }
      FlowchartFragment preFragment = null, firstFragment = null;
      Set<BreakFlowchartNode> breakNodes = new HashSet<>(4);
      Set<ContinueFlowchartNode> continueNodes = new HashSet<>(4);
      for (CodeFlowParser.BlockStatementContext context : blockStatements) {
        FlowchartFragment fragment = visitBlockStatement(context);
        logger.debug("fragment: {}", fragment);

        // DO NOT modify origin fragment
        fragment = fragment.clone();

        if (firstFragment == null) {
          firstFragment = fragment;
        }
        if (fragment.isMatchType(FlowchartFragmentType.BREAK)) {
          breakNodes.addAll(fragment.getBreakNodes());
        }
        if (fragment.isMatchType(FlowchartFragmentType.CONTINUE)) {
          continueNodes.addAll(fragment.getContinueNodes());
        }
        if (preFragment != null) {
          firstFragment.addTypes(preFragment.getTypes());
          // merge current fragment to previous fragment while both are a single statement
          if (FlowchartConfig.mergeSequences &&
              preFragment.isMatchAllTypes(FlowchartFragmentType.SEQUENCE) &&
              fragment.isMatchAllTypes(FlowchartFragmentType.SEQUENCE) &&
              preFragment.getStops().size() == 1 && fragment.getStops().size() == 1) {
            Label label = Label.of(preFragment.getStart().getLabelString() + "\n" + fragment.getStart().getLabelString());
            preFragment.getStart().add(label);
          } else {
            preFragment.link(fragment);
            preFragment = fragment;
          }
        } else {
          preFragment = fragment;
        }
      }
      if (firstFragment != null) {
        firstFragment.addTypes(preFragment.getTypes());
        firstFragment.setStops(preFragment.getStops());
        firstFragment.addBreakNodes(breakNodes);
        firstFragment.addContinueNodes(continueNodes);
        if (!firstFragment.getBreakNodes().isEmpty()) {
          firstFragment.addType(FlowchartFragmentType.BREAK);
        }
        if (!firstFragment.getContinueNodes().isEmpty()) {
          firstFragment.addType(FlowchartFragmentType.CONTINUE);
        }
      }
      return firstFragment;
    }
    return null;
  }

  @Override
  public FlowchartFragment visitTopLevelStmts(CodeFlowParser.TopLevelStmtsContext ctx) {
    return linkStatements(ctx);
  }

  /**
   * Link all statement FlowchartFragments
   */
  @Override
  public FlowchartFragment visitBlockStatements(CodeFlowParser.BlockStatementsContext ctx) {
    return linkStatements(ctx);
  }

  @Override
  public FlowchartFragment visitBlockStatement(CodeFlowParser.BlockStatementContext ctx) {
    return super.visitBlockStatement(ctx);
//    return visitStatement(ctx.statement());
  }

  /**
   * There're 16 cases of statement rule
   */
  @Override
  public FlowchartFragment visitStatement(CodeFlowParser.StatementContext ctx) {
    logger.info("visitStatement");
    String single = ANTLRUtil.getTextFromInputStream(ctx);
    if (ctx.block() != null) {
      return visitBlockStatements(ctx.block().blockStatements());
      // same as
      // return super.visitStatement(ctx);
    } else if (ctx.ifBlock() != null) {
      return visitIfBlock(ctx.ifBlock());
    } else if (ctx.switchBlock() != null) {
      return visitSwitchBlock(ctx.switchBlock());
    } else if (ctx.forBlock() != null) {
      return visitForBlock(ctx.forBlock());
    } else if (ctx.whileBlock() != null) {
      return visitWhileBlock(ctx.whileBlock());
    } else if (ctx.doWhileBlock() != null) {
      return visitDoWhileBlock(ctx.doWhileBlock());
    } else if (ctx.returnToken != null || ctx.throwToken != null) {
      // function call in return expression
      // todo convert tail recursion to loop
      if (isExpressionAFunctionCall(ctx.expression())) {
        FlowchartNode call = Flowchart.functionCallNode(ctx, FlowchartNodeType.END);
        call.setAbrupt(true);
        CodeFlowParser.FunctionCallContext functionCallContext = grepFunctionCallContext(ctx.expression());
        functionCallNodes.put(call, asArrayList(ParseUtil.getFunctionFullName2(functionCallContext)));
        return FlowchartFragment.create(EnumSet.of(FlowchartFragmentType.END, FlowchartFragmentType.FUNCTION_CALL), call, call);
      } else {
        return FlowchartFragment.create(FlowchartFragmentType.END, Flowchart.endNode(single).setAbrupt(true));
      }
    } else if (ctx.breakToken != null) {
      String where = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : "";
      FlowchartNode breakNode = Flowchart.breakNode(where);
      FlowchartFragment breakFragment = FlowchartFragment.create(FlowchartFragmentType.BREAK, breakNode, emptyHashList());
      breakFragment.addBreakNode((BreakFlowchartNode) breakNode);
      return breakFragment;
    } else if (ctx.continueToken != null) {
      String where = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : "";
      FlowchartNode continueNode = Flowchart.continueNode(where);
      FlowchartFragment continueFragment = FlowchartFragment.create(FlowchartFragmentType.CONTINUE, continueNode, emptyHashList());
      continueFragment.addContinueNode((ContinueFlowchartNode) continueNode);
      return continueFragment;
    } else if (ctx.emptyStmt != null) {
      // TODO create a invisible node
      throw TODO("empty statement");
    } else if (ctx.labelToken != null) {
      String label = ctx.labelToken.getText();
      FlowchartFragment labeledBlock = visitStatement(ctx.statement());
      labeledFragments.put(label, labeledBlock);
      return labeledBlock;
    } else if (ctx.expressionStmt != null) {
      return visitExpression(ctx.expressionStmt);
    } else { // variableDeclarators ,variableAssign
      if (ctx.variableDeclarators() != null) {
        for (CodeFlowParser.VariableDeclaratorContext varCtx : ctx.variableDeclarators().variableDeclarator()) {
          if (varCtx.variableInitializer() != null && varCtx.variableInitializer().expression() != null) {
            if (isExpressionAFunctionCall(varCtx.variableInitializer().expression())) {
              CodeFlowParser.FunctionCallContext functionCallContext = grepFunctionCallContext(varCtx.variableInitializer().expression());
              FlowchartNode call = Flowchart.functionCallNode(ctx, FlowchartNodeType.PROCESS);
              functionCallNodes.put(call, asArrayList(ParseUtil.getFunctionFullName2(functionCallContext)));
              return FlowchartFragment.create(FlowchartFragmentType.FUNCTION_CALL, call, call);
            }
          }
        }
      } else if (ctx.variableAssign() != null &&
          isExpressionAFunctionCall(ctx.variableAssign().variableInitializer().expression())) {
        CodeFlowParser.VariableAssignContext varCtx = ctx.variableAssign();
        CodeFlowParser.FunctionCallContext functionCallContext = grepFunctionCallContext(varCtx.variableInitializer().expression());
        FlowchartNode call = Flowchart.functionCallNode(ctx, FlowchartNodeType.PROCESS);
        functionCallNodes.put(call, asArrayList(ParseUtil.getFunctionFullName2(functionCallContext)));
        return FlowchartFragment.create(FlowchartFragmentType.FUNCTION_CALL, call, call);
      }
      return FlowchartFragment.singleProcess(Flowchart.processNode(single));
    }
  }

  /**
   * Support one level function call, not support like "a.get().add()", it will be treated as a single function call a.get.[add()]
   */
  @Override
  public FlowchartFragment visitExpression(CodeFlowParser.ExpressionContext ctx) {
    if (ctx.functionCall() != null) {
      FlowchartNode call = Flowchart.functionCallNode(ctx, FlowchartNodeType.PROCESS);
      CodeFlowParser.FunctionCallContext functionCallContext = grepFunctionCallContext(ctx);
      functionCallNodes.put(call, asArrayList(ParseUtil.getFunctionFullName2(functionCallContext)));
      return FlowchartFragment.create(FlowchartFragmentType.FUNCTION_CALL, call, call);
    } else if (ctx.QUESTION() != null && ctx.COLON() != null) { //Ternary operator
      throw TODO("Ternary operator");
    } else {
      return FlowchartFragment.singleProcess(Flowchart.processNode(ctx));
    }
  }

  @Override
  public FlowchartFragment visitIfBlock(CodeFlowParser.IfBlockContext ctx) {
    logger.info("visited ifBlock");
    FlowchartNode decisionNode = Flowchart.decisionNode(ctx.parExpression().expression());

    CodeFlowParser.StatementContext statementContext = ctx.statement(0);
    // if branch, recursively support nesting other blocks
    FlowchartFragment firstFragment;
    // if block
    if (statementContext.block() != null && statementContext.block().blockStatements() != null) {
      firstFragment = visitBlockStatements(statementContext.block().blockStatements());
    } else { // single if statement without braces
      firstFragment = visitStatement(statementContext);
    }
    // link decision node as start
    if (firstFragment != null) {
      firstFragment.linkDecisionNodeAsTrueStart(decisionNode);
      firstFragment.addType(FlowchartFragmentType.IF);
      // fixme decision is also a end node
      if (decisionNode.isLinkable()) {
        firstFragment.addStopNode(decisionNode);
      }
    } else { // TODO optimize empty if block, remove decision node?
      firstFragment = FlowchartFragment.create(FlowchartFragmentType.IF, decisionNode, decisionNode);
    }
    if (isExpressionAFunctionCall(ctx.parExpression().expression())) {
      firstFragment.addType(FlowchartFragmentType.FUNCTION_CALL);
    }

    // else branch
    if (ctx.ELSE() != null && ctx.statement().size() == 2) {
      CodeFlowParser.StatementContext elseBranch = ctx.statement(1);
      // else if
      if (ctx.statement(1).ifBlock() != null) {
        FlowchartFragment elseIf = visitIfBlock(elseBranch.ifBlock());
        // decision node has pointed to else if branch, remove from stops
        decisionNode.addFalseConditionLink(elseIf.getStart());
        firstFragment.removeStopNode(decisionNode);

        firstFragment.addStopNodes(elseIf.getStops());
        firstFragment.addBreakNodes(elseIf.getBreakNodes());
        firstFragment.addContinueNodes(elseIf.getContinueNodes());
      } else { // else
        FlowchartFragment elseBlock;
        if (elseBranch.block() != null) {
          elseBlock = visitBlockStatements(elseBranch.block().blockStatements());
        } else {
          elseBlock = visitStatement(elseBranch);
        }

        decisionNode.addFalseConditionLink(elseBlock.getStart());
        firstFragment.removeStopNode(decisionNode);

        firstFragment.addStopNodes(elseBlock.getStops());
        firstFragment.addBreakNodes(elseBlock.getBreakNodes());
        firstFragment.addContinueNodes(elseBlock.getContinueNodes());
      }
    }
    if (!firstFragment.getBreakNodes().isEmpty()) {
      firstFragment.addType(FlowchartFragmentType.BREAK);
    }
    if (!firstFragment.getContinueNodes().isEmpty()) {
      firstFragment.addType(FlowchartFragmentType.CONTINUE);
    }
    logger.debug("ifFragment: {}", firstFragment);
    return firstFragment;
  }

  private String switchConditionPrefix;

  @Override
  public FlowchartFragment visitSwitchBlock(CodeFlowParser.SwitchBlockContext ctx) {
    switchConditionPrefix = ANTLRUtil.getTextFromInputStream(ctx.parExpression().expression());
    if (ctx.switchCaseGroup() != null) {
      // link all switch case group
      FlowchartFragment preFragment = null, firstFragment = null;
      Set<FlowchartNode> breakNodes = new HashSet<>(4);
      for (CodeFlowParser.SwitchCaseGroupContext switchGroupContext : ctx.switchCaseGroup()) {
        FlowchartFragment fragment = visitSwitchCaseGroup(switchGroupContext);
        if (firstFragment == null) {
          firstFragment = fragment;
        }
        if (preFragment != null && !preFragment.isMatchType(FlowchartFragmentType.END)) {
          // fallthrough this case
          if (!preFragment.isMatchType(FlowchartFragmentType.BREAK)) {
            for (FlowchartNode stopNode : preFragment.getStops()) {
              // every caseFragment has two stops: the false condition and the last statement
              if (stopNode.getType() != FlowchartNodeType.DECISION && fragment.getStart().getTrueLink() != null) {
                // link to next true condition
                stopNode.addLink(fragment.getStart().getTrueLink().to());
                break;
              }
            }
          }
          // link other stop nodes
          preFragment.link(fragment);
        }
        if (fragment.isMatchType(FlowchartFragmentType.BREAK)) {
          breakNodes.addAll(fragment.getBreakNodes());
        }
        preFragment = fragment;
      }
      // LIMITATION: force default case at the last
      if (ctx.DEFAULT() != null && ctx.defaultStmt != null) {
        FlowchartFragment defaultFragment = visitBlockStatements(ctx.defaultStmt);
        Objects.requireNonNull(preFragment).link(defaultFragment);
        preFragment = defaultFragment;
        if (defaultFragment.isMatchType(FlowchartFragmentType.BREAK)) {
          breakNodes.addAll(defaultFragment.getBreakNodes());
        }
      }
      if (firstFragment != null) {
        firstFragment.setStops(preFragment.getStops());
        firstFragment.addStopNodes(breakNodes);
        // the break node is used
        // firstFragment.addBreakNodes(breakNodes);
        firstFragment.setBreakNodes(new HashSet<>(4));
        // clear other type
        firstFragment.setType(FlowchartFragmentType.SWITCH);
      }
      return firstFragment;
    }
    throw TODO("empty switch block");
  }

  @Override
  public FlowchartFragment visitSwitchCaseGroup(CodeFlowParser.SwitchCaseGroupContext ctx) {
    StringBuilder conditionBuilder = new StringBuilder(switchConditionPrefix +
        "==" +
        ANTLRUtil.getTextFromInputStream(ctx.switchCase(0).constantExpression));
    for (int i = 1; i < ctx.switchCase().size(); i++) {
      conditionBuilder.append(" || ").append(ANTLRUtil.getTextFromInputStream(ctx.switchCase(i).constantExpression));
    }
    FlowchartNode conditionNode = Flowchart.decisionNode(conditionBuilder.toString());
    FlowchartFragment caseFragment = visitBlockStatements(ctx.blockStatements());
    caseFragment.linkDecisionNodeAsTrueStart(conditionNode);
    caseFragment.addStopNode(conditionNode);
    return caseFragment;
  }

  /**
   * Link continue and break statement in loop fragment:
   * 1. the continue node((without label)) is link with <code>target</code> node
   * 2. the break node(without label) is treated as stop node, which will be linked in <code>linkStatements()</code>
   * 3. continue and break nodes with label are linked when its label equals current loop's label
   */
  private void linkBreakContinueNodesInLoop(@NotNull FlowchartFragment loopFragment, @NotNull FlowchartNode target,
                                            @NotNull String currentLabel) {
    if (!loopFragment.getContinueNodes().isEmpty()) {
      loopFragment.addType(FlowchartFragmentType.BREAK);
      for (ContinueFlowchartNode continueNode : loopFragment.getContinueNodes()) {
        // the continue node is not lined yet and is without label or equals current label
        if (continueNode.isLinkable()) {
          if (!continueNode.hasLabel() || continueNode.getLabel().equals(currentLabel)) {
            continueNode.addLink(target);
          }
        }
      }
    }
    if (!loopFragment.getBreakNodes().isEmpty()) {
      loopFragment.addType(FlowchartFragmentType.CONTINUE);
      for (BreakFlowchartNode breakNode : loopFragment.getBreakNodes()) {
        // the break node is not lined yet and is without label or equals current label
        if (breakNode.isLinkable()) {
          if (!breakNode.hasLabel() || breakNode.getLabel().equals(currentLabel))
            loopFragment.addStopNode(breakNode);
        }
      }
    }
  }

  /**
   * Create new loop fragment and extend nested loop
   *
   * @param innerLoopFragment the nested loop
   * @return new loop fragment contains nested loop extends it's labeled break and continue nodes
   */
  private FlowchartFragment createNestedLoop(FlowchartFragment innerLoopFragment) {
    FlowchartFragment loopFragment = FlowchartFragment.create(innerLoopFragment.getTypes(), innerLoopFragment.getStart(), innerLoopFragment.getStops());
    innerLoopFragment.getBreakNodes().stream().filter(BreakFlowchartNode::hasLabel).forEach(loopFragment::addBreakNode);
    innerLoopFragment.getContinueNodes().stream().filter(ContinueFlowchartNode::hasLabel).forEach(loopFragment::addContinueNode);
    return loopFragment;
  }

  private String getCurrentLabel(ParserRuleContext ctx) {
    String currentLabel = "";
    if (ctx.parent != null && ctx.parent.parent instanceof CodeFlowParser.StatementContext) {
      CodeFlowParser.StatementContext stmt = (CodeFlowParser.StatementContext) ctx.parent.parent;
      if (stmt.labelToken != null) {
        System.out.println("label: " + stmt.labelToken.getText());
        currentLabel = stmt.labelToken.getText();
      }
    }
    return currentLabel;
  }

  @Override
  public FlowchartFragment visitForBlock(CodeFlowParser.ForBlockContext ctx) {
//    System.out.println(ctx.parent.getClass().getName());
    String currentLabel = getCurrentLabel(ctx);

    FlowchartFragment forBlockStmtFragment;
    if (ctx.forExpressions().enhancedForExpression() != null) {
      CodeFlowParser.EnhancedForExpressionContext enhancedForCtx = ctx.forExpressions().enhancedForExpression();
      String iteratorDefine = String.format("Iterator<%s> it = %s.iterator();",
          ANTLRUtil.getTextFromInputStream(enhancedForCtx.variableType()),
          ANTLRUtil.getTextFromInputStream(enhancedForCtx.expression()));
      String entryDefine = String.format("%s %s = it.next();",
          ANTLRUtil.getTextFromInputStream(enhancedForCtx.variableType()),
          ANTLRUtil.getTextFromInputStream(enhancedForCtx.variableDeclaratorId()));
      FlowchartNode iteratorDefineNode = Flowchart.processNode(iteratorDefine);
      FlowchartNode entryDefineNode = Flowchart.processNode(entryDefine);

      FlowchartNode conditionNode = Flowchart.decisionNode("it.hasNext()");
      if (ctx.statement().block() != null) {
        forBlockStmtFragment = visitBlockStatements(ctx.statement().block().blockStatements());
      } else {
        forBlockStmtFragment = visitStatement(ctx.statement());
      }
      forBlockStmtFragment.linkNodeAsStart(entryDefineNode);

      forBlockStmtFragment.linkDecisionNodeAsTrueStart(conditionNode);
      forBlockStmtFragment.linkDecisionNodeAsStop(conditionNode);
      forBlockStmtFragment.linkNodeAsStart(iteratorDefineNode);

      linkBreakContinueNodesInLoop(forBlockStmtFragment, conditionNode, currentLabel);
    } else {
      CodeFlowParser.ForInitExpContext forInitExpCtx = ctx.forExpressions().forInitExp();
      CodeFlowParser.ForConditionExpContext forConditionExpCtx = ctx.forExpressions().forConditionExp();
      CodeFlowParser.ForUpdateExpContext forUpdateExpCtx = ctx.forExpressions().forUpdateExp();
      //todo forInitExpCtx, forConditionExpCtx, forUpdateExpCtx can be null,
      // but one of the forConditionExpCtx and forUpdateExpCtx must not be null
      FlowchartNode initNode = Flowchart.processNode(forInitExpCtx);
      FlowchartNode conditionNode = Flowchart.decisionNode(forConditionExpCtx);
      FlowchartNode updateNode = Flowchart.processNode(forUpdateExpCtx);
      // for block
      if (ctx.statement().block() != null) {
        forBlockStmtFragment = visitBlockStatements(ctx.statement().block().blockStatements());
      } else { // for block without braces
        forBlockStmtFragment = visitStatement(ctx.statement());
      }
      // create new instance for nested loop
      if (forBlockStmtFragment.isMatchType(FlowchartFragmentType.LOOP)) {
        forBlockStmtFragment = createNestedLoop(forBlockStmtFragment);
      }
      forBlockStmtFragment.linkDecisionNodeAsTrueStart(conditionNode);
      forBlockStmtFragment.linkNode2Stop(updateNode);
      updateNode.addLink(conditionNode);
      forBlockStmtFragment.linkNodeAsStart(initNode);
      // normally, loop has only one stop node--the condition node
      forBlockStmtFragment.setStops(asHashSet(conditionNode));

      linkBreakContinueNodesInLoop(forBlockStmtFragment, updateNode, currentLabel);
    }
    forBlockStmtFragment.addType(FlowchartFragmentType.LOOP);
    forBlockStmtFragment.addType(FlowchartFragmentType.FOR);
    return forBlockStmtFragment;
  }

  @Override
  public FlowchartFragment visitWhileBlock(CodeFlowParser.WhileBlockContext ctx) {
    String currentLabel = getCurrentLabel(ctx);

    FlowchartFragment whileFragment = null;
    FlowchartNode conditionNode = Flowchart.decisionNode(ctx.parExpression().expression());
    if (ctx.statement().block() != null) {
      whileFragment = visitBlockStatements(ctx.statement().block().blockStatements());
    } else {
      whileFragment = visitStatement(ctx.statement());
    }
    // create new instance for nested loop
    if (whileFragment.isMatchType(FlowchartFragmentType.LOOP)) {
      whileFragment = createNestedLoop(whileFragment);
    }

    whileFragment.linkDecisionNodeAsTrueStart(conditionNode);
    whileFragment.linkDecisionNodeAsStop(conditionNode);
    whileFragment.addType(FlowchartFragmentType.LOOP);
    whileFragment.addType(FlowchartFragmentType.WHILE);

    linkBreakContinueNodesInLoop(whileFragment, conditionNode, currentLabel);
    return whileFragment;
  }

  @Override
  public FlowchartFragment visitDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx) {
    String currentLabel = getCurrentLabel(ctx);

    FlowchartFragment dowhileFragemnt;
    FlowchartNode conditionNode = Flowchart.decisionNode(ctx.parExpression().expression());
    dowhileFragemnt = visitBlockStatements(ctx.block().blockStatements());
    if (StringUtils.isNotBlank(FlowchartConfig.doWhileDecisionTrueCompass)) {
      conditionNode.addLink(
//        to(dowhileFragemnt.getStart())
          compassLink(conditionNode, Compass.of(FlowchartConfig.doWhileDecisionTrueCompass).get(), dowhileFragemnt.getStart(), Compass.EAST)
              .with(trueLabel())
      );
    } else {
      conditionNode.addLink(
          to(dowhileFragemnt.getStart())
      );
    }
    // create new instance for nested loop
    if (dowhileFragemnt.isMatchType(FlowchartFragmentType.LOOP)) {
      dowhileFragemnt = createNestedLoop(dowhileFragemnt);
    }
    dowhileFragemnt.linkNode2Stop(conditionNode);
    dowhileFragemnt.addType(FlowchartFragmentType.LOOP);
    dowhileFragemnt.addType(FlowchartFragmentType.DO_WHILE);

    linkBreakContinueNodesInLoop(dowhileFragemnt, conditionNode, currentLabel);

    return dowhileFragemnt;
  }

}

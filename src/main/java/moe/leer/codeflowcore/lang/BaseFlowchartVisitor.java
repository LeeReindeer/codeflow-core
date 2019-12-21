package moe.leer.codeflowcore.lang;

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
import static moe.leer.codeflowcore.util.SomeUtil.asArrayList;
import static moe.leer.codeflowcore.util.SomeUtil.emptyArrayList;

/**
 * @author leer
 * Created at 12/17/19 1:57 PM
 */
public class BaseFlowchartVisitor extends CodeFlowBaseVisitor<FlowchartFragment> {
  private static Logger logger = LoggerFactory.getLogger(FlowchartFragment.class);

  //  @Getter
//  private List<FlowchartNode> functionCallNodes = new ArrayList<>();
  public Map<FlowchartNode, List<String>> functionCallNodes = new HashMap<>(8);
  // breakNode -> label, default label is empty
  public Set<FlowchartNode> breakNodes = new HashSet<>(8);
  public Set<FlowchartNode> continueNodes = new HashSet<>(8);
  // label name -> block
  public Map<String, FlowchartFragment> labeledFragments = new HashMap<>(8);

  public boolean isExpressionAFunctionCall(CodeFlowParser.ExpressionContext expressionContext) {
//    boolean rst = false;
//    if (expressionContext.expression() != null) {
//      for (CodeFlowParser.ExpressionContext exp : expressionContext.expression()) {
//        rst = isExpressionAFunctionCall(exp);
//        if (rst) return rst;
//      }
//    }
//    return expressionContext.functionCall() != null;
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
        if (firstFragment == null) {
          firstFragment = fragment;
        }
        if (preFragment != null && !preFragment.isMatchType(FlowchartFragmentType.END)) {
          preFragment.link(fragment);
        }
        if (fragment.isMatchType(FlowchartFragmentType.BREAK)) {
          breakNodes.addAll(fragment.getBreakNodes());
        }
        if (fragment.isMatchType(FlowchartFragmentType.CONTINUE)) {
          continueNodes.addAll(fragment.getContinueNodes());
        }
        preFragment = fragment;
      }
      if (firstFragment != null) {
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
  }

  /**
   * There're 15 cases of statement rule
   */
  @Override
  public FlowchartFragment visitStatement(CodeFlowParser.StatementContext ctx) {
    logger.info("visitStatement");
    String single = ANTLRUtil.getTextFromInputStream(ctx);
    if (ctx.block() != null) {
      return super.visitStatement(ctx);
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
    } else if (ctx.returnToken != null) {
      // function call in return expression
      // todo convert tail recursion to loop
      if (isExpressionAFunctionCall(ctx.expression())) {
        FlowchartNode call = Flowchart.functionCallNode(ctx, FlowchartNodeType.END);
        CodeFlowParser.FunctionCallContext functionCallContext = grepFunctionCallContext(ctx.expression());
        functionCallNodes.put(call, asArrayList(ParseUtil.getFunctionFullName2(functionCallContext)));
        return FlowchartFragment.create(EnumSet.of(FlowchartFragmentType.END, FlowchartFragmentType.FUNCTION_CALL), call, call);
      } else {
        return FlowchartFragment.create(FlowchartFragmentType.END, Flowchart.endNode(single));
      }
    } else if (ctx.breakToken != null) {
      String where = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : "";
      FlowchartNode breakNode = Flowchart.breakNode(where);
      FlowchartFragment breakFragment = FlowchartFragment.create(FlowchartFragmentType.BREAK, breakNode, emptyArrayList());
      breakFragment.addBreakNode((BreakFlowchartNode) breakNode);

      breakNodes.add(breakNode);
      return breakFragment;
    } else if (ctx.continueToken != null) {
      String where = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : "";
      FlowchartNode continueNode = Flowchart.continueNode(where);
      FlowchartFragment continueFragment = FlowchartFragment.create(FlowchartFragmentType.CONTINUE, continueNode, emptyArrayList());
      continueFragment.addContinueNode((ContinueFlowchartNode) continueNode);

      continueNodes.add(continueNode);
      return continueFragment;
    } else if (ctx.gotoToken != null) {
      throw TODO();
    } else if (ctx.emptyStmt != null) {
      // TODO create a invisible node
      throw TODO();
    } else if (ctx.labelStmt != null) {
      throw TODO();
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
      } else if (ctx.variableAssign() != null) {

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
//      FlowchartNode call = Flowchart.processNode(ctx).add(Color.LIGHTBLUE, Style.FILLED);
      FlowchartNode call = Flowchart.functionCallNode(ctx, FlowchartNodeType.PROCESS);
      CodeFlowParser.FunctionCallContext functionCallContext = grepFunctionCallContext(ctx);
      functionCallNodes.put(call, asArrayList(ParseUtil.getFunctionFullName2(functionCallContext)));
      return FlowchartFragment.create(FlowchartFragmentType.FUNCTION_CALL, call, call);
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
      firstFragment = FlowchartFragment.create(FlowchartFragmentType.IF, decisionNode);
      firstFragment.addStopNode(decisionNode);
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
        firstFragment.getStart().addFalseConditionLink(elseIf.getStart());
        firstFragment.removeStopNode(firstFragment.getStart());
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

        Iterator<FlowchartNode> nodeIterator = firstFragment.getStops().iterator();
        FlowchartNode stop;
        // link decision node to else node, then remove decision from stop nodes
        while (nodeIterator.hasNext()) {
          stop = nodeIterator.next();
          if (stop.getType() == FlowchartNodeType.DECISION && stop.isLinkable()) {
            stop.addFalseConditionLink(elseBlock.getStart());
            nodeIterator.remove();
          }
        }
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

  /**
   * Link continue and break statement without label in loop fragment:
   * 1. the continue node is link with <code>target</code> node
   * 2. the break node(without label) is treated as stop node, which will be linked in <code>linkStatements()</code>
   */
  private void linkBreakContinueNodesInLoop(@NotNull FlowchartFragment loopFragment, @NotNull FlowchartNode target) {
    if (!loopFragment.getContinueNodes().isEmpty()) {
      for (ContinueFlowchartNode continueNode : loopFragment.getContinueNodes()) {
        // the continue node is not lined yet and without label
        if (continueNode.isLinkable() &&
            StringUtils.isEmpty(continueNode.getLabel())) {
          continueNode.addLink(target);
        }
      }
    }
    if (!loopFragment.getBreakNodes().isEmpty()) {
      for (BreakFlowchartNode breakNode : loopFragment.getBreakNodes()) {
        // the break node is not lined yet and without label
        if (breakNode.isLinkable() &&
            StringUtils.isEmpty(breakNode.getLabel())) {
          loopFragment.addStopNode(breakNode);
        }
      }
    }
  }

  @Override
  public FlowchartFragment visitForBlock(CodeFlowParser.ForBlockContext ctx) {
    FlowchartFragment forBlockStmtFragment = null;
    if (ctx.forExpressions().enhancedForExpression() != null) {
      // todo iterator for
      throw TODO("translate to Iterator");
    } else {
      CodeFlowParser.ForInitExpContext forInitExpCtx = ctx.forExpressions().forInitExp();
      CodeFlowParser.ForConditionExpContext forConditionExpCtx = ctx.forExpressions().forConditionExp();
      CodeFlowParser.ForUpdateExpContext forUpdateExpCtx = ctx.forExpressions().forUpdateExp();
      FlowchartNode initNode = Flowchart.processNode(forInitExpCtx);
      FlowchartNode conditionNode = Flowchart.decisionNode(forConditionExpCtx);
      FlowchartNode updateNode = Flowchart.processNode(forUpdateExpCtx);
      // for block
      if (ctx.statement().block() != null) {
        forBlockStmtFragment = visitBlockStatements(ctx.statement().block().blockStatements());
      } else { // for block without braces
        forBlockStmtFragment = visitStatement(ctx.statement());
      }
      forBlockStmtFragment.linkDecisionNodeAsTrueStart(conditionNode);
      forBlockStmtFragment.linkNode2Stop(updateNode);
//      updateNode.addLink(compassLink(updateNode, Compass.EAST, conditionNode));
      updateNode.addLink(conditionNode);
//      updateNode.addLink(conditionNode);
      forBlockStmtFragment.linkNodeAsStart(initNode);
      // normally, loop has only one stop node--the condition node
      forBlockStmtFragment.setStops(asArrayList(conditionNode));

      linkBreakContinueNodesInLoop(forBlockStmtFragment, updateNode);
    }
    forBlockStmtFragment.setType(FlowchartFragmentType.FOR);
    return forBlockStmtFragment;
  }

  @Override
  public FlowchartFragment visitWhileBlock(CodeFlowParser.WhileBlockContext ctx) {
    FlowchartFragment whileFragment = null;
    FlowchartNode conditionNode = Flowchart.decisionNode(ctx.parExpression().expression());
    if (ctx.statement().block() != null) {
      whileFragment = visitBlockStatements(ctx.statement().block().blockStatements());
    } else {
      whileFragment = visitStatement(ctx.statement());
    }
    whileFragment.linkDecisionNodeAsTrueStart(conditionNode);
    whileFragment.linkDecisionNodeAsStop(conditionNode);
    whileFragment.setType(FlowchartFragmentType.WHILE);

    linkBreakContinueNodesInLoop(whileFragment, conditionNode);
    return whileFragment;
  }

  @Override
  public FlowchartFragment visitDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx) {
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
    dowhileFragemnt.linkNode2Stop(conditionNode);
    dowhileFragemnt.setType(FlowchartFragmentType.DO_WHILE);

    linkBreakContinueNodesInLoop(dowhileFragemnt, conditionNode);

    return dowhileFragemnt;
  }

}

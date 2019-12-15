package moe.leer.codeflowcore.lang;

import guru.nidi.graphviz.model.Compass;
import moe.leer.codeflowcore.graph.*;
import moe.leer.codeflowcore.util.ANTLRUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

import static moe.leer.codeflowcore.graph.Flowchart.trueLabel;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.compassLink;
import static moe.leer.codeflowcore.util.SomeUtil.asArrayList;


/**
 * @author leer
 * Created at 12/6/19 9:25 PM
 */
public class FlowchartGenVisitor extends CodeFlowBaseVisitor<FlowchartFragment> {

  private static Logger logger = LoggerFactory.getLogger(FlowchartFragment.class);

  @Override
  public FlowchartFragment visitProgram(CodeFlowParser.ProgramContext ctx) {
    return super.visitProgram(ctx);
  }

  /**
   * Link all statement FlowchartFragments
   */
  @Override
  public FlowchartFragment visitBlockStatements(CodeFlowParser.BlockStatementsContext ctx) {
    FlowchartFragment preFragment = null, firstFragment = null;
    for (CodeFlowParser.BlockStatementContext context : ctx.blockStatement()) {
      FlowchartFragment fragment = visitBlockStatement(context);
      logger.debug("fragment: {}", fragment);
      if (firstFragment == null) {
        firstFragment = fragment;
      }
      if (preFragment != null && preFragment.getType() != FlowchartFragmentType.END) {
        preFragment.link(fragment);
      }
      preFragment = fragment;
    }
    if (firstFragment != null) {
      firstFragment.setStops(preFragment.getStops());
    }
    return firstFragment;
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
    } else if (ctx.forBlock() != null) {
      return visitForBlock(ctx.forBlock());
    } else if (ctx.whileBlock() != null) {
      return visitWhileBlock(ctx.whileBlock());
    } else if (ctx.doWhileBlock() != null) {
      return visitDoWhileBlock(ctx.doWhileBlock());
    } else if (ctx.returnToken != null) {
      return FlowchartFragment.create(FlowchartFragmentType.END, Flowchart.endNode(single));
    } else if (ctx.breakToken != null) {

    } else if (ctx.gotoToken != null) {

    } else if (ctx.emptyStmt != null) {

    } else if (ctx.labelStmt != null) {

    } else { // variableDeclarators,expressionStmt,objectDeclarator,variableAssign
      return FlowchartFragment.singleProcess(Flowchart.processNode(single));
    }
    return null;
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
      firstFragment.setType(FlowchartFragmentType.IF);
      // fixme decision is also a end node
      if (decisionNode.isLinkable()) {
        firstFragment.addStopNode(decisionNode);
      }
    } else { // TODO optimize empty if block, remove decision node?
      firstFragment = FlowchartFragment.create(FlowchartFragmentType.IF, decisionNode);
      firstFragment.addStopNode(decisionNode);
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
      }
    }
    logger.debug("ifFragment: {}", firstFragment);
    return firstFragment;
  }

  @Override
  public FlowchartFragment visitForBlock(CodeFlowParser.ForBlockContext ctx) {
    FlowchartFragment forBlockStmtFragment = null;
    if (ctx.forExpressions().enhancedForExpression() != null) {
      // todo
      // translate to Iterator
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
      updateNode.addLink(Compass.EAST, conditionNode, Compass.EAST);
      forBlockStmtFragment.linkNodeAsStart(initNode);
      // has only one stop node--the condition node
      forBlockStmtFragment.setStops(asArrayList(conditionNode));
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
    return whileFragment;
  }

  @Override
  public FlowchartFragment visitDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx) {
    FlowchartFragment dowhileFragemnt;
    FlowchartNode conditionNode = Flowchart.decisionNode(ctx.parExpression().expression());
    dowhileFragemnt = visitBlockStatements(ctx.block().blockStatements());
    conditionNode.addLink(
        compassLink(conditionNode, Compass.EAST, dowhileFragemnt.getStart(), Compass.EAST)
            .with(trueLabel())
    );
    dowhileFragemnt.linkNode2Stop(conditionNode);
    dowhileFragemnt.setType(FlowchartFragmentType.DO_WHILE);
    return dowhileFragemnt;
  }
}

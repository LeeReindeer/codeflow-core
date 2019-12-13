package moe.leer.codeflowcore.lang;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.Compass;
import moe.leer.codeflowcore.graph.*;
import moe.leer.codeflowcore.util.ANTLRUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

import static moe.leer.codeflowcore.graph.Flowchart.falseLable;
import static moe.leer.codeflowcore.graph.Flowchart.trueLabel;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.to;
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
      if (preFragment != null) {
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
    if (ctx.block() != null) {
      return super.visitStatement(ctx);
    } else if (ctx.ifBlock() != null) {
      return visitIfBlock(ctx.ifBlock());
    } else if (ctx.forBlock() != null) {
      return visitForBlock(ctx.forBlock());
    } else if (ctx.whileBlock() != null) {

    } else if (ctx.doWhileBlock() != null) {

    } else if (ctx.returnToken != null) {

    } else if (ctx.breakToken != null) {

    } else if (ctx.gotoToken != null) {

    } else if (ctx.emptyStmt != null) {

    } else if (ctx.labelStmt != null) {

    } else { // variableDeclarators,expressionStmt,objectDeclarator,variableAssign
      String single = ANTLRUtil.getTextFromInputStream(
          ctx.start.getStartIndex(),
          ctx.stop.getStopIndex(),
          ctx.start.getInputStream());
      return FlowchartFragment.singleProcess(Flowchart.processNode(single));
    }
    return null;
  }

  @Override
  public FlowchartFragment visitIfBlock(CodeFlowParser.IfBlockContext ctx) {
    logger.info("visited ifBlock");
//    int conStart = ctx.parExpression().expression().start.getStartIndex();
//    int conEnd = ctx.parExpression().expression().stop.getStopIndex();
//    String condition = ctx.start.getInputStream().getText(new Interval(conStart, conEnd));
//    logger.debug("decision: {}", condition);
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
      firstFragment.linkNodeAsStart(decisionNode, trueLabel());
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
        firstFragment.getStart().addLink(
            to(elseIf.getStart()).with(falseLable())
        );
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
            stop.addLink(
                to(elseBlock.getStart()).with(Label.of("false"))
            );
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
      forBlockStmtFragment.linkNodeAsStart(conditionNode, trueLabel());
      forBlockStmtFragment.linkNode2Stop(updateNode);
//      updateNode.addLink(conditionNode);
      // fixme not graceful
      updateNode.links().add(updateNode.port(Compass.EAST).linkTo(conditionNode.port(Compass.EAST)));
//      updateNode.addLink(conditionNode.port(Compass.EAST));
      forBlockStmtFragment.linkNodeAsStart(initNode);
      // has only one stop node--the condition node
      forBlockStmtFragment.setStops(asArrayList(conditionNode));
    }
    return forBlockStmtFragment;
  }

  @Override
  public FlowchartFragment visitWhileBlock(CodeFlowParser.WhileBlockContext ctx) {
    // todo
    return super.visitWhileBlock(ctx);
  }

  @Override
  public FlowchartFragment visitDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx) {
    // todo
    return super.visitDoWhileBlock(ctx);
  }
}

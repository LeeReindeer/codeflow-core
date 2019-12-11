package moe.leer.codeflowcore.lang;

import guru.nidi.graphviz.attribute.Label;
import moe.leer.codeflowcore.graph.*;
import moe.leer.codeflowcore.util.ANTLRUtil;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.misc.Interval;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.List;

import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.to;


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
    return firstFragment;
  }

  @Override
  public FlowchartFragment visitBlockStatement(CodeFlowParser.BlockStatementContext ctx) {
    return super.visitBlockStatement(ctx);
  }

  @Override
  public FlowchartFragment visitStatement(CodeFlowParser.StatementContext ctx) {
    logger.info("visitStatement");
    if (ctx.block() != null) {
      //todo
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
    int conStart = ctx.parBooleanExpression().booleanExpression().start.getStartIndex();
    int conEnd = ctx.parBooleanExpression().booleanExpression().stop.getStopIndex();
    String condition = ctx.start.getInputStream().getText(new Interval(conStart, conEnd));

    logger.debug("decision: {}", condition);
    FlowchartNode decisionNode = Flowchart.decisionNode(condition);

    int stmtStart, stmtEnd;
    CharStream input;
    String stmtString;
    FlowchartFragment preFragment = null, firstFragment = null;
    // if branch
    CodeFlowParser.StatementContext statementContext = ctx.statement(0);
    input = statementContext.start.getInputStream();

    List<CodeFlowParser.BlockStatementContext> stmts = statementContext.block().blockStatements().blockStatement();
    for (CodeFlowParser.BlockStatementContext blockStmt : stmts) {
      stmtStart = blockStmt.start.getStartIndex();
      stmtEnd = blockStmt.stop.getStopIndex();
      FlowchartNode stmtNode;
      FlowchartFragment fragment;
      // nested if
      if (blockStmt.statement().ifBlock() != null) {
        fragment = visitIfBlock(blockStmt.statement().ifBlock());
        fragment.setType(FlowchartFragmentType.IF);
        //todo consider other type
      } else {
        stmtString = input.getText(new Interval(stmtStart, stmtEnd));
        fragment = FlowchartFragment.singleProcess(Flowchart.processNode(stmtString));
        logger.debug("process: {}", stmtString);
      }
      if (preFragment != null) {
        preFragment.link(fragment);
      }
      if (firstFragment == null) {
        firstFragment = fragment;
      }
      preFragment = fragment;
    }

    // link decision node as start
    if (firstFragment != null) {
      firstFragment.linkNode2Start(decisionNode, "true");
      firstFragment.setType(FlowchartFragmentType.IF);
      firstFragment.setStops(preFragment.getStops());
      // fixme decision is also a end node
      if (decisionNode.isLinkable()) {
        firstFragment.addStopNode(decisionNode);
      }
    } else { // TODO optimize empty if block
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
            to(elseIf.getStart()).with(Label.of("false"))
        );
        firstFragment.removeStopNode(firstFragment.getStart());
        firstFragment.addStopNodes(elseIf.getStops());
      } else { // else
        FlowchartFragment elseBlock = visitBlockStatements(elseBranch.block().blockStatements());

        Iterator<FlowchartNode> nodeIterator = firstFragment.getStops().iterator();
        FlowchartNode stop;
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
    // todo
    return super.visitForBlock(ctx);
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

package moe.leer.codeflowcore.lang;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.MutableGraph;
import moe.leer.codeflowcore.FlowchartConfig;
import moe.leer.codeflowcore.graph.Flowchart;
import moe.leer.codeflowcore.graph.FlowchartFragment;
import moe.leer.codeflowcore.graph.FlowchartFragmentType;
import moe.leer.codeflowcore.graph.FlowchartNodeType;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.util.ANTLRUtil;
import moe.leer.codeflowcore.util.ParseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static guru.nidi.graphviz.model.Factory.mutGraph;


/**
 * Create root graph and add sub graphs
 *
 * @author leer
 * Created at 12/6/19 9:25 PM
 */
public class FlowchartGenVisitor extends BaseFlowchartVisitor {

  private static Logger logger = LoggerFactory.getLogger(FlowchartGenVisitor.class);
  FlowchartFragment root = new FlowchartFragment();
  MutableGraph rootGraph = mutGraph().setDirected(true);

  /**
   * Though our lexer and parser support parsing class declaration, but an object in a flowchart is meaningless and complicated.
   * An Class/object should not represent in a flowchart, maybe a UML graph is better.
   */
//  @Override
//  public FlowchartFragment visitClassDeclaration(CodeFlowParser.ClassDeclarationContext ctx) {
//    return super.visitClassDeclaration(ctx);
//    throw new IllegalStateException("Class/Object not supported in flowchart, cause class/object is OOP, flowchart represent a PROCESS which is POP");
//  }

  /**
   * topLevelStmts
   * topLevelFunctions
   * classDeclaration, support parse but not present
   */
  @Override
  public FlowchartFragment visitProgram(CodeFlowParser.ProgramContext ctx) {
    root.setGraph(rootGraph);
    // link toplevel statements which is split by function
    FlowchartFragment preFragment = null, firstFragment = null;
    for (CodeFlowParser.DeclarationContext declarationContext : ctx.declaration()) {
      if (declarationContext.topLevelFunctions() != null) {
        for (CodeFlowParser.FunctionDeclareContext functionDeclareContext : declarationContext.topLevelFunctions().functionDeclare()) {
          visitFunctionDeclare(functionDeclareContext);
        }
      } else if (declarationContext.topLevelStmts() != null) {
        // link statements split by function
        FlowchartFragment fragment = super.visitTopLevelStmts(declarationContext.topLevelStmts());
        if (firstFragment == null) {
          firstFragment = fragment;
        }
        if (preFragment != null && !preFragment.isMatchType(FlowchartFragmentType.END)) {
          preFragment.link(fragment);
        }
        preFragment = fragment;
      }
    }
    if (firstFragment != null) {
      // add a end node
      if (FlowchartConfig.virtualEndNode) {
        preFragment.linkNode2Stop(Flowchart.endNode());
      }
      // add a start node
      if (FlowchartConfig.virtualStartNode) {
        if (firstFragment.getStart().getType() != FlowchartNodeType.START) {
          firstFragment.linkNodeAsStart(Flowchart.startNode());
        }
      }
      firstFragment.setStops(preFragment.getStops());
      rootGraph.add(firstFragment.getStart());
    }
    return root;
  }

  /**
   * Add top level function to sub fragments
   */
  @Override
  public FlowchartFragment visitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    // todo add function subgraph
    FlowchartFragment fragment = null;
    // only blockStatements can be null
    if (ctx.functionBody().block().blockStatements() != null) {
      FlowchartFragment functionBody = super.visitBlockStatements(ctx.functionBody().block().blockStatements());
      // add a start node, function has a start node by default, not by configuration
      if (functionBody != null) {
        if (functionBody.getStart().getType() != FlowchartNodeType.START) {
          functionBody.linkNodeAsStart(Flowchart.startNode());
        }
      } else {
        // empty function body
        functionBody = FlowchartFragment.create(Flowchart.startNode());
      }
      String functionDisplayName = ctx.IDENTIFIER().getText() + ANTLRUtil.getTextFromInputStream(ctx.formalParams());
      String functionFullName = ParseUtil.getFunctionFullName2(ctx);
      MutableGraph subgraph = mutGraph(functionDisplayName)
          .setCluster(true).setDirected(true);
      subgraph.graphAttrs().add(Label.of(functionDisplayName));
      subgraph.add(functionBody.getStart());
      fragment = FlowchartFragment.create(FlowchartFragmentType.FUNCTION, functionBody.getStart(), functionBody.getStops());
      fragment.setGraph(subgraph);

      // put sub graph to root
      subgraph.addTo(rootGraph);
      // put sub fragment to root
      subFragments.put(functionFullName, fragment);
      return fragment;
    }
    return null;
  }

}

package moe.leer.codeflowcore.lang;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.MutableGraph;
import moe.leer.codeflowcore.graph.FlowchartFragment;
import moe.leer.codeflowcore.graph.FlowchartFragmentType;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.util.ANTLRUtil;
import moe.leer.codeflowcore.util.ParseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

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


//  private List<FlowchartFragment> subFragments = new ArrayList<>();
  // function name -> graph
  public Map<String, FlowchartFragment> subFragments = new HashMap<>(8);

  /**
   * topLevelStmts
   * topLevelFunctions
   * classDeclaration
   */
  @Override
  public FlowchartFragment visitProgram(CodeFlowParser.ProgramContext ctx) {
    root.setGraph(rootGraph);
    // link toplevel statements which is split by function
    FlowchartFragment preFragment = null, firstFragment = null;
    for (CodeFlowParser.DeclarationContext declarationContext : ctx.declaration()) {
      if (declarationContext.topLevelFunctions() != null) {
        for (CodeFlowParser.FunctionDeclareContext functionDeclareContext : declarationContext.topLevelFunctions().functionDeclare()) {
          FlowchartFragment subgraph = visitFunctionDeclare(functionDeclareContext);
          subgraph.getGraph().addTo(rootGraph);
        }
      } else if (declarationContext.topLevelStmts() != null) {
        FlowchartFragment fragment = super.visitTopLevelStmts(declarationContext.topLevelStmts());
        if (firstFragment == null) {
          firstFragment = fragment;
        }
        if (preFragment != null && !preFragment.isMatchType(FlowchartFragmentType.END)) {
          preFragment.link(fragment);
        }
        preFragment = fragment;
//        rootGraph.add(topNode.getStart());
      }
    }
    if (firstFragment != null) {
      firstFragment.setStops(preFragment.getStops());
    }
    if (firstFragment != null) {
      rootGraph.add(firstFragment.getStart());
    }
    return root;
  }

  /**
   * Treat toplevel function and class method as same level, that is toplevel function and class method is at the same level of graph
   */
  @Override
  public FlowchartFragment visitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    // todo add function subgraph
    FlowchartFragment fragment = null;
    // only blockStatements can be null
    if (ctx.functionBody().block().blockStatements() != null) {
      FlowchartFragment functionBody = super.visitBlockStatements(ctx.functionBody().block().blockStatements());
      String functionDisplayName = ctx.IDENTIFIER().getText() + ANTLRUtil.getTextFromInputStream(ctx.formalParams());
      String functionFullName = ParseUtil.getFunctionFullName2(ctx);
      MutableGraph subgraph = mutGraph(functionDisplayName)
          .setCluster(true).setDirected(true);
      subgraph.graphAttrs().add(Label.of("function " + ctx.IDENTIFIER().getText()));
      subgraph.add(functionBody.getStart());
      fragment = FlowchartFragment.create(FlowchartFragmentType.FUNCTION, functionBody.getStart(), functionBody.getStops());
      fragment.setGraph(subgraph);
      subFragments.put(functionFullName, fragment);
      return fragment;
    }
    return null;
  }

}

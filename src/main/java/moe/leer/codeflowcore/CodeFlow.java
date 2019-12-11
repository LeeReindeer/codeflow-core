package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import moe.leer.codeflowcore.graph.FlowchartFragment;
import moe.leer.codeflowcore.lang.CodeFlowLexer;
import moe.leer.codeflowcore.lang.CodeFlowParser;
import moe.leer.codeflowcore.lang.FlowchartGenVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.util.function.Supplier;

import static guru.nidi.graphviz.model.Factory.mutGraph;

/**
 * @author leer
 * Created at 12/11/19 7:46 PM
 */
public class CodeFlow {
  public static void main(String[] args) throws IOException {
//    genFlowchartPNG("simpleIf", Compiler::testIfCode);
//    genFlowchartPNG("nestIf1", Compiler::testNestedIfCode);
//    genFlowchartPNG("ifAndElse", Compiler::testIfAndElseCode);
//    genFlowchartPNG("ifElse", Compiler::testIfElseCode);
//    genFlowchartPNG("ifElseElse", Compiler::testIfElseElseCode);
    genFlowchartPNG("ifExample1", Example::testIfExample1);
  }

  public static void genFlowchartPNG(String fileNameWithoutSuffix, Supplier<String> codeSupplier) throws IOException {
    CodeFlowLexer lexer = new CodeFlowLexer(CharStreams.fromString(codeSupplier.get()));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CodeFlowParser parser = new CodeFlowParser(tokens);
//    parser.setErrorHandler();
    ParseTree ast = parser.program();

//    ParseTreeWalker walker = new ParseTreeWalker();
//    ConditionNodeListener conditionNodeListener = new ConditionNodeListener();
//    walker.walk(conditionNodeListener, ast);
    FlowchartGenVisitor visitor = new FlowchartGenVisitor();
    FlowchartFragment flowChartFragment = visitor.visit(ast);
    MutableGraph g = mutGraph().setDirected(true)
        .add(flowChartFragment.getStart().node);
//    System.out.println(flowChartFragment.getStart().name());
//    System.out.println(flowChartFragment.getStart().getType());

    Graphviz.fromGraph(g).width(600).height(800).render(Format.PNG).toFile(new File("examples/" + fileNameWithoutSuffix + ".png"));
  }

}

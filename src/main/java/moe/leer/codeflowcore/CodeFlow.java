package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import moe.leer.codeflowcore.graph.FlowchartFragment;
import moe.leer.codeflowcore.lang.FlowchartConnector;
import moe.leer.codeflowcore.lang.FlowchartGenVisitor;
import moe.leer.codeflowcore.lang.parser.CodeFlowLexer;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.lang.semantic.SymbolDefListener;
import moe.leer.codeflowcore.lang.semantic.SymbolResolveListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.function.Supplier;

/**
 * @author leer
 * Created at 12/11/19 7:46 PM
 */
@Builder
public class CodeFlow {

  private Graphviz graphviz;
  private CodeFlowLexer lexer = new CodeFlowLexer(null);
  private CodeFlowParser parser;

  //  private String code;
//  private File codeFile;
  private boolean supportClass;
  private String functionColor = "lightblue";

  @Getter
  @Setter
  private String workDir = "./";
  @Getter
  @Setter
  private String outDir = "./";
  private Format format = Format.PNG;
  private File outFile;

  /*
  public CodeFlow(boolean supportClass, String baseDir) {
    this.supportClass = supportClass;
    this.workDir = baseDir;
  }

  public CodeFlow(String code) {
    lexer = new CodeFlowLexer(CharStreams.fromString(code));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new CodeFlowParser(tokens);
    CodeFlowParser.supportClass = false;
    ParseTree ast = parser.program();

//    semanticCheck(ast);

    FlowchartGenVisitor visitor = new FlowchartGenVisitor();
    FlowchartFragment flowChart = visitor.visit(ast);

    ParseTreeWalker walker = new ParseTreeWalker();
    SymbolDefListener symbolDefListener = new SymbolDefListener();

    walker.walk(symbolDefListener, ast);

    FlowchartConnector connector = new FlowchartConnector(visitor.functionCallNodes, visitor.subFragments);
    connector.connect(flowChart.getGraph());

//    visitor.visit(ast);
//    MutableGraph g = mutGraph().setDirected(true);
//        .add(flowChartFragment.getStart().node);
//    g.graphAttrs().add("splines", "polyline");

//    for (FlowchartFragment subFragment : visitor.getSubFragments().values()) {
//      if (subFragment.getGraph() != null) {
//        subFragment.getGraph().addTo(g);
//      }
//    }
    graphviz = Graphviz.fromGraph(flowChart.getGraph());
  }
   */

  public CodeFlow parse(Supplier<String> supplier) {
    return parse(supplier.get());
  }

  public CodeFlow parse(String code) {
    if (StringUtils.isNotBlank(code)) {
      // init lexer and parser
      if (lexer == null) {
        lexer = new CodeFlowLexer(CharStreams.fromString(code));
      }
      lexer.setInputStream(CharStreams.fromString(code));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      if (parser == null) {
        parser = new CodeFlowParser(tokens);
      }
      parser.setTokenStream(tokens);
      CodeFlowParser.supportClass = this.supportClass;

      // output parse tree
      ParseTree ast = parser.program();

//    semanticCheck(ast);
      ParseTreeWalker walker = new ParseTreeWalker();
      SymbolDefListener symbolDefListener = new SymbolDefListener();
      walker.walk(symbolDefListener, ast);

      FlowchartGenVisitor visitor = new FlowchartGenVisitor();
      FlowchartFragment flowChart = visitor.visit(ast);

      FlowchartConnector connector = new FlowchartConnector(visitor.functionCallNodes, visitor.subFragments);
      connector.connect(flowChart.getGraph());
      graphviz = Graphviz.fromGraph(flowChart.getGraph());
    }
    return this;
  }

  public CodeFlow parse(File file) throws IOException {
    try (final InputStream in = new FileInputStream(getAndCreateDir(workDir) + file.getPath())) {
      return parse(IOUtils.toString(in));
    }
  }

  public CodeFlow parseFile(String path) throws IOException {
    try (final InputStream in = new FileInputStream(getAndCreateDir(workDir) + path)) {
      return parse(IOUtils.toString(in));
    }
  }

  public CodeFlow render(Format format) {
    this.format = format;
    return this;
  }

  public File toFile(String pathName) throws IOException {
    this.outFile = new File(getAndCreateDir(outDir) + pathName);
    if (graphviz != null) {
      graphviz.render(this.format).toFile(outFile);
    } else {
      throw new IllegalStateException("Please call CodeFlow#parse first");
    }
    return this.outFile;
  }

  public BufferedImage toImage() {
    if (graphviz != null) {
      return graphviz.render(this.format).toImage();
    } else {
      throw new IllegalStateException("Please call CodeFlow#parse first");
    }
  }

  private String getAndCreateDir(String dir) throws IOException {
    if (!dir.endsWith("/")) {
      dir = dir + "/";
    }
    Files.createDirectories(new File(dir).getAbsoluteFile().getParentFile().toPath());
    return dir;
  }

  private void semanticCheck(ParseTree tree) {
    ParseTreeWalker walker = new ParseTreeWalker();
    SymbolDefListener symbolDefListener = new SymbolDefListener();

    walker.walk(symbolDefListener, tree);
    System.out.println(symbolDefListener.getScopesManager().getGlobalScope());

    // evaluate expression, fall type mismatched
//    EvaluateSymbolListener evaluateSymbolListener = new EvaluateSymbolListener(symbolDefListener.scopes, symbolDefListener.getGlobalScope());
//    walker.walk(evaluateSymbolListener, tree);

    SymbolResolveListener symbolResolveListener = new SymbolResolveListener(symbolDefListener.getScopesManager().scopes, symbolDefListener.getScopesManager().getGlobalScope());
    walker.walk(symbolResolveListener, tree);
  }

  public static CodeFlow build() {
    return CodeFlow.builder().build();
  }

  /*
  public static void genFlowchartPNG(String fileNameWithoutSuffix, Supplier<String> codeSupplier) throws IOException {
    CodeFlow.fromString(codeSupplier.get())
        .graphviz.height(800).width(600).render(Format.PNG).toFile(new File(fileNameWithoutSuffix + ".png"));
  }

  public static void genFlowchartPNGFromFile(String inputFile) throws IOException {
    int dotIndex = inputFile.indexOf('.');
    String fileNameWithoutSuffix = inputFile.substring(0, dotIndex == -1 ? inputFile.length() : dotIndex);
    genFlowchartPNGFromFile(inputFile, fileNameWithoutSuffix);
  }

  public static void genFlowchartPNGFromFile(String inputFile, String outputFile) throws IOException {
    inputFile = "examples/" + inputFile;
    CodeFlow.fromFile(new File(inputFile))
//    ;
        .graphviz.height(800).width(600).render(Format.PNG).toFile(new File(outputFile + ".png"));
  }
   */

}

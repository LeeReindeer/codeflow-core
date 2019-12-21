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
import org.jetbrains.annotations.NotNull;

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

  private boolean supportClass;

  private Integer height;
  private Integer width;

  @Getter
  @Setter
  private String workDir = "./";
  @Getter
  @Setter
  private String outDir = "./";
  private Format format = Format.PNG;
  private File outFile;

  public CodeFlow parse(@NotNull Supplier<String> supplier) {
    return parse(supplier.get());
  }

  public CodeFlow parse(@NotNull String code) {
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
      if (height != null) {
        graphviz = graphviz.height(height);
      }
      if (width != null) {
        graphviz = graphviz.width(width);
      }
    }
    return this;
  }

  public CodeFlow parse(@NotNull File file) throws IOException {
    try (final InputStream in = new FileInputStream(getAndCreateDir(workDir) + file.getPath())) {
      return parse(IOUtils.toString(in));
    }
  }

  public CodeFlow parseFile(@NotNull String path) throws IOException {
    try (final InputStream in = new FileInputStream(getAndCreateDir(workDir) + path)) {
      return parse(IOUtils.toString(in));
    }
  }

  public CodeFlow render(@NotNull Format format) {
    this.format = format;
    return this;
  }

  public CodeFlow height(@NotNull Integer height) {
    this.height = height;
    if (graphviz != null) {
      graphviz = graphviz.height(height);
    } else {
      throw new IllegalStateException("Please call CodeFlow#parse first");
    }
    return this;
  }

  public CodeFlow width(@NotNull Integer width) {
    this.width = width;
    if (graphviz != null) {
      graphviz = graphviz.width(width);
    } else {
      throw new IllegalStateException("Please call CodeFlow#parse first");
    }
    return this;
  }

  public File toFile(@NotNull String pathName) throws IOException {
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

  @NotNull
  private String getAndCreateDir(@NotNull String dir) throws IOException {
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
}

package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Engine;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.engine.GraphvizException;
import guru.nidi.graphviz.model.MutableGraph;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import moe.leer.codeflowcore.exception.SyntaxErrorException;
import moe.leer.codeflowcore.graph.FlowchartFragment;
import moe.leer.codeflowcore.graph.FlowchartNodeFactory;
import moe.leer.codeflowcore.lang.FlowchartConnector;
import moe.leer.codeflowcore.lang.FlowchartGenVisitor;
import moe.leer.codeflowcore.lang.ThrowSyntaxErrorListener;
import moe.leer.codeflowcore.lang.parser.CodeFlowLexer;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.lang.semantic.SymbolDefListener;
import moe.leer.codeflowcore.lang.semantic.SymbolResolveListener;
import moe.leer.codeflowcore.util.NativeUtil;
import moe.leer.codeflowcore.util.ProgramTimer;
import moe.leer.codeflowcore.util.SomeUtil;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.graphviz.SWIGTYPE_p_Agraph_t;
import org.graphviz.gv;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.function.Supplier;

/**
 * CodeFlow API
 *
 * @author leer
 * Created at 12/11/19 7:46 PM
 */
public class CodeFlow {

  public static final Logger logger = LoggerFactory.getLogger(CodeFlow.class);

  private Graphviz graphviz;
  private MutableGraph graph;
  private CodeFlowLexer lexer;
  private CodeFlowParser parser;

  private final ProgramTimer parseTimer = new ProgramTimer("parse time");
  private final ProgramTimer checkTimer = new ProgramTimer("syntax check time");
  private final ProgramTimer convertFlowchartTimer = new ProgramTimer("Convert flowchart time");

  @Getter
  @Setter
  @Accessors(chain = true)
  private boolean supportClass;
  @Getter
  @Setter
  @Accessors(chain = true)
  // throw exception when occurred syntax error
  private boolean failFast;

  @Getter
  @Setter
  @Accessors(chain = true)
  // use graphviz native binding
  private boolean useNative;

  static {
    NativeUtil.loadLibraryFromResource("gv");
  }

  /**
   * height and width are ignored when <code>useIgnore</code> is true
   */
  private Integer height;
  private Integer width;

  @Getter
  @Setter
  @Accessors(chain = true)
  private String workDir = "./";
  @Getter
  @Setter
  @Accessors(chain = true)
  private String outDir = "./";
  @Getter
  @Setter
  @Accessors(chain = true)
  private Format format = Format.PNG;
  private File outFile;


  public CodeFlow(boolean supportClass, boolean failFast, boolean useNative, Integer height, Integer width, String workDir, String outDir, Format format) {
    this.supportClass = supportClass;
    this.failFast = failFast;
    this.useNative = useNative;
    this.height = height;
    this.width = width;
    this.workDir = workDir;
    this.outDir = outDir;
    this.format = format;
  }

  public CodeFlow parse(@NotNull Supplier<String> supplier) {
    return parse(supplier.get());
  }

  static class BailCodeFlowLexer extends CodeFlowLexer {

    public BailCodeFlowLexer(CharStream input) {
      super(input);
    }

    @Override
    public void recover(LexerNoViableAltException e) {
      throw new SyntaxErrorException(e);
    }
  }

  public CodeFlow parse(@NotNull String code) {
    if (StringUtils.isNotBlank(code)) {
      parseTimer.start();
      // init lexer and parser
      if (lexer == null) {
        if (failFast) {
          lexer = new BailCodeFlowLexer(CharStreams.fromString(code));
        } else {
          lexer = new CodeFlowLexer(CharStreams.fromString(code));
        }
      }
      lexer.setInputStream(CharStreams.fromString(code));
      final CommonTokenStream tokens = new CommonTokenStream(lexer);
      if (parser == null) {
        parser = new CodeFlowParser(tokens);
      }
      parser.setTokenStream(tokens);
      if (failFast) {
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowSyntaxErrorListener());
      }
      CodeFlowParser.supportClass = this.supportClass;

      // output parse tree
      ParseTree ast = parser.program();
      parseTimer.stopAndReport();

      checkTimer.start();
//    semanticCheck(ast);
      ParseTreeWalker walker = new ParseTreeWalker();
      SymbolDefListener symbolDefListener = new SymbolDefListener();
      walker.walk(symbolDefListener, ast);
      checkTimer.stopAndReport();

      convertFlowchartTimer.start();
      FlowchartGenVisitor visitor = new FlowchartGenVisitor();
      FlowchartFragment flowChart = visitor.visit(ast);

      FlowchartConnector connector = new FlowchartConnector(visitor.functionCallNodes, visitor.subFragments);
      connector.connect(flowChart.getGraph());
      convertFlowchartTimer.stopAndReport();
      this.graph = flowChart.getGraph();
      graphviz = Graphviz.fromGraph(flowChart.getGraph()).engine(Engine.DOT);
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
    }
    return this;
  }

  public CodeFlow width(@NotNull Integer width) {
    this.width = width;
    if (graphviz != null) {
      graphviz = graphviz.width(width);
    }
    return this;
  }

  public File toFile(@NotNull String pathName) throws IOException {
    if (!pathName.endsWith("." + format.fileExtension)) {
      pathName += ("." + format.fileExtension);
    }
    this.outFile = new File(getAndCreateDir(outDir) + pathName);

    if (useNative) {
      renderWithNativeLibrary(this.graph.toString(), format.name().toLowerCase(), outFile.getAbsolutePath());
    } else {
      if (graphviz != null) {
        try {
          graphviz.render(this.format).toFile(outFile);
        } catch (GraphvizException e) {
          logger.error(e.getMessage());
          renderWithNativeLibrary(this.graph.toString(), format.name().toLowerCase(), outFile.getAbsolutePath());
        }
      } else {
        throw new IllegalStateException("Please call CodeFlow#parse first");
      }
    }
    return this.outFile;
  }

  public BufferedImage toImage() throws IOException {
    if (useNative) {
      File file = SomeUtil.createTempFile(FlowchartNodeFactory.randomName(), "." + format.fileExtension);
      renderWithNativeLibrary(this.graph.toString(), format.name().toLowerCase(), file.getAbsolutePath());
      logger.debug("create tmp file: " + file.getAbsolutePath());
      return ImageIO.read(file);
    } else {
      if (graphviz != null) {
        try {
          return graphviz.render(this.format).toImage();
        } catch (GraphvizException e) {
          File file = SomeUtil.createTempFile(FlowchartNodeFactory.randomName(), "." + format.fileExtension);
          renderWithNativeLibrary(this.graph.toString(), format.name().toLowerCase(), file.getAbsolutePath());
          logger.debug("create tmp file: " + file.getAbsolutePath());
          return ImageIO.read(file);
        }
      } else {
        throw new IllegalStateException("Please call CodeFlow#parse first");
      }
    }
  }

  private boolean renderWithNativeLibrary(String dotString, String format, String filename) {
    SWIGTYPE_p_Agraph_t g = gv.readstring(dotString);
    gv.layout(g, "dot");
    return gv.render(g, format, filename);
  }

  private String getAndCreateDir(@NotNull String dir) throws IOException {
    if (!dir.endsWith("/")) {
      dir = dir + "/";
    }
    Files.createDirectories(new File(dir).getAbsoluteFile().toPath());
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

  public static CodeFlowBuilder builder() {
    return new CodeFlowBuilder();
  }


  public static class CodeFlowBuilder {
    private boolean supportClass;
    private boolean failFast;
    private boolean useNative;
    private Integer height;
    private Integer width;
    private String workDir;
    private String outDir;
    private Format format;

    CodeFlowBuilder() {
    }

    public CodeFlow.CodeFlowBuilder supportClass(boolean supportClass) {
      this.supportClass = supportClass;
      return this;
    }

    public CodeFlow.CodeFlowBuilder failFast(boolean failFast) {
      this.failFast = failFast;
      return this;
    }

    public CodeFlow.CodeFlowBuilder useNative(boolean useNative) {
      this.useNative = useNative;
      return this;
    }

    public CodeFlow.CodeFlowBuilder height(Integer height) {
      this.height = height;
      return this;
    }

    public CodeFlow.CodeFlowBuilder width(Integer width) {
      this.width = width;
      return this;
    }

    public CodeFlow.CodeFlowBuilder workDir(String workDir) {
      this.workDir = workDir;
      return this;
    }

    public CodeFlow.CodeFlowBuilder outDir(String outDir) {
      this.outDir = outDir;
      return this;
    }

    public CodeFlow.CodeFlowBuilder format(Format format) {
      this.format = format;
      return this;
    }

    public CodeFlow build() {
      return new CodeFlow(this.supportClass, this.failFast, this.useNative, this.height, this.width, this.workDir, this.outDir, this.format);
    }

    public String toString() {
      return "CodeFlow.CodeFlowBuilder(supportClass=" + this.supportClass + ", failFast=" + this.failFast + ", useNative=" + this.useNative + ", height=" + this.height + ", width=" + this.width + ", workDir=" + this.workDir + ", outDir=" + this.outDir + ", format=" + this.format + ", outFile=" + ")";
    }
  }
}

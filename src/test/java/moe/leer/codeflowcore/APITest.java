package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Format;
import moe.leer.codeflowcore.exception.CodeFlowException;
import moe.leer.codeflowcore.exception.SemanticErrorException;
import moe.leer.codeflowcore.exception.SyntaxErrorException;
import org.graphviz.SWIGTYPE_p_Agraph_t;
import org.graphviz.gv;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author leer
 * Created at 12/21/19 4:17 PM
 */
public class APITest extends BaseFlowchartTest {
  @Test(expectedExceptions = SyntaxErrorException.class)
  public void failFastTest() throws IOException, CodeFlowException {
    codeFlow.setFailFast(true).parse("boolean  a = false; \n" +
        "if (a) {").toFile("failFast");
    codeFlow.setFailFast(false);
  }

  public static void main(String[] args) throws IOException {
    CodeFlow codeFlow = CodeFlow.builder()
        .failFast(true)
        .useNative(true)
        .workDir("examples")
        .outDir("tests")
        .format(Format.PNG)
        .build();
    BufferedImage image = null;
    try {
      image = codeFlow.parseFile("ifCode.cf").toImage();
    } catch (CodeFlowException e) {
      e.printStackTrace();
    }
    JFrame frame = new JFrame();
    frame.getContentPane().setLayout(new FlowLayout());
    JPanel jPanel = new JPanel();
    frame.getContentPane().add(jPanel);
    jPanel.add(new JLabel(new ImageIcon(image)));
    frame.pack();
    frame.setVisible(true);
  }

  @Test
  public void testNative() {
    System.load("/usr/lib/graphviz/java/libgv.so");
    System.out.println(Format.JSON0.name());
//    gvContext();
//    SWIGTYPE_p_Agraph_t g = gv.graph("test");
//    SWIGTYPE_p_Agnode_t headNode = gv.node(g, "a");
//    SWIGTYPE_p_Agnode_t tailNode = gv.node(g, "b");
//    gv.edge(headNode, tailNode);
    SWIGTYPE_p_Agraph_t g = gv.read("subGraph.dot");
    gv.layout(g, "dot");
    boolean file = gv.render(g, "png", "graph.PNG");
    System.out.println("success? " + file);
//    boolean file = gv.write(g, "graph");
  }

  @Test(expectedExceptions = SyntaxErrorException.class, expectedExceptionsMessageRegExp = ".*From Lexer.*")
  public void testLexerError() {
    baseFlowchartTest("int a = 1;\n#", "testLexerError");
  }

  @Test(expectedExceptions = SyntaxErrorException.class, expectedExceptionsMessageRegExp = ".*From Parser.*")
  public void testParserError() {
//    baseFlowchartTest("if(a==1){else}", "testParserError");
    baseFlowchartTest(" int 1a = 1;", "testParserError");
  }

  @Test(expectedExceptions = SemanticErrorException.class)
  public void testSemanticError() {
    baseFlowchartTest("label:\n" +
        "if(a==1) {continue label;}", "testSemanticError");
  }

  @Test(expectedExceptions = SemanticErrorException.class)
  // enable semanticCheck() strict mode
  public void testVariableDefResolve() {
    codeFlow.setStrictMode(true);
    baseFlowchartTest("if(a == 1) {doSome();}", "testVariableDefResolve");
    codeFlow.setStrictMode(false);
  }
}

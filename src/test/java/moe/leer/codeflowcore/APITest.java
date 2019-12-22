package moe.leer.codeflowcore;

import guru.nidi.graphviz.engine.Format;
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
  public void failFastTest() throws IOException {
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
    BufferedImage image = codeFlow.parseFile("ifCode.cf").toImage();
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

}

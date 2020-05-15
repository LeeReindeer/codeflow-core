package moe.leer.codeflowcore;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.Shape;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.*;
import guru.nidi.graphviz.parse.Parser;
import moe.leer.codeflowcore.graph.Flowchart;
import moe.leer.codeflowcore.graph.FlowchartNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

/**
 * Test Graphviz-java's API
 *
 * @author leer
 * Created at 12/6/19 3:37 PM
 */
public class GraphTest {

  @Test
  public void testParseDotFile() throws IOException {
    Parser parser = new Parser();
    MutableGraph g1 = parser.read(new File("t.dot"));

    Assert.assertNotNull(g1);

    Graphviz.fromGraph(g1).render(Format.PNG).toFile(new File("./t3.png"));
    Graphviz.fromGraph(g1).render(Format.DOT).toFile(new File("./t3.dot"));
  }

  @Test
  public void testLinkSubGraph() throws IOException {
    MutableNode a0 = mutNode("a0");
    MutableNode a1 = mutNode("a1");
    MutableNode b0 = mutNode("b0");
    MutableNode b1 = mutNode("b1");
    a0.addLink(a1);
    b0.addLink(b1);

    MutableGraph g = mutGraph().setDirected(true).add(
        mutGraph("a").setCluster(true).setDirected(true).add(a0),
        mutGraph("b").setCluster(true).setDirected(true).add(b0)
    );
    LinkSource from = mutNode("a1");
    LinkSource to = mutNode("b0");
    from.links().add(from.linkTo((LinkTarget) to));
    g.add(from);

    Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("subGraph.png"));
    Graphviz.fromGraph(g).width(200).render(Format.DOT).toFile(new File("subGraph.dot"));
  }

  /**
   * sub graph must has a name start with "cluster"
   */
  @Test
  public void testSubFlowchart() throws IOException {
    FlowchartNode nodeA = Flowchart.startNode();
    FlowchartNode nodeB = Flowchart.processNode("b").add(Color.LIGHTBLUE, Style.FILLED);
    FlowchartNode end1 = Flowchart.endNode();
    FlowchartNode nodeC = Flowchart.startNode();
    FlowchartNode nodeD = Flowchart.processNode("d");
    FlowchartNode end2 = Flowchart.endNode();

    nodeA.addLink(nodeB);
    nodeB.addLink(end1);
    nodeC.addLink(nodeD);
    nodeD.addLink(end2);

    MutableGraph sub1 = mutGraph("cluster_ab").setDirected(true).add(nodeA).setCluster(true);
    MutableGraph sub2 = mutGraph("cluster_cd").setDirected(true).add(nodeC).setCluster(true);
    MutableGraph g = mutGraph().setDirected(true).add(sub1, sub2);
    sub1.graphAttrs().add(Label.of("function ab"));
    sub2.graphAttrs().add(Label.of("function cd"));

    linkNode2SubGraph(nodeB, nodeC, g);

    FlowchartNode start = Flowchart.startNode();
    FlowchartNode outCall = Flowchart.processNode("ab();");
    start.addLink(outCall);
    g.add(start);
    linkNode2SubGraph(outCall, nodeA, g);

    Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("subGraph.png"));
    Graphviz.fromGraph(g).width(200).render(Format.DOT).toFile(new File("subGraph.dot"));
  }

  public static void linkNode2SubGraph(FlowchartNode source, FlowchartNode targetInSub, MutableGraph rootGraph) {
    LinkSource from = source.isolateCopy();
    LinkTarget to = targetInSub.isolateCopy();
    from.links().add(from.linkTo(to).add(Style.DASHED));
    rootGraph.add(from);
  }

  @Test
  public void testPort() throws IOException {
    MutableNode init = mutNode("int a = 1");
    MutableNode node = mutNode("a < 1").add(Shape.DIAMOND);
    MutableNode end = mutNode("end");
    init.addLink(node);
    node.links().add(node.port(Compass.EAST).linkTo(end));
    MutableGraph g = mutGraph().setDirected(true).add(init);
    g.graphAttrs().add("splines", "false");

    Graphviz.fromGraph(g).render(Format.PNG).toFile(new File("port.png"));
    Graphviz.fromGraph(g).render(Format.DOT).toFile(new File("port.dot"));
  }

  /*
  static Graph binarySearchGraph() {
    MutableNode startNode = Flowchart.startNode("binary search");
    MutableNode processNode1 = Flowchart.processNode("int len = a.length;");
    MutableNode processNode2 = Flowchart.processNode("int l = 0, r = len - 1;");
    MutableNode whileNode = Flowchart.decisionNode("l < r");
    MutableNode midNode = Flowchart.processNode("int mid = (l + r) /2;");
    MutableNode ifNode = Flowchart.decisionNode("a[mid] > k");
    MutableNode ifChild = Flowchart.processNode("l = mid + 1");
    MutableNode ifNode2 = Flowchart.decisionNode("a[mid] > k");
    MutableNode ifChild2 = Flowchart.processNode("r = mid - 1");
    MutableNode ifChild3 = Flowchart.endNode("return mid");
    MutableNode notFind = Flowchart.endNode("return -1");
    MutableNode vEnd = Flowchart.endNode();
    Graph g = graph("binary search").directed()
        .with(
            startNode.addLink(processNode1),
            processNode1.addLink(processNode2),
            processNode2.addLink(whileNode),
            whileNode.addLink(
                to(midNode).with(Label.of("true")),
                to(notFind).with(Label.of("false"))
            ),
            midNode.addLink(ifNode),
            ifNode.addLink(
                to(ifChild).with(Label.of("true")),
                to(ifNode2).with(Label.of("false"))
            ),
            ifChild.addLink(whileNode),
            ifChild2.addLink(whileNode),
            ifNode2.addLink(
                to(ifChild2).with(Label.of("true")),
                to(ifChild3).with(Label.of("false"))
            ),
            ifChild3.addLink(vEnd),
            notFind.addLink(vEnd)
        );
    return g;
  }
*/

  /**
   * @param a
   * @param k
   * @return
   * @start binary search
   * @end end
   */
  static int binarySearch(int[] a, int k) {
    int len = a.length;
    int l = 0, r = len - 1;

    //@condition
    while (l < r) {
      int mid = (l + r) / 2;
      //@condition
      if (a[mid] < k) {
        //@process
        l = mid + 1;
      }
      //@condition
      else if (a[mid] > k) {
        r = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}

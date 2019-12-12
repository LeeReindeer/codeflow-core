package moe.leer.codeflowcore;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.LinkSource;
import guru.nidi.graphviz.model.LinkTarget;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;
import guru.nidi.graphviz.parse.Parser;
import moe.leer.codeflowcore.graph.Flowchart;
import moe.leer.codeflowcore.graph.FlowchartNode;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

/**
 * @author leer
 * Created at 12/6/19 3:37 PM
 */
public class TestGraph {

  public static void main(String[] args) throws IOException{
    testSubFlowchart();
  }

  public static void testParseDotFile() throws IOException {
    Parser parser = new Parser();
    MutableGraph g1 = parser.read(new File("t.dot"));
    Graphviz.fromGraph(g1).render(Format.PNG).toFile(new File("t3.png"));
    Graphviz.fromGraph(g1).render(Format.DOT).toFile(new File("t3.dot"));
  }

  public static void testLinkSubGraph() throws IOException {
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
  public static void testSubFlowchart() throws IOException {
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

    LinkSource from = nodeB.isolateCopy();
    LinkSource to = nodeC.isolateCopy();
    from.links().add(from.linkTo((LinkTarget) to));
    g.add(from);

    Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("subGraph.png"));
    Graphviz.fromGraph(g).width(200).render(Format.DOT).toFile(new File("subGraph.dot"));
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

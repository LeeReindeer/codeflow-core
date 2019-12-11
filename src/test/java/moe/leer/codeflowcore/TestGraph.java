package moe.leer.codeflowcore;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;
import moe.leer.codeflowcore.graph.Flowchart;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.model.Factory.*;

/**
 * @author leer
 * Created at 12/6/19 3:37 PM
 */
public class TestGraph {
  /**
   * start
   * if (!ok) {
   * correct it
   * }
   * end
   *
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {

    int[] a = new int[]{1, 2, 3, 5, 6};
    System.out.println(binarySearch(a, 5));

    MutableGraph g = mutGraph().setDirected(true).add(
        Flowchart.startNode().addLink(
            to(Flowchart.decisionNode("is ok"))
        ),
        Flowchart.decisionNode("is ok").addLink(
            to(Flowchart.endNode()).with(Label.of("true")),
            to(Flowchart.processNode("correct it")).with(Label.of("false"))
        ),
        Flowchart.processNode("correct it").addLink(Flowchart.endNode())
    );

    g.add(Flowchart.endNode().addLink(Flowchart.endNode()));

    Graph graph = graph().directed()
        .with(node("1").with(Label.of("a")).link(node("2").with(Label.of("a"))));
//    Graphviz.fromGraph(binarySearchGraph()).width(200).render(Format.PNG).toFile(new File("test3.png"));
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

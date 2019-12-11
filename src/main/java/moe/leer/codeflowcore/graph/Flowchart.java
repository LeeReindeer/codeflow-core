package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.attribute.Shape;

import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.fcNode;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.uniqueFcNode;

/**
 * To create flowchart node shapes which are define in ISO 5807:1985
 *
 * @author leer
 * Created at 12/6/19 3:49 PM
 */
public class Flowchart {

  public static FlowchartNode startNode() {
    return fcNode(FlowchartNodeType.START);
  }

  public static FlowchartNode startNode(String start) {
    return fcNode(FlowchartNodeType.START);
  }

  public static FlowchartNode endNode() {
    return fcNode(FlowchartNodeType.END);
  }

  /**
   * End nodes use same text are treated as the same node
   */
  public static FlowchartNode endNode(String end) {
    return fcNode(FlowchartNodeType.END);
  }

  /**
   * Create a UNIQUE node in <code>FlowchartType.PROCESS</code> type even if <code>process</code> text is same.
   */
  public static FlowchartNode processNode(String process) {
    return uniqueFcNode(process, FlowchartNodeType.PROCESS)
        .add(Shape.RECTANGLE);
  }

  /**
   * Create a UNIQUE node in <code>FlowchartType.DECISION</code> type even if <code>process</code> text is same.
   */
  public static FlowchartNode decisionNode(String decision) {
    return uniqueFcNode(decision, FlowchartNodeType.DECISION)
        .add(Shape.DIAMOND);
  }
}

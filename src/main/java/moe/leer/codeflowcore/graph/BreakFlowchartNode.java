package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.model.MutableNode;
import lombok.Getter;
import lombok.Setter;

/**
 * Break node is virtual node
 *
 * @author leer
 * Created at 12/20/19 2:24 PM
 */
public class BreakFlowchartNode extends FlowchartNode {

  @Getter
  @Setter
  private String label;

  public BreakFlowchartNode(MutableNode node,  String label) {
    super(node, FlowchartNodeType.PROCESS);
    this.label = label;
  }
}

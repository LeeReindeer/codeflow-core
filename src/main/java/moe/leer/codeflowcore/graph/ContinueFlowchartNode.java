package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.model.MutableNode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author leer
 * Created at 12/20/19 2:24 PM
 */
public class ContinueFlowchartNode extends FlowchartNode {

  @Getter
  @Setter
  private String label;

  public ContinueFlowchartNode(MutableNode node, String label) {
    super(node, FlowchartNodeType.PROCESS);
    this.label = label;
  }
}

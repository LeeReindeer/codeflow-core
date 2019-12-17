package moe.leer.codeflowcore.lang;

import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.model.LinkSource;
import guru.nidi.graphviz.model.LinkTarget;
import guru.nidi.graphviz.model.MutableGraph;
import moe.leer.codeflowcore.graph.FlowchartFragment;
import moe.leer.codeflowcore.graph.FlowchartNode;

import java.util.List;
import java.util.Map;

/**
 * Link function call node to function sub graph
 *
 * @author leer
 * Created at 12/16/19 9:58 PM
 */
public class FlowchartConnector {
  public final Map<FlowchartNode, List<String>> functionCallNodes;
  public final Map<String, FlowchartFragment> subFragments;

  public FlowchartConnector(Map<FlowchartNode, List<String>> functionCallNodes, Map<String, FlowchartFragment> subFragments) {
    this.functionCallNodes = functionCallNodes;
    this.subFragments = subFragments;
  }

  public void connect(MutableGraph rootGraph) {
    if (subFragments == null || subFragments.isEmpty()) return;
    for (Map.Entry<FlowchartNode, List<String>> nodeEntry : functionCallNodes.entrySet()) {
      FlowchartNode node = nodeEntry.getKey();
      String functionName = nodeEntry.getValue().get(0);
      if (subFragments.containsKey(functionName)) {
        linkNode2SubGraph(node, subFragments.get(functionName).getStart(), rootGraph);
      }
    }
  }

  private void linkNode2SubGraph(FlowchartNode source, FlowchartNode targetInSub, MutableGraph rootGraph) {
    LinkSource from = source.isolateCopy();
    LinkTarget to = targetInSub.isolateCopy();
    from.links().add(from.linkTo(to).add(Style.DASHED));
    rootGraph.add(from);
  }
}

package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.Compass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.compassLink;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.to;
import static moe.leer.codeflowcore.util.SomeUtil.asArrayList;

/**
 * Represent a fragment of flowchart
 * <p>
 * start node and end nodes is well linked.
 *
 * @author leer
 * Created at 12/6/19 8:35 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowchartFragment {

  /**
   * Create fragment contains only one node as both start and stop node
   */
  public static FlowchartFragment singleProcess(FlowchartNode start) {
    return new FlowchartFragment(start, asArrayList(start), FlowchartFragmentType.SEQUENCE);
  }

  public static FlowchartFragment create(FlowchartNode start, FlowchartNode... end) {
    return new FlowchartFragment(start, asArrayList(end), FlowchartFragmentType.SEQUENCE);
  }

  public static FlowchartFragment create(FlowchartFragmentType type, FlowchartNode start, FlowchartNode... end) {
    return new FlowchartFragment(start, asArrayList(end), type);
  }

  public FlowchartFragment(FlowchartNode start, List<FlowchartNode> stops) {
    this.start = start;
    this.stops = stops;
  }

  public FlowchartFragment(FlowchartNode start, List<FlowchartNode> stops, FlowchartFragmentType type) {
    this.type = type;
    this.start = start;
    this.stops = stops;
  }

  private FlowchartFragmentType type;

  /**
   * A start node can also be a stop node, like decision node
   */
  private FlowchartNode start;

  /**
   * A fragment can have many end node, cause <code>if</code> and <code>switch</code>'s condition branches.
   * <p>
   * A stop node here does not mean the end node in whole flowchart graph,
   * it can be an end node in whole flowchart or not.
   */
  private List<FlowchartNode> stops = new ArrayList<>(4);

  public void addStopNode(FlowchartNode node) {
    stops.add(node);
  }

  public void addStopNodes(List<FlowchartNode> nodes) {
    stops.addAll(nodes);
  }

  /**
   * Link this fragment's ends to other fragment's start
   */
  public void link(FlowchartFragment other) {
    for (FlowchartNode stop : this.stops) {
      if (this.getType() == FlowchartFragmentType.DO_WHILE) { // special port compass for "do while" loop
        stop.addLink(
            compassLink(stop, Compass.SOUTH, other.start).with(Flowchart.falseLable())
        );
      } else if (stop.getType() == FlowchartNodeType.DECISION && stop.isLinkable()) {
        stop.addFalseConditionLink(other.start);
      } else {
        stop.addLink(other.start);
      }
    }
    stops = other.stops;
  }

  public void linkNodeAsStart(FlowchartNode newStart) {
    newStart.addLink(start);
    start = newStart;
  }

  public void linkNodeAsStart(FlowchartNode newStart, Label linkName) {
    newStart.addLink(
        to(start).with(linkName)
    );
    start = newStart;
  }

  /**
   * newStart:startCompass -> start
   */
  public void linkNodeAsStart(FlowchartNode newStart, Compass startCompass, Label linkName) {
    newStart.addLink(compassLink(newStart, startCompass, start).with(linkName));
    start = newStart;
  }

  public void linkDecisionNodeAsTrueStart(FlowchartNode decisionNode) {
    decisionNode.addTrueConditionLink(start);
    start = decisionNode;
  }

  public void linkNode2Stop(FlowchartNode newStop) {
    for (FlowchartNode stop : stops) {
      stop.addLink(newStop);
    }
    this.stops = asArrayList(newStop);
  }

  public void linkDecisionNodeAsStop(FlowchartNode decisionNode) {
    for (FlowchartNode stop : stops) {
      stop.addLink(Compass.EAST, decisionNode, Compass.EAST);
    }
    this.stops = asArrayList(decisionNode);
  }

  public void linkNode2Stop(FlowchartNode newStop, Label linkName) {
    for (FlowchartNode stop : stops) {
      stop.addLink(
          to(newStop).with(linkName)
      );
    }
    this.stops = asArrayList(newStop);
  }

  public void removeStopNode(FlowchartNode stop) {
    stops.remove(stop);
  }
}

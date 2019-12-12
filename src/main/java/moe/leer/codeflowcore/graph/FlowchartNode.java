package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.attribute.Attributes;
import guru.nidi.graphviz.attribute.ForNode;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.MapAttributes;
import guru.nidi.graphviz.model.*;

import javax.annotation.Nullable;
import java.util.List;

import static guru.nidi.graphviz.model.Factory.mutNode;
import static java.util.Arrays.asList;

/**
 * Proxy of <code>MutableNode</code>
 *
 * @author leer
 * Created at 12/9/19 7:07 PM
 */
public class FlowchartNode implements MutableAttributed<FlowchartNode, ForNode>, LinkSource, LinkTarget {

  public final MutableNode node;
  private FlowchartNodeType type;

  public FlowchartNode(MutableNode node) {
    this.node = node;
  }

  public FlowchartNode(MutableNode node, FlowchartNodeType type) {
    this.node = node;
    this.type = type;
  }

  /**
   * Decision node has 2 out-degrees, other node only has one out-degree
   *
   * @return true if node's out-degree is sill not full
   */
  public boolean isLinkable() {
    if (type == FlowchartNodeType.DECISION) {
      return links().size() < 2;
    } else {
      return links().size() < 1;
    }
  }

  @Override
  public List<Link> links() {
    return node.links();
  }

  @Override
  public Link linkTo(LinkTarget target) {
    if (target instanceof FlowchartNode) {
      node.linkTo(((FlowchartNode) target).node); // add raw node
    }
    return node.linkTo(target);
  }

  @Override
  public void addTo(MutableGraph graph) {
    node.addTo(graph);
  }

  @Override
  public LinkTarget asLinkTarget() {
    return node.asLinkTarget();
  }

  /**
   * @return a link to it self
   */
  @Override
  public Link linkTo() {
    return node.linkTo();
  }

  @Override
  public LinkSource asLinkSource() {
    return node.asLinkSource();
  }

  @Override
  public FlowchartNode add(Attributes<? extends ForNode> attributes) {
    node.add(attributes);
    return this;
  }

  @Override
  public Attributes<? super ForNode> applyTo(MapAttributes<? super ForNode> attrs) {
    return node.applyTo(attrs);
  }

  @Nullable
  @Override
  public Object get(String key) {
    return node.get(key);
  }

  public MutableNode copy() {
    return mutNode(node.name()).addLink(node.links()).add(node.attrs());
  }

  /**
   * Copy node without links
   */
  public MutableNode isolateCopy() {
    return mutNode(node.name()).add(node.attrs());
  }

  @Override
  public String toString() {
    return node.toString();
  }

  public Label name() {
    return node.name();
  }

  public MutableAttributed<MutableNode, ForNode> attrs() {
    return node.attrs();
  }

  public FlowchartNode addLink(LinkTarget... targets) {
    addLink(asList(targets));
    return this;
  }

  public FlowchartNode addLink(List<? extends LinkTarget> targets) {
    for (LinkTarget target : targets) {
      addLink(target);
    }
    return this;
  }

  public FlowchartNode addLink(LinkTarget target) {
    if (this.isLinkable()) {
      links().add(linkTo(target));
    } else {
      throw new IllegalStateException("failed to link " + target + ", when node's out-degree is " + this.links().size());
    }
    return this;
  }

  public FlowchartNode addLink(String node) {
    this.node.addLink(mutNode(node));
    return this;
  }

  public FlowchartNode addLink(String... nodes) {
    this.node.addLink(nodes);
    return this;
  }

  public final FlowchartNode setName(Label name) {
    node.setName(name);
    return this;
  }

  public FlowchartNode setName(String name) {
    node.setName(Label.of(name));
    return this;
  }

  public FlowchartNodeType getType() {
    return type;
  }

  public FlowchartNode setType(FlowchartNodeType type) {
    this.type = type;
    return this;
  }
}

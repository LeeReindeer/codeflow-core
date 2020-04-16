package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.attribute.Attributes;
import guru.nidi.graphviz.attribute.ForNode;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.MapAttributes;
import guru.nidi.graphviz.model.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import moe.leer.codeflowcore.FlowchartConfig;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

import static guru.nidi.graphviz.model.Factory.mutNode;
import static java.util.Arrays.asList;
import static moe.leer.codeflowcore.exception.TodoException.TODO;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.compassLink;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.to;

/**
 * Proxy of <code>MutableNode</code>
 *
 * @author leer
 * Created at 12/9/19 7:07 PM
 */
public class FlowchartNode implements MutableAttributed<FlowchartNode, ForNode>, LinkSource, LinkTarget {

  public final MutableNode node;
  protected FlowchartNodeType type;

  @Getter
  @Setter
  @Accessors(chain = true)
  protected boolean abrupt; // return, throw

  // for condition node
  @Getter
  protected Link trueLink;
  @Getter
  protected Link falseLink;

  public FlowchartNode(@NotNull MutableNode node) {
    this.node = node;
  }

  public FlowchartNode(@NotNull MutableNode node, @NotNull FlowchartNodeType type) {
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

  @NotNull
  public String getLabelString() {
    Label label = (Label) node.get("label");
    return label == null ? "" : label.toString();
  }

  @Override
  public List<Link> links() {
    return node.links();
  }

  @Override
  public Link linkTo(@NotNull LinkTarget target) {
    if (target instanceof FlowchartNode) {
      node.linkTo(((FlowchartNode) target).node); // add raw node
    }
    return node.linkTo(target);
  }

  @Override
  public void addTo(@NotNull MutableGraph graph) {
    node.addTo(graph);
  }

  @NotNull
  @Override
  public LinkTarget asLinkTarget() {
    return node.asLinkTarget();
  }

  /**
   * @return a link to it self
   */
  @NotNull
  @Override
  public Link linkTo() {
    return node.linkTo();
  }

  @NotNull
  @Override
  public LinkSource asLinkSource() {
    return node.asLinkSource();
  }

  @NotNull
  @Override
  public FlowchartNode add(@NotNull Attributes<? extends ForNode> attributes) {
    node.add(attributes);
    return this;
  }

  @NotNull
  @Override
  public Attributes<? super ForNode> applyTo(@NotNull MapAttributes<? super ForNode> attrs) {
    return node.applyTo(attrs);
  }

  @Nullable
  @Override
  public Object get(@NotNull String key) {
    return node.get(key);
  }

  @NotNull
  public MutableNode copy() {
    return mutNode(node.name()).addLink(node.links()).add(node.attrs());
  }

  public PortNode port(String record) {
    return port(record, null);
  }

  public PortNode port(Compass compass) {
    return port(null, compass);
  }

  public PortNode port(String record, Compass compass) {
    return node.port(record, compass);
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

  public FlowchartNode addLink(@NotNull LinkTarget target) {
    if (this.isLinkable()) {
      links().add(linkTo(target));
    } else {
      throw new IllegalStateException(this + " failed to link " + target + ",\nwhen node's out-degree is " + this.links().size());
    }
    return this;
  }

  public FlowchartNode addLink(@NotNull LinkTarget target, Label label) {
    if (this.isLinkable()) {
      links().add(linkTo(target).with(label));
    } else {
      throw new IllegalStateException(this + " failed to link " + target + ",\nwhen node's out-degree is " + this.links().size());
    }
    return this;
  }

  public FlowchartNode addLink(Compass sourceCompass, FlowchartNode target, Compass targetCompass) {
    if (this.isLinkable()) {
      links().add(this.port(sourceCompass).linkTo(target.port(targetCompass)));
    } else {
      throw new IllegalStateException("failed to link " + target + ", when node's out-degree is " + this.links().size());
    }
    return this;
  }

  public FlowchartNode addLink(FlowchartNode target, Compass targetCompass) {
    return addLink(Compass.CENTER, target, Compass.CENTER);
  }

  public FlowchartNode addLink(Compass sourceCompass, FlowchartNode target) {
    return addLink(sourceCompass, target, Compass.CENTER);
  }


  public FlowchartNode addLink(@NotNull Link link) {
    if (this.isLinkable()) {
      links().add(link);
    } else {
      throw new IllegalStateException("failed add link " + link + ", when node's out-degree is " + this.links().size());
    }
    return this;
  }

  public FlowchartNode addTrueConditionLink(@NotNull FlowchartNode target, @NotNull String trueCondition) {
    if (type == FlowchartNodeType.DECISION) {
      Link link;
      if (StringUtils.isNotBlank(FlowchartConfig.decisionTrueCompass)) {
        link = compassLink(this,
            Compass.of(FlowchartConfig.decisionTrueCompass).get(),
            target).
            with(Label.of(trueCondition));
        addLink(link);
      } else {
        link = to(target).with(Label.of(trueCondition));
        addLink(link);
      }
      trueLink = link;
    } else {
      throw new IllegalStateException(this + " is not a decision node");
    }
    return this;
  }

  public FlowchartNode addTrueConditionLink(@NotNull FlowchartNode target) {
    return addTrueConditionLink(target, "true");
  }

  public FlowchartNode addFalseConditionLink(@NotNull FlowchartNode target) {
    return addFalseConditionLink(target, "false");
  }

  public FlowchartNode addFalseConditionLink(@NotNull FlowchartNode target, @NotNull String falseCondition) {
    if (type == FlowchartNodeType.DECISION) {
      Link link;
      if (StringUtils.isNotBlank(FlowchartConfig.decisionFalseCompass)) {
        link = compassLink(this, Compass.of(FlowchartConfig.decisionFalseCompass).get(), target).with(Label.of(falseCondition));
        addLink(link);
      } else {
        link = to(target).with(Label.of(falseCondition));
        addLink(link);
      }
      falseLink = link;
    } else {
      throw new IllegalStateException(this + " is not a decision node");
    }
    return this;
  }

  public FlowchartNode addFunctionCallLink(FlowchartNode function) {
    //todo
    throw TODO();
  }

  public FlowchartNode addCommentLink(FlowchartNode comment) {
    //todo
    throw TODO();
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

  // use reference-equality, because the node's link will changing
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof FlowchartNode)) return false;
    FlowchartNode node1 = (FlowchartNode) o;
    return node == node1.node && type == node1.type;
  }

  /**
   * hash code not change when add node link
   */
  @Override
  public int hashCode() {
    return Objects.hash(node.attrs(), type);
  }
}

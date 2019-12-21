package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.attribute.Font;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.Compass;
import guru.nidi.graphviz.model.Link;
import guru.nidi.graphviz.model.LinkTarget;
import org.apache.commons.lang3.RandomStringUtils;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static guru.nidi.graphviz.model.Factory.mutNode;

/**
 * @author leer
 * @see Flowchart
 * Created at 12/9/19 7:49 PM
 */
public class FlowchartNodeFactory {

  public static long nodeCount;

  @NotNull
  public static String randomName() {
    if (nodeCount == Long.MAX_VALUE) nodeCount = 0;
    return "-" + nodeCount++ + RandomStringUtils.randomAlphabetic(1);
  }

  public static FlowchartNode fcNode(String name, FlowchartNodeType type) {
    return modifyFontSize(new FlowchartNode(mutNode(name, false).add(Label.of(name))).setType(type), name);
  }

  public static FlowchartNode uniqueFcNode(String name, FlowchartNodeType type) {
    return modifyFontSize(new FlowchartNode(mutNode(name + randomName(), false).add(Label.of(name))).setType(type), name);
  }

  public static FlowchartNode fcNode(@NotNull FlowchartNodeType type) {
    return new FlowchartNode(mutNode(Label.of(type.name()))).setType(type);
  }

  public static FlowchartNode uniqueFcNode(@NotNull FlowchartNodeType type) {
    return new FlowchartNode(mutNode(type.name() + randomName())).add(Label.of(type.name())).setType(type);
  }

  @NotNull
  public static Link to(LinkTarget node) {
    if (node instanceof FlowchartNode) {
      return Link.to(((FlowchartNode) node).node);
    }
    return Link.to(node);
  }

  /**
   * source:sourceCompass -> target:targetCompass
   *
   * @return link between nodes
   */
  @NotNull
  public static Link compassLink(@NotNull FlowchartNode source, Compass sourceCompass, @NotNull FlowchartNode target, Compass targetCompass) {
    return source.port(sourceCompass).linkTo(target.port(targetCompass));
  }

  /**
   * source:sourceCompass -> target
   */
  @NotNull
  public static Link compassLink(@NotNull FlowchartNode source, Compass sourceCompass, @NotNull FlowchartNode target) {
    return source.port(sourceCompass).linkTo(target.node);
  }

  // default font size is 14
  @Contract("_, _ -> param1")
  private static FlowchartNode modifyFontSize(@NotNull FlowchartNode node, @NotNull String text) {
    if (text.length() >= 30 && text.length() < 40) {
      node.add(Font.size(12));
    } else if (text.length() >= 40) {
      node.add(Font.size(10));
    }
    return node;
  }
}

package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.Compass;
import guru.nidi.graphviz.model.Link;
import guru.nidi.graphviz.model.LinkTarget;
import org.apache.commons.lang3.RandomStringUtils;

import static guru.nidi.graphviz.model.Factory.mutNode;

/**
 * @author leer
 * @see Flowchart
 * Created at 12/9/19 7:49 PM
 */
public class FlowchartNodeFactory {

  public static long nodeCount;

  private static String randomName() {
    if (nodeCount == Long.MAX_VALUE) nodeCount = 0;
    return "-" + nodeCount++ + RandomStringUtils.randomAlphabetic(1);
  }

  public static FlowchartNode fcNode(String name, FlowchartNodeType type) {
    return new FlowchartNode(mutNode(name, false).add(Label.of(name))).setType(type);
  }

  public static FlowchartNode uniqueFcNode(String name, FlowchartNodeType type) {
    return new FlowchartNode(mutNode(name + randomName(), false).add(Label.of(name))).setType(type);
  }

  public static FlowchartNode fcNode(FlowchartNodeType type) {
    return new FlowchartNode(mutNode(Label.of(type.name()))).setType(type);
  }

  public static FlowchartNode uniqueFcNode(FlowchartNodeType type) {
    return new FlowchartNode(mutNode(type.name() + randomName())).add(Label.of(type.name())).setType(type);
  }

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
  public static Link compassLink(FlowchartNode source, Compass sourceCompass, FlowchartNode target, Compass targetCompass) {
    return source.port(sourceCompass).linkTo(target.port(targetCompass));
  }

  /**
   * source:sourceCompass -> target
   */
  public static Link compassLink(FlowchartNode source, Compass sourceCompass, FlowchartNode target) {
    return source.port(sourceCompass).linkTo(target.port(Compass.CENTER));
  }
}

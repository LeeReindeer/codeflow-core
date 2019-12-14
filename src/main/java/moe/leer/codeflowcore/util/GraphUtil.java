package moe.leer.codeflowcore.util;

import guru.nidi.graphviz.model.Compass;
import moe.leer.codeflowcore.graph.FlowchartNode;

/**
 * @author leer
 * Created at 12/14/19 2:01 PM
 */
public class GraphUtil {
  /**
   * source:sourceCompass -> target:targetCompass
   */
  public static void addLinkWithCompass(FlowchartNode source, Compass sourceCompass, FlowchartNode target, Compass targetCompass) {
    if (source.isLinkable()) {
      source.links().add(source.port(sourceCompass).linkTo(target.port(targetCompass)));
    } else {
      throw new IllegalStateException("failed to link " + target + ", when node's out-degree is " + source.links().size());
    }
  }
}

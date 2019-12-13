package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.Shape;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import moe.leer.codeflowcore.util.ANTLRUtil;
import org.antlr.v4.runtime.ParserRuleContext;

import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.fcNode;
import static moe.leer.codeflowcore.graph.FlowchartNodeFactory.uniqueFcNode;

/**
 * To create flowchart node shapes which are define in ISO 5807:1985.
 * <p>
 * When method with "same" prefix create same node ref, others creat a different ref.
 *
 * @author leer
 * Created at 12/6/19 3:49 PM
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Flowchart {

  public static FlowchartNode startNode() {
    return uniqueFcNode(FlowchartNodeType.START);
  }


  public static FlowchartNode sameStartNode() {
    return fcNode(FlowchartNodeType.START);
  }

  public static FlowchartNode startNode(String start) {
    return uniqueFcNode(start, FlowchartNodeType.START);
  }

  public static FlowchartNode sameStartNode(String start) {
    return uniqueFcNode(start, FlowchartNodeType.START);
  }

  public static FlowchartNode endNode() {
    return uniqueFcNode(FlowchartNodeType.END);
  }

  public static FlowchartNode sameEndNode() {
    return fcNode(FlowchartNodeType.END);
  }

  public static FlowchartNode endNode(String end) {
    return uniqueFcNode(end, FlowchartNodeType.END);
  }

  /**
   * End nodes use same text are treated as the same node
   */
  public static FlowchartNode sameEndNode(String end) {
    return uniqueFcNode(end, FlowchartNodeType.END);
  }

  /**
   * Create a UNIQUE node in <code>FlowchartType.PROCESS</code> type even if <code>process</code> text is same.
   */
  public static FlowchartNode processNode(String process) {
    return uniqueFcNode(process, FlowchartNodeType.PROCESS)
        .add(Shape.RECTANGLE);
  }

  public static FlowchartNode processNode(ParserRuleContext ctx) {
    String process = ANTLRUtil.getTextFromInputStream(ctx.start.getStartIndex(),
        ctx.stop.getStopIndex(),
        ctx.start.getInputStream()
    );
    return processNode(process);
  }

  /**
   * Create a UNIQUE node in <code>FlowchartType.DECISION</code> type even if <code>process</code> text is same.
   */
  public static FlowchartNode decisionNode(String decision) {
    return uniqueFcNode(decision, FlowchartNodeType.DECISION)
        .add(Shape.DIAMOND);
  }

  public static FlowchartNode decisionNode(ParserRuleContext ctx) {
    String decision = ANTLRUtil.getTextFromInputStream(ctx.start.getStartIndex(),
        ctx.stop.getStopIndex(),
        ctx.start.getInputStream()
    );
    return decisionNode(decision);
  }

  public static Label trueLabel() {
    return Label.of("true");
  }

  public static Label falseLable() {
    return Label.of("false");
  }
}

package moe.leer.codeflowcore.graph;

import guru.nidi.graphviz.attribute.*;
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
    String process = ANTLRUtil.getTextFromInputStream(ctx);
    return processNode(process);
  }

  public static FlowchartNode functionCallNode(String exp, FlowchartNodeType type) {
    return uniqueFcNode(exp, type)
        .add(getShape(type), Color.LIGHTBLUE, Style.FILLED);
  }

  public static FlowchartNode functionCallNode(ParserRuleContext context, FlowchartNodeType type) {
    return functionCallNode(ANTLRUtil.getTextFromInputStream(context), type);
  }

  /**
   * Create a UNIQUE node in <code>FlowchartType.DECISION</code> type even if <code>process</code> text is same.
   */
  public static FlowchartNode decisionNode(String decision) {
    // special font size for decision node
    FlowchartNode node  = uniqueFcNode(decision, FlowchartNodeType.DECISION)
        .add(Shape.DIAMOND);
    if (decision.length() >= 10 && decision.length() <= 20) {
      node.add(Font.size(12));
    } else if (decision.length() > 20){
      node.add(Font.size(8));
    }
    return node;
  }

  public static FlowchartNode decisionNode(ParserRuleContext ctx) {
    String decision = ANTLRUtil.getTextFromInputStream(ctx);
    return decisionNode(decision);
  }

  public static Label trueLabel() {
    return Label.of("true");
  }

  public static Label falseLable() {
    return Label.of("false");
  }

  public static Shape getShape(FlowchartNodeType type) {
    switch (type) {
      case START:
      case END:
        return Shape.ELLIPSE; // default shape
      case PROCESS:
        return Shape.RECTANGLE;
      case DECISION:
        return Shape.DIAMOND;
      default:
        return Shape.ELLIPSE;
    }
  }

}

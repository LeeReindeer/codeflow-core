package moe.leer.codeflowcore;

import lombok.Setter;

/**
 * @author leer
 * Created at 12/20/19 6:10 PM
 */
//@Accessors(chain = true, fluent = true)
public final class FlowchartConfig {

  @Setter
  public static String functionColor = "lightblue";
  // You can set decision nodes' compass,
  // but the best you can do is not interfering the layout engine.
  // It will avoid most line intersections in graphviz.
  // Nevertheless, if you sill want to customize, the recommend preference is commented following.
  public static String decisionTrueCompass; // s
  public static String decisionFalseCompass; // w
  public static String doWhileDecisionTrueCompass; // e
  public static String doWhileDecisionFalseCompass; // s


  public static void setDecisionCompass(String decisionTrueCompass, String decisionFalseCompass) {
    FlowchartConfig.decisionTrueCompass = decisionTrueCompass;
    FlowchartConfig.decisionFalseCompass = decisionFalseCompass;
  }

  public static void setDoWhileDecisionCompass(String doWhileDecisionTrueCompass, String doWhileDecisionFalseCompass) {
    FlowchartConfig.doWhileDecisionTrueCompass = doWhileDecisionTrueCompass;
    FlowchartConfig.doWhileDecisionFalseCompass = doWhileDecisionFalseCompass;
  }

}

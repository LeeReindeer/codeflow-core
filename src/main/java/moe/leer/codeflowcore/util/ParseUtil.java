package moe.leer.codeflowcore.util;

import moe.leer.codeflowcore.lang.parser.CodeFlowParser;

/**
 * @author leer
 * Created at 12/16/19 8:33 PM
 */
public class ParseUtil {

  /**
   * Example:
   * int a(int a, int b) {
   * }
   * -> "int,int"
   * <p>
   * int a(float a, float b) {
   * }
   * -> "float,float"
   *
   * @return function args as type, return empty string while no args
   */
  public static String getFunctionType(CodeFlowParser.FunctionDeclareContext context) {
    StringBuilder sb = new StringBuilder();
    if (context != null) {
      if (context.formalParams().formalParamList() == null) return "";
      //fixme lastFormalParam...
      for (int i = 0; i < context.formalParams().formalParamList().formalParam().size(); i++) {
        CodeFlowParser.FormalParamContext paramContext = context.formalParams().formalParamList().formalParam().get(i);
        if (i != 0) sb.append(",");
        sb.append(ANTLRUtil.getTextFromInputStream(paramContext.variableType()));
      }
      if (context.formalParams().formalParamList().lastFormalParam() != null) {
        sb.append(",")
            .append(ANTLRUtil.getTextFromInputStream(context.formalParams().formalParamList().lastFormalParam().variableType()))
            .append("...");
      }
      return sb.toString();
    }
    return null;
  }

  // not support lastFormalParam
  public static int getFunctionArgsSize(CodeFlowParser.FunctionDeclareContext context) {
    if (context.formalParams().formalParamList() == null) return 0;
    int rst = context.formalParams().formalParamList().formalParam().size();
    if (context.formalParams().formalParamList().lastFormalParam() != null) {
      rst++;
    }
    return rst;
  }

  public static int getFunctionArgsSize(CodeFlowParser.FunctionCallContext context) {
    if (context.functionCall().size() != 0) {
      CodeFlowParser.ArgumentsContext lastCallArgs = context.functionCall().get(context.functionCall().size() - 1).arguments();
      return lastCallArgs.expressionList().expression().size();
    } else {
      if (context.arguments().expressionList() != null) {
        return context.arguments().expressionList().expression().size();
      } else {
        return 0;
      }
    }
  }

  /**
   * Example:
   * int a(int a, int b) {
   * }
   * -> "a:int,int"
   * <p>
   * int a(float a, float b) {
   * }
   * -> "a:float,float"
   */
  public static String getFunctionFullName(CodeFlowParser.FunctionDeclareContext context) {
    return context.IDENTIFIER().getText() + ":" + getFunctionType(context);
  }

  /**
   * Example:
   * int a(int a, int b) {
   * }
   * -> "a:2"
   * <p>
   * int a(float a, float b) {
   * }
   * -> "a:2"
   * <p>
   * int a(int a) {
   * }
   * -> "a:1"
   * <p>
   * DO NOT support method overload except method with different size of arguments
   */
  public static String getFunctionFullName2(CodeFlowParser.FunctionDeclareContext context) {
    return context.IDENTIFIER().getText() + ":" + getFunctionArgsSize(context);
  }

  public static String getFunctionFullName2(CodeFlowParser.FunctionCallContext context) {
    String name;
    // use last function call name
    if (context.functionCall().size() != 0) {
      String lastCallArgs = ANTLRUtil.getTextFromInputStream(context.functionCall().get(context.functionCall().size() - 1).arguments());
      name = ANTLRUtil.getTextFromInputStream(context);
      name = name.substring(0, name.length() - lastCallArgs.length());
    } else {
      name = context.functionCallName().IDENTIFIER().get(context.functionCallName().IDENTIFIER().size() - 1).getText();
//      name = context.functionCallName().getText();
    }
    return name + ":" + getFunctionArgsSize(context);
  }
}

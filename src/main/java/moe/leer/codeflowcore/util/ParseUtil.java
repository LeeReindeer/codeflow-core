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
      //fixme ignored lastFormalParam...
      for (int i = 0; i < context.formalParams().formalParamList().formalParam().size(); i++) {
        CodeFlowParser.FormalParamContext paramContext = context.formalParams().formalParamList().formalParam().get(i);
        if (i != 0) sb.append(",");
        sb.append(ANTLRUtil.getTextFromInputStream(paramContext.variableType()));
      }
      return sb.toString();
    }
    return null;
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
  public static String getFunctionFullName(String functionShortName, CodeFlowParser.FunctionDeclareContext context) {
    return functionShortName + ":" + getFunctionType(context);
  }
}

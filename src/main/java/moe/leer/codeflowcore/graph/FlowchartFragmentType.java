package moe.leer.codeflowcore.graph;

/**
 * @author leer
 * Created at 12/9/19 10:21 PM
 */
public enum FlowchartFragmentType {
  IF,
  SWITCH,
  FOR,
  WHILE,
  DO_WHILE,
  //  LOOP,
  GOTO,
  BREAK,
  CONTINUE,
  END,// return
  SEQUENCE, // normal sequential statements
  FUNCTION,
  FUNCTION_CALL
}

package moe.leer.codeflowcore.lang.semantic.scope;

import moe.leer.codeflowcore.lang.parser.CodeFlowLexer;

/**
 * @author leer
 * Created at 12/16/19 9:07 AM
 */
public class Symbol {
  String name;

  String text;
  /**
   * type define in lexer
   *
   * @see CodeFlowLexer#VOID
   */
  String type;
  // this symbol's scope
  Scope scope;

  public Symbol(String name, String text, String type) {
    this.name = name;
    this.text = text;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getText() {
    return text;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return name + ":" + text;
  }
}

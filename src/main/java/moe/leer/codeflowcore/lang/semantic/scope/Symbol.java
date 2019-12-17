package moe.leer.codeflowcore.lang.semantic.scope;

import lombok.Data;
import moe.leer.codeflowcore.lang.parser.CodeFlowLexer;

/**
 * @author leer
 * Created at 12/16/19 9:07 AM
 */
@Data
public class Symbol {
  final String name;

  final String text;
  /**
   * type define in lexer
   *
   * @see CodeFlowLexer#VOID
   */
  final String type;
  // this symbol's scope
  Scope scope;

  public Symbol(String name, String text, String type) {
    this.name = name;
    this.text = text;
    this.type = type;
  }

  @Override
  public String toString() {
    return name + ":" + text;
  }
}

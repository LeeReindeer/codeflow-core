package moe.leer.codeflowcore.lang.semantic.scope;

import java.util.List;

/**
 * @author leer
 * Created at 12/16/19 9:07 AM
 */
public interface Scope {
  String getScopeName();

  /**
   * if symbol is not exits in this scop, find in the parent scope
   */
  Scope getParentScope();

  List<Scope> getChildrenScope();

  /**
   * Define a symbol in this scope
   */
  void define(Symbol symbol);

  /**
   * Find a symbol in scope
   *
   * @return null if not found
   */
  Symbol resolve(String name);

  Symbol resolveFunction(String name);

}

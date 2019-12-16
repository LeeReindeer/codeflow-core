package moe.leer.codeflowcore.lang.semantic.scope;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Function scope only contains function param symbol, not function block.
 * As a function symbol it is used to resolve a function call
 *
 * @author leer
 * Created at 12/16/19 9:22 AM
 */
public class FunctionSymbol extends Symbol implements Scope {

  Scope parentScope;
  Map<String, Symbol> args = new LinkedHashMap<>();

  public final List<Scope> childrenScopes = new ArrayList<>();

  public FunctionSymbol(String name, String type, Scope parentScope) {
    super(name, name, type);
    this.parentScope = parentScope;
  }

  @Override
  public String getScopeName() {
    return name;
  }

  @Override
  public Scope getParentScope() {
    return parentScope;
  }

  @Override
  public void define(Symbol symbol) {
    args.put(symbol.name, symbol);
    symbol.scope = this;
  }

  /**
   * resolve a function param
   */
  @Override
  public Symbol resolve(String name) {
    Symbol s = args.get(name);
    if (s != null) return s;
    if (parentScope != null) return parentScope.resolve(name);
    return null;
  }

  /**
   * There's no function call in function declare scope, it usually in a block scope
   * <p>
   * int a(int x, int y //function scope) { // block scope
   * }
   */
  @Override
  public Symbol resolveFunction(String name) {
    return parentScope.resolveFunction(name);
  }

  @Override
  public List<Scope> getChildrenScope() {
    return childrenScopes;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{function ").append(name).append(args.values());
    for (int i = 0; i < childrenScopes.size(); i++) {
      if (i != 0) {
        sb.append(", ");
      }
      sb.append(childrenScopes.get(i));
    }
    sb.append("}");
    return sb.toString();
  }
}

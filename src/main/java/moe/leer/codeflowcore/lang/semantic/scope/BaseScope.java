package moe.leer.codeflowcore.lang.semantic.scope;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leer
 * Created at 12/16/19 9:13 AM
 */
public abstract class BaseScope implements Scope {
  //  String name;
  Scope parentScope;

  public final List<Scope> childrenScopes = new ArrayList<>();

  // symbol name -> symbol
  public final Map<String, VariableSymbol> symbols = new LinkedHashMap<>(8);

  public final Map<String, FunctionSymbol> functionSymbols = new LinkedHashMap<>(8);

  public BaseScope(Scope parentScope) {
    this.parentScope = parentScope;
  }

  @Override
  public Scope getParentScope() {
    return parentScope;
  }

  @Override
  public void define(Symbol symbol) {
    if (symbol instanceof VariableSymbol) {
      symbols.put(symbol.name, (VariableSymbol) symbol);
    } else if (symbol instanceof FunctionSymbol) {
      functionSymbols.put(symbol.name, (FunctionSymbol) symbol);
    }
    symbol.scope = this; // symbol knows its scope
  }

  @Override
  public Symbol resolve(String name) {
    Symbol s = symbols.get(name);
    if (s != null) return s;
    if (parentScope != null) return parentScope.resolve(name);
    return null;
  }

  @Override
  public Symbol resolveFunction(String name) {
    Symbol s = functionSymbols.get(name);
    if (s != null) return s;
    if (parentScope != null) return parentScope.resolveFunction(name);
    return null;
  }

  @Override
  public List<Scope> getChildrenScope() {
    return childrenScopes;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getScopeName()).append("{");
    for (String s : symbols.keySet()) {
      sb.append(s).append(", ");
    }
    for (String s : functionSymbols.keySet()) {
      sb.append("function:").append(s).append(", ");
    }
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

package moe.leer.codeflowcore.lang.semantic;

import lombok.Getter;
import lombok.Setter;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.lang.semantic.scope.GlobalScope;
import moe.leer.codeflowcore.lang.semantic.scope.Scope;
import moe.leer.codeflowcore.lang.semantic.scope.Symbol;
import moe.leer.codeflowcore.lang.semantic.scope.VariableSymbol;
import moe.leer.codeflowcore.util.ANTLRUtil;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * @author leer
 * Created at 12/16/19 2:10 PM
 */
public class ScopesManager {
  public final ParseTreeProperty<Scope> scopes;
  @Getter
  @Setter
  GlobalScope globalScope;
  @Getter
  @Setter
  Scope currentScope;

  public ScopesManager(ParseTreeProperty<Scope> scopes) {
    this.scopes = scopes;
  }

  public ScopesManager(ParseTreeProperty<Scope> scopes, GlobalScope globalScope) {
    this.scopes = scopes;
    this.globalScope = globalScope;
  }

  public void saveScope(ParserRuleContext context, Scope scope) {
    scopes.put(context, scope);
  }

  public Scope obtainScope(ParserRuleContext context) {
    return scopes.get(context);
  }

  public void enterAndSaveScope(ParserRuleContext context, Scope scope) {
    currentScope.getChildrenScope().add(scope);
    currentScope = scope;
    scopes.put(context, scope);
  }

  public void enterScope(ParserRuleContext context) {
    currentScope = obtainScope(context);
  }

  public void leaveScope() {
    if (currentScope == globalScope) return;
    currentScope = currentScope.getParentScope();
  }

  public Symbol resolve(String name) {
    if (currentScope != null) {
      return currentScope.resolve(name);
    }
    return null;
  }

  public Symbol resolveFunction(String name) {
    if (currentScope != null) {
      return currentScope.resolveFunction(name);
    }
    return null;
  }

  public void defineVar(CodeFlowParser.VariableTypeContext typeContext, String name, String text) {
//    int type = typeContext.start.getType();
    VariableSymbol variableSymbol = new VariableSymbol(name, text, ANTLRUtil.getTextFromInputStream(typeContext));
    Symbol definedSymbol = currentScope.resolve(name);
    // duplicated symbol in same scope
    if (definedSymbol != null && definedSymbol.getScope() == currentScope) {
      error(typeContext.start, "Duplicated variable declare: " + name);
    }
    currentScope.define(variableSymbol);
  }

  public void error(Token t, String msg) {
    System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
  }
}

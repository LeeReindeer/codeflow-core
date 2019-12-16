package moe.leer.codeflowcore.lang.semantic;

import moe.leer.codeflowcore.lang.parser.CodeFlowBaseListener;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.lang.semantic.scope.GlobalScope;
import moe.leer.codeflowcore.lang.semantic.scope.Scope;
import moe.leer.codeflowcore.lang.semantic.scope.VariableSymbol;
import moe.leer.codeflowcore.util.ANTLRUtil;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * @author leer
 * Created at 12/16/19 2:10 PM
 */
public class BaseSymbolListener extends CodeFlowBaseListener {
  public final ParseTreeProperty<Scope> scopes;
  protected GlobalScope globalScope;
  protected Scope currentScope;

  public BaseSymbolListener(ParseTreeProperty<Scope> scopes) {
    this.scopes = scopes;
  }

  public BaseSymbolListener(ParseTreeProperty<Scope> scopes, GlobalScope globalScope) {
    this.scopes = scopes;
    this.globalScope = globalScope;
  }

  protected void saveScope(ParserRuleContext context, Scope scope) {
    scopes.put(context, scope);
  }


  protected Scope obtainScope(ParserRuleContext context) {
    return scopes.get(context);
  }

  protected void leaveScope() {
    if (currentScope == globalScope) return;
    currentScope = currentScope.getParentScope();
  }

  protected void defineVar(CodeFlowParser.VariableTypeContext typeContext, String name, String text) {
//    int type = typeContext.start.getType();
    VariableSymbol variableSymbol = new VariableSymbol(name, text, ANTLRUtil.getTextFromInputStream(typeContext));
    currentScope.define(variableSymbol);
  }

  public GlobalScope getGlobalScope() {
    return globalScope;
  }
}

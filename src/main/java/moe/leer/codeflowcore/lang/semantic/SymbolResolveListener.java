package moe.leer.codeflowcore.lang.semantic;

import lombok.Getter;
import moe.leer.codeflowcore.lang.parser.CodeFlowBaseListener;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.lang.semantic.scope.GlobalScope;
import moe.leer.codeflowcore.lang.semantic.scope.Scope;
import moe.leer.codeflowcore.lang.semantic.scope.Symbol;
import moe.leer.codeflowcore.util.ANTLRUtil;
import moe.leer.codeflowcore.util.ParseUtil;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * @author leer
 * Created at 12/16/19 1:04 PM
 */
public class SymbolResolveListener extends CodeFlowBaseListener {

  @Getter
  private ScopesManager scopesManager;

  public SymbolResolveListener(ParseTreeProperty<Scope> scopes, GlobalScope globalScope) {
    scopesManager = new ScopesManager(scopes, globalScope);
  }

  public void enterProgram(CodeFlowParser.ProgramContext ctx) {
    scopesManager.currentScope = scopesManager.globalScope;
  }

  @Override
  public void enterFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    scopesManager.currentScope = scopesManager.obtainScope(ctx);
  }

  @Override
  public void exitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    scopesManager.leaveScope();
  }

  @Override
  public void enterBlock(CodeFlowParser.BlockContext ctx) {
    scopesManager.currentScope = scopesManager.obtainScope(ctx);
  }

  @Override
  public void exitBlock(CodeFlowParser.BlockContext ctx) {
    scopesManager.leaveScope();
  }

  @Override
  public void exitVariableDeclarator(CodeFlowParser.VariableDeclaratorContext ctx) {
//    String name = ANTLRUtil.getTextFromInputStream(ctx.variableDeclaratorId());
//    Symbol var = currentScope.resolve(name);
  }

  /**
   * Resolve a variable
   */
  @Override
  public void exitVariableAssign(CodeFlowParser.VariableAssignContext ctx) {
    String name = ANTLRUtil.getTextFromInputStream(ctx.variableId);
    Symbol var = scopesManager.resolve(name);
    if (var == null) {
      scopesManager.error(ctx.variableId.getStart(), "no such variable: " + name);
    }
  }

  /**
   * Resolve a function call
   */
  @Override
  public void exitFunctionCall(CodeFlowParser.FunctionCallContext ctx) {
    //fixme function overload
//    String functionName = ANTLRUtil.getTextFromInputStream(ctx.functionCallName());
    // only last function call
    if (ctx.functionCall().size() == 0) {
      String functionName = ParseUtil.getFunctionFullName2(ctx);
      Symbol func = scopesManager.resolveFunction(functionName);
      if (func == null) {
        scopesManager.error(ctx.functionCallName().getStart(), "no such function: " + functionName);
      }
    }
  }

  /**
   * resolve a variable or an object in expression
   */
  @Override
  public void exitVariableRef(CodeFlowParser.VariableRefContext ctx) {
    //todo
    String name = ctx.IDENTIFIER(0).getText();
    Symbol var = scopesManager.resolve(name);
    if (var == null) {
      scopesManager.error(ctx.getStart(), "no such variable: " + name);
    }
  }


}

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

import java.util.ArrayList;
import java.util.List;

/**
 * @author leer
 * Created at 12/16/19 1:04 PM
 */
public class SymbolResolveListener extends CodeFlowBaseListener {

  @Getter
  private ScopesManager scopesManager;
  @Getter
  private List<String> errorMessages = new ArrayList<>(4);

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
      String error = "no such variable: " + name;
      errorMessages.add(error);
      scopesManager.error(ctx.variableId.getStart(), error);
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
        String error = "no such function: " + functionName;
        errorMessages.add(error);
        scopesManager.error(ctx.functionCallName().getStart(), error);
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
      String error = "no such variable: " + name;
      errorMessages.add(error);
      scopesManager.error(ctx.getStart(), error);
    }
  }


}

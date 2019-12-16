package moe.leer.codeflowcore.lang.semantic;

import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.lang.semantic.scope.GlobalScope;
import moe.leer.codeflowcore.lang.semantic.scope.Scope;
import moe.leer.codeflowcore.lang.semantic.scope.Symbol;
import moe.leer.codeflowcore.util.ANTLRUtil;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * @author leer
 * Created at 12/16/19 1:04 PM
 */
public class SymbolResolveListener extends BaseSymbolListener {

  public SymbolResolveListener(ParseTreeProperty<Scope> scopes, GlobalScope globalScope) {
    super(scopes, globalScope);
  }

  public void enterProgram(CodeFlowParser.ProgramContext ctx) {
    currentScope = globalScope;
  }

  @Override
  public void enterFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    currentScope = obtainScope(ctx);
  }

  @Override
  public void exitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    leaveScope();
  }

  @Override
  public void enterBlock(CodeFlowParser.BlockContext ctx) {
    currentScope = obtainScope(ctx);
  }

  @Override
  public void exitBlock(CodeFlowParser.BlockContext ctx) {
    leaveScope();
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
    Symbol var = currentScope.resolve(name);
    if (var == null) {
      error(ctx.variableId.getStart(), "no such variable: " + name);
    }
  }

  /**
   * Resolve a function call
   */
  @Override
  public void exitFunctionCall(CodeFlowParser.FunctionCallContext ctx) {
    //todo function overload
    String functionName = ANTLRUtil.getTextFromInputStream(ctx.functionCallName());
    Symbol func = currentScope.resolveFunction(functionName);
    if (func == null) {
      error(ctx.functionCallName().getStart(), "no such function: " + functionName);
    }
  }

  /**
   * resolve a variable or an object in expression
   */
  @Override
  public void exitVariableRef(CodeFlowParser.VariableRefContext ctx) {
    //todo
    String name = ctx.IDENTIFIER(0).getText();
    Symbol var = currentScope.resolve(name);
    if (var == null) {
      error(ctx.getStart(), "no such variable: " + name);
    }
  }

  public void error(Token t, String msg) {
    System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
  }
}

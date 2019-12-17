package moe.leer.codeflowcore.lang.semantic;

import lombok.Getter;
import moe.leer.codeflowcore.lang.parser.CodeFlowBaseListener;
import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.lang.semantic.scope.BlockScope;
import moe.leer.codeflowcore.lang.semantic.scope.ClassScope;
import moe.leer.codeflowcore.lang.semantic.scope.FunctionSymbol;
import moe.leer.codeflowcore.lang.semantic.scope.GlobalScope;
import moe.leer.codeflowcore.util.ANTLRUtil;
import moe.leer.codeflowcore.util.ParseUtil;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Build scope and define symbols, warning duplicated declaration
 *
 * @author leer
 * Created at 12/16/19 1:04 PM
 */
public class SymbolDefListener extends CodeFlowBaseListener {

  @Getter
  private final ScopesManager scopesManager;

  public SymbolDefListener() {
    scopesManager = new ScopesManager(new ParseTreeProperty<>());
  }

  /**
   * Set global scope
   */
  @Override
  public void enterProgram(CodeFlowParser.ProgramContext ctx) {
    scopesManager.globalScope = new GlobalScope();
    scopesManager.currentScope = scopesManager.globalScope;
  }

  @Override
  public void enterClassDeclaration(CodeFlowParser.ClassDeclarationContext ctx) {
    scopesManager.enterScope(ctx, new ClassScope(scopesManager.currentScope));
  }

  @Override
  public void exitClassDeclaration(CodeFlowParser.ClassDeclarationContext ctx) {
    scopesManager.leaveScope();
  }

  @Override
  public void enterBlock(CodeFlowParser.BlockContext ctx) {
    BlockScope blockScope = new BlockScope(scopesManager.currentScope);
    scopesManager.enterScope(ctx, blockScope);
  }

  @Override
  public void exitBlock(CodeFlowParser.BlockContext ctx) {
    scopesManager.leaveScope();
  }

  @Override
  public void enterFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    String type = ParseUtil.getFunctionType(ctx);
    //todo function overload
    String functionFullName = ParseUtil.getFunctionFullName2(ctx);
    FunctionSymbol function = new FunctionSymbol(functionFullName, type, scopesManager.currentScope);
    // duplicated function
    FunctionSymbol fun;
    if ((fun = (FunctionSymbol) scopesManager.resolveFunction(functionFullName)) != null) {
      //method declare is not conflict with top level function
      if (!(scopesManager.currentScope instanceof ClassScope) || !(fun.getScope() instanceof GlobalScope)) {
        scopesManager.error(ctx.start, "Overload method not support! Duplicated function declare: " + ctx.IDENTIFIER().getText());
      }
    }
    scopesManager.currentScope.define(function); // save function symbol
    scopesManager.enterScope(ctx, function);
  }

  @Override
  public void exitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    scopesManager.leaveScope();
  }

  /**
   * Define a function param
   */
  @Override
  public void enterFormalParam(CodeFlowParser.FormalParamContext ctx) {
    scopesManager.defineVar(ctx.variableType(),
        ANTLRUtil.getTextFromInputStream(ctx.variableDeclaratorId()),
//        ctx.variableDeclaratorId().IDENTIFIER().getText(),
        null);
  }

  /**
   * Define variables
   */
  @Override
  public void exitVariableDeclarators(CodeFlowParser.VariableDeclaratorsContext ctx) {
    CodeFlowParser.VariableTypeContext typeContext = ctx.variableType();
    for (CodeFlowParser.VariableDeclaratorContext varContext : ctx.variableDeclarator()) {
      scopesManager.defineVar(typeContext,
          ANTLRUtil.getTextFromInputStream(varContext.variableDeclaratorId()),
          ANTLRUtil.getTextFromInputStream(varContext.variableInitializer())
      );
    }
  }
}

package moe.leer.codeflowcore.lang.semantic;

import moe.leer.codeflowcore.lang.parser.CodeFlowParser;
import moe.leer.codeflowcore.lang.semantic.scope.BlockScope;
import moe.leer.codeflowcore.lang.semantic.scope.FunctionSymbol;
import moe.leer.codeflowcore.lang.semantic.scope.GlobalScope;
import moe.leer.codeflowcore.util.ANTLRUtil;
import moe.leer.codeflowcore.util.ParseUtil;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Build scope and define symbols
 *
 * @author leer
 * Created at 12/16/19 1:04 PM
 */
public class SymbolDefListener extends BaseSymbolListener {
  public SymbolDefListener() {
    super(new ParseTreeProperty<>());
  }

  /**
   * Set global scope
   */
  @Override
  public void enterProgram(CodeFlowParser.ProgramContext ctx) {
    globalScope = new GlobalScope();
    currentScope = globalScope;
  }

  @Override
  public void enterBlock(CodeFlowParser.BlockContext ctx) {
    BlockScope blockScope = new BlockScope(currentScope);
    currentScope.getChildrenScope().add(blockScope);
    currentScope = blockScope;
    saveScope(ctx, blockScope);
  }

  @Override
  public void exitBlock(CodeFlowParser.BlockContext ctx) {
    leaveScope();
  }

  @Override
  public void enterFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    String type = ParseUtil.getFunctionType(ctx);
    //todo function overload
    FunctionSymbol function = new FunctionSymbol(ctx.IDENTIFIER().getText(), type, currentScope);
    currentScope.define(function); // save function symbol
    saveScope(ctx, function); // save function scope
    currentScope.getChildrenScope().add(function);
    currentScope = function;
  }

  @Override
  public void exitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx) {
    leaveScope();
  }

  /**
   * Define a function param
   */
  @Override
  public void enterFormalParam(CodeFlowParser.FormalParamContext ctx) {
    defineVar(ctx.variableType(),
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
      defineVar(typeContext,
          ANTLRUtil.getTextFromInputStream(varContext.variableDeclaratorId()),
          ANTLRUtil.getTextFromInputStream(varContext.variableInitializer())
      );
    }
  }
}

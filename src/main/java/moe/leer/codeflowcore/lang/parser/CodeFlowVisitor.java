// Generated from CodeFlow.g4 by ANTLR 4.8

package moe.leer.codeflowcore.lang.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodeFlowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodeFlowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CodeFlowParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#topLevelFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelFunctions(CodeFlowParser.TopLevelFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#topLevelStmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelStmts(CodeFlowParser.TopLevelStmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(CodeFlowParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(CodeFlowParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CodeFlowParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CodeFlowParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CodeFlowParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(CodeFlowParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(CodeFlowParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#classOrInterfacemodifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfacemodifier(CodeFlowParser.ClassOrInterfacemodifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#classOrInterfacemodifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfacemodifiers(CodeFlowParser.ClassOrInterfacemodifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#functionDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(CodeFlowParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(CodeFlowParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(CodeFlowParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(CodeFlowParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams(CodeFlowParser.FormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#formalParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamList(CodeFlowParser.FormalParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParam(CodeFlowParser.FormalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#lastFormalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParam(CodeFlowParser.LastFormalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(CodeFlowParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(CodeFlowParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#fieldDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclare(CodeFlowParser.FieldDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#constructorDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclare(CodeFlowParser.ConstructorDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssign(CodeFlowParser.VariableAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(CodeFlowParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CodeFlowParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(CodeFlowParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(CodeFlowParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(CodeFlowParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#objectDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclarator(CodeFlowParser.ObjectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CodeFlowParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(CodeFlowParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CodeFlowParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CodeFlowParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(CodeFlowParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(CodeFlowParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#switchCaseGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseGroup(CodeFlowParser.SwitchCaseGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(CodeFlowParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(CodeFlowParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(CodeFlowParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#forExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpressions(CodeFlowParser.ForExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#forInitExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitExp(CodeFlowParser.ForInitExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#forConditionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditionExp(CodeFlowParser.ForConditionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#forUpdateExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateExp(CodeFlowParser.ForUpdateExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#enhancedForExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForExpression(CodeFlowParser.EnhancedForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(CodeFlowParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CodeFlowParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CodeFlowParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CodeFlowParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CodeFlowParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#functionCallName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallName(CodeFlowParser.FunctionCallNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableRef(CodeFlowParser.VariableRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(CodeFlowParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(CodeFlowParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(CodeFlowParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(CodeFlowParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(CodeFlowParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(CodeFlowParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(CodeFlowParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#typeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOrVoid(CodeFlowParser.TypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CodeFlowParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CodeFlowParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#shiftOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(CodeFlowParser.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CodeFlowParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CodeFlowParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(CodeFlowParser.FloatLiteralContext ctx);
}
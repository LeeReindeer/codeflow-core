// Generated from CodeFlow.g4 by ANTLR 4.8

package moe.leer.codeflowcore.lang.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodeFlowParser}.
 */
public interface CodeFlowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CodeFlowParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CodeFlowParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#topLevelFunctions}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelFunctions(CodeFlowParser.TopLevelFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#topLevelFunctions}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelFunctions(CodeFlowParser.TopLevelFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#topLevelStmts}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelStmts(CodeFlowParser.TopLevelStmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#topLevelStmts}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelStmts(CodeFlowParser.TopLevelStmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(CodeFlowParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(CodeFlowParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CodeFlowParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CodeFlowParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CodeFlowParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CodeFlowParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CodeFlowParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CodeFlowParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(CodeFlowParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(CodeFlowParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(CodeFlowParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(CodeFlowParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(CodeFlowParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(CodeFlowParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#classOrInterfacemodifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfacemodifier(CodeFlowParser.ClassOrInterfacemodifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#classOrInterfacemodifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfacemodifier(CodeFlowParser.ClassOrInterfacemodifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#classOrInterfacemodifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfacemodifiers(CodeFlowParser.ClassOrInterfacemodifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#classOrInterfacemodifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfacemodifiers(CodeFlowParser.ClassOrInterfacemodifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#functionDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#functionDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CodeFlowParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CodeFlowParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(CodeFlowParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(CodeFlowParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(CodeFlowParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(CodeFlowParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(CodeFlowParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(CodeFlowParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(CodeFlowParser.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(CodeFlowParser.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamList(CodeFlowParser.FormalParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamList(CodeFlowParser.FormalParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(CodeFlowParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(CodeFlowParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#lastFormalParam}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParam(CodeFlowParser.LastFormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#lastFormalParam}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParam(CodeFlowParser.LastFormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(CodeFlowParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(CodeFlowParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(CodeFlowParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(CodeFlowParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#fieldDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclare(CodeFlowParser.FieldDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#fieldDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclare(CodeFlowParser.FieldDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#constructorDeclare}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclare(CodeFlowParser.ConstructorDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#constructorDeclare}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclare(CodeFlowParser.ConstructorDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableAssign}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(CodeFlowParser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableAssign}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(CodeFlowParser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(CodeFlowParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(CodeFlowParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CodeFlowParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CodeFlowParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(CodeFlowParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(CodeFlowParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CodeFlowParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CodeFlowParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(CodeFlowParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(CodeFlowParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#objectDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclarator(CodeFlowParser.ObjectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#objectDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclarator(CodeFlowParser.ObjectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CodeFlowParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CodeFlowParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(CodeFlowParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(CodeFlowParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CodeFlowParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CodeFlowParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CodeFlowParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CodeFlowParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(CodeFlowParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(CodeFlowParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(CodeFlowParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(CodeFlowParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#switchCaseGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseGroup(CodeFlowParser.SwitchCaseGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#switchCaseGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseGroup(CodeFlowParser.SwitchCaseGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(CodeFlowParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(CodeFlowParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(CodeFlowParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(CodeFlowParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(CodeFlowParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(CodeFlowParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#forExpressions}.
	 * @param ctx the parse tree
	 */
	void enterForExpressions(CodeFlowParser.ForExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#forExpressions}.
	 * @param ctx the parse tree
	 */
	void exitForExpressions(CodeFlowParser.ForExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#forInitExp}.
	 * @param ctx the parse tree
	 */
	void enterForInitExp(CodeFlowParser.ForInitExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#forInitExp}.
	 * @param ctx the parse tree
	 */
	void exitForInitExp(CodeFlowParser.ForInitExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#forConditionExp}.
	 * @param ctx the parse tree
	 */
	void enterForConditionExp(CodeFlowParser.ForConditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#forConditionExp}.
	 * @param ctx the parse tree
	 */
	void exitForConditionExp(CodeFlowParser.ForConditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#forUpdateExp}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateExp(CodeFlowParser.ForUpdateExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#forUpdateExp}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateExp(CodeFlowParser.ForUpdateExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#enhancedForExpression}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForExpression(CodeFlowParser.EnhancedForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#enhancedForExpression}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForExpression(CodeFlowParser.EnhancedForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(CodeFlowParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(CodeFlowParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CodeFlowParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CodeFlowParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CodeFlowParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CodeFlowParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CodeFlowParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CodeFlowParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CodeFlowParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CodeFlowParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#functionCallName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallName(CodeFlowParser.FunctionCallNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#functionCallName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallName(CodeFlowParser.FunctionCallNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void enterVariableRef(CodeFlowParser.VariableRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void exitVariableRef(CodeFlowParser.VariableRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(CodeFlowParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(CodeFlowParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(CodeFlowParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(CodeFlowParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(CodeFlowParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(CodeFlowParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(CodeFlowParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(CodeFlowParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(CodeFlowParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(CodeFlowParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(CodeFlowParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(CodeFlowParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(CodeFlowParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(CodeFlowParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrVoid(CodeFlowParser.TypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrVoid(CodeFlowParser.TypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CodeFlowParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CodeFlowParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CodeFlowParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CodeFlowParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(CodeFlowParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(CodeFlowParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CodeFlowParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CodeFlowParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(CodeFlowParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(CodeFlowParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(CodeFlowParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(CodeFlowParser.FloatLiteralContext ctx);
}
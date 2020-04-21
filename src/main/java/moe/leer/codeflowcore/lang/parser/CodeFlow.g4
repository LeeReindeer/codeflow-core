// a Java like grammar
grammar CodeFlow;

import CommonLexer;

@header {
package moe.leer.codeflowcore.lang.parser;
}

@parser::members {
 public static boolean supportClass;
}

// support toplevel function, toplevel statement
program
    : packageDeclaration? importDeclaration* declaration*
    ;

topLevelFunctions
    : functionDeclare+
    ;

topLevelStmts
    : blockStatement+
    ;

packageDeclaration
    :   'package' qualifiedName ';'
    ;

importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;

declaration
    : {supportClass}? classDeclaration
    | topLevelFunctions
    | topLevelStmts
    | ';'
    ;

classDeclaration
    :   classOrInterfacemodifiers CLASS IDENTIFIER typeArguments? (EXTENDS variableType)?
        (IMPLEMENTS typeList)?
        classBody
    ;

classBody
    :   '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    :   ';'
    |   'static'? block
    |   classOrInterfacemodifiers member
    ;

member
    : functionDeclare
    | fieldDeclare
    | constructorDeclare
    | classDeclaration
    ;

classOrInterfacemodifier
    : PUBLIC
    | PROTECTED
    | PRIVATE
    | ABSTRACT
    | STATIC
    | FINAL // class only
    ;

classOrInterfacemodifiers
    : classOrInterfacemodifier*
    ;

functionDeclare
    : classOrInterfacemodifiers typeOrVoid IDENTIFIER formalParams
      (THROWS qualifiedNameList)?
      functionBody
    ;

functionBody
    : block
    | ';'
    ;

qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

// generic type no wildcard
typeArguments
    :   '<' typeArgument (',' typeArgument)* '>'
    ;

typeArgument
    :   variableType
    |   '?' (('extends' | 'super') variableType)?
    ;

formalParams
    : '(' formalParamList? ')'
    ;

formalParamList
    : formalParam (',' formalParam)* (',' lastFormalParam)?
    ;

formalParam
    : variableModifier? variableType variableDeclaratorId
    ;

lastFormalParam
    : variableModifier? variableType '...' variableDeclaratorId
    ;

variableModifier
    : FINAL
    ;

qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

fieldDeclare
    : classOrInterfacemodifiers variableDeclarators ';'?
    ;

constructorDeclare
    : IDENTIFIER formalParams (THROWS qualifiedNameList)? constructorBody=block
    ;

variableAssign
    : variableId=expression '=' variableInitializer
    ;

variableDeclarators
    : variableType variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

objectDeclarator
    : IDENTIFIER IDENTIFIER '=' NEW IDENTIFIER'('expressionList?')'
    ;

// Statement

block
    : '{' blockStatements '}'
    ;

blockStatements
    : blockStatement*
    ;

blockStatement
    : statement
    ;

statement
    : blockStmt=block
    | ifBlock
    | switchBlock
    | forBlock
    | whileBlock
    | doWhileBlock
    | returnToken=RETURN expression? ';'?
    | throwToken=THROW expression? ';'?
    | breakToken=BREAK IDENTIFIER? ';'?
    | continueToken=CONTINUE IDENTIFIER? ';'?
    | labelToken=IDENTIFIER ':' statement // label
    | emptyStmt=SEMI
    | variableDeclarators ';'?
    | variableAssign ';'?
    | expressionStmt=expression ';'? // 表达式语句
    ;

ifBlock
    // fixme else (a == 3)
    : IF parExpression statement (ELSE statement)?
    ;

// LIMITATION: force default case at the last
switchBlock
    : SWITCH parExpression '{'
      switchCaseGroup*
      DEFAULT ':' defaultStmt=blockStatements
    '}'
    ;

switchCaseGroup
    : switchCase+ blockStatements
    ;

switchCase
    : CASE constantExpression=expression ':'
    | CASE IDENTIFIER ':'
//    | DEFAULT ':'
    ;

forBlock
    : FOR '(' forExpressions ')' statement
    ;

whileBlock
    : WHILE parExpression statement
    ;

doWhileBlock
    :  DO block WHILE parExpression ';'?
    ;

forExpressions
    : enhancedForExpression
    | forInitExp? SEMI forConditionExp? SEMI forUpdateExp?
    ;

forInitExp
    : variableDeclarators
    | expressionList
    ;

forConditionExp
    : expression
    ;

forUpdateExp
    : expressionList
    ;

enhancedForExpression
    : variableType variableDeclaratorId ':' expression
    ;


// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

// 优先级以产生式的顺序来表达
// bop -> binary op
expression
    : functionCall
    | variableRef
    | functionCall '.' variableRef   // example: nodes().size;
    | primary
    | expression '[' expression ']' // array
    | '(' expression ')'
    | NEW creator
    | expression postfix=('++'|'--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('!'|'~') expression
    | '(' variableType ')' expression // type convert
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression // <<, >>>, >>
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | ternaryCondition=expression '?' ternaryTrueExp=expression ':' ternaryFalseExp=expression //Ternary operator
    | <assoc=right> expression //所有赋值运算都是右结合，先计算右边的值
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    ;

functionCall
    : functionCallName arguments  ('.' functionCall)*
    ;

arguments
    : '(' expressionList? ')'
    ;

expressionList
    : expression (',' expression)*
    ;

functionCallName
    : IDENTIFIER ('.' IDENTIFIER)*
    | THIS ('.' IDENTIFIER)*  // this
    | SUPER ('.' IDENTIFIER)+  // super
    ;

variableRef
    : IDENTIFIER ('.' IDENTIFIER)*
    | THIS ('.' IDENTIFIER)*  // this
    | SUPER ('.' IDENTIFIER)+  // super
    ;

// TYPE

typeList
    : variableType (',' variableType)*
    ;

variableType
    : (classOrInterfaceType | primitiveType) ('[' ']')*
    ;

creator
    :   createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   classOrInterfaceType
    |   primitiveType
    ;

classCreatorRest
    : arguments classBody?
    ;

// support object array
arrayCreatorRest
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

classOrInterfaceType
    :   IDENTIFIER typeArguments? ('.' IDENTIFIER typeArguments? )*
    ;

typeOrVoid
    : variableType
    | 'void'
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | BYTE
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    | STRING
    ;

primary
    : literal
    | IDENTIFIER
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;
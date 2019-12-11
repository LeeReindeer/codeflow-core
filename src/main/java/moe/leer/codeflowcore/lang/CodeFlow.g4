// a Java like grammar
grammar CodeFlow;

import CommonLexer;

@header {
package moe.leer.codeflowcore.lang;
}

// todo new Object

accessModifiers
    : PUBLIC
    | PROTECTED
    | PRIVATE
    ;

functionDeclare
    : (accessModifiers? ((STATIC? FINAL?)|(FINAL? STATIC?))) typeOrVoid IDENTIFIER formalParams ('[' ']')*
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
    : (accessModifiers? ((STATIC? FINAL?)|(FINAL? STATIC?)))  variableDeclarators ';'?
    ;

constructorDeclare
    : IDENTIFIER formalParams (THROWS qualifiedNameList)? constructorBody=block
    ;

variableAssign
    : leftVariable '=' variableInitializer
    ;

leftVariable
    : (THIS|SUPER|IDENTIFIER)('.'IDENTIFIER)+
    | IDENTIFIER
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
    | (THIS|SUPER|IDENTIFIER)('.'IDENTIFIER)+
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

objectDeclarator
    : IDENTIFIER IDENTIFIER '=' NEW IDENTIFIER'('expressionList?')'
    ;

// Statement

program
    : blockStatements
    | functionDeclare
    | fieldDeclare
//    | classDeclare
    ;

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
    | forBlock
    | whileBlock
    | doWhileBlock
    | returnToken=RETURN expression? ';'?
    | breakToken=BREAK IDENTIFIER? ';'?
    | gotoToken=GOTO IDENTIFIER ';'?
    | labelStmt=IDENTIFIER ':' statement // label
    | emptyStmt=SEMI
    | variableDeclarators ';'?
    | objectDeclarator ';'?
    | variableAssign ';'?
    | expressionStmt=expression ';'? // 表达式语句
    ;

ifBlock
    // fixme else (a == 3)
    : IF parBooleanExpression statement (ELSE statement)?
    ;

forBlock
    : FOR '(' forExpressions ')' statement
    ;

whileBlock
    : WHILE parBooleanExpression statement
    ;

doWhileBlock
    :  DO statement WHILE parBooleanExpression
    ;

forExpressions
    : enhancedForExpression
    | forInitExp? ';' forConditionExp? ';' forUpdateExp?
    ;

forInitExp
    : variableDeclarators
    | expressionList
    ;

forConditionExp
    : booleanExpression
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

parBooleanExpression
    : '(' booleanExpression ')'
    ;

booleanExpression
    : BOOL_LITERAL
    | IDENTIFIER
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression // <<, >>>, >>
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&&' expression
    | expression bop='||' expression
    ;

// 优先级以产生式的顺序来表达
// bop -> binary op
expression
    //fixme support this
    : primary
    | functionCall
    | objectRef
    | expression '[' expression ']' // array
    | '(' expression ')'
    | expression postfix=('++'|'--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('!'|'~') expression
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
    | expression bop='?' expression ':' expression
    | <assoc=right> expression //所有赋值运算都是右结合，先计算右边的值
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    ;

functionCall
    : objectRef '(' args=expressionList? ')' ('.' functionCall)*
//    | THIS '(' expressionList? ')'  // this()
//    | SUPER '(' expressionList? ')' // super call
    ;

expressionList
    : expression (',' expression)*
    ;

objectRef
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
//    |
    ;

classOrInterfaceType
    : IDENTIFIER ('.' IDENTIFIER)*
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
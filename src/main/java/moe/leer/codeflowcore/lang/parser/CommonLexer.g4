 // modify from https://github.com/antlr/grammars-v4/blob/master/java/JavaParser.g4

 lexer grammar CommonLexer;

 // Keywords

 // type
// VAR:                'var';
// VAL:                'val';
 VOID:               'void';
 STRING:             'string';
 INT:                'int';
 SHORT:              'short';
 DOUBLE:             'double';
 FLOAT:              'float';
 CHAR:               'char';
 LONG:               'long';
 BOOLEAN:            'boolean';
 BYTE:               'byte';

 FINAL:              'final';

 // object
 ABSTRACT:           'abstract';
 CLASS:              'class';
 EXTENDS:            'extends';
 ENUM:               'enum';
 IMPLEMENTS:         'implements';
 NEW:                'new';
 PACKAGE:            'package';
 PRIVATE:            'private';
 PUBLIC:             'public';
 PROTECTED:          'protected';
 INTERFACE:          'interface';
 INSTANCEOF:         'instanceof';
 STATIC:             'static';
 THIS:               'this';
 SUPER:              'super';
 IMPORT:             'import';

// control flow
 BREAK:              'break';
 CASE:               'case';
 CONTINUE:           'continue';
 DEFAULT:            'default';
 DO:                 'do';
 ELSE:               'else';
 FOR:                'for';
 IF:                 'if';
 GOTO:               'goto';
 RETURN:             'return';
 SWITCH:             'switch';
 WHILE:              'while';

// NATIVE:             'native';
// STRICTFP:           'strictfp';
// SYNCHRONIZED:       'synchronized';

 TRY:                'try';
 CATCH:              'catch';
 THROW:              'throw';
 FINALLY:            'finally';
 THROWS:             'throws';

// CONST:              'const';
// ASSERT:             'assert';
// TRANSIENT:          'transient';
// VOLATILE:           'volatile';

 // Literals

 DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
 HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
 OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
 BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

 FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
              |       Digits (ExponentPart [fFdD]? | [fFdD])
              ;

 HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

 BOOL_LITERAL:       'true'
             |       'false'
             ;

 CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

 STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';
 NULL_LITERAL:       'null';
 // Separators
 LPAREN:             '(';
 RPAREN:             ')';
 LBRACE:             '{';
 RBRACE:             '}';
 LBRACK:             '[';
 RBRACK:             ']';
 SEMI:               ';';
 COMMA:              ',';
 DOT:                '.';
 // Operators
 GT:                 '>';
 LT:                 '<';
 BANG:               '!';
 TILDE:              '~';
 QUESTION:           '?';
 COLON:              ':';
 EQUAL:              '==';
 LE:                 '<=';
 GE:                 '>=';
 NOTEQUAL:           '!=';
 AND:                '&&';
 OR:                 '||';
 INC:                '++';
 DEC:                '--';
 ADD:                '+';
 SUB:                '-';
 MUL:                '*';
 DIV:                '/';
 MOD:                '%';
 BITAND:             '&';
 BITOR:              '|';
 CARET:              '^';
 //https://stackoverflow.com/questions/24236798/how-do-i-correctly-parse-generic-types-with-antlr
// LSHIFT:             '<<';
// RSHIFT:             '>>';
// URSHIFT:            '>>>';

 ASSIGN:             '=';
 ADD_ASSIGN:         '+=';
 SUB_ASSIGN:         '-=';
 MUL_ASSIGN:         '*=';
 DIV_ASSIGN:         '/=';
 AND_ASSIGN:         '&=';
 OR_ASSIGN:          '|=';
 XOR_ASSIGN:         '^=';
 MOD_ASSIGN:         '%=';
 LSHIFT_ASSIGN:      '<<=';
 RSHIFT_ASSIGN:      '>>=';
 URSHIFT_ASSIGN:     '>>>=';

 ARROW:              '->';
 COLONCOLON:         '::';
 // Additional symbols not defined in the lexical specification
 AT:                 '@';
 ELLIPSIS:           '...';
 // Whitespace and comments
 WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
 COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
 LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

 // Identifiers

 IDENTIFIER:         Letter LetterOrDigit*;

 // Fragment rules

 fragment ExponentPart
     : [eE] [+-]? Digits
     ;

 fragment EscapeSequence
     : '\\' [btnfr"'\\]
     | '\\' ([0-3]? [0-7])? [0-7]
     | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
     ;
 fragment HexDigits
     : HexDigit ((HexDigit | '_')* HexDigit)?
     ;
 fragment HexDigit
     : [0-9a-fA-F]
     ;
 fragment Digits
     : [0-9] ([0-9_]* [0-9])?
     ;
 fragment LetterOrDigit
     : Letter
     | [0-9]
     ;
 fragment Letter
     : [a-zA-Z$_] // these are the "java letters" below 0x7F
     | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
     | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
     ;
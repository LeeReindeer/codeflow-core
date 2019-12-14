// Generated from CodeFlow.g4 by ANTLR 4.7.2

package moe.leer.codeflowcore.lang;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeFlowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, STRING=2, INT=3, SHORT=4, DOUBLE=5, FLOAT=6, CHAR=7, LONG=8, BOOLEAN=9, 
		BYTE=10, FINAL=11, ABSTRACT=12, CLASS=13, EXTENDS=14, ENUM=15, IMPLEMENTS=16, 
		NEW=17, PACKAGE=18, PRIVATE=19, PUBLIC=20, PROTECTED=21, INTERFACE=22, 
		INSTANCEOF=23, STATIC=24, THIS=25, SUPER=26, IMPORT=27, BREAK=28, CASE=29, 
		CONTINUE=30, DEFAULT=31, DO=32, ELSE=33, FOR=34, IF=35, GOTO=36, RETURN=37, 
		SWITCH=38, WHILE=39, TRY=40, CATCH=41, THROW=42, FINALLY=43, THROWS=44, 
		DECIMAL_LITERAL=45, HEX_LITERAL=46, OCT_LITERAL=47, BINARY_LITERAL=48, 
		FLOAT_LITERAL=49, HEX_FLOAT_LITERAL=50, BOOL_LITERAL=51, CHAR_LITERAL=52, 
		STRING_LITERAL=53, NULL_LITERAL=54, LPAREN=55, RPAREN=56, LBRACE=57, RBRACE=58, 
		LBRACK=59, RBRACK=60, SEMI=61, COMMA=62, DOT=63, GT=64, LT=65, BANG=66, 
		TILDE=67, QUESTION=68, COLON=69, EQUAL=70, LE=71, GE=72, NOTEQUAL=73, 
		AND=74, OR=75, INC=76, DEC=77, ADD=78, SUB=79, MUL=80, DIV=81, MOD=82, 
		BITAND=83, BITOR=84, CARET=85, LSHIFT=86, RSHIFT=87, URSHIFT=88, ASSIGN=89, 
		ADD_ASSIGN=90, SUB_ASSIGN=91, MUL_ASSIGN=92, DIV_ASSIGN=93, AND_ASSIGN=94, 
		OR_ASSIGN=95, XOR_ASSIGN=96, MOD_ASSIGN=97, LSHIFT_ASSIGN=98, RSHIFT_ASSIGN=99, 
		URSHIFT_ASSIGN=100, ARROW=101, COLONCOLON=102, AT=103, ELLIPSIS=104, WS=105, 
		COMMENT=106, LINE_COMMENT=107, IDENTIFIER=108;
	public static final int
		RULE_accessModifiers = 0, RULE_functionDeclare = 1, RULE_functionBody = 2, 
		RULE_qualifiedNameList = 3, RULE_formalParams = 4, RULE_formalParamList = 5, 
		RULE_formalParam = 6, RULE_lastFormalParam = 7, RULE_variableModifier = 8, 
		RULE_qualifiedName = 9, RULE_fieldDeclare = 10, RULE_constructorDeclare = 11, 
		RULE_variableAssign = 12, RULE_leftVariable = 13, RULE_variableDeclarators = 14, 
		RULE_variableDeclarator = 15, RULE_variableDeclaratorId = 16, RULE_variableInitializer = 17, 
		RULE_arrayInitializer = 18, RULE_objectDeclarator = 19, RULE_program = 20, 
		RULE_block = 21, RULE_blockStatements = 22, RULE_blockStatement = 23, 
		RULE_statement = 24, RULE_ifBlock = 25, RULE_forBlock = 26, RULE_whileBlock = 27, 
		RULE_doWhileBlock = 28, RULE_forExpressions = 29, RULE_forInitExp = 30, 
		RULE_forConditionExp = 31, RULE_forUpdateExp = 32, RULE_enhancedForExpression = 33, 
		RULE_parExpression = 34, RULE_expression = 35, RULE_functionCall = 36, 
		RULE_expressionList = 37, RULE_variableRef = 38, RULE_typeList = 39, RULE_variableType = 40, 
		RULE_classOrInterfaceType = 41, RULE_typeOrVoid = 42, RULE_primitiveType = 43, 
		RULE_primary = 44, RULE_literal = 45, RULE_integerLiteral = 46, RULE_floatLiteral = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"accessModifiers", "functionDeclare", "functionBody", "qualifiedNameList", 
			"formalParams", "formalParamList", "formalParam", "lastFormalParam", 
			"variableModifier", "qualifiedName", "fieldDeclare", "constructorDeclare", 
			"variableAssign", "leftVariable", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "objectDeclarator", 
			"program", "block", "blockStatements", "blockStatement", "statement", 
			"ifBlock", "forBlock", "whileBlock", "doWhileBlock", "forExpressions", 
			"forInitExp", "forConditionExp", "forUpdateExp", "enhancedForExpression", 
			"parExpression", "expression", "functionCall", "expressionList", "variableRef", 
			"typeList", "variableType", "classOrInterfaceType", "typeOrVoid", "primitiveType", 
			"primary", "literal", "integerLiteral", "floatLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'string'", "'int'", "'short'", "'double'", "'float'", 
			"'char'", "'long'", "'boolean'", "'byte'", "'final'", "'abstract'", "'class'", 
			"'extends'", "'enum'", "'implements'", "'new'", "'package'", "'private'", 
			"'public'", "'protected'", "'interface'", "'instanceof'", "'static'", 
			"'this'", "'super'", "'import'", "'break'", "'case'", "'continue'", "'default'", 
			"'do'", "'else'", "'for'", "'if'", "'goto'", "'return'", "'switch'", 
			"'while'", "'try'", "'catch'", "'throw'", "'finally'", "'throws'", null, 
			null, null, null, null, null, null, null, null, "'null'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", 
			"'<<'", "'>>'", "'>>>'", "'='", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", "'@'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "STRING", "INT", "SHORT", "DOUBLE", "FLOAT", "CHAR", "LONG", 
			"BOOLEAN", "BYTE", "FINAL", "ABSTRACT", "CLASS", "EXTENDS", "ENUM", "IMPLEMENTS", 
			"NEW", "PACKAGE", "PRIVATE", "PUBLIC", "PROTECTED", "INTERFACE", "INSTANCEOF", 
			"STATIC", "THIS", "SUPER", "IMPORT", "BREAK", "CASE", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "FOR", "IF", "GOTO", "RETURN", "SWITCH", "WHILE", "TRY", 
			"CATCH", "THROW", "FINALLY", "THROWS", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"BITAND", "BITOR", "CARET", "LSHIFT", "RSHIFT", "URSHIFT", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CodeFlow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodeFlowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AccessModifiersContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(CodeFlowParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CodeFlowParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(CodeFlowParser.PRIVATE, 0); }
		public AccessModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterAccessModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitAccessModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitAccessModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifiersContext accessModifiers() throws RecognitionException {
		AccessModifiersContext _localctx = new AccessModifiersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_accessModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclareContext extends ParserRuleContext {
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CodeFlowParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodeFlowParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodeFlowParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeFlowParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(CodeFlowParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(CodeFlowParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(CodeFlowParser.FINAL, 0); }
		public FunctionDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFunctionDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFunctionDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFunctionDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclareContext functionDeclare() throws RecognitionException {
		FunctionDeclareContext _localctx = new FunctionDeclareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				setState(98);
				accessModifiers();
				}
			}

			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(101);
					match(STATIC);
					}
				}

				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(104);
					match(FINAL);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(107);
					match(FINAL);
					}
				}

				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(110);
					match(STATIC);
					}
				}

				}
				}
				break;
			}
			}
			setState(115);
			typeOrVoid();
			setState(116);
			match(IDENTIFIER);
			setState(117);
			formalParams();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(118);
				match(LBRACK);
				setState(119);
				match(RBRACK);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(125);
				match(THROWS);
				setState(126);
				qualifiedNameList();
				}
			}

			setState(129);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionBody);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			qualifiedName();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				qualifiedName();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParamsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public FormalParamListContext formalParamList() {
			return getRuleContext(FormalParamListContext.class,0);
		}
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFormalParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFormalParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFormalParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LPAREN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << FINAL))) != 0) || _la==IDENTIFIER) {
				{
				setState(144);
				formalParamList();
				}
			}

			setState(147);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParamListContext extends ParserRuleContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public LastFormalParamContext lastFormalParam() {
			return getRuleContext(LastFormalParamContext.class,0);
		}
		public FormalParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFormalParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFormalParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFormalParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamListContext formalParamList() throws RecognitionException {
		FormalParamListContext _localctx = new FormalParamListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParamList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			formalParam();
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					formalParam();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(157);
				match(COMMA);
				setState(158);
				lastFormalParam();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParamContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
		}
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFormalParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFormalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(161);
				variableModifier();
				}
			}

			setState(164);
			variableType();
			setState(165);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParamContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(CodeFlowParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
		}
		public LastFormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterLastFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitLastFormalParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitLastFormalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParamContext lastFormalParam() throws RecognitionException {
		LastFormalParamContext _localctx = new LastFormalParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lastFormalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(167);
				variableModifier();
				}
			}

			setState(170);
			variableType();
			setState(171);
			match(ELLIPSIS);
			setState(172);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(CodeFlowParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeFlowParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeFlowParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CodeFlowParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodeFlowParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IDENTIFIER);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(177);
				match(DOT);
				setState(178);
				match(IDENTIFIER);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclareContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(CodeFlowParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(CodeFlowParser.FINAL, 0); }
		public FieldDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFieldDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFieldDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFieldDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclareContext fieldDeclare() throws RecognitionException {
		FieldDeclareContext _localctx = new FieldDeclareContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				setState(184);
				accessModifiers();
				}
			}

			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(187);
					match(STATIC);
					}
				}

				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(190);
					match(FINAL);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(193);
					match(FINAL);
					}
				}

				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(196);
					match(STATIC);
					}
				}

				}
				}
				break;
			}
			}
			setState(201);
			variableDeclarators();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(202);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclareContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(CodeFlowParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterConstructorDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitConstructorDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitConstructorDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclareContext constructorDeclare() throws RecognitionException {
		ConstructorDeclareContext _localctx = new ConstructorDeclareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(IDENTIFIER);
			setState(206);
			formalParams();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(207);
				match(THROWS);
				setState(208);
				qualifiedNameList();
				}
			}

			setState(211);
			((ConstructorDeclareContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignContext extends ParserRuleContext {
		public LeftVariableContext leftVariable() {
			return getRuleContext(LeftVariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodeFlowParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignContext variableAssign() throws RecognitionException {
		VariableAssignContext _localctx = new VariableAssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			leftVariable();
			setState(214);
			match(ASSIGN);
			setState(215);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftVariableContext extends ParserRuleContext {
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public LeftVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterLeftVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitLeftVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitLeftVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftVariableContext leftVariable() throws RecognitionException {
		LeftVariableContext _localctx = new LeftVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_leftVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			variableRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			variableType();
			setState(220);
			variableDeclarator();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				variableDeclarator();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodeFlowParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			variableDeclaratorId();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(229);
				match(ASSIGN);
				setState(230);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(CodeFlowParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodeFlowParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodeFlowParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeFlowParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IDENTIFIER);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(234);
				match(LBRACK);
				setState(235);
				match(RBRACK);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableInitializer);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				arrayInitializer();
				}
				break;
			case THIS:
			case SUPER:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CodeFlowParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodeFlowParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LBRACE);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(246);
				variableInitializer();
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(247);
						match(COMMA);
						setState(248);
						variableInitializer();
						}
						} 
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(254);
					match(COMMA);
					}
				}

				}
			}

			setState(259);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectDeclaratorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeFlowParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeFlowParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(CodeFlowParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(CodeFlowParser.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ObjectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterObjectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitObjectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitObjectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclaratorContext objectDeclarator() throws RecognitionException {
		ObjectDeclaratorContext _localctx = new ObjectDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IDENTIFIER);
			setState(262);
			match(IDENTIFIER);
			setState(263);
			match(ASSIGN);
			setState(264);
			match(NEW);
			setState(265);
			match(IDENTIFIER);
			setState(266);
			match(LPAREN);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(267);
				expressionList();
				}
			}

			setState(270);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public FunctionDeclareContext functionDeclare() {
			return getRuleContext(FunctionDeclareContext.class,0);
		}
		public FieldDeclareContext fieldDeclare() {
			return getRuleContext(FieldDeclareContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_program);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				blockStatements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				functionDeclare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				fieldDeclare();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CodeFlowParser.LBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CodeFlowParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LBRACE);
			setState(278);
			blockStatements();
			setState(279);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << THIS) | (1L << SUPER) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << GOTO) | (1L << RETURN) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(281);
				blockStatement();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockStmt;
		public Token returnToken;
		public Token breakToken;
		public Token continueToken;
		public Token gotoToken;
		public Token labelStmt;
		public Token emptyStmt;
		public ExpressionContext expressionStmt;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CodeFlowParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public TerminalNode BREAK() { return getToken(CodeFlowParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(CodeFlowParser.CONTINUE, 0); }
		public TerminalNode GOTO() { return getToken(CodeFlowParser.GOTO, 0); }
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public ObjectDeclaratorContext objectDeclarator() {
			return getRuleContext(ObjectDeclaratorContext.class,0);
		}
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((StatementContext)_localctx).blockStmt = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				forBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				whileBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				doWhileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				((StatementContext)_localctx).returnToken = match(RETURN);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(295);
					expression(0);
					}
					break;
				}
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(298);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				((StatementContext)_localctx).breakToken = match(BREAK);
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(302);
					match(IDENTIFIER);
					}
					break;
				}
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(305);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(308);
				((StatementContext)_localctx).continueToken = match(CONTINUE);
				setState(309);
				match(IDENTIFIER);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(310);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(313);
				((StatementContext)_localctx).gotoToken = match(GOTO);
				setState(314);
				match(IDENTIFIER);
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(315);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(318);
				((StatementContext)_localctx).labelStmt = match(IDENTIFIER);
				setState(319);
				match(COLON);
				setState(320);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(321);
				((StatementContext)_localctx).emptyStmt = match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(322);
				variableDeclarators();
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(323);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(326);
				objectDeclarator();
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(327);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(330);
				variableAssign();
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(331);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(334);
				((StatementContext)_localctx).expressionStmt = expression(0);
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(335);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CodeFlowParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CodeFlowParser.ELSE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(IF);
			setState(341);
			parExpression();
			setState(342);
			statement();
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(343);
				match(ELSE);
				setState(344);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CodeFlowParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public ForExpressionsContext forExpressions() {
			return getRuleContext(ForExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(FOR);
			setState(348);
			match(LPAREN);
			setState(349);
			forExpressions();
			setState(350);
			match(RPAREN);
			setState(351);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CodeFlowParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(WHILE);
			setState(354);
			parExpression();
			setState(355);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileBlockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CodeFlowParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CodeFlowParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(DO);
			setState(358);
			block();
			setState(359);
			match(WHILE);
			setState(360);
			parExpression();
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(361);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionsContext extends ParserRuleContext {
		public EnhancedForExpressionContext enhancedForExpression() {
			return getRuleContext(EnhancedForExpressionContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CodeFlowParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CodeFlowParser.SEMI, i);
		}
		public ForInitExpContext forInitExp() {
			return getRuleContext(ForInitExpContext.class,0);
		}
		public ForConditionExpContext forConditionExp() {
			return getRuleContext(ForConditionExpContext.class,0);
		}
		public ForUpdateExpContext forUpdateExp() {
			return getRuleContext(ForUpdateExpContext.class,0);
		}
		public ForExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterForExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitForExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitForExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionsContext forExpressions() throws RecognitionException {
		ForExpressionsContext _localctx = new ForExpressionsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forExpressions);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				enhancedForExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(365);
					forInitExp();
					}
				}

				setState(368);
				match(SEMI);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(369);
					forConditionExp();
					}
				}

				setState(372);
				match(SEMI);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(373);
					forUpdateExp();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitExpContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterForInitExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitForInitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitForInitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitExpContext forInitExp() throws RecognitionException {
		ForInitExpContext _localctx = new ForInitExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forInitExp);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				variableDeclarators();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionExpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterForConditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitForConditionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitForConditionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionExpContext forConditionExp() throws RecognitionException {
		ForConditionExpContext _localctx = new ForConditionExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forConditionExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateExpContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdateExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterForUpdateExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitForUpdateExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitForUpdateExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateExpContext forUpdateExp() throws RecognitionException {
		ForUpdateExpContext _localctx = new ForUpdateExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forUpdateExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForExpressionContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterEnhancedForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitEnhancedForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitEnhancedForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForExpressionContext enhancedForExpression() throws RecognitionException {
		EnhancedForExpressionContext _localctx = new EnhancedForExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enhancedForExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			variableType();
			setState(387);
			variableDeclaratorId();
			setState(388);
			match(COLON);
			setState(389);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(LPAREN);
			setState(392);
			expression(0);
			setState(393);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CodeFlowParser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public TerminalNode ADD() { return getToken(CodeFlowParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CodeFlowParser.SUB, 0); }
		public TerminalNode INC() { return getToken(CodeFlowParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CodeFlowParser.DEC, 0); }
		public TerminalNode BANG() { return getToken(CodeFlowParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(CodeFlowParser.TILDE, 0); }
		public TerminalNode MUL() { return getToken(CodeFlowParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CodeFlowParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CodeFlowParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(CodeFlowParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CodeFlowParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CodeFlowParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CodeFlowParser.GT, i);
		}
		public TerminalNode LE() { return getToken(CodeFlowParser.LE, 0); }
		public TerminalNode GE() { return getToken(CodeFlowParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(CodeFlowParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CodeFlowParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(CodeFlowParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(CodeFlowParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(CodeFlowParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(CodeFlowParser.AND, 0); }
		public TerminalNode OR() { return getToken(CodeFlowParser.OR, 0); }
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(CodeFlowParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(CodeFlowParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(CodeFlowParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(CodeFlowParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CodeFlowParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CodeFlowParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(CodeFlowParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(CodeFlowParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(CodeFlowParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(CodeFlowParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(CodeFlowParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(CodeFlowParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CodeFlowParser.MOD_ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(CodeFlowParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CodeFlowParser.RBRACK, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(396);
				functionCall();
				}
				break;
			case 2:
				{
				setState(397);
				variableRef();
				}
				break;
			case 3:
				{
				setState(398);
				functionCall();
				setState(399);
				match(DOT);
				setState(400);
				variableRef();
				}
				break;
			case 4:
				{
				setState(402);
				primary();
				}
				break;
			case 5:
				{
				setState(403);
				match(LPAREN);
				setState(404);
				expression(0);
				setState(405);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(407);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (INC - 76)) | (1L << (DEC - 76)) | (1L << (ADD - 76)) | (1L << (SUB - 76)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(408);
				expression(14);
				}
				break;
			case 7:
				{
				setState(409);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(410);
				expression(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(467);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(413);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(414);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (MUL - 80)) | (1L << (DIV - 80)) | (1L << (MOD - 80)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(415);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(416);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(417);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(418);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(419);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(427);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
						case 1:
							{
							setState(420);
							match(LT);
							setState(421);
							match(LT);
							}
							break;
						case 2:
							{
							setState(422);
							match(GT);
							setState(423);
							match(GT);
							setState(424);
							match(GT);
							}
							break;
						case 3:
							{
							setState(425);
							match(GT);
							setState(426);
							match(GT);
							}
							break;
						}
						setState(429);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(431);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GT - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(432);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(434);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(435);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(436);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(437);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(438);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(439);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(440);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(441);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(442);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(443);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(444);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(446);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(447);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(448);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(449);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(450);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(451);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(452);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(453);
						expression(0);
						setState(454);
						match(COLON);
						setState(455);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(457);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(458);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (ASSIGN - 89)) | (1L << (ADD_ASSIGN - 89)) | (1L << (SUB_ASSIGN - 89)) | (1L << (MUL_ASSIGN - 89)) | (1L << (DIV_ASSIGN - 89)) | (1L << (AND_ASSIGN - 89)) | (1L << (OR_ASSIGN - 89)) | (1L << (XOR_ASSIGN - 89)) | (1L << (MOD_ASSIGN - 89)) | (1L << (LSHIFT_ASSIGN - 89)) | (1L << (RSHIFT_ASSIGN - 89)) | (1L << (URSHIFT_ASSIGN - 89)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(459);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(460);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(461);
						match(LBRACK);
						setState(462);
						expression(0);
						setState(463);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(466);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionListContext args;
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(CodeFlowParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodeFlowParser.DOT, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			variableRef();
			setState(473);
			match(LPAREN);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(474);
				((FunctionCallContext)_localctx).args = expressionList();
				}
			}

			setState(477);
			match(RPAREN);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					match(DOT);
					setState(479);
					functionCall();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			expression(0);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(486);
				match(COMMA);
				setState(487);
				expression(0);
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableRefContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeFlowParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeFlowParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CodeFlowParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodeFlowParser.DOT, i);
		}
		public TerminalNode THIS() { return getToken(CodeFlowParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(CodeFlowParser.SUPER, 0); }
		public VariableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableRefContext variableRef() throws RecognitionException {
		VariableRefContext _localctx = new VariableRefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableRef);
		try {
			int _alt;
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(IDENTIFIER);
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(494);
						match(DOT);
						setState(495);
						match(IDENTIFIER);
						}
						} 
					}
					setState(500);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(THIS);
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(502);
						match(DOT);
						setState(503);
						match(IDENTIFIER);
						}
						} 
					}
					setState(508);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(SUPER);
				setState(512); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(510);
						match(DOT);
						setState(511);
						match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(514); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<VariableTypeContext> variableType() {
			return getRuleContexts(VariableTypeContext.class);
		}
		public VariableTypeContext variableType(int i) {
			return getRuleContext(VariableTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			variableType();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(519);
				match(COMMA);
				setState(520);
				variableType();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CodeFlowParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodeFlowParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodeFlowParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeFlowParser.RBRACK, i);
		}
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(526);
				classOrInterfaceType();
				}
				break;
			case STRING:
			case INT:
			case SHORT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case LONG:
			case BOOLEAN:
			case BYTE:
				{
				setState(527);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(530);
				match(LBRACK);
				setState(531);
				match(RBRACK);
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeFlowParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeFlowParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CodeFlowParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodeFlowParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(IDENTIFIER);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(538);
				match(DOT);
				setState(539);
				match(IDENTIFIER);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeOrVoidContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CodeFlowParser.VOID, 0); }
		public TypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeOrVoid);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case INT:
			case SHORT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case LONG:
			case BOOLEAN:
			case BYTE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				variableType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CodeFlowParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(CodeFlowParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(CodeFlowParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CodeFlowParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(CodeFlowParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CodeFlowParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(CodeFlowParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CodeFlowParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(CodeFlowParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primary);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(CodeFlowParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CodeFlowParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CodeFlowParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(CodeFlowParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_literal);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(560);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(CodeFlowParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CodeFlowParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(CodeFlowParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(CodeFlowParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(CodeFlowParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(CodeFlowParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u023a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\5\3f\n\3\3\3\5"+
		"\3i\n\3\3\3\5\3l\n\3\3\3\5\3o\n\3\3\3\5\3r\n\3\5\3t\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\5\3\u0082\n\3\3\3\3\3\3\4\3\4\5"+
		"\4\u0088\n\4\3\5\3\5\3\5\7\5\u008d\n\5\f\5\16\5\u0090\13\5\3\6\3\6\5\6"+
		"\u0094\n\6\3\6\3\6\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\7\3"+
		"\7\5\7\u00a2\n\7\3\b\5\b\u00a5\n\b\3\b\3\b\3\b\3\t\5\t\u00ab\n\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13\u00b6\n\13\f\13\16\13\u00b9\13"+
		"\13\3\f\5\f\u00bc\n\f\3\f\5\f\u00bf\n\f\3\f\5\f\u00c2\n\f\3\f\5\f\u00c5"+
		"\n\f\3\f\5\f\u00c8\n\f\5\f\u00ca\n\f\3\f\3\f\5\f\u00ce\n\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00d4\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\7\20\u00e2\n\20\f\20\16\20\u00e5\13\20\3\21\3\21\3\21\5\21\u00ea"+
		"\n\21\3\22\3\22\3\22\7\22\u00ef\n\22\f\22\16\22\u00f2\13\22\3\23\3\23"+
		"\5\23\u00f6\n\23\3\24\3\24\3\24\3\24\7\24\u00fc\n\24\f\24\16\24\u00ff"+
		"\13\24\3\24\5\24\u0102\n\24\5\24\u0104\n\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u010f\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u0116"+
		"\n\26\3\27\3\27\3\27\3\27\3\30\7\30\u011d\n\30\f\30\16\30\u0120\13\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012b\n\32\3\32\5\32"+
		"\u012e\n\32\3\32\3\32\5\32\u0132\n\32\3\32\5\32\u0135\n\32\3\32\3\32\3"+
		"\32\5\32\u013a\n\32\3\32\3\32\3\32\5\32\u013f\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0147\n\32\3\32\3\32\5\32\u014b\n\32\3\32\3\32\5\32\u014f"+
		"\n\32\3\32\3\32\5\32\u0153\n\32\5\32\u0155\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u015c\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u016d\n\36\3\37\3\37\5\37\u0171\n\37\3"+
		"\37\3\37\5\37\u0175\n\37\3\37\3\37\5\37\u0179\n\37\5\37\u017b\n\37\3 "+
		"\3 \5 \u017f\n \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u019e\n%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u01ae\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\7%\u01d6\n%\f%\16%\u01d9\13%\3&\3&\3&\5&\u01de\n&\3&\3&\3&\7&"+
		"\u01e3\n&\f&\16&\u01e6\13&\3\'\3\'\3\'\7\'\u01eb\n\'\f\'\16\'\u01ee\13"+
		"\'\3(\3(\3(\7(\u01f3\n(\f(\16(\u01f6\13(\3(\3(\3(\7(\u01fb\n(\f(\16(\u01fe"+
		"\13(\3(\3(\3(\6(\u0203\n(\r(\16(\u0204\5(\u0207\n(\3)\3)\3)\7)\u020c\n"+
		")\f)\16)\u020f\13)\3*\3*\5*\u0213\n*\3*\3*\7*\u0217\n*\f*\16*\u021a\13"+
		"*\3+\3+\3+\7+\u021f\n+\f+\16+\u0222\13+\3,\3,\5,\u0226\n,\3-\3-\3.\3."+
		"\5.\u022c\n.\3/\3/\3/\3/\3/\3/\5/\u0234\n/\3\60\3\60\3\61\3\61\3\61\2"+
		"\3H\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`\2\16\3\2\25\27\3\2NQ\3\2DE\3\2RT\3\2PQ\4\2BCIJ\4\2"+
		"HHKK\3\2[f\3\2NO\3\2\4\f\3\2/\62\3\2\63\64\2\u0274\2b\3\2\2\2\4e\3\2\2"+
		"\2\6\u0087\3\2\2\2\b\u0089\3\2\2\2\n\u0091\3\2\2\2\f\u0097\3\2\2\2\16"+
		"\u00a4\3\2\2\2\20\u00aa\3\2\2\2\22\u00b0\3\2\2\2\24\u00b2\3\2\2\2\26\u00bb"+
		"\3\2\2\2\30\u00cf\3\2\2\2\32\u00d7\3\2\2\2\34\u00db\3\2\2\2\36\u00dd\3"+
		"\2\2\2 \u00e6\3\2\2\2\"\u00eb\3\2\2\2$\u00f5\3\2\2\2&\u00f7\3\2\2\2(\u0107"+
		"\3\2\2\2*\u0115\3\2\2\2,\u0117\3\2\2\2.\u011e\3\2\2\2\60\u0121\3\2\2\2"+
		"\62\u0154\3\2\2\2\64\u0156\3\2\2\2\66\u015d\3\2\2\28\u0163\3\2\2\2:\u0167"+
		"\3\2\2\2<\u017a\3\2\2\2>\u017e\3\2\2\2@\u0180\3\2\2\2B\u0182\3\2\2\2D"+
		"\u0184\3\2\2\2F\u0189\3\2\2\2H\u019d\3\2\2\2J\u01da\3\2\2\2L\u01e7\3\2"+
		"\2\2N\u0206\3\2\2\2P\u0208\3\2\2\2R\u0212\3\2\2\2T\u021b\3\2\2\2V\u0225"+
		"\3\2\2\2X\u0227\3\2\2\2Z\u022b\3\2\2\2\\\u0233\3\2\2\2^\u0235\3\2\2\2"+
		"`\u0237\3\2\2\2bc\t\2\2\2c\3\3\2\2\2df\5\2\2\2ed\3\2\2\2ef\3\2\2\2fs\3"+
		"\2\2\2gi\7\32\2\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\7\r\2\2kj\3\2\2\2kl"+
		"\3\2\2\2lt\3\2\2\2mo\7\r\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\7\32\2\2"+
		"qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2sh\3\2\2\2sn\3\2\2\2tu\3\2\2\2uv\5V,\2v"+
		"w\7n\2\2w|\5\n\6\2xy\7=\2\2y{\7>\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}\u0081\3\2\2\2~|\3\2\2\2\177\u0080\7.\2\2\u0080\u0082\5\b\5\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5\6\4"+
		"\2\u0084\5\3\2\2\2\u0085\u0088\5,\27\2\u0086\u0088\7?\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0086\3\2\2\2\u0088\7\3\2\2\2\u0089\u008e\5\24\13\2\u008a"+
		"\u008b\7@\2\2\u008b\u008d\5\24\13\2\u008c\u008a\3\2\2\2\u008d\u0090\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\t\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0093\79\2\2\u0092\u0094\5\f\7\2\u0093\u0092\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7:\2\2\u0096\13\3\2\2\2"+
		"\u0097\u009c\5\16\b\2\u0098\u0099\7@\2\2\u0099\u009b\5\16\b\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a1\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\u00a2\5\20"+
		"\t\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\r\3\2\2\2\u00a3\u00a5"+
		"\5\22\n\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6\u00a7\5R*\2\u00a7\u00a8\5\"\22\2\u00a8\17\3\2\2\2\u00a9\u00ab\5"+
		"\22\n\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\5R*\2\u00ad\u00ae\7j\2\2\u00ae\u00af\5\"\22\2\u00af\21\3\2\2\2"+
		"\u00b0\u00b1\7\r\2\2\u00b1\23\3\2\2\2\u00b2\u00b7\7n\2\2\u00b3\u00b4\7"+
		"A\2\2\u00b4\u00b6\7n\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\25\3\2\2\2\u00b9\u00b7\3\2\2"+
		"\2\u00ba\u00bc\5\2\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c9"+
		"\3\2\2\2\u00bd\u00bf\7\32\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c1\3\2\2\2\u00c0\u00c2\7\r\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00ca\3\2\2\2\u00c3\u00c5\7\r\2\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\7\32\2\2\u00c7\u00c6\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00be\3\2\2\2\u00c9"+
		"\u00c4\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\5\36\20\2\u00cc\u00ce\7"+
		"?\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\27\3\2\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d3\5\n\6\2\u00d1\u00d2\7.\2\2\u00d2\u00d4\5\b\5\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5,"+
		"\27\2\u00d6\31\3\2\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9\7[\2\2\u00d9"+
		"\u00da\5$\23\2\u00da\33\3\2\2\2\u00db\u00dc\5N(\2\u00dc\35\3\2\2\2\u00dd"+
		"\u00de\5R*\2\u00de\u00e3\5 \21\2\u00df\u00e0\7@\2\2\u00e0\u00e2\5 \21"+
		"\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\37\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\5\"\22\2\u00e7"+
		"\u00e8\7[\2\2\u00e8\u00ea\5$\23\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea!\3\2\2\2\u00eb\u00f0\7n\2\2\u00ec\u00ed\7=\2\2\u00ed\u00ef"+
		"\7>\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1#\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\5&\24\2"+
		"\u00f4\u00f6\5H%\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6%\3\2"+
		"\2\2\u00f7\u0103\7;\2\2\u00f8\u00fd\5$\23\2\u00f9\u00fa\7@\2\2\u00fa\u00fc"+
		"\5$\23\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\7@"+
		"\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00f8\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7<"+
		"\2\2\u0106\'\3\2\2\2\u0107\u0108\7n\2\2\u0108\u0109\7n\2\2\u0109\u010a"+
		"\7[\2\2\u010a\u010b\7\23\2\2\u010b\u010c\7n\2\2\u010c\u010e\79\2\2\u010d"+
		"\u010f\5L\'\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\7:\2\2\u0111)\3\2\2\2\u0112\u0116\5.\30\2\u0113\u0116"+
		"\5\4\3\2\u0114\u0116\5\26\f\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0115\u0114\3\2\2\2\u0116+\3\2\2\2\u0117\u0118\7;\2\2\u0118\u0119\5."+
		"\30\2\u0119\u011a\7<\2\2\u011a-\3\2\2\2\u011b\u011d\5\60\31\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"/\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\5\62\32\2\u0122\61\3\2\2\2\u0123"+
		"\u0155\5,\27\2\u0124\u0155\5\64\33\2\u0125\u0155\5\66\34\2\u0126\u0155"+
		"\58\35\2\u0127\u0155\5:\36\2\u0128\u012a\7\'\2\2\u0129\u012b\5H%\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\7?"+
		"\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0155\3\2\2\2\u012f"+
		"\u0131\7\36\2\2\u0130\u0132\7n\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u0135\7?\2\2\u0134\u0133\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0155\3\2\2\2\u0136\u0137\7 \2\2\u0137\u0139\7n\2"+
		"\2\u0138\u013a\7?\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0155"+
		"\3\2\2\2\u013b\u013c\7&\2\2\u013c\u013e\7n\2\2\u013d\u013f\7?\2\2\u013e"+
		"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0155\3\2\2\2\u0140\u0141\7n"+
		"\2\2\u0141\u0142\7G\2\2\u0142\u0155\5\62\32\2\u0143\u0155\7?\2\2\u0144"+
		"\u0146\5\36\20\2\u0145\u0147\7?\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0155\3\2\2\2\u0148\u014a\5(\25\2\u0149\u014b\7?\2\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0155\3\2\2\2\u014c\u014e\5\32"+
		"\16\2\u014d\u014f\7?\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0155\3\2\2\2\u0150\u0152\5H%\2\u0151\u0153\7?\2\2\u0152\u0151\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0123\3\2\2\2\u0154\u0124"+
		"\3\2\2\2\u0154\u0125\3\2\2\2\u0154\u0126\3\2\2\2\u0154\u0127\3\2\2\2\u0154"+
		"\u0128\3\2\2\2\u0154\u012f\3\2\2\2\u0154\u0136\3\2\2\2\u0154\u013b\3\2"+
		"\2\2\u0154\u0140\3\2\2\2\u0154\u0143\3\2\2\2\u0154\u0144\3\2\2\2\u0154"+
		"\u0148\3\2\2\2\u0154\u014c\3\2\2\2\u0154\u0150\3\2\2\2\u0155\63\3\2\2"+
		"\2\u0156\u0157\7%\2\2\u0157\u0158\5F$\2\u0158\u015b\5\62\32\2\u0159\u015a"+
		"\7#\2\2\u015a\u015c\5\62\32\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2"+
		"\u015c\65\3\2\2\2\u015d\u015e\7$\2\2\u015e\u015f\79\2\2\u015f\u0160\5"+
		"<\37\2\u0160\u0161\7:\2\2\u0161\u0162\5\62\32\2\u0162\67\3\2\2\2\u0163"+
		"\u0164\7)\2\2\u0164\u0165\5F$\2\u0165\u0166\5\62\32\2\u01669\3\2\2\2\u0167"+
		"\u0168\7\"\2\2\u0168\u0169\5,\27\2\u0169\u016a\7)\2\2\u016a\u016c\5F$"+
		"\2\u016b\u016d\7?\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d;\3"+
		"\2\2\2\u016e\u017b\5D#\2\u016f\u0171\5> \2\u0170\u016f\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\7?\2\2\u0173\u0175\5@!\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\7?"+
		"\2\2\u0177\u0179\5B\"\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u016e\3\2\2\2\u017a\u0170\3\2\2\2\u017b=\3\2\2\2"+
		"\u017c\u017f\5\36\20\2\u017d\u017f\5L\'\2\u017e\u017c\3\2\2\2\u017e\u017d"+
		"\3\2\2\2\u017f?\3\2\2\2\u0180\u0181\5H%\2\u0181A\3\2\2\2\u0182\u0183\5"+
		"L\'\2\u0183C\3\2\2\2\u0184\u0185\5R*\2\u0185\u0186\5\"\22\2\u0186\u0187"+
		"\7G\2\2\u0187\u0188\5H%\2\u0188E\3\2\2\2\u0189\u018a\79\2\2\u018a\u018b"+
		"\5H%\2\u018b\u018c\7:\2\2\u018cG\3\2\2\2\u018d\u018e\b%\1\2\u018e\u019e"+
		"\5J&\2\u018f\u019e\5N(\2\u0190\u0191\5J&\2\u0191\u0192\7A\2\2\u0192\u0193"+
		"\5N(\2\u0193\u019e\3\2\2\2\u0194\u019e\5Z.\2\u0195\u0196\79\2\2\u0196"+
		"\u0197\5H%\2\u0197\u0198\7:\2\2\u0198\u019e\3\2\2\2\u0199\u019a\t\3\2"+
		"\2\u019a\u019e\5H%\20\u019b\u019c\t\4\2\2\u019c\u019e\5H%\17\u019d\u018d"+
		"\3\2\2\2\u019d\u018f\3\2\2\2\u019d\u0190\3\2\2\2\u019d\u0194\3\2\2\2\u019d"+
		"\u0195\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01d7\3\2"+
		"\2\2\u019f\u01a0\f\16\2\2\u01a0\u01a1\t\5\2\2\u01a1\u01d6\5H%\17\u01a2"+
		"\u01a3\f\r\2\2\u01a3\u01a4\t\6\2\2\u01a4\u01d6\5H%\16\u01a5\u01ad\f\f"+
		"\2\2\u01a6\u01a7\7C\2\2\u01a7\u01ae\7C\2\2\u01a8\u01a9\7B\2\2\u01a9\u01aa"+
		"\7B\2\2\u01aa\u01ae\7B\2\2\u01ab\u01ac\7B\2\2\u01ac\u01ae\7B\2\2\u01ad"+
		"\u01a6\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01d6\5H%\r\u01b0\u01b1\f\13\2\2\u01b1\u01b2\t\7\2\2\u01b2"+
		"\u01d6\5H%\f\u01b3\u01b4\f\n\2\2\u01b4\u01b5\t\b\2\2\u01b5\u01d6\5H%\13"+
		"\u01b6\u01b7\f\t\2\2\u01b7\u01b8\7U\2\2\u01b8\u01d6\5H%\n\u01b9\u01ba"+
		"\f\b\2\2\u01ba\u01bb\7W\2\2\u01bb\u01d6\5H%\t\u01bc\u01bd\f\7\2\2\u01bd"+
		"\u01be\7V\2\2\u01be\u01d6\5H%\b\u01bf\u01c0\f\6\2\2\u01c0\u01c1\7L\2\2"+
		"\u01c1\u01d6\5H%\7\u01c2\u01c3\f\5\2\2\u01c3\u01c4\7M\2\2\u01c4\u01d6"+
		"\5H%\6\u01c5\u01c6\f\4\2\2\u01c6\u01c7\7F\2\2\u01c7\u01c8\5H%\2\u01c8"+
		"\u01c9\7G\2\2\u01c9\u01ca\5H%\5\u01ca\u01d6\3\2\2\2\u01cb\u01cc\f\3\2"+
		"\2\u01cc\u01cd\t\t\2\2\u01cd\u01d6\5H%\3\u01ce\u01cf\f\23\2\2\u01cf\u01d0"+
		"\7=\2\2\u01d0\u01d1\5H%\2\u01d1\u01d2\7>\2\2\u01d2\u01d6\3\2\2\2\u01d3"+
		"\u01d4\f\21\2\2\u01d4\u01d6\t\n\2\2\u01d5\u019f\3\2\2\2\u01d5\u01a2\3"+
		"\2\2\2\u01d5\u01a5\3\2\2\2\u01d5\u01b0\3\2\2\2\u01d5\u01b3\3\2\2\2\u01d5"+
		"\u01b6\3\2\2\2\u01d5\u01b9\3\2\2\2\u01d5\u01bc\3\2\2\2\u01d5\u01bf\3\2"+
		"\2\2\u01d5\u01c2\3\2\2\2\u01d5\u01c5\3\2\2\2\u01d5\u01cb\3\2\2\2\u01d5"+
		"\u01ce\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8I\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db"+
		"\5N(\2\u01db\u01dd\79\2\2\u01dc\u01de\5L\'\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e4\7:\2\2\u01e0\u01e1\7A\2"+
		"\2\u01e1\u01e3\5J&\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5K\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"\u01ec\5H%\2\u01e8\u01e9\7@\2\2\u01e9\u01eb\5H%\2\u01ea\u01e8\3\2\2\2"+
		"\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edM\3"+
		"\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f4\7n\2\2\u01f0\u01f1\7A\2\2\u01f1"+
		"\u01f3\7n\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u0207\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7"+
		"\u01fc\7\33\2\2\u01f8\u01f9\7A\2\2\u01f9\u01fb\7n\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u0207\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\7\34\2\2\u0200\u0201\7"+
		"A\2\2\u0201\u0203\7n\2\2\u0202\u0200\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u01ef\3\2"+
		"\2\2\u0206\u01f7\3\2\2\2\u0206\u01ff\3\2\2\2\u0207O\3\2\2\2\u0208\u020d"+
		"\5R*\2\u0209\u020a\7@\2\2\u020a\u020c\5R*\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020eQ\3\2\2\2"+
		"\u020f\u020d\3\2\2\2\u0210\u0213\5T+\2\u0211\u0213\5X-\2\u0212\u0210\3"+
		"\2\2\2\u0212\u0211\3\2\2\2\u0213\u0218\3\2\2\2\u0214\u0215\7=\2\2\u0215"+
		"\u0217\7>\2\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219S\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u0220"+
		"\7n\2\2\u021c\u021d\7A\2\2\u021d\u021f\7n\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221U\3\2\2\2"+
		"\u0222\u0220\3\2\2\2\u0223\u0226\5R*\2\u0224\u0226\7\3\2\2\u0225\u0223"+
		"\3\2\2\2\u0225\u0224\3\2\2\2\u0226W\3\2\2\2\u0227\u0228\t\13\2\2\u0228"+
		"Y\3\2\2\2\u0229\u022c\5\\/\2\u022a\u022c\7n\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022a\3\2\2\2\u022c[\3\2\2\2\u022d\u0234\5^\60\2\u022e\u0234\5`\61\2"+
		"\u022f\u0234\7\66\2\2\u0230\u0234\7\67\2\2\u0231\u0234\7\65\2\2\u0232"+
		"\u0234\78\2\2\u0233\u022d\3\2\2\2\u0233\u022e\3\2\2\2\u0233\u022f\3\2"+
		"\2\2\u0233\u0230\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2\2\2\u0234"+
		"]\3\2\2\2\u0235\u0236\t\f\2\2\u0236_\3\2\2\2\u0237\u0238\t\r\2\2\u0238"+
		"a\3\2\2\2Hehknqs|\u0081\u0087\u008e\u0093\u009c\u00a1\u00a4\u00aa\u00b7"+
		"\u00bb\u00be\u00c1\u00c4\u00c7\u00c9\u00cd\u00d3\u00e3\u00e9\u00f0\u00f5"+
		"\u00fd\u0101\u0103\u010e\u0115\u011e\u012a\u012d\u0131\u0134\u0139\u013e"+
		"\u0146\u014a\u014e\u0152\u0154\u015b\u016c\u0170\u0174\u0178\u017a\u017e"+
		"\u019d\u01ad\u01d5\u01d7\u01dd\u01e4\u01ec\u01f4\u01fc\u0204\u0206\u020d"+
		"\u0212\u0218\u0220\u0225\u022b\u0233";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
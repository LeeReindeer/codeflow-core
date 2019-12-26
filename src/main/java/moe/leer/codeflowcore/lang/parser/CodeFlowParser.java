// Generated from CodeFlow.g4 by ANTLR 4.7.2

package moe.leer.codeflowcore.lang.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		RULE_program = 0, RULE_topLevelFunctions = 1, RULE_topLevelStmts = 2, 
		RULE_packageDeclaration = 3, RULE_importDeclaration = 4, RULE_declaration = 5, 
		RULE_classDeclaration = 6, RULE_classBody = 7, RULE_classBodyDeclaration = 8, 
		RULE_member = 9, RULE_classOrInterfacemodifier = 10, RULE_classOrInterfacemodifiers = 11, 
		RULE_functionDeclare = 12, RULE_functionBody = 13, RULE_qualifiedNameList = 14, 
		RULE_typeArguments = 15, RULE_typeArgument = 16, RULE_formalParams = 17, 
		RULE_formalParamList = 18, RULE_formalParam = 19, RULE_lastFormalParam = 20, 
		RULE_variableModifier = 21, RULE_qualifiedName = 22, RULE_fieldDeclare = 23, 
		RULE_constructorDeclare = 24, RULE_variableAssign = 25, RULE_variableDeclarators = 26, 
		RULE_variableDeclarator = 27, RULE_variableDeclaratorId = 28, RULE_variableInitializer = 29, 
		RULE_arrayInitializer = 30, RULE_objectDeclarator = 31, RULE_block = 32, 
		RULE_blockStatements = 33, RULE_blockStatement = 34, RULE_statement = 35, 
		RULE_ifBlock = 36, RULE_switchBlock = 37, RULE_switchCaseGroup = 38, RULE_switchCase = 39, 
		RULE_forBlock = 40, RULE_whileBlock = 41, RULE_doWhileBlock = 42, RULE_forExpressions = 43, 
		RULE_forInitExp = 44, RULE_forConditionExp = 45, RULE_forUpdateExp = 46, 
		RULE_enhancedForExpression = 47, RULE_parExpression = 48, RULE_expression = 49, 
		RULE_functionCall = 50, RULE_arguments = 51, RULE_expressionList = 52, 
		RULE_functionCallName = 53, RULE_variableRef = 54, RULE_typeList = 55, 
		RULE_variableType = 56, RULE_creator = 57, RULE_createdName = 58, RULE_classCreatorRest = 59, 
		RULE_arrayCreatorRest = 60, RULE_classOrInterfaceType = 61, RULE_typeOrVoid = 62, 
		RULE_primitiveType = 63, RULE_primary = 64, RULE_literal = 65, RULE_integerLiteral = 66, 
		RULE_floatLiteral = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topLevelFunctions", "topLevelStmts", "packageDeclaration", 
			"importDeclaration", "declaration", "classDeclaration", "classBody", 
			"classBodyDeclaration", "member", "classOrInterfacemodifier", "classOrInterfacemodifiers", 
			"functionDeclare", "functionBody", "qualifiedNameList", "typeArguments", 
			"typeArgument", "formalParams", "formalParamList", "formalParam", "lastFormalParam", 
			"variableModifier", "qualifiedName", "fieldDeclare", "constructorDeclare", 
			"variableAssign", "variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "objectDeclarator", "block", 
			"blockStatements", "blockStatement", "statement", "ifBlock", "switchBlock", 
			"switchCaseGroup", "switchCase", "forBlock", "whileBlock", "doWhileBlock", 
			"forExpressions", "forInitExp", "forConditionExp", "forUpdateExp", "enhancedForExpression", 
			"parExpression", "expression", "functionCall", "arguments", "expressionList", 
			"functionCallName", "variableRef", "typeList", "variableType", "creator", 
			"createdName", "classCreatorRest", "arrayCreatorRest", "classOrInterfaceType", 
			"typeOrVoid", "primitiveType", "primary", "literal", "integerLiteral", 
			"floatLiteral"
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


	 public static boolean supportClass;

	public CodeFlowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(136);
				packageDeclaration();
				}
				break;
			}
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					importDeclaration();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					declaration();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TopLevelFunctionsContext extends ParserRuleContext {
		public List<FunctionDeclareContext> functionDeclare() {
			return getRuleContexts(FunctionDeclareContext.class);
		}
		public FunctionDeclareContext functionDeclare(int i) {
			return getRuleContext(FunctionDeclareContext.class,i);
		}
		public TopLevelFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTopLevelFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTopLevelFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTopLevelFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelFunctionsContext topLevelFunctions() throws RecognitionException {
		TopLevelFunctionsContext _localctx = new TopLevelFunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelFunctions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(151);
					functionDeclare();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TopLevelStmtsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TopLevelStmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTopLevelStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTopLevelStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTopLevelStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelStmtsContext topLevelStmts() throws RecognitionException {
		TopLevelStmtsContext _localctx = new TopLevelStmtsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topLevelStmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(CodeFlowParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(PACKAGE);
			setState(162);
			qualifiedName();
			setState(163);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CodeFlowParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(CodeFlowParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(CodeFlowParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(CodeFlowParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IMPORT);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(166);
				match(STATIC);
				}
			}

			setState(169);
			qualifiedName();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(170);
				match(DOT);
				setState(171);
				match(MUL);
				}
			}

			setState(174);
			match(SEMI);
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

	public static class DeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TopLevelFunctionsContext topLevelFunctions() {
			return getRuleContext(TopLevelFunctionsContext.class,0);
		}
		public TopLevelStmtsContext topLevelStmts() {
			return getRuleContext(TopLevelStmtsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				if (!(supportClass)) throw new FailedPredicateException(this, "supportClass");
				setState(177);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				topLevelFunctions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				topLevelStmts();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(SEMI);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassOrInterfacemodifiersContext classOrInterfacemodifiers() {
			return getRuleContext(ClassOrInterfacemodifiersContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(CodeFlowParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(CodeFlowParser.EXTENDS, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(CodeFlowParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			classOrInterfacemodifiers();
			setState(184);
			match(CLASS);
			setState(185);
			match(IDENTIFIER);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(186);
				typeArguments();
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(189);
				match(EXTENDS);
				setState(190);
				variableType();
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(193);
				match(IMPLEMENTS);
				setState(194);
				typeList();
				}
			}

			setState(197);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CodeFlowParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodeFlowParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(LBRACE);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << FINAL) | (1L << ABSTRACT) | (1L << CLASS) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << STATIC) | (1L << LBRACE) | (1L << SEMI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(200);
				classBodyDeclaration();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(CodeFlowParser.STATIC, 0); }
		public ClassOrInterfacemodifiersContext classOrInterfacemodifiers() {
			return getRuleContext(ClassOrInterfacemodifiersContext.class,0);
		}
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(209);
					match(STATIC);
					}
				}

				setState(212);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				classOrInterfacemodifiers();
				setState(214);
				member();
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

	public static class MemberContext extends ParserRuleContext {
		public FunctionDeclareContext functionDeclare() {
			return getRuleContext(FunctionDeclareContext.class,0);
		}
		public FieldDeclareContext fieldDeclare() {
			return getRuleContext(FieldDeclareContext.class,0);
		}
		public ConstructorDeclareContext constructorDeclare() {
			return getRuleContext(ConstructorDeclareContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_member);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				functionDeclare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				fieldDeclare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				constructorDeclare();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				classDeclaration();
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

	public static class ClassOrInterfacemodifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(CodeFlowParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CodeFlowParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(CodeFlowParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(CodeFlowParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(CodeFlowParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(CodeFlowParser.FINAL, 0); }
		public ClassOrInterfacemodifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfacemodifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterClassOrInterfacemodifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitClassOrInterfacemodifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitClassOrInterfacemodifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfacemodifierContext classOrInterfacemodifier() throws RecognitionException {
		ClassOrInterfacemodifierContext _localctx = new ClassOrInterfacemodifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classOrInterfacemodifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << ABSTRACT) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << STATIC))) != 0)) ) {
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

	public static class ClassOrInterfacemodifiersContext extends ParserRuleContext {
		public List<ClassOrInterfacemodifierContext> classOrInterfacemodifier() {
			return getRuleContexts(ClassOrInterfacemodifierContext.class);
		}
		public ClassOrInterfacemodifierContext classOrInterfacemodifier(int i) {
			return getRuleContext(ClassOrInterfacemodifierContext.class,i);
		}
		public ClassOrInterfacemodifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfacemodifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterClassOrInterfacemodifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitClassOrInterfacemodifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitClassOrInterfacemodifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfacemodifiersContext classOrInterfacemodifiers() throws RecognitionException {
		ClassOrInterfacemodifiersContext _localctx = new ClassOrInterfacemodifiersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classOrInterfacemodifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					classOrInterfacemodifier();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public ClassOrInterfacemodifiersContext classOrInterfacemodifiers() {
			return getRuleContext(ClassOrInterfacemodifiersContext.class,0);
		}
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
		public TerminalNode THROWS() { return getToken(CodeFlowParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_functionDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			classOrInterfacemodifiers();
			setState(233);
			typeOrVoid();
			setState(234);
			match(IDENTIFIER);
			setState(235);
			formalParams();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(236);
				match(THROWS);
				setState(237);
				qualifiedNameList();
				}
			}

			setState(240);
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
		enterRule(_localctx, 26, RULE_functionBody);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
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
		enterRule(_localctx, 28, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			qualifiedName();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				qualifiedName();
				}
				}
				setState(253);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CodeFlowParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(CodeFlowParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(LT);
			setState(255);
			typeArgument();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				typeArgument();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(GT);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(CodeFlowParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(CodeFlowParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(CodeFlowParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeArgument);
		int _la;
		try {
			setState(271);
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
				setState(265);
				variableType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(QUESTION);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(267);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(268);
					variableType();
					}
				}

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
		enterRule(_localctx, 34, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LPAREN);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << FINAL))) != 0) || _la==IDENTIFIER) {
				{
				setState(274);
				formalParamList();
				}
			}

			setState(277);
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
		enterRule(_localctx, 36, RULE_formalParamList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			formalParam();
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(COMMA);
					setState(281);
					formalParam();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(287);
				match(COMMA);
				setState(288);
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
		enterRule(_localctx, 38, RULE_formalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(291);
				variableModifier();
				}
			}

			setState(294);
			variableType();
			setState(295);
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
		enterRule(_localctx, 40, RULE_lastFormalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(297);
				variableModifier();
				}
			}

			setState(300);
			variableType();
			setState(301);
			match(ELLIPSIS);
			setState(302);
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
		enterRule(_localctx, 42, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 44, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IDENTIFIER);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(DOT);
					setState(308);
					match(IDENTIFIER);
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public ClassOrInterfacemodifiersContext classOrInterfacemodifiers() {
			return getRuleContext(ClassOrInterfacemodifiersContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
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
		enterRule(_localctx, 46, RULE_fieldDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			classOrInterfacemodifiers();
			setState(315);
			variableDeclarators();
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(316);
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
		enterRule(_localctx, 48, RULE_constructorDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(IDENTIFIER);
			setState(320);
			formalParams();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(321);
				match(THROWS);
				setState(322);
				qualifiedNameList();
				}
			}

			setState(325);
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
		public ExpressionContext variableId;
		public TerminalNode ASSIGN() { return getToken(CodeFlowParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 50, RULE_variableAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((VariableAssignContext)_localctx).variableId = expression(0);
			setState(328);
			match(ASSIGN);
			setState(329);
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
		enterRule(_localctx, 52, RULE_variableDeclarators);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			variableType();
			setState(332);
			variableDeclarator();
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					variableDeclarator();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 54, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			variableDeclaratorId();
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(341);
				match(ASSIGN);
				setState(342);
				variableInitializer();
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
		enterRule(_localctx, 56, RULE_variableDeclaratorId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IDENTIFIER);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					match(LBRACK);
					setState(347);
					match(RBRACK);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 58, RULE_variableInitializer);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				arrayInitializer();
				}
				break;
			case NEW:
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
				setState(354);
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
		enterRule(_localctx, 60, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LBRACE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(358);
				variableInitializer();
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						match(COMMA);
						setState(360);
						variableInitializer();
						}
						} 
					}
					setState(365);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(366);
					match(COMMA);
					}
				}

				}
			}

			setState(371);
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
		enterRule(_localctx, 62, RULE_objectDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(IDENTIFIER);
			setState(374);
			match(IDENTIFIER);
			setState(375);
			match(ASSIGN);
			setState(376);
			match(NEW);
			setState(377);
			match(IDENTIFIER);
			setState(378);
			match(LPAREN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(379);
				expressionList();
				}
			}

			setState(382);
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
		enterRule(_localctx, 64, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(LBRACE);
			setState(385);
			blockStatements();
			setState(386);
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
		enterRule(_localctx, 66, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << GOTO) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << THROW) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(388);
				blockStatement();
				}
				}
				setState(393);
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
		enterRule(_localctx, 68, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		public Token throwToken;
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
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
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
		public TerminalNode THROW() { return getToken(CodeFlowParser.THROW, 0); }
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
		enterRule(_localctx, 70, RULE_statement);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				((StatementContext)_localctx).blockStmt = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				switchBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				forBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				whileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(401);
				doWhileBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
				((StatementContext)_localctx).returnToken = match(RETURN);
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(403);
					expression(0);
					}
					break;
				}
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(406);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(409);
				((StatementContext)_localctx).throwToken = match(THROW);
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(410);
					expression(0);
					}
					break;
				}
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(413);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(416);
				((StatementContext)_localctx).breakToken = match(BREAK);
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(417);
					match(IDENTIFIER);
					}
					break;
				}
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(420);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(423);
				((StatementContext)_localctx).continueToken = match(CONTINUE);
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(424);
					match(IDENTIFIER);
					}
					break;
				}
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(427);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(430);
				((StatementContext)_localctx).gotoToken = match(GOTO);
				setState(431);
				match(IDENTIFIER);
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(432);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(435);
				((StatementContext)_localctx).labelStmt = match(IDENTIFIER);
				setState(436);
				match(COLON);
				setState(437);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(438);
				((StatementContext)_localctx).emptyStmt = match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(439);
				variableDeclarators();
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(440);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(443);
				variableAssign();
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(444);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(447);
				((StatementContext)_localctx).expressionStmt = expression(0);
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(448);
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
		enterRule(_localctx, 72, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(IF);
			setState(454);
			parExpression();
			setState(455);
			statement();
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(456);
				match(ELSE);
				setState(457);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public BlockStatementsContext defaultStmt;
		public TerminalNode SWITCH() { return getToken(CodeFlowParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CodeFlowParser.LBRACE, 0); }
		public TerminalNode DEFAULT() { return getToken(CodeFlowParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public TerminalNode RBRACE() { return getToken(CodeFlowParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public List<SwitchCaseGroupContext> switchCaseGroup() {
			return getRuleContexts(SwitchCaseGroupContext.class);
		}
		public SwitchCaseGroupContext switchCaseGroup(int i) {
			return getRuleContext(SwitchCaseGroupContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(SWITCH);
			setState(461);
			parExpression();
			setState(462);
			match(LBRACE);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(463);
				switchCaseGroup();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			match(DEFAULT);
			setState(470);
			match(COLON);
			setState(471);
			((SwitchBlockContext)_localctx).defaultStmt = blockStatements();
			setState(472);
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

	public static class SwitchCaseGroupContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public SwitchCaseGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterSwitchCaseGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitSwitchCaseGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitSwitchCaseGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseGroupContext switchCaseGroup() throws RecognitionException {
		SwitchCaseGroupContext _localctx = new SwitchCaseGroupContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchCaseGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(474);
					switchCase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(477); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(479);
			blockStatements();
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public TerminalNode CASE() { return getToken(CodeFlowParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switchCase);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(CASE);
				setState(482);
				((SwitchCaseContext)_localctx).constantExpression = expression(0);
				setState(483);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(CASE);
				setState(486);
				match(IDENTIFIER);
				setState(487);
				match(COLON);
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
		enterRule(_localctx, 80, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(FOR);
			setState(491);
			match(LPAREN);
			setState(492);
			forExpressions();
			setState(493);
			match(RPAREN);
			setState(494);
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
		enterRule(_localctx, 82, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(WHILE);
			setState(497);
			parExpression();
			setState(498);
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
		enterRule(_localctx, 84, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(DO);
			setState(501);
			block();
			setState(502);
			match(WHILE);
			setState(503);
			parExpression();
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(504);
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
		enterRule(_localctx, 86, RULE_forExpressions);
		int _la;
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				enhancedForExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(508);
					forInitExp();
					}
				}

				setState(511);
				match(SEMI);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(512);
					forConditionExp();
					}
				}

				setState(515);
				match(SEMI);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(516);
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
		enterRule(_localctx, 88, RULE_forInitExp);
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				variableDeclarators();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
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
		enterRule(_localctx, 90, RULE_forConditionExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
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
		enterRule(_localctx, 92, RULE_forUpdateExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
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
		enterRule(_localctx, 94, RULE_enhancedForExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			variableType();
			setState(530);
			variableDeclaratorId();
			setState(531);
			match(COLON);
			setState(532);
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
		enterRule(_localctx, 96, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(LPAREN);
			setState(535);
			expression(0);
			setState(536);
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
		public ExpressionContext ternaryCondition;
		public Token prefix;
		public Token bop;
		public ExpressionContext ternaryTrueExp;
		public ExpressionContext ternaryFalseExp;
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
		public TerminalNode NEW() { return getToken(CodeFlowParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CodeFlowParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CodeFlowParser.SUB, 0); }
		public TerminalNode INC() { return getToken(CodeFlowParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CodeFlowParser.DEC, 0); }
		public TerminalNode BANG() { return getToken(CodeFlowParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(CodeFlowParser.TILDE, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
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
		public TerminalNode QUESTION() { return getToken(CodeFlowParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(539);
				functionCall();
				}
				break;
			case 2:
				{
				setState(540);
				variableRef();
				}
				break;
			case 3:
				{
				setState(541);
				functionCall();
				setState(542);
				match(DOT);
				setState(543);
				variableRef();
				}
				break;
			case 4:
				{
				setState(545);
				primary();
				}
				break;
			case 5:
				{
				setState(546);
				match(LPAREN);
				setState(547);
				expression(0);
				setState(548);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(550);
				match(NEW);
				setState(551);
				creator();
				}
				break;
			case 7:
				{
				setState(552);
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
				setState(553);
				expression(15);
				}
				break;
			case 8:
				{
				setState(554);
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
				setState(555);
				expression(14);
				}
				break;
			case 9:
				{
				setState(556);
				match(LPAREN);
				setState(557);
				variableType();
				setState(558);
				match(RPAREN);
				setState(559);
				expression(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(617);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(563);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(564);
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
						setState(565);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(566);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(567);
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
						setState(568);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(569);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(577);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
						case 1:
							{
							setState(570);
							match(LT);
							setState(571);
							match(LT);
							}
							break;
						case 2:
							{
							setState(572);
							match(GT);
							setState(573);
							match(GT);
							setState(574);
							match(GT);
							}
							break;
						case 3:
							{
							setState(575);
							match(GT);
							setState(576);
							match(GT);
							}
							break;
						}
						setState(579);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(580);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(581);
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
						setState(582);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(583);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(584);
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
						setState(585);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(586);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(587);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(588);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(589);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(590);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(591);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(592);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(593);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(594);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(595);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(596);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(597);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(598);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(599);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(600);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ternaryCondition = _prevctx;
						_localctx.ternaryCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(601);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(602);
						match(QUESTION);
						setState(603);
						((ExpressionContext)_localctx).ternaryTrueExp = expression(0);
						setState(604);
						match(COLON);
						setState(605);
						((ExpressionContext)_localctx).ternaryFalseExp = expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(607);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(608);
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
						setState(609);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(610);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(611);
						match(LBRACK);
						setState(612);
						expression(0);
						setState(613);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(615);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(616);
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
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		public FunctionCallNameContext functionCallName() {
			return getRuleContext(FunctionCallNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
		enterRule(_localctx, 100, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			functionCallName();
			setState(623);
			arguments();
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(624);
					match(DOT);
					setState(625);
					functionCall();
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(LPAREN);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(632);
				expressionList();
				}
			}

			setState(635);
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
		enterRule(_localctx, 104, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			expression(0);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(638);
				match(COMMA);
				setState(639);
				expression(0);
				}
				}
				setState(644);
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

	public static class FunctionCallNameContext extends ParserRuleContext {
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
		public FunctionCallNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFunctionCallName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFunctionCallName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFunctionCallName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallNameContext functionCallName() throws RecognitionException {
		FunctionCallNameContext _localctx = new FunctionCallNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionCallName);
		int _la;
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(IDENTIFIER);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(646);
					match(DOT);
					setState(647);
					match(IDENTIFIER);
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(THIS);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(654);
					match(DOT);
					setState(655);
					match(IDENTIFIER);
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				match(SUPER);
				setState(664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(662);
					match(DOT);
					setState(663);
					match(IDENTIFIER);
					}
					}
					setState(666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
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
		enterRule(_localctx, 108, RULE_variableRef);
		try {
			int _alt;
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				match(IDENTIFIER);
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(671);
						match(DOT);
						setState(672);
						match(IDENTIFIER);
						}
						} 
					}
					setState(677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(THIS);
				setState(683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(679);
						match(DOT);
						setState(680);
						match(IDENTIFIER);
						}
						} 
					}
					setState(685);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				match(SUPER);
				setState(689); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(687);
						match(DOT);
						setState(688);
						match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(691); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 110, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			variableType();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(696);
				match(COMMA);
				setState(697);
				variableType();
				}
				}
				setState(702);
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
		enterRule(_localctx, 112, RULE_variableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(703);
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
				setState(704);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(707);
				match(LBRACK);
				setState(708);
				match(RBRACK);
				}
				}
				setState(713);
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

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_creator);
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				createdName();
				setState(715);
				classCreatorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				createdName();
				setState(720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(718);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(719);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CreatedNameContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_createdName);
		try {
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				primitiveType();
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			arguments();
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(729);
				classBody();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(CodeFlowParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodeFlowParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodeFlowParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeFlowParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(LBRACK);
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(733);
				match(RBRACK);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(734);
					match(LBRACK);
					setState(735);
					match(RBRACK);
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(741);
				arrayInitializer();
				}
				break;
			case NEW:
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
				{
				setState(742);
				expression(0);
				setState(743);
				match(RBRACK);
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(744);
						match(LBRACK);
						setState(745);
						expression(0);
						setState(746);
						match(RBRACK);
						}
						} 
					}
					setState(752);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(753);
						match(LBRACK);
						setState(754);
						match(RBRACK);
						}
						} 
					}
					setState(759);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
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
		enterRule(_localctx, 122, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(IDENTIFIER);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(763);
				typeArguments();
				}
			}

			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(766);
				match(DOT);
				setState(767);
				match(IDENTIFIER);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(768);
					typeArguments();
					}
				}

				}
				}
				setState(775);
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
		enterRule(_localctx, 124, RULE_typeOrVoid);
		try {
			setState(778);
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
				setState(776);
				variableType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
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
		enterRule(_localctx, 126, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
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
		enterRule(_localctx, 128, RULE_primary);
		try {
			setState(784);
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
				setState(782);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
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
		enterRule(_localctx, 130, RULE_literal);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(790);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(791);
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
		enterRule(_localctx, 132, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
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
		enterRule(_localctx, 134, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
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
		case 5:
			return declaration_sempred((DeclarationContext)_localctx, predIndex);
		case 49:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declaration_sempred(DeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return supportClass;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u0321\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\5\2\u008c\n\2\3\2"+
		"\7\2\u008f\n\2\f\2\16\2\u0092\13\2\3\2\7\2\u0095\n\2\f\2\16\2\u0098\13"+
		"\2\3\3\6\3\u009b\n\3\r\3\16\3\u009c\3\4\6\4\u00a0\n\4\r\4\16\4\u00a1\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\5\6\u00aa\n\6\3\6\3\6\3\6\5\6\u00af\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00b8\n\7\3\b\3\b\3\b\3\b\5\b\u00be\n\b\3\b\3"+
		"\b\5\b\u00c2\n\b\3\b\3\b\5\b\u00c6\n\b\3\b\3\b\3\t\3\t\7\t\u00cc\n\t\f"+
		"\t\16\t\u00cf\13\t\3\t\3\t\3\n\3\n\5\n\u00d5\n\n\3\n\3\n\3\n\3\n\5\n\u00db"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u00e1\n\13\3\f\3\f\3\r\7\r\u00e6\n\r\f\r"+
		"\16\r\u00e9\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f1\n\16\3\16\3"+
		"\16\3\17\3\17\5\17\u00f7\n\17\3\20\3\20\3\20\7\20\u00fc\n\20\f\20\16\20"+
		"\u00ff\13\20\3\21\3\21\3\21\3\21\7\21\u0105\n\21\f\21\16\21\u0108\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0110\n\22\5\22\u0112\n\22\3\23\3"+
		"\23\5\23\u0116\n\23\3\23\3\23\3\24\3\24\3\24\7\24\u011d\n\24\f\24\16\24"+
		"\u0120\13\24\3\24\3\24\5\24\u0124\n\24\3\25\5\25\u0127\n\25\3\25\3\25"+
		"\3\25\3\26\5\26\u012d\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\7\30\u0138\n\30\f\30\16\30\u013b\13\30\3\31\3\31\3\31\5\31\u0140\n\31"+
		"\3\32\3\32\3\32\3\32\5\32\u0146\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\7\34\u0152\n\34\f\34\16\34\u0155\13\34\3\35\3\35\3\35"+
		"\5\35\u015a\n\35\3\36\3\36\3\36\7\36\u015f\n\36\f\36\16\36\u0162\13\36"+
		"\3\37\3\37\5\37\u0166\n\37\3 \3 \3 \3 \7 \u016c\n \f \16 \u016f\13 \3"+
		" \5 \u0172\n \5 \u0174\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u017f\n!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\7#\u0188\n#\f#\16#\u018b\13#\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u0197\n%\3%\5%\u019a\n%\3%\3%\5%\u019e\n%\3%\5%\u01a1\n"+
		"%\3%\3%\5%\u01a5\n%\3%\5%\u01a8\n%\3%\3%\5%\u01ac\n%\3%\5%\u01af\n%\3"+
		"%\3%\3%\5%\u01b4\n%\3%\3%\3%\3%\3%\3%\5%\u01bc\n%\3%\3%\5%\u01c0\n%\3"+
		"%\3%\5%\u01c4\n%\5%\u01c6\n%\3&\3&\3&\3&\3&\5&\u01cd\n&\3\'\3\'\3\'\3"+
		"\'\7\'\u01d3\n\'\f\'\16\'\u01d6\13\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u01de\n"+
		"(\r(\16(\u01df\3(\3(\3)\3)\3)\3)\3)\3)\3)\5)\u01eb\n)\3*\3*\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3,\3,\3,\3,\3,\5,\u01fc\n,\3-\3-\5-\u0200\n-\3-\3-\5-\u0204"+
		"\n-\3-\3-\5-\u0208\n-\5-\u020a\n-\3.\3.\5.\u020e\n.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u0234\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0244\n\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u026c\n\63\f\63\16\63\u026f\13\63"+
		"\3\64\3\64\3\64\3\64\7\64\u0275\n\64\f\64\16\64\u0278\13\64\3\65\3\65"+
		"\5\65\u027c\n\65\3\65\3\65\3\66\3\66\3\66\7\66\u0283\n\66\f\66\16\66\u0286"+
		"\13\66\3\67\3\67\3\67\7\67\u028b\n\67\f\67\16\67\u028e\13\67\3\67\3\67"+
		"\3\67\7\67\u0293\n\67\f\67\16\67\u0296\13\67\3\67\3\67\3\67\6\67\u029b"+
		"\n\67\r\67\16\67\u029c\5\67\u029f\n\67\38\38\38\78\u02a4\n8\f8\168\u02a7"+
		"\138\38\38\38\78\u02ac\n8\f8\168\u02af\138\38\38\38\68\u02b4\n8\r8\16"+
		"8\u02b5\58\u02b8\n8\39\39\39\79\u02bd\n9\f9\169\u02c0\139\3:\3:\5:\u02c4"+
		"\n:\3:\3:\7:\u02c8\n:\f:\16:\u02cb\13:\3;\3;\3;\3;\3;\3;\5;\u02d3\n;\5"+
		";\u02d5\n;\3<\3<\5<\u02d9\n<\3=\3=\5=\u02dd\n=\3>\3>\3>\3>\7>\u02e3\n"+
		">\f>\16>\u02e6\13>\3>\3>\3>\3>\3>\3>\3>\7>\u02ef\n>\f>\16>\u02f2\13>\3"+
		">\3>\7>\u02f6\n>\f>\16>\u02f9\13>\5>\u02fb\n>\3?\3?\5?\u02ff\n?\3?\3?"+
		"\3?\5?\u0304\n?\7?\u0306\n?\f?\16?\u0309\13?\3@\3@\5@\u030d\n@\3A\3A\3"+
		"B\3B\5B\u0313\nB\3C\3C\3C\3C\3C\3C\5C\u031b\nC\3D\3D\3E\3E\3E\2\3dF\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2\17\5\2\r\16"+
		"\25\27\32\32\4\2\20\20\34\34\3\2NQ\3\2DE\3\2RT\3\2PQ\4\2BCIJ\4\2HHKK\3"+
		"\2[f\3\2NO\3\2\4\f\3\2/\62\3\2\63\64\2\u0367\2\u008b\3\2\2\2\4\u009a\3"+
		"\2\2\2\6\u009f\3\2\2\2\b\u00a3\3\2\2\2\n\u00a7\3\2\2\2\f\u00b7\3\2\2\2"+
		"\16\u00b9\3\2\2\2\20\u00c9\3\2\2\2\22\u00da\3\2\2\2\24\u00e0\3\2\2\2\26"+
		"\u00e2\3\2\2\2\30\u00e7\3\2\2\2\32\u00ea\3\2\2\2\34\u00f6\3\2\2\2\36\u00f8"+
		"\3\2\2\2 \u0100\3\2\2\2\"\u0111\3\2\2\2$\u0113\3\2\2\2&\u0119\3\2\2\2"+
		"(\u0126\3\2\2\2*\u012c\3\2\2\2,\u0132\3\2\2\2.\u0134\3\2\2\2\60\u013c"+
		"\3\2\2\2\62\u0141\3\2\2\2\64\u0149\3\2\2\2\66\u014d\3\2\2\28\u0156\3\2"+
		"\2\2:\u015b\3\2\2\2<\u0165\3\2\2\2>\u0167\3\2\2\2@\u0177\3\2\2\2B\u0182"+
		"\3\2\2\2D\u0189\3\2\2\2F\u018c\3\2\2\2H\u01c5\3\2\2\2J\u01c7\3\2\2\2L"+
		"\u01ce\3\2\2\2N\u01dd\3\2\2\2P\u01ea\3\2\2\2R\u01ec\3\2\2\2T\u01f2\3\2"+
		"\2\2V\u01f6\3\2\2\2X\u0209\3\2\2\2Z\u020d\3\2\2\2\\\u020f\3\2\2\2^\u0211"+
		"\3\2\2\2`\u0213\3\2\2\2b\u0218\3\2\2\2d\u0233\3\2\2\2f\u0270\3\2\2\2h"+
		"\u0279\3\2\2\2j\u027f\3\2\2\2l\u029e\3\2\2\2n\u02b7\3\2\2\2p\u02b9\3\2"+
		"\2\2r\u02c3\3\2\2\2t\u02d4\3\2\2\2v\u02d8\3\2\2\2x\u02da\3\2\2\2z\u02de"+
		"\3\2\2\2|\u02fc\3\2\2\2~\u030c\3\2\2\2\u0080\u030e\3\2\2\2\u0082\u0312"+
		"\3\2\2\2\u0084\u031a\3\2\2\2\u0086\u031c\3\2\2\2\u0088\u031e\3\2\2\2\u008a"+
		"\u008c\5\b\5\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2"+
		"\2\2\u008d\u008f\5\n\6\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0096\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0095\5\f\7\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\3\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\5\3\2\2\2\u009e\u00a0\5F$\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\7\3\2\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\5.\30\2\u00a5\u00a6\7?\2\2"+
		"\u00a6\t\3\2\2\2\u00a7\u00a9\7\35\2\2\u00a8\u00aa\7\32\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\5.\30\2\u00ac"+
		"\u00ad\7A\2\2\u00ad\u00af\7R\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\13\3\2\2\2\u00b2\u00b3"+
		"\6\7\2\2\u00b3\u00b8\5\16\b\2\u00b4\u00b8\5\4\3\2\u00b5\u00b8\5\6\4\2"+
		"\u00b6\u00b8\7?\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\r\3\2\2\2\u00b9\u00ba\5\30\r\2\u00ba"+
		"\u00bb\7\17\2\2\u00bb\u00bd\7n\2\2\u00bc\u00be\5 \21\2\u00bd\u00bc\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c0\7\20\2\2\u00c0"+
		"\u00c2\5r:\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2"+
		"\2\u00c3\u00c4\7\22\2\2\u00c4\u00c6\5p9\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\5\20\t\2\u00c8\17\3\2\2\2\u00c9"+
		"\u00cd\7;\2\2\u00ca\u00cc\5\22\n\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7<\2\2\u00d1\21\3\2\2\2\u00d2\u00db\7?\2\2"+
		"\u00d3\u00d5\7\32\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00db\5B\"\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9\5\24\13\2"+
		"\u00d9\u00db\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7"+
		"\3\2\2\2\u00db\23\3\2\2\2\u00dc\u00e1\5\32\16\2\u00dd\u00e1\5\60\31\2"+
		"\u00de\u00e1\5\62\32\2\u00df\u00e1\5\16\b\2\u00e0\u00dc\3\2\2\2\u00e0"+
		"\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\25\3\2\2"+
		"\2\u00e2\u00e3\t\2\2\2\u00e3\27\3\2\2\2\u00e4\u00e6\5\26\f\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\31\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ec\5~@\2"+
		"\u00ec\u00ed\7n\2\2\u00ed\u00f0\5$\23\2\u00ee\u00ef\7.\2\2\u00ef\u00f1"+
		"\5\36\20\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f2\u00f3\5\34\17\2\u00f3\33\3\2\2\2\u00f4\u00f7\5B\"\2\u00f5\u00f7"+
		"\7?\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\35\3\2\2\2\u00f8"+
		"\u00fd\5.\30\2\u00f9\u00fa\7@\2\2\u00fa\u00fc\5.\30\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\37\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7C\2\2\u0101\u0106\5\"\22"+
		"\2\u0102\u0103\7@\2\2\u0103\u0105\5\"\22\2\u0104\u0102\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7B\2\2\u010a!\3\2\2\2\u010b\u0112\5r:\2\u010c"+
		"\u010f\7F\2\2\u010d\u010e\t\3\2\2\u010e\u0110\5r:\2\u010f\u010d\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c"+
		"\3\2\2\2\u0112#\3\2\2\2\u0113\u0115\79\2\2\u0114\u0116\5&\24\2\u0115\u0114"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7:\2\2\u0118"+
		"%\3\2\2\2\u0119\u011e\5(\25\2\u011a\u011b\7@\2\2\u011b\u011d\5(\25\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0123\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7@\2\2\u0122"+
		"\u0124\5*\26\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\'\3\2\2\2"+
		"\u0125\u0127\5,\27\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\5r:\2\u0129\u012a\5:\36\2\u012a)\3\2\2\2\u012b\u012d"+
		"\5,\27\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\5r:\2\u012f\u0130\7j\2\2\u0130\u0131\5:\36\2\u0131+\3\2\2\2\u0132"+
		"\u0133\7\r\2\2\u0133-\3\2\2\2\u0134\u0139\7n\2\2\u0135\u0136\7A\2\2\u0136"+
		"\u0138\7n\2\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a/\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d"+
		"\5\30\r\2\u013d\u013f\5\66\34\2\u013e\u0140\7?\2\2\u013f\u013e\3\2\2\2"+
		"\u013f\u0140\3\2\2\2\u0140\61\3\2\2\2\u0141\u0142\7n\2\2\u0142\u0145\5"+
		"$\23\2\u0143\u0144\7.\2\2\u0144\u0146\5\36\20\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\5B\"\2\u0148\63\3\2\2\2"+
		"\u0149\u014a\5d\63\2\u014a\u014b\7[\2\2\u014b\u014c\5<\37\2\u014c\65\3"+
		"\2\2\2\u014d\u014e\5r:\2\u014e\u0153\58\35\2\u014f\u0150\7@\2\2\u0150"+
		"\u0152\58\35\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\67\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0159"+
		"\5:\36\2\u0157\u0158\7[\2\2\u0158\u015a\5<\37\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a9\3\2\2\2\u015b\u0160\7n\2\2\u015c\u015d\7=\2\2\u015d"+
		"\u015f\7>\2\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161;\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0166"+
		"\5> \2\u0164\u0166\5d\63\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"=\3\2\2\2\u0167\u0173\7;\2\2\u0168\u016d\5<\37\2\u0169\u016a\7@\2\2\u016a"+
		"\u016c\5<\37\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0172\7@\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2"+
		"\2\2\u0173\u0168\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\7<\2\2\u0176?\3\2\2\2\u0177\u0178\7n\2\2\u0178\u0179\7n\2\2\u0179"+
		"\u017a\7[\2\2\u017a\u017b\7\23\2\2\u017b\u017c\7n\2\2\u017c\u017e\79\2"+
		"\2\u017d\u017f\5j\66\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\7:\2\2\u0181A\3\2\2\2\u0182\u0183\7;\2\2\u0183\u0184"+
		"\5D#\2\u0184\u0185\7<\2\2\u0185C\3\2\2\2\u0186\u0188\5F$\2\u0187\u0186"+
		"\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"E\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\5H%\2\u018dG\3\2\2\2\u018e\u01c6"+
		"\5B\"\2\u018f\u01c6\5J&\2\u0190\u01c6\5L\'\2\u0191\u01c6\5R*\2\u0192\u01c6"+
		"\5T+\2\u0193\u01c6\5V,\2\u0194\u0196\7\'\2\2\u0195\u0197\5d\63\2\u0196"+
		"\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a\7?"+
		"\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01c6\3\2\2\2\u019b"+
		"\u019d\7,\2\2\u019c\u019e\5d\63\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\7?\2\2\u01a0\u019f\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01c6\3\2\2\2\u01a2\u01a4\7\36\2\2\u01a3\u01a5\7"+
		"n\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a8\7?\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01c6\3\2"+
		"\2\2\u01a9\u01ab\7 \2\2\u01aa\u01ac\7n\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\7?\2\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01c6\3\2\2\2\u01b0\u01b1\7&\2\2\u01b1\u01b3\7n\2"+
		"\2\u01b2\u01b4\7?\2\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01c6"+
		"\3\2\2\2\u01b5\u01b6\7n\2\2\u01b6\u01b7\7G\2\2\u01b7\u01c6\5H%\2\u01b8"+
		"\u01c6\7?\2\2\u01b9\u01bb\5\66\34\2\u01ba\u01bc\7?\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c6\3\2\2\2\u01bd\u01bf\5\64\33\2\u01be"+
		"\u01c0\7?\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c6\3\2"+
		"\2\2\u01c1\u01c3\5d\63\2\u01c2\u01c4\7?\2\2\u01c3\u01c2\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u018e\3\2\2\2\u01c5\u018f\3\2"+
		"\2\2\u01c5\u0190\3\2\2\2\u01c5\u0191\3\2\2\2\u01c5\u0192\3\2\2\2\u01c5"+
		"\u0193\3\2\2\2\u01c5\u0194\3\2\2\2\u01c5\u019b\3\2\2\2\u01c5\u01a2\3\2"+
		"\2\2\u01c5\u01a9\3\2\2\2\u01c5\u01b0\3\2\2\2\u01c5\u01b5\3\2\2\2\u01c5"+
		"\u01b8\3\2\2\2\u01c5\u01b9\3\2\2\2\u01c5\u01bd\3\2\2\2\u01c5\u01c1\3\2"+
		"\2\2\u01c6I\3\2\2\2\u01c7\u01c8\7%\2\2\u01c8\u01c9\5b\62\2\u01c9\u01cc"+
		"\5H%\2\u01ca\u01cb\7#\2\2\u01cb\u01cd\5H%\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cdK\3\2\2\2\u01ce\u01cf\7(\2\2\u01cf\u01d0\5b\62\2\u01d0"+
		"\u01d4\7;\2\2\u01d1\u01d3\5N(\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2"+
		"\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d7\u01d8\7!\2\2\u01d8\u01d9\7G\2\2\u01d9\u01da\5D#\2\u01da"+
		"\u01db\7<\2\2\u01dbM\3\2\2\2\u01dc\u01de\5P)\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e2\5D#\2\u01e2O\3\2\2\2\u01e3\u01e4\7\37\2\2\u01e4\u01e5"+
		"\5d\63\2\u01e5\u01e6\7G\2\2\u01e6\u01eb\3\2\2\2\u01e7\u01e8\7\37\2\2\u01e8"+
		"\u01e9\7n\2\2\u01e9\u01eb\7G\2\2\u01ea\u01e3\3\2\2\2\u01ea\u01e7\3\2\2"+
		"\2\u01ebQ\3\2\2\2\u01ec\u01ed\7$\2\2\u01ed\u01ee\79\2\2\u01ee\u01ef\5"+
		"X-\2\u01ef\u01f0\7:\2\2\u01f0\u01f1\5H%\2\u01f1S\3\2\2\2\u01f2\u01f3\7"+
		")\2\2\u01f3\u01f4\5b\62\2\u01f4\u01f5\5H%\2\u01f5U\3\2\2\2\u01f6\u01f7"+
		"\7\"\2\2\u01f7\u01f8\5B\"\2\u01f8\u01f9\7)\2\2\u01f9\u01fb\5b\62\2\u01fa"+
		"\u01fc\7?\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcW\3\2\2\2\u01fd"+
		"\u020a\5`\61\2\u01fe\u0200\5Z.\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2"+
		"\2\u0200\u0201\3\2\2\2\u0201\u0203\7?\2\2\u0202\u0204\5\\/\2\u0203\u0202"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\7?\2\2\u0206"+
		"\u0208\5^\60\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2"+
		"\2\2\u0209\u01fd\3\2\2\2\u0209\u01ff\3\2\2\2\u020aY\3\2\2\2\u020b\u020e"+
		"\5\66\34\2\u020c\u020e\5j\66\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2"+
		"\u020e[\3\2\2\2\u020f\u0210\5d\63\2\u0210]\3\2\2\2\u0211\u0212\5j\66\2"+
		"\u0212_\3\2\2\2\u0213\u0214\5r:\2\u0214\u0215\5:\36\2\u0215\u0216\7G\2"+
		"\2\u0216\u0217\5d\63\2\u0217a\3\2\2\2\u0218\u0219\79\2\2\u0219\u021a\5"+
		"d\63\2\u021a\u021b\7:\2\2\u021bc\3\2\2\2\u021c\u021d\b\63\1\2\u021d\u0234"+
		"\5f\64\2\u021e\u0234\5n8\2\u021f\u0220\5f\64\2\u0220\u0221\7A\2\2\u0221"+
		"\u0222\5n8\2\u0222\u0234\3\2\2\2\u0223\u0234\5\u0082B\2\u0224\u0225\7"+
		"9\2\2\u0225\u0226\5d\63\2\u0226\u0227\7:\2\2\u0227\u0234\3\2\2\2\u0228"+
		"\u0229\7\23\2\2\u0229\u0234\5t;\2\u022a\u022b\t\4\2\2\u022b\u0234\5d\63"+
		"\21\u022c\u022d\t\5\2\2\u022d\u0234\5d\63\20\u022e\u022f\79\2\2\u022f"+
		"\u0230\5r:\2\u0230\u0231\7:\2\2\u0231\u0232\5d\63\17\u0232\u0234\3\2\2"+
		"\2\u0233\u021c\3\2\2\2\u0233\u021e\3\2\2\2\u0233\u021f\3\2\2\2\u0233\u0223"+
		"\3\2\2\2\u0233\u0224\3\2\2\2\u0233\u0228\3\2\2\2\u0233\u022a\3\2\2\2\u0233"+
		"\u022c\3\2\2\2\u0233\u022e\3\2\2\2\u0234\u026d\3\2\2\2\u0235\u0236\f\16"+
		"\2\2\u0236\u0237\t\6\2\2\u0237\u026c\5d\63\17\u0238\u0239\f\r\2\2\u0239"+
		"\u023a\t\7\2\2\u023a\u026c\5d\63\16\u023b\u0243\f\f\2\2\u023c\u023d\7"+
		"C\2\2\u023d\u0244\7C\2\2\u023e\u023f\7B\2\2\u023f\u0240\7B\2\2\u0240\u0244"+
		"\7B\2\2\u0241\u0242\7B\2\2\u0242\u0244\7B\2\2\u0243\u023c\3\2\2\2\u0243"+
		"\u023e\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u026c\5d"+
		"\63\r\u0246\u0247\f\13\2\2\u0247\u0248\t\b\2\2\u0248\u026c\5d\63\f\u0249"+
		"\u024a\f\n\2\2\u024a\u024b\t\t\2\2\u024b\u026c\5d\63\13\u024c\u024d\f"+
		"\t\2\2\u024d\u024e\7U\2\2\u024e\u026c\5d\63\n\u024f\u0250\f\b\2\2\u0250"+
		"\u0251\7W\2\2\u0251\u026c\5d\63\t\u0252\u0253\f\7\2\2\u0253\u0254\7V\2"+
		"\2\u0254\u026c\5d\63\b\u0255\u0256\f\6\2\2\u0256\u0257\7L\2\2\u0257\u026c"+
		"\5d\63\7\u0258\u0259\f\5\2\2\u0259\u025a\7M\2\2\u025a\u026c\5d\63\6\u025b"+
		"\u025c\f\4\2\2\u025c\u025d\7F\2\2\u025d\u025e\5d\63\2\u025e\u025f\7G\2"+
		"\2\u025f\u0260\5d\63\5\u0260\u026c\3\2\2\2\u0261\u0262\f\3\2\2\u0262\u0263"+
		"\t\n\2\2\u0263\u026c\5d\63\3\u0264\u0265\f\25\2\2\u0265\u0266\7=\2\2\u0266"+
		"\u0267\5d\63\2\u0267\u0268\7>\2\2\u0268\u026c\3\2\2\2\u0269\u026a\f\22"+
		"\2\2\u026a\u026c\t\13\2\2\u026b\u0235\3\2\2\2\u026b\u0238\3\2\2\2\u026b"+
		"\u023b\3\2\2\2\u026b\u0246\3\2\2\2\u026b\u0249\3\2\2\2\u026b\u024c\3\2"+
		"\2\2\u026b\u024f\3\2\2\2\u026b\u0252\3\2\2\2\u026b\u0255\3\2\2\2\u026b"+
		"\u0258\3\2\2\2\u026b\u025b\3\2\2\2\u026b\u0261\3\2\2\2\u026b\u0264\3\2"+
		"\2\2\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026ee\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\5l\67\2"+
		"\u0271\u0276\5h\65\2\u0272\u0273\7A\2\2\u0273\u0275\5f\64\2\u0274\u0272"+
		"\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"g\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\79\2\2\u027a\u027c\5j\66\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\7:"+
		"\2\2\u027ei\3\2\2\2\u027f\u0284\5d\63\2\u0280\u0281\7@\2\2\u0281\u0283"+
		"\5d\63\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285k\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u028c\7n\2\2\u0288"+
		"\u0289\7A\2\2\u0289\u028b\7n\2\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2"+
		"\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u029f\3\2\2\2\u028e\u028c"+
		"\3\2\2\2\u028f\u0294\7\33\2\2\u0290\u0291\7A\2\2\u0291\u0293\7n\2\2\u0292"+
		"\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u029f\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u029a\7\34\2\2\u0298"+
		"\u0299\7A\2\2\u0299\u029b\7n\2\2\u029a\u0298\3\2\2\2\u029b\u029c\3\2\2"+
		"\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u0287"+
		"\3\2\2\2\u029e\u028f\3\2\2\2\u029e\u0297\3\2\2\2\u029fm\3\2\2\2\u02a0"+
		"\u02a5\7n\2\2\u02a1\u02a2\7A\2\2\u02a2\u02a4\7n\2\2\u02a3\u02a1\3\2\2"+
		"\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02b8"+
		"\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02ad\7\33\2\2\u02a9\u02aa\7A\2\2\u02aa"+
		"\u02ac\7n\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2"+
		"\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b8\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0"+
		"\u02b3\7\34\2\2\u02b1\u02b2\7A\2\2\u02b2\u02b4\7n\2\2\u02b3\u02b1\3\2"+
		"\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b8\3\2\2\2\u02b7\u02a0\3\2\2\2\u02b7\u02a8\3\2\2\2\u02b7\u02b0\3\2"+
		"\2\2\u02b8o\3\2\2\2\u02b9\u02be\5r:\2\u02ba\u02bb\7@\2\2\u02bb\u02bd\5"+
		"r:\2\u02bc\u02ba\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bfq\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c4\5|?\2\u02c2"+
		"\u02c4\5\u0080A\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c9"+
		"\3\2\2\2\u02c5\u02c6\7=\2\2\u02c6\u02c8\7>\2\2\u02c7\u02c5\3\2\2\2\u02c8"+
		"\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02cas\3\2\2\2"+
		"\u02cb\u02c9\3\2\2\2\u02cc\u02cd\5v<\2\u02cd\u02ce\5x=\2\u02ce\u02d5\3"+
		"\2\2\2\u02cf\u02d2\5v<\2\u02d0\u02d3\5z>\2\u02d1\u02d3\5x=\2\u02d2\u02d0"+
		"\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02cc\3\2\2\2\u02d4"+
		"\u02cf\3\2\2\2\u02d5u\3\2\2\2\u02d6\u02d9\5|?\2\u02d7\u02d9\5\u0080A\2"+
		"\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9w\3\2\2\2\u02da\u02dc\5"+
		"h\65\2\u02db\u02dd\5\20\t\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"y\3\2\2\2\u02de\u02fa\7=\2\2\u02df\u02e4\7>\2\2\u02e0\u02e1\7=\2\2\u02e1"+
		"\u02e3\7>\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2"+
		"\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7"+
		"\u02fb\5> \2\u02e8\u02e9\5d\63\2\u02e9\u02f0\7>\2\2\u02ea\u02eb\7=\2\2"+
		"\u02eb\u02ec\5d\63\2\u02ec\u02ed\7>\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ea"+
		"\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f7\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f4\7=\2\2\u02f4\u02f6\7>\2"+
		"\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8"+
		"\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02df\3\2\2\2\u02fa"+
		"\u02e8\3\2\2\2\u02fb{\3\2\2\2\u02fc\u02fe\7n\2\2\u02fd\u02ff\5 \21\2\u02fe"+
		"\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0307\3\2\2\2\u0300\u0301\7A"+
		"\2\2\u0301\u0303\7n\2\2\u0302\u0304\5 \21\2\u0303\u0302\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0300\3\2\2\2\u0306\u0309\3\2"+
		"\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308}\3\2\2\2\u0309\u0307"+
		"\3\2\2\2\u030a\u030d\5r:\2\u030b\u030d\7\3\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030b\3\2\2\2\u030d\177\3\2\2\2\u030e\u030f\t\f\2\2\u030f\u0081\3\2\2"+
		"\2\u0310\u0313\5\u0084C\2\u0311\u0313\7n\2\2\u0312\u0310\3\2\2\2\u0312"+
		"\u0311\3\2\2\2\u0313\u0083\3\2\2\2\u0314\u031b\5\u0086D\2\u0315\u031b"+
		"\5\u0088E\2\u0316\u031b\7\66\2\2\u0317\u031b\7\67\2\2\u0318\u031b\7\65"+
		"\2\2\u0319\u031b\78\2\2\u031a\u0314\3\2\2\2\u031a\u0315\3\2\2\2\u031a"+
		"\u0316\3\2\2\2\u031a\u0317\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u0319\3\2"+
		"\2\2\u031b\u0085\3\2\2\2\u031c\u031d\t\r\2\2\u031d\u0087\3\2\2\2\u031e"+
		"\u031f\t\16\2\2\u031f\u0089\3\2\2\2`\u008b\u0090\u0096\u009c\u00a1\u00a9"+
		"\u00ae\u00b7\u00bd\u00c1\u00c5\u00cd\u00d4\u00da\u00e0\u00e7\u00f0\u00f6"+
		"\u00fd\u0106\u010f\u0111\u0115\u011e\u0123\u0126\u012c\u0139\u013f\u0145"+
		"\u0153\u0159\u0160\u0165\u016d\u0171\u0173\u017e\u0189\u0196\u0199\u019d"+
		"\u01a0\u01a4\u01a7\u01ab\u01ae\u01b3\u01bb\u01bf\u01c3\u01c5\u01cc\u01d4"+
		"\u01df\u01ea\u01fb\u01ff\u0203\u0207\u0209\u020d\u0233\u0243\u026b\u026d"+
		"\u0276\u027b\u0284\u028c\u0294\u029c\u029e\u02a5\u02ad\u02b5\u02b7\u02be"+
		"\u02c3\u02c9\u02d2\u02d4\u02d8\u02dc\u02e4\u02f0\u02f7\u02fa\u02fe\u0303"+
		"\u0307\u030c\u0312\u031a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
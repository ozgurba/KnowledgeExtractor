// Generated from KnowExtParser.g4 by ANTLR 4.4
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnowExtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW=18, ADD=66, THROW=24, LT=53, DO=9, AND_ASSIGN=78, PRODUCT=31, AGGREGATE=33, 
		BYTE=2, BREAK=3, ELSE=11, OR_ASSIGN=79, TRY=25, IF=14, SUB=67, PROJECT=30, 
		MUL=68, BANG=54, REORDER=35, FOR=13, LPAREN=42, DOT=50, RPAREN=43, CARET=72, 
		URSHIFT_ASSIGN=84, BOOLEAN=1, CASE=4, BOOL_LITERAL=38, NOTEQUAL=61, RBRACK=47, 
		LINE_COMMENT=87, RBRACE=45, LBRACK=46, AND=62, TREE=23, SWITCH=21, CHAR_LITERAL=39, 
		VOID=26, LIST=16, NULL_LITERAL=41, RSHIFT_ASSIGN=83, LBRACE=44, INC=64, 
		FLOAT=12, SET=29, DIV_ASSIGN=77, SUB_ASSIGN=75, SEMI=48, CHAR=6, ASSIGN=51, 
		INT=15, QUESTION=56, COMMENT=86, RETURN=19, GROUP=32, BITOR=71, CATCH=5, 
		MUL_ASSIGN=76, LSHIFT_ASSIGN=82, DOUBLE=10, ADD_ASSIGN=74, IDENTIFIER=88, 
		WS=85, GE=60, LONG=17, RENAME=34, COMMA=49, BITAND=70, OR=63, DEC=65, 
		MOD=73, XOR_ASSIGN=80, EQUAL=58, COLON=57, GT=52, SELECT=28, SHORT=20, 
		CONTINUE=7, DIV=69, MOD_ASSIGN=81, FLOAT_LITERAL=37, LE=59, WHILE=22, 
		STRING_LITERAL=40, TILDE=55, UNION=27, DEFAULT=8, DECIMAL_LITERAL=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'boolean'", "'byte'", "'break'", "'case'", "'catch'", "'char'", 
		"'continue'", "'default'", "'do'", "'double'", "'else'", "'float'", "'for'", 
		"'if'", "'int'", "'list'", "'long'", "'new'", "'return'", "'short'", "'switch'", 
		"'while'", "'Tree'", "'throw'", "'try'", "'void'", "'union'", "'select'", 
		"'set'", "'project'", "'product'", "'group'", "'aggregate'", "'rename'", 
		"'reorder'", "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "WS", 
		"COMMENT", "LINE_COMMENT", "IDENTIFIER"
	};
	public static final int
		RULE_file = 0, RULE_varDecl = 1, RULE_functionDecl = 2, RULE_typeTypeOrVoid = 3, 
		RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_block = 6, RULE_stat = 7, 
		RULE_parExpr = 8, RULE_expr = 9, RULE_primary = 10, RULE_exprList = 11, 
		RULE_typeType = 12, RULE_literal = 13, RULE_primitiveType = 14, RULE_complexType = 15;
	public static final String[] ruleNames = {
		"file", "varDecl", "functionDecl", "typeTypeOrVoid", "formalParameters", 
		"formalParameter", "block", "stat", "parExpr", "expr", "primary", "exprList", 
		"typeType", "literal", "primitiveType", "complexType"
	};

	@Override
	public String getGrammarFileName() { return "KnowExtParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KnowExtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32); functionDecl();
					}
					break;
				case 2:
					{
					setState(33); varDecl();
					}
					break;
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << SHORT) | (1L << TREE) | (1L << VOID) | (1L << SET))) != 0) );
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(KnowExtParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); typeType();
			setState(39); match(IDENTIFIER);
			setState(42);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(40); match(ASSIGN);
				setState(41); expr(0);
				}
			}

			setState(44); match(SEMI);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); typeTypeOrVoid();
			setState(47); match(IDENTIFIER);
			setState(48); match(LPAREN);
			setState(50);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << SHORT) | (1L << TREE) | (1L << SET))) != 0)) {
				{
				setState(49); formalParameters();
				}
			}

			setState(52); match(RPAREN);
			setState(53); block();
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(KnowExtParser.VOID, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeTypeOrVoid);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LIST:
			case LONG:
			case SHORT:
			case TREE:
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(VOID);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); formalParameter();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60); match(COMMA);
				setState(61); formalParameter();
				}
				}
				setState(66);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); typeType();
			setState(68); match(IDENTIFIER);
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
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(LBRACE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << TREE) | (1L << SET) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG))) != 0) || _la==SUB || _la==IDENTIFIER) {
				{
				{
				setState(71); stat();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(RBRACE);
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KnowExtParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(KnowExtParser.IF, 0); }
		public TerminalNode RETURN() { return getToken(KnowExtParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ParExprContext parExpr() {
			return getRuleContext(ParExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		int _la;
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); match(IF);
				setState(82); parExpr();
				setState(83); stat();
				setState(86);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(84); match(ELSE);
					setState(85); stat();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88); match(RETURN);
				setState(90);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (DECIMAL_LITERAL - 36)) | (1L << (FLOAT_LITERAL - 36)) | (1L << (BOOL_LITERAL - 36)) | (1L << (CHAR_LITERAL - 36)) | (1L << (STRING_LITERAL - 36)) | (1L << (NULL_LITERAL - 36)) | (1L << (LPAREN - 36)) | (1L << (BANG - 36)) | (1L << (SUB - 36)) | (1L << (IDENTIFIER - 36)))) != 0)) {
					{
					setState(89); expr(0);
					}
				}

				setState(92); match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93); expr(0);
				setState(94); match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96); varDecl();
				setState(97); match(SEMI);
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

	public static class ParExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitParExpr(this);
		}
	}

	public final ParExprContext parExpr() throws RecognitionException {
		ParExprContext _localctx = new ParExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(LPAREN);
			setState(102); expr(0);
			setState(103); match(RPAREN);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(KnowExtParser.SUB, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KnowExtParser.RPAREN, 0); }
		public TerminalNode MUL() { return getToken(KnowExtParser.MUL, 0); }
		public TerminalNode ASSIGN() { return getToken(KnowExtParser.ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(KnowExtParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode LPAREN() { return getToken(KnowExtParser.LPAREN, 0); }
		public TerminalNode ADD() { return getToken(KnowExtParser.ADD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public TerminalNode DIV() { return getToken(KnowExtParser.DIV, 0); }
		public TerminalNode BANG() { return getToken(KnowExtParser.BANG, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(106); match(SUB);
				setState(107); expr(8);
				}
				break;
			case 2:
				{
				setState(108); match(BANG);
				setState(109); expr(7);
				}
				break;
			case 3:
				{
				setState(110); primary();
				}
				break;
			case 4:
				{
				setState(111); match(IDENTIFIER);
				setState(112); match(LPAREN);
				setState(114);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (DECIMAL_LITERAL - 36)) | (1L << (FLOAT_LITERAL - 36)) | (1L << (BOOL_LITERAL - 36)) | (1L << (CHAR_LITERAL - 36)) | (1L << (STRING_LITERAL - 36)) | (1L << (NULL_LITERAL - 36)) | (1L << (LPAREN - 36)) | (1L << (BANG - 36)) | (1L << (SUB - 36)) | (1L << (IDENTIFIER - 36)))) != 0)) {
					{
					setState(113); exprList();
					}
				}

				setState(116); match(RPAREN);
				}
				break;
			case 5:
				{
				setState(117); match(IDENTIFIER);
				setState(118); match(LBRACK);
				setState(119); expr(0);
				setState(120); match(RBRACK);
				}
				break;
			case 6:
				{
				setState(122); match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(123); match(LPAREN);
				setState(124); expr(0);
				setState(125); match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(131); expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(134); expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136); match(ASSIGN);
						setState(137); expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139); match(EQUAL);
						setState(140); expr(4);
						}
						break;
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KnowExtParser.LPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KnowExtParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primary);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); match(LPAREN);
				setState(147); expr(0);
				setState(148); match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(151); match(IDENTIFIER);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); expr(0);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155); match(COMMA);
				setState(156); expr(0);
				}
				}
				setState(161);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			switch (_input.LA(1)) {
			case LIST:
			case TREE:
			case SET:
				{
				setState(162); complexType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(163); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(166); match(LBRACK);
				setState(167); match(RBRACK);
				}
				}
				setState(172);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(KnowExtParser.DECIMAL_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(KnowExtParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(KnowExtParser.NULL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(KnowExtParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(KnowExtParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(KnowExtParser.CHAR_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode SHORT() { return getToken(KnowExtParser.SHORT, 0); }
		public TerminalNode LONG() { return getToken(KnowExtParser.LONG, 0); }
		public TerminalNode BYTE() { return getToken(KnowExtParser.BYTE, 0); }
		public TerminalNode BOOLEAN() { return getToken(KnowExtParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(KnowExtParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(KnowExtParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(KnowExtParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(KnowExtParser.FLOAT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ComplexTypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(KnowExtParser.LIST, 0); }
		public TerminalNode TREE() { return getToken(KnowExtParser.TREE, 0); }
		public TerminalNode SET() { return getToken(KnowExtParser.SET, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitComplexType(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << TREE) | (1L << SET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 9: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		case 3: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Z\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\6"+
		"\2%\n\2\r\2\16\2&\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\65\n\4\3\4\3\4\3\4\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13"+
		"\6\3\7\3\7\3\7\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tY\n\t\3\t\3\t\5\t]\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"f\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"u\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0082"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0090\n\13\f\13\16\13\u0093\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009b\n"+
		"\f\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\16\3\16\5\16\u00a7"+
		"\n\16\3\16\3\16\7\16\u00ab\n\16\f\16\16\16\u00ae\13\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\2\3\24\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\7\3\2FG\3\2DE\3\2&+\t\2\3\4\b\b\f\f\16\16\21\21\23\23\26\26\5\2\22"+
		"\22\31\31\37\37\u00c3\2$\3\2\2\2\4(\3\2\2\2\6\60\3\2\2\2\b;\3\2\2\2\n"+
		"=\3\2\2\2\fE\3\2\2\2\16H\3\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24\u0081\3\2"+
		"\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u00a6\3\2\2\2\34\u00af\3\2\2"+
		"\2\36\u00b1\3\2\2\2 \u00b3\3\2\2\2\"%\5\6\4\2#%\5\4\3\2$\"\3\2\2\2$#\3"+
		"\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2()\5\32\16\2),\7Z\2\2"+
		"*+\7\65\2\2+-\5\24\13\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\62\2\2/\5\3"+
		"\2\2\2\60\61\5\b\5\2\61\62\7Z\2\2\62\64\7,\2\2\63\65\5\n\6\2\64\63\3\2"+
		"\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7-\2\2\678\5\16\b\28\7\3\2\2\2"+
		"9<\5\32\16\2:<\7\34\2\2;9\3\2\2\2;:\3\2\2\2<\t\3\2\2\2=B\5\f\7\2>?\7\63"+
		"\2\2?A\5\f\7\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DB\3"+
		"\2\2\2EF\5\32\16\2FG\7Z\2\2G\r\3\2\2\2HL\7.\2\2IK\5\20\t\2JI\3\2\2\2K"+
		"N\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7/\2\2P\17\3\2\2\2"+
		"Qf\5\16\b\2Rf\5\4\3\2ST\7\20\2\2TU\5\22\n\2UX\5\20\t\2VW\7\r\2\2WY\5\20"+
		"\t\2XV\3\2\2\2XY\3\2\2\2Yf\3\2\2\2Z\\\7\25\2\2[]\5\24\13\2\\[\3\2\2\2"+
		"\\]\3\2\2\2]^\3\2\2\2^f\7\62\2\2_`\5\24\13\2`a\7\62\2\2af\3\2\2\2bc\5"+
		"\4\3\2cd\7\62\2\2df\3\2\2\2eQ\3\2\2\2eR\3\2\2\2eS\3\2\2\2eZ\3\2\2\2e_"+
		"\3\2\2\2eb\3\2\2\2f\21\3\2\2\2gh\7,\2\2hi\5\24\13\2ij\7-\2\2j\23\3\2\2"+
		"\2kl\b\13\1\2lm\7E\2\2m\u0082\5\24\13\nno\78\2\2o\u0082\5\24\13\tp\u0082"+
		"\5\26\f\2qr\7Z\2\2rt\7,\2\2su\5\30\r\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2v"+
		"\u0082\7-\2\2wx\7Z\2\2xy\7\60\2\2yz\5\24\13\2z{\7\61\2\2{\u0082\3\2\2"+
		"\2|\u0082\7Z\2\2}~\7,\2\2~\177\5\24\13\2\177\u0080\7-\2\2\u0080\u0082"+
		"\3\2\2\2\u0081k\3\2\2\2\u0081n\3\2\2\2\u0081p\3\2\2\2\u0081q\3\2\2\2\u0081"+
		"w\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0082\u0091\3\2\2\2\u0083\u0084"+
		"\f\b\2\2\u0084\u0085\t\2\2\2\u0085\u0090\5\24\13\t\u0086\u0087\f\7\2\2"+
		"\u0087\u0088\t\3\2\2\u0088\u0090\5\24\13\b\u0089\u008a\f\6\2\2\u008a\u008b"+
		"\7\65\2\2\u008b\u0090\5\24\13\7\u008c\u008d\f\5\2\2\u008d\u008e\7<\2\2"+
		"\u008e\u0090\5\24\13\6\u008f\u0083\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089"+
		"\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\25\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7,\2\2"+
		"\u0095\u0096\5\24\13\2\u0096\u0097\7-\2\2\u0097\u009b\3\2\2\2\u0098\u009b"+
		"\5\34\17\2\u0099\u009b\7Z\2\2\u009a\u0094\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\27\3\2\2\2\u009c\u00a1\5\24\13\2\u009d\u009e"+
		"\7\63\2\2\u009e\u00a0\5\24\13\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2"+
		"\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a7\5 \21\2\u00a5\u00a7\5\36\20\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9\7\60\2\2\u00a9\u00ab"+
		"\7\61\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0"+
		"\t\4\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\t\5\2\2\u00b2\37\3\2\2\2\u00b3\u00b4"+
		"\t\6\2\2\u00b4!\3\2\2\2\24$&,\64;BLX\\et\u0081\u008f\u0091\u009a\u00a1"+
		"\u00a6\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
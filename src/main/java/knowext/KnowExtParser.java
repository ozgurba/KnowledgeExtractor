// Generated from KnowExtParser.g4 by ANTLR 4.7.1
package knowext;
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, BREAK=3, CASE=4, CATCH=5, CHAR=6, CONTINUE=7, DEFAULT=8, 
		DO=9, DOUBLE=10, ELSE=11, FLOAT=12, FOR=13, IF=14, INT=15, LIST=16, LONG=17, 
		NEW=18, RETURN=19, SHORT=20, SWITCH=21, WHILE=22, TREE=23, THROW=24, TRY=25, 
		UNION=26, SELECT=27, SET=28, PROJECT=29, PRODUCT=30, GROUP=31, AGGREGATE=32, 
		RENAME=33, REORDER=34, DECIMAL_LITERAL=35, FLOAT_LITERAL=36, BOOL_LITERAL=37, 
		CHAR_LITERAL=38, STRING_LITERAL=39, NULL_LITERAL=40, LPAREN=41, RPAREN=42, 
		LBRACE=43, RBRACE=44, LBRACK=45, RBRACK=46, SEMI=47, COMMA=48, DOT=49, 
		ASSIGN=50, GT=51, LT=52, BANG=53, TILDE=54, QUESTION=55, COLON=56, EQUAL=57, 
		LE=58, GE=59, NOTEQUAL=60, AND=61, OR=62, INC=63, DEC=64, ADD=65, SUB=66, 
		MUL=67, DIV=68, BITAND=69, BITOR=70, CARET=71, MOD=72, WS=73, COMMENT=74, 
		LINE_COMMENT=75, IDENTIFIER=76;
	public static final int
		RULE_file = 0, RULE_varDecl = 1, RULE_functionDecl = 2, RULE_formalParameters = 3, 
		RULE_formalParameter = 4, RULE_block = 5, RULE_blockStatement = 6, RULE_localVariableDeclaration = 7, 
		RULE_variableDeclarators = 8, RULE_variableDeclarator = 9, RULE_variableDeclaratorId = 10, 
		RULE_variableInitializer = 11, RULE_arrayInitializer = 12, RULE_literal = 13, 
		RULE_integerLiteral = 14, RULE_statement = 15, RULE_switchBlockStatementGroup = 16, 
		RULE_switchLabel = 17, RULE_forControl = 18, RULE_forInit = 19, RULE_enhancedForControl = 20, 
		RULE_parExpression = 21, RULE_expressionList = 22, RULE_expression = 23, 
		RULE_primary = 24, RULE_creator = 25, RULE_createdName = 26, RULE_arrayCreatorRest = 27, 
		RULE_nonWildcardTypeArguments = 28, RULE_typeList = 29, RULE_typeType = 30, 
		RULE_primitiveType = 31, RULE_complexType = 32, RULE_arguments = 33;
	public static final String[] ruleNames = {
		"file", "varDecl", "functionDecl", "formalParameters", "formalParameter", 
		"block", "blockStatement", "localVariableDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"literal", "integerLiteral", "statement", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
		"expressionList", "expression", "primary", "creator", "createdName", "arrayCreatorRest", 
		"nonWildcardTypeArguments", "typeList", "typeType", "primitiveType", "complexType", 
		"arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'byte'", "'break'", "'case'", "'catch'", "'char'", 
		"'continue'", "'default'", "'do'", "'double'", "'else'", "'float'", "'for'", 
		"'if'", "'int'", "'list'", "'long'", "'new'", "'return'", "'short'", "'switch'", 
		"'while'", "'tree'", "'throw'", "'try'", "'union'", "'select'", "'set'", 
		"'project'", "'product'", "'group'", "'aggregate'", "'rename'", "'reorder'", 
		null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
		"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
		"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BYTE", "BREAK", "CASE", "CATCH", "CHAR", "CONTINUE", 
		"DEFAULT", "DO", "DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "LIST", 
		"LONG", "NEW", "RETURN", "SHORT", "SWITCH", "WHILE", "TREE", "THROW", 
		"TRY", "UNION", "SELECT", "SET", "PROJECT", "PRODUCT", "GROUP", "AGGREGATE", 
		"RENAME", "REORDER", "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
	};
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
	public String getGrammarFileName() { return "KnowExtParser.g4"; }

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
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
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
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(68);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(69);
					varDecl();
					}
					break;
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << SHORT) | (1L << TREE) | (1L << SET))) != 0) );
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
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(74);
			typeType();
			setState(75);
			match(IDENTIFIER);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(76);
				match(ASSIGN);
				setState(77);
				expression(0);
				}
			}

			setState(80);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
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
			setState(82);
			typeType();
			setState(83);
			match(IDENTIFIER);
			setState(84);
			match(LPAREN);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << SHORT) | (1L << TREE) | (1L << SET))) != 0)) {
				{
				setState(85);
				formalParameters();
				}
			}

			setState(88);
			match(RPAREN);
			setState(89);
			block();
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
		enterRule(_localctx, 6, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			formalParameter();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				formalParameter();
				}
				}
				setState(98);
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
		enterRule(_localctx, 8, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			typeType();
			setState(100);
			match(IDENTIFIER);
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
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LBRACE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << BREAK) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SWITCH) | (1L << WHILE) | (1L << TREE) | (1L << SET) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(103);
				blockStatement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockStatement);
		try {
			setState(115);
			_errHandler.sync(this);
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
				setState(111);
				localVariableDeclaration();
				setState(112);
				match(SEMI);
				}
				break;
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case IF:
			case NEW:
			case RETURN:
			case SWITCH:
			case WHILE:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LBRACE:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				statement();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			typeType();
			setState(118);
			variableDeclarators();
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
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			variableDeclarator();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				variableDeclarator();
				}
				}
				setState(127);
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
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			variableDeclaratorId();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(129);
				match(ASSIGN);
				setState(130);
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
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENTIFIER);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(134);
				match(LBRACK);
				setState(135);
				match(RBRACK);
				}
				}
				setState(140);
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
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableInitializer);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				arrayInitializer();
				}
				break;
			case NEW:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
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
				setState(142);
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
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LBRACE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (NEW - 18)) | (1L << (DECIMAL_LITERAL - 18)) | (1L << (FLOAT_LITERAL - 18)) | (1L << (BOOL_LITERAL - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (NULL_LITERAL - 18)) | (1L << (LPAREN - 18)) | (1L << (LBRACE - 18)) | (1L << (BANG - 18)) | (1L << (TILDE - 18)) | (1L << (INC - 18)) | (1L << (DEC - 18)) | (1L << (ADD - 18)) | (1L << (SUB - 18)) | (1L << (IDENTIFIER - 18)))) != 0)) {
				{
				setState(146);
				variableInitializer();
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(147);
						match(COMMA);
						setState(148);
						variableInitializer();
						}
						} 
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(154);
					match(COMMA);
					}
				}

				}
			}

			setState(159);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode FLOAT_LITERAL() { return getToken(KnowExtParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(KnowExtParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(KnowExtParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(KnowExtParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(KnowExtParser.NULL_LITERAL, 0); }
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
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(FLOAT_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(KnowExtParser.DECIMAL_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DECIMAL_LITERAL);
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
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(KnowExtParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KnowExtParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(KnowExtParser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(KnowExtParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(KnowExtParser.DO, 0); }
		public TerminalNode SWITCH() { return getToken(KnowExtParser.SWITCH, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(KnowExtParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(KnowExtParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(KnowExtParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(IF);
				setState(173);
				parExpression();
				setState(174);
				statement();
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(175);
					match(ELSE);
					setState(176);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(FOR);
				setState(180);
				match(LPAREN);
				setState(181);
				forControl();
				setState(182);
				match(RPAREN);
				setState(183);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(WHILE);
				setState(186);
				parExpression();
				setState(187);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(DO);
				setState(190);
				statement();
				setState(191);
				match(WHILE);
				setState(192);
				parExpression();
				setState(193);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				match(SWITCH);
				setState(196);
				parExpression();
				setState(197);
				match(LBRACE);
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(204);
					switchLabel();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(RBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(RETURN);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (NEW - 18)) | (1L << (DECIMAL_LITERAL - 18)) | (1L << (FLOAT_LITERAL - 18)) | (1L << (BOOL_LITERAL - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (NULL_LITERAL - 18)) | (1L << (LPAREN - 18)) | (1L << (BANG - 18)) | (1L << (TILDE - 18)) | (1L << (INC - 18)) | (1L << (DEC - 18)) | (1L << (ADD - 18)) | (1L << (SUB - 18)) | (1L << (IDENTIFIER - 18)))) != 0)) {
					{
					setState(213);
					expression(0);
					}
				}

				setState(216);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				match(BREAK);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(218);
					match(IDENTIFIER);
					}
				}

				setState(221);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				match(CONTINUE);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(223);
					match(IDENTIFIER);
					}
				}

				setState(226);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(227);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(228);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(230);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(231);
				match(COLON);
				setState(232);
				statement();
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				switchLabel();
				}
				}
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				blockStatement();
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << BREAK) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SWITCH) | (1L << WHILE) | (1L << TREE) | (1L << SET) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(KnowExtParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KnowExtParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(KnowExtParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchLabel);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(CASE);
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(246);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(247);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(250);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(DEFAULT);
				setState(252);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forControl);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LIST) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << TREE) | (1L << SET) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(256);
					forInit();
					}
				}

				setState(259);
				match(SEMI);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (NEW - 18)) | (1L << (DECIMAL_LITERAL - 18)) | (1L << (FLOAT_LITERAL - 18)) | (1L << (BOOL_LITERAL - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (NULL_LITERAL - 18)) | (1L << (LPAREN - 18)) | (1L << (BANG - 18)) | (1L << (TILDE - 18)) | (1L << (INC - 18)) | (1L << (DEC - 18)) | (1L << (ADD - 18)) | (1L << (SUB - 18)) | (1L << (IDENTIFIER - 18)))) != 0)) {
					{
					setState(260);
					expression(0);
					}
				}

				setState(263);
				match(SEMI);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (NEW - 18)) | (1L << (DECIMAL_LITERAL - 18)) | (1L << (FLOAT_LITERAL - 18)) | (1L << (BOOL_LITERAL - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (NULL_LITERAL - 18)) | (1L << (LPAREN - 18)) | (1L << (BANG - 18)) | (1L << (TILDE - 18)) | (1L << (INC - 18)) | (1L << (DEC - 18)) | (1L << (ADD - 18)) | (1L << (SUB - 18)) | (1L << (IDENTIFIER - 18)))) != 0)) {
					{
					setState(264);
					((ForControlContext)_localctx).forUpdate = expressionList();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forInit);
		try {
			setState(271);
			_errHandler.sync(this);
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
				setState(269);
				localVariableDeclaration();
				}
				break;
			case NEW:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
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
				setState(270);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			typeType();
			setState(274);
			variableDeclaratorId();
			setState(275);
			match(COLON);
			setState(276);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LPAREN);
			setState(279);
			expression(0);
			setState(280);
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
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expression(0);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(283);
				match(COMMA);
				setState(284);
				expression(0);
				}
				}
				setState(289);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NEW() { return getToken(KnowExtParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode UNION() { return getToken(KnowExtParser.UNION, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitExpression(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(291);
				primary();
				}
				break;
			case 2:
				{
				setState(292);
				match(NEW);
				setState(293);
				creator();
				}
				break;
			case 3:
				{
				setState(294);
				match(LPAREN);
				setState(295);
				typeType();
				setState(296);
				match(RPAREN);
				setState(297);
				expression(16);
				}
				break;
			case 4:
				{
				setState(299);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (INC - 63)) | (1L << (DEC - 63)) | (1L << (ADD - 63)) | (1L << (SUB - 63)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(300);
				expression(14);
				}
				break;
			case 5:
				{
				setState(301);
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
				setState(302);
				expression(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(306);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MUL - 67)) | (1L << (DIV - 67)) | (1L << (MOD - 67)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(309);
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
						setState(310);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(319);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(312);
							match(LT);
							setState(313);
							match(LT);
							}
							break;
						case 2:
							{
							setState(314);
							match(GT);
							setState(315);
							match(GT);
							setState(316);
							match(GT);
							}
							break;
						case 3:
							{
							setState(317);
							match(GT);
							setState(318);
							match(GT);
							}
							break;
						}
						setState(321);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(323);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(324);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(326);
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
						setState(327);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(329);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(330);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(332);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(333);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(335);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(336);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(338);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(339);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(341);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(342);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(344);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(345);
						expression(0);
						setState(346);
						match(COLON);
						setState(347);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(350);
						match(UNION);
						setState(351);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(353);
						match(LBRACK);
						setState(354);
						expression(0);
						setState(355);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(358);
						match(LPAREN);
						setState(360);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (NEW - 18)) | (1L << (DECIMAL_LITERAL - 18)) | (1L << (FLOAT_LITERAL - 18)) | (1L << (BOOL_LITERAL - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (NULL_LITERAL - 18)) | (1L << (LPAREN - 18)) | (1L << (BANG - 18)) | (1L << (TILDE - 18)) | (1L << (INC - 18)) | (1L << (DEC - 18)) | (1L << (ADD - 18)) | (1L << (SUB - 18)) | (1L << (IDENTIFIER - 18)))) != 0)) {
							{
							setState(359);
							expressionList();
							}
						}

						setState(362);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(364);
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
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_primary);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(LPAREN);
				setState(371);
				expression(0);
				setState(372);
				match(RPAREN);
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
				setState(374);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
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
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_creator);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				nonWildcardTypeArguments();
				setState(379);
				createdName();
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				createdName();
				{
				setState(382);
				arrayCreatorRest();
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

	public static class CreatedNameContext extends ParserRuleContext {
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
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
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_createdName);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case TREE:
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				complexType();
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
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
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
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LBRACK);
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(391);
				match(RBRACK);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(392);
					match(LBRACK);
					setState(393);
					match(RBRACK);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				arrayInitializer();
				}
				break;
			case NEW:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
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
				setState(400);
				expression(0);
				setState(401);
				match(RBRACK);
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						match(LBRACK);
						setState(403);
						expression(0);
						setState(404);
						match(RBRACK);
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(411);
						match(LBRACK);
						setState(412);
						match(RBRACK);
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LT);
			setState(421);
			typeList();
			setState(422);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			typeType();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(425);
				match(COMMA);
				setState(426);
				typeType();
				}
				}
				setState(431);
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
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
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
		enterRule(_localctx, 60, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case TREE:
			case SET:
				{
				setState(432);
				complexType();
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
				setState(433);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(436);
				match(LBRACK);
				setState(437);
				match(RBRACK);
				}
				}
				setState(442);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(KnowExtParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(KnowExtParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(KnowExtParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(KnowExtParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(KnowExtParser.INT, 0); }
		public TerminalNode LONG() { return getToken(KnowExtParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(KnowExtParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(KnowExtParser.DOUBLE, 0); }
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
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << TREE) | (1L << SET))) != 0)) ) {
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowExtParserListener ) ((KnowExtParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LPAREN);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (NEW - 18)) | (1L << (DECIMAL_LITERAL - 18)) | (1L << (FLOAT_LITERAL - 18)) | (1L << (BOOL_LITERAL - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (NULL_LITERAL - 18)) | (1L << (LPAREN - 18)) | (1L << (BANG - 18)) | (1L << (TILDE - 18)) | (1L << (INC - 18)) | (1L << (DEC - 18)) | (1L << (ADD - 18)) | (1L << (SUB - 18)) | (1L << (IDENTIFIER - 18)))) != 0)) {
				{
				setState(448);
				expressionList();
				}
			}

			setState(451);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
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
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u01c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\6\2I\n\2\r\2\16\2J\3\3\3\3\3\3\3\3\5\3Q\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5a\n\5\f\5"+
		"\16\5d\13\5\3\6\3\6\3\6\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\5\bv\n\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13"+
		"\n\3\13\3\13\3\13\5\13\u0086\n\13\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e"+
		"\13\f\3\r\3\r\5\r\u0092\n\r\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16"+
		"\16\u009b\13\16\3\16\5\16\u009e\n\16\5\16\u00a0\n\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00aa\n\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00b4\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ca\n\21"+
		"\f\21\16\21\u00cd\13\21\3\21\7\21\u00d0\n\21\f\21\16\21\u00d3\13\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00d9\n\21\3\21\3\21\3\21\5\21\u00de\n\21\3\21"+
		"\3\21\3\21\5\21\u00e3\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ec"+
		"\n\21\3\22\6\22\u00ef\n\22\r\22\16\22\u00f0\3\22\6\22\u00f4\n\22\r\22"+
		"\16\22\u00f5\3\23\3\23\3\23\5\23\u00fb\n\23\3\23\3\23\3\23\5\23\u0100"+
		"\n\23\3\24\3\24\5\24\u0104\n\24\3\24\3\24\5\24\u0108\n\24\3\24\3\24\5"+
		"\24\u010c\n\24\5\24\u010e\n\24\3\25\3\25\5\25\u0112\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0120\n\30\f\30\16"+
		"\30\u0123\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0132\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0142\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u016b\n\31\3\31\3\31\3\31\7\31\u0170\n"+
		"\31\f\31\16\31\u0173\13\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u017b\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0183\n\33\3\34\3\34\5\34\u0187"+
		"\n\34\3\35\3\35\3\35\3\35\7\35\u018d\n\35\f\35\16\35\u0190\13\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0199\n\35\f\35\16\35\u019c\13\35"+
		"\3\35\3\35\7\35\u01a0\n\35\f\35\16\35\u01a3\13\35\5\35\u01a5\n\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u01ae\n\37\f\37\16\37\u01b1\13\37"+
		"\3 \3 \5 \u01b5\n \3 \3 \7 \u01b9\n \f \16 \u01bc\13 \3!\3!\3\"\3\"\3"+
		"#\3#\5#\u01c4\n#\3#\3#\3#\2\3\60$\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BD\2\13\3\2AD\3\2\678\4\2EFJJ\3\2CD\4\2\65"+
		"\66<=\4\2;;>>\3\2AB\t\2\3\4\b\b\f\f\16\16\21\21\23\23\26\26\5\2\22\22"+
		"\31\31\36\36\2\u01f4\2H\3\2\2\2\4L\3\2\2\2\6T\3\2\2\2\b]\3\2\2\2\ne\3"+
		"\2\2\2\fh\3\2\2\2\16u\3\2\2\2\20w\3\2\2\2\22z\3\2\2\2\24\u0082\3\2\2\2"+
		"\26\u0087\3\2\2\2\30\u0091\3\2\2\2\32\u0093\3\2\2\2\34\u00a9\3\2\2\2\36"+
		"\u00ab\3\2\2\2 \u00eb\3\2\2\2\"\u00ee\3\2\2\2$\u00ff\3\2\2\2&\u010d\3"+
		"\2\2\2(\u0111\3\2\2\2*\u0113\3\2\2\2,\u0118\3\2\2\2.\u011c\3\2\2\2\60"+
		"\u0131\3\2\2\2\62\u017a\3\2\2\2\64\u0182\3\2\2\2\66\u0186\3\2\2\28\u0188"+
		"\3\2\2\2:\u01a6\3\2\2\2<\u01aa\3\2\2\2>\u01b4\3\2\2\2@\u01bd\3\2\2\2B"+
		"\u01bf\3\2\2\2D\u01c1\3\2\2\2FI\5\6\4\2GI\5\4\3\2HF\3\2\2\2HG\3\2\2\2"+
		"IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\3\3\2\2\2LM\5> \2MP\7N\2\2NO\7\64\2\2"+
		"OQ\5\60\31\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\61\2\2S\5\3\2\2\2TU\5>"+
		" \2UV\7N\2\2VX\7+\2\2WY\5\b\5\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7,\2\2"+
		"[\\\5\f\7\2\\\7\3\2\2\2]b\5\n\6\2^_\7\62\2\2_a\5\n\6\2`^\3\2\2\2ad\3\2"+
		"\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2db\3\2\2\2ef\5> \2fg\7N\2\2g\13\3\2"+
		"\2\2hl\7-\2\2ik\5\16\b\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2"+
		"\2\2nl\3\2\2\2op\7.\2\2p\r\3\2\2\2qr\5\20\t\2rs\7\61\2\2sv\3\2\2\2tv\5"+
		" \21\2uq\3\2\2\2ut\3\2\2\2v\17\3\2\2\2wx\5> \2xy\5\22\n\2y\21\3\2\2\2"+
		"z\177\5\24\13\2{|\7\62\2\2|~\5\24\13\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\23\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\5\26\f\2\u0083\u0084\7\64\2\2\u0084\u0086\5\30\r\2\u0085\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\25\3\2\2\2\u0087\u008c\7N\2\2\u0088\u0089"+
		"\7/\2\2\u0089\u008b\7\60\2\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u008c\3\2\2"+
		"\2\u008f\u0092\5\32\16\2\u0090\u0092\5\60\31\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\31\3\2\2\2\u0093\u009f\7-\2\2\u0094\u0099\5\30\r"+
		"\2\u0095\u0096\7\62\2\2\u0096\u0098\5\30\r\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7\62\2\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0094\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2\33\3\2\2\2\u00a3\u00aa"+
		"\5\36\20\2\u00a4\u00aa\7&\2\2\u00a5\u00aa\7(\2\2\u00a6\u00aa\7)\2\2\u00a7"+
		"\u00aa\7\'\2\2\u00a8\u00aa\7*\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2"+
		"\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7%\2\2\u00ac\37\3\2\2\2\u00ad"+
		"\u00ec\5\f\7\2\u00ae\u00af\7\20\2\2\u00af\u00b0\5,\27\2\u00b0\u00b3\5"+
		" \21\2\u00b1\u00b2\7\r\2\2\u00b2\u00b4\5 \21\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00ec\3\2\2\2\u00b5\u00b6\7\17\2\2\u00b6\u00b7\7"+
		"+\2\2\u00b7\u00b8\5&\24\2\u00b8\u00b9\7,\2\2\u00b9\u00ba\5 \21\2\u00ba"+
		"\u00ec\3\2\2\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\5,\27\2\u00bd\u00be\5"+
		" \21\2\u00be\u00ec\3\2\2\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1\5 \21\2\u00c1"+
		"\u00c2\7\30\2\2\u00c2\u00c3\5,\27\2\u00c3\u00c4\7\61\2\2\u00c4\u00ec\3"+
		"\2\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\5,\27\2\u00c7\u00cb\7-\2\2\u00c8"+
		"\u00ca\5\"\22\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d1\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d0\5$\23\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7.\2\2\u00d5\u00ec\3\2\2\2\u00d6\u00d8\7\25\2\2\u00d7\u00d9\5\60"+
		"\31\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00ec\7\61\2\2\u00db\u00dd\7\5\2\2\u00dc\u00de\7N\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00ec\7\61\2\2\u00e0"+
		"\u00e2\7\t\2\2\u00e1\u00e3\7N\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00ec\7\61\2\2\u00e5\u00e6\5\60\31\2\u00e6"+
		"\u00e7\7\61\2\2\u00e7\u00ec\3\2\2\2\u00e8\u00e9\7N\2\2\u00e9\u00ea\7:"+
		"\2\2\u00ea\u00ec\5 \21\2\u00eb\u00ad\3\2\2\2\u00eb\u00ae\3\2\2\2\u00eb"+
		"\u00b5\3\2\2\2\u00eb\u00bb\3\2\2\2\u00eb\u00bf\3\2\2\2\u00eb\u00c5\3\2"+
		"\2\2\u00eb\u00d6\3\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00e0\3\2\2\2\u00eb"+
		"\u00e5\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec!\3\2\2\2\u00ed\u00ef\5$\23\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\5\16\b\2\u00f3\u00f2\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6#\3"+
		"\2\2\2\u00f7\u00fa\7\6\2\2\u00f8\u00fb\5\60\31\2\u00f9\u00fb\7N\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\7:"+
		"\2\2\u00fd\u00fe\7\n\2\2\u00fe\u0100\7:\2\2\u00ff\u00f7\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100%\3\2\2\2\u0101\u010e\5*\26\2\u0102\u0104\5(\25\2"+
		"\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107"+
		"\7\61\2\2\u0106\u0108\5\60\31\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2"+
		"\2\u0108\u0109\3\2\2\2\u0109\u010b\7\61\2\2\u010a\u010c\5.\30\2\u010b"+
		"\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0101\3\2"+
		"\2\2\u010d\u0103\3\2\2\2\u010e\'\3\2\2\2\u010f\u0112\5\20\t\2\u0110\u0112"+
		"\5.\30\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112)\3\2\2\2\u0113"+
		"\u0114\5> \2\u0114\u0115\5\26\f\2\u0115\u0116\7:\2\2\u0116\u0117\5\60"+
		"\31\2\u0117+\3\2\2\2\u0118\u0119\7+\2\2\u0119\u011a\5\60\31\2\u011a\u011b"+
		"\7,\2\2\u011b-\3\2\2\2\u011c\u0121\5\60\31\2\u011d\u011e\7\62\2\2\u011e"+
		"\u0120\5\60\31\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122/\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125"+
		"\b\31\1\2\u0125\u0132\5\62\32\2\u0126\u0127\7\24\2\2\u0127\u0132\5\64"+
		"\33\2\u0128\u0129\7+\2\2\u0129\u012a\5> \2\u012a\u012b\7,\2\2\u012b\u012c"+
		"\5\60\31\22\u012c\u0132\3\2\2\2\u012d\u012e\t\2\2\2\u012e\u0132\5\60\31"+
		"\20\u012f\u0130\t\3\2\2\u0130\u0132\5\60\31\17\u0131\u0124\3\2\2\2\u0131"+
		"\u0126\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u012d\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0132\u0171\3\2\2\2\u0133\u0134\f\16\2\2\u0134\u0135\t\4\2\2\u0135"+
		"\u0170\5\60\31\17\u0136\u0137\f\r\2\2\u0137\u0138\t\5\2\2\u0138\u0170"+
		"\5\60\31\16\u0139\u0141\f\f\2\2\u013a\u013b\7\66\2\2\u013b\u0142\7\66"+
		"\2\2\u013c\u013d\7\65\2\2\u013d\u013e\7\65\2\2\u013e\u0142\7\65\2\2\u013f"+
		"\u0140\7\65\2\2\u0140\u0142\7\65\2\2\u0141\u013a\3\2\2\2\u0141\u013c\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0170\5\60\31\r\u0144"+
		"\u0145\f\13\2\2\u0145\u0146\t\6\2\2\u0146\u0170\5\60\31\f\u0147\u0148"+
		"\f\n\2\2\u0148\u0149\t\7\2\2\u0149\u0170\5\60\31\13\u014a\u014b\f\t\2"+
		"\2\u014b\u014c\7G\2\2\u014c\u0170\5\60\31\n\u014d\u014e\f\b\2\2\u014e"+
		"\u014f\7I\2\2\u014f\u0170\5\60\31\t\u0150\u0151\f\7\2\2\u0151\u0152\7"+
		"H\2\2\u0152\u0170\5\60\31\b\u0153\u0154\f\6\2\2\u0154\u0155\7?\2\2\u0155"+
		"\u0170\5\60\31\7\u0156\u0157\f\5\2\2\u0157\u0158\7@\2\2\u0158\u0170\5"+
		"\60\31\6\u0159\u015a\f\4\2\2\u015a\u015b\79\2\2\u015b\u015c\5\60\31\2"+
		"\u015c\u015d\7:\2\2\u015d\u015e\5\60\31\5\u015e\u0170\3\2\2\2\u015f\u0160"+
		"\f\3\2\2\u0160\u0161\7\34\2\2\u0161\u0170\5\60\31\4\u0162\u0163\f\25\2"+
		"\2\u0163\u0164\7/\2\2\u0164\u0165\5\60\31\2\u0165\u0166\7\60\2\2\u0166"+
		"\u0170\3\2\2\2\u0167\u0168\f\24\2\2\u0168\u016a\7+\2\2\u0169\u016b\5."+
		"\30\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u0170\7,\2\2\u016d\u016e\f\21\2\2\u016e\u0170\t\b\2\2\u016f\u0133\3\2"+
		"\2\2\u016f\u0136\3\2\2\2\u016f\u0139\3\2\2\2\u016f\u0144\3\2\2\2\u016f"+
		"\u0147\3\2\2\2\u016f\u014a\3\2\2\2\u016f\u014d\3\2\2\2\u016f\u0150\3\2"+
		"\2\2\u016f\u0153\3\2\2\2\u016f\u0156\3\2\2\2\u016f\u0159\3\2\2\2\u016f"+
		"\u015f\3\2\2\2\u016f\u0162\3\2\2\2\u016f\u0167\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\61\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7+\2\2\u0175\u0176\5\60\31"+
		"\2\u0176\u0177\7,\2\2\u0177\u017b\3\2\2\2\u0178\u017b\5\34\17\2\u0179"+
		"\u017b\7N\2\2\u017a\u0174\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2"+
		"\2\2\u017b\63\3\2\2\2\u017c\u017d\5:\36\2\u017d\u017e\5\66\34\2\u017e"+
		"\u0183\3\2\2\2\u017f\u0180\5\66\34\2\u0180\u0181\58\35\2\u0181\u0183\3"+
		"\2\2\2\u0182\u017c\3\2\2\2\u0182\u017f\3\2\2\2\u0183\65\3\2\2\2\u0184"+
		"\u0187\5B\"\2\u0185\u0187\5@!\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2"+
		"\2\u0187\67\3\2\2\2\u0188\u01a4\7/\2\2\u0189\u018e\7\60\2\2\u018a\u018b"+
		"\7/\2\2\u018b\u018d\7\60\2\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u01a5\5\32\16\2\u0192\u0193\5\60\31\2\u0193\u019a\7\60\2\2"+
		"\u0194\u0195\7/\2\2\u0195\u0196\5\60\31\2\u0196\u0197\7\60\2\2\u0197\u0199"+
		"\3\2\2\2\u0198\u0194\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u01a1\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7/"+
		"\2\2\u019e\u01a0\7\60\2\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u0189\3\2\2\2\u01a4\u0192\3\2\2\2\u01a59\3\2\2\2\u01a6\u01a7"+
		"\7\66\2\2\u01a7\u01a8\5<\37\2\u01a8\u01a9\7\65\2\2\u01a9;\3\2\2\2\u01aa"+
		"\u01af\5> \2\u01ab\u01ac\7\62\2\2\u01ac\u01ae\5> \2\u01ad\u01ab\3\2\2"+
		"\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0="+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\5B\"\2\u01b3\u01b5\5@!\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01ba\3\2\2\2\u01b6\u01b7\7/"+
		"\2\2\u01b7\u01b9\7\60\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb?\3\2\2\2\u01bc\u01ba\3\2\2\2"+
		"\u01bd\u01be\t\t\2\2\u01beA\3\2\2\2\u01bf\u01c0\t\n\2\2\u01c0C\3\2\2\2"+
		"\u01c1\u01c3\7+\2\2\u01c2\u01c4\5.\30\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6E\3\2\2\2\62HJPX"+
		"blu\177\u0085\u008c\u0091\u0099\u009d\u009f\u00a9\u00b3\u00cb\u00d1\u00d8"+
		"\u00dd\u00e2\u00eb\u00f0\u00f5\u00fa\u00ff\u0103\u0107\u010b\u010d\u0111"+
		"\u0121\u0131\u0141\u016a\u016f\u0171\u017a\u0182\u0186\u018e\u019a\u01a1"+
		"\u01a4\u01af\u01b4\u01ba\u01c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
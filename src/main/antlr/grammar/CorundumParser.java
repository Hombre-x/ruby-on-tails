// Generated from C:/Users/Gaby/Documents/University/Semester XI/Lenguajes de Programacion/RubyOnTails/grammar/Corundum.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CorundumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, REQUIRE=5, END=6, DEF=7, RETURN=8, 
		PIR=9, IF=10, ELSE=11, ELSIF=12, UNLESS=13, WHILE=14, RETRY=15, BREAK=16, 
		FOR=17, TRUE=18, FALSE=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, 
		EXP=25, EQUAL=26, NOT_EQUAL=27, GREATER=28, LESS=29, LESS_EQUAL=30, GREATER_EQUAL=31, 
		ASSIGN=32, PLUS_ASSIGN=33, MINUS_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, 
		MOD_ASSIGN=37, EXP_ASSIGN=38, BIT_AND=39, BIT_OR=40, BIT_XOR=41, BIT_NOT=42, 
		BIT_SHL=43, BIT_SHR=44, AND=45, OR=46, NOT=47, LEFT_RBRACKET=48, RIGHT_RBRACKET=49, 
		LEFT_SBRACKET=50, RIGHT_SBRACKET=51, NIL=52, TAILREC=53, SL_COMMENT=54, 
		ML_COMMENT=55, WS=56, INT=57, FLOAT=58, ID=59, ID_GLOBAL=60, ID_FUNCTION=61;
	public static final int
		RULE_program = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_global_get = 3, 
		RULE_global_set = 4, RULE_global_result = 5, RULE_function_inline_call = 6, 
		RULE_require_block = 7, RULE_pir_inline = 8, RULE_pir_expression_list = 9, 
		RULE_clojure_definition = 10, RULE_clojure_definition_header = 11, RULE_function_definition = 12, 
		RULE_function_definition_body = 13, RULE_function_definition_header = 14, 
		RULE_function_name = 15, RULE_function_definition_params = 16, RULE_function_definition_params_list = 17, 
		RULE_function_definition_param_id = 18, RULE_return_statement = 19, RULE_function_call = 20, 
		RULE_function_call_param_list = 21, RULE_function_call_params = 22, RULE_function_param = 23, 
		RULE_function_unnamed_param = 24, RULE_function_named_param = 25, RULE_function_call_assignment = 26, 
		RULE_all_result = 27, RULE_elsif_statement = 28, RULE_if_elsif_statement = 29, 
		RULE_if_statement = 30, RULE_unless_statement = 31, RULE_while_statement = 32, 
		RULE_for_statement = 33, RULE_init_expression = 34, RULE_all_assignment = 35, 
		RULE_for_init_list = 36, RULE_cond_expression = 37, RULE_loop_expression = 38, 
		RULE_for_loop_list = 39, RULE_statement_body = 40, RULE_statement_expression_list = 41, 
		RULE_assignment = 42, RULE_dynamic_assignment = 43, RULE_int_assignment = 44, 
		RULE_float_assignment = 45, RULE_string_assignment = 46, RULE_initial_array_assignment = 47, 
		RULE_array_assignment = 48, RULE_array_definition = 49, RULE_array_definition_elements = 50, 
		RULE_array_selector = 51, RULE_dynamic_result = 52, RULE_dynamic_ = 53, 
		RULE_int_result = 54, RULE_float_result = 55, RULE_string_result = 56, 
		RULE_comparison_list = 57, RULE_comparison = 58, RULE_comp_var = 59, RULE_lvalue = 60, 
		RULE_rvalue = 61, RULE_break_expression = 62, RULE_literal_t = 63, RULE_float_t = 64, 
		RULE_int_t = 65, RULE_bool_t = 66, RULE_nil_t = 67, RULE_id_ = 68, RULE_id_global = 69, 
		RULE_id_function = 70, RULE_terminator = 71, RULE_else_token = 72, RULE_crlf = 73;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression_list", "expression", "global_get", "global_set", 
			"global_result", "function_inline_call", "require_block", "pir_inline", 
			"pir_expression_list", "clojure_definition", "clojure_definition_header", 
			"function_definition", "function_definition_body", "function_definition_header", 
			"function_name", "function_definition_params", "function_definition_params_list", 
			"function_definition_param_id", "return_statement", "function_call", 
			"function_call_param_list", "function_call_params", "function_param", 
			"function_unnamed_param", "function_named_param", "function_call_assignment", 
			"all_result", "elsif_statement", "if_elsif_statement", "if_statement", 
			"unless_statement", "while_statement", "for_statement", "init_expression", 
			"all_assignment", "for_init_list", "cond_expression", "loop_expression", 
			"for_loop_list", "statement_body", "statement_expression_list", "assignment", 
			"dynamic_assignment", "int_assignment", "float_assignment", "string_assignment", 
			"initial_array_assignment", "array_assignment", "array_definition", "array_definition_elements", 
			"array_selector", "dynamic_result", "dynamic_", "int_result", "float_result", 
			"string_result", "comparison_list", "comparison", "comp_var", "lvalue", 
			"rvalue", "break_expression", "literal_t", "float_t", "int_t", "bool_t", 
			"nil_t", "id_", "id_global", "id_function", "terminator", "else_token", 
			"crlf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "';'", null, "'require'", "'end'", "'def'", "'return'", 
			"'pir'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", 
			"'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", 
			"'<<'", "'>>'", null, null, null, "'('", "')'", "'['", "']'", "'nil'", 
			"'rec'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
			"RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", 
			"FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", 
			"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
			"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", 
			"BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", 
			"LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "TAILREC", "SL_COMMENT", "ML_COMMENT", 
			"WS", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
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
	public String getGrammarFileName() { return "Corundum.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CorundumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CorundumParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expression_list(0);
			setState(149);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(152);
				expression();
				setState(153);
				terminator(0);
				}
				break;
			case SEMICOLON:
			case CRLF:
				{
				setState(155);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(158);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(159);
					expression();
					setState(160);
					terminator(0);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Clojure_definitionContext clojure_definition() {
			return getRuleContext(Clojure_definitionContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				clojure_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				function_inline_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				require_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				unless_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				rvalue(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				return_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
				while_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(176);
				for_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(177);
				pir_inline();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Global_getContext extends ParserRuleContext {
		public LvalueContext var_name;
		public Token op;
		public Id_globalContext global_name;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterGlobal_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitGlobal_get(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitGlobal_get(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_getContext global_get() throws RecognitionException {
		Global_getContext _localctx = new Global_getContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((Global_getContext)_localctx).var_name = lvalue();
			setState(181);
			((Global_getContext)_localctx).op = match(ASSIGN);
			setState(182);
			((Global_getContext)_localctx).global_name = id_global();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Global_setContext extends ParserRuleContext {
		public Id_globalContext global_name;
		public Token op;
		public All_resultContext result;
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Global_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterGlobal_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitGlobal_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitGlobal_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_setContext global_set() throws RecognitionException {
		Global_setContext _localctx = new Global_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((Global_setContext)_localctx).global_name = id_global();
			setState(185);
			((Global_setContext)_localctx).op = match(ASSIGN);
			setState(186);
			((Global_setContext)_localctx).result = all_result();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Global_resultContext extends ParserRuleContext {
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterGlobal_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitGlobal_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitGlobal_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_resultContext global_result() throws RecognitionException {
		Global_resultContext _localctx = new Global_resultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_global_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			id_global();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_inline_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_inline_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_inline_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_inline_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_inline_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_inline_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_inline_callContext function_inline_call() throws RecognitionException {
		Function_inline_callContext _localctx = new Function_inline_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_inline_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Require_blockContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(CorundumParser.REQUIRE, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Require_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterRequire_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitRequire_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitRequire_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Require_blockContext require_block() throws RecognitionException {
		Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(REQUIRE);
			setState(193);
			literal_t();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pir_inlineContext extends ParserRuleContext {
		public TerminalNode PIR() { return getToken(CorundumParser.PIR, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Pir_expression_listContext pir_expression_list() {
			return getRuleContext(Pir_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Pir_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterPir_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitPir_inline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitPir_inline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pir_inlineContext pir_inline() throws RecognitionException {
		Pir_inlineContext _localctx = new Pir_inlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pir_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(PIR);
			setState(196);
			crlf();
			setState(197);
			pir_expression_list();
			setState(198);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pir_expression_listContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Pir_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterPir_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitPir_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitPir_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pir_expression_listContext pir_expression_list() throws RecognitionException {
		Pir_expression_listContext _localctx = new Pir_expression_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pir_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			expression_list(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Clojure_definitionContext extends ParserRuleContext {
		public Clojure_definition_headerContext clojure_definition_header() {
			return getRuleContext(Clojure_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Clojure_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clojure_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterClojure_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitClojure_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitClojure_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clojure_definitionContext clojure_definition() throws RecognitionException {
		Clojure_definitionContext _localctx = new Clojure_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_clojure_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			clojure_definition_header();
			setState(203);
			function_definition_body();
			setState(204);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Clojure_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(CorundumParser.DEF, 0); }
		public TerminalNode TAILREC() { return getToken(CorundumParser.TAILREC, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Clojure_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clojure_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterClojure_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitClojure_definition_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitClojure_definition_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clojure_definition_headerContext clojure_definition_header() throws RecognitionException {
		Clojure_definition_headerContext _localctx = new Clojure_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_clojure_definition_header);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(DEF);
				setState(207);
				match(TAILREC);
				setState(208);
				function_name();
				setState(209);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(DEF);
				setState(212);
				match(TAILREC);
				setState(213);
				function_name();
				setState(214);
				function_definition_params();
				setState(215);
				crlf();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			function_definition_header();
			setState(220);
			function_definition_body();
			setState(221);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_definition_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expression_list(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(CorundumParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_definition_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_definition_header);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(DEF);
				setState(226);
				function_name();
				setState(227);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(DEF);
				setState(230);
				function_name();
				setState(231);
				function_definition_params();
				setState(232);
				crlf();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_name);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				id_function();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				id_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_definition_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_definition_params);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(LEFT_RBRACKET);
				setState(241);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(LEFT_RBRACKET);
				setState(243);
				function_definition_params_list();
				setState(244);
				match(RIGHT_RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				function_definition_params_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_params_listContext extends ParserRuleContext {
		public List<Function_definition_param_idContext> function_definition_param_id() {
			return getRuleContexts(Function_definition_param_idContext.class);
		}
		public Function_definition_param_idContext function_definition_param_id(int i) {
			return getRuleContext(Function_definition_param_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorundumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorundumParser.COMMA, i);
		}
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_params_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_params_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_definition_params_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_definition_params_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			function_definition_param_id();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(250);
				match(COMMA);
				setState(251);
				function_definition_param_id();
				}
				}
				setState(256);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definition_param_idContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_definition_param_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_definition_param_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_definition_param_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_definition_param_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_param_idContext function_definition_param_id() throws RecognitionException {
		Function_definition_param_idContext _localctx = new Function_definition_param_idContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_definition_param_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			id_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CorundumParser.RETURN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(RETURN);
			setState(260);
			all_result();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext name;
		public Function_call_param_listContext params;
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_call);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((Function_callContext)_localctx).name = function_name();
				setState(263);
				match(LEFT_RBRACKET);
				setState(264);
				((Function_callContext)_localctx).params = function_call_param_list();
				setState(265);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				((Function_callContext)_localctx).name = function_name();
				setState(268);
				((Function_callContext)_localctx).params = function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				((Function_callContext)_localctx).name = function_name();
				setState(271);
				match(LEFT_RBRACKET);
				setState(272);
				match(RIGHT_RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_call_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_call_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_call_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			function_call_params();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_paramsContext extends ParserRuleContext {
		public List<Function_paramContext> function_param() {
			return getRuleContexts(Function_paramContext.class);
		}
		public Function_paramContext function_param(int i) {
			return getRuleContext(Function_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CorundumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CorundumParser.COMMA, i);
		}
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_call_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_call_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_call_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			function_param();
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					match(COMMA);
					setState(280);
					function_param();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_paramContext extends ParserRuleContext {
		public Function_unnamed_paramContext function_unnamed_param() {
			return getRuleContext(Function_unnamed_paramContext.class,0);
		}
		public Function_named_paramContext function_named_param() {
			return getRuleContext(Function_named_paramContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(286);
				function_unnamed_param();
				}
				break;
			case 2:
				{
				setState(287);
				function_named_param();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_unnamed_paramContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_unnamed_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_unnamed_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_unnamed_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_unnamed_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_unnamed_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_unnamed_paramContext function_unnamed_param() throws RecognitionException {
		Function_unnamed_paramContext _localctx = new Function_unnamed_paramContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_unnamed_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(290);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(291);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(292);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(293);
				dynamic_result(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_named_paramContext extends ParserRuleContext {
		public Token op;
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_named_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_named_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_named_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_named_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_named_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_named_paramContext function_named_param() throws RecognitionException {
		Function_named_paramContext _localctx = new Function_named_paramContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_named_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			id_();
			setState(297);
			((Function_named_paramContext)_localctx).op = match(ASSIGN);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(298);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(299);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(300);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(301);
				dynamic_result(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_assignmentContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_call_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFunction_call_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFunction_call_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFunction_call_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_assignmentContext function_call_assignment() throws RecognitionException {
		Function_call_assignmentContext _localctx = new Function_call_assignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function_call_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class All_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Global_resultContext global_result() {
			return getRuleContext(Global_resultContext.class,0);
		}
		public All_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterAll_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitAll_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitAll_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_resultContext all_result() throws RecognitionException {
		All_resultContext _localctx = new All_resultContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_all_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(306);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(307);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(308);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(309);
				dynamic_result(0);
				}
				break;
			case 5:
				{
				setState(310);
				global_result();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elsif_statementContext extends ParserRuleContext {
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterElsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitElsif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitElsif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			if_elsif_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(CorundumParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterIf_elsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitIf_elsif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitIf_elsif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_elsif_statement);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(ELSIF);
				setState(316);
				cond_expression();
				setState(317);
				crlf();
				setState(318);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(ELSIF);
				setState(321);
				cond_expression();
				setState(322);
				crlf();
				setState(323);
				statement_body();
				setState(324);
				else_token();
				setState(325);
				crlf();
				setState(326);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(ELSIF);
				setState(329);
				cond_expression();
				setState(330);
				crlf();
				setState(331);
				statement_body();
				setState(332);
				if_elsif_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CorundumParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_statement);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(IF);
				setState(337);
				cond_expression();
				setState(338);
				crlf();
				setState(339);
				statement_body();
				setState(340);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(IF);
				setState(343);
				cond_expression();
				setState(344);
				crlf();
				setState(345);
				statement_body();
				setState(346);
				else_token();
				setState(347);
				crlf();
				setState(348);
				statement_body();
				setState(349);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(IF);
				setState(352);
				cond_expression();
				setState(353);
				crlf();
				setState(354);
				statement_body();
				setState(355);
				elsif_statement();
				setState(356);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(CorundumParser.UNLESS, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterUnless_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitUnless_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitUnless_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unless_statement);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(UNLESS);
				setState(361);
				cond_expression();
				setState(362);
				crlf();
				setState(363);
				statement_body();
				setState(364);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(UNLESS);
				setState(367);
				cond_expression();
				setState(368);
				crlf();
				setState(369);
				statement_body();
				setState(370);
				else_token();
				setState(371);
				crlf();
				setState(372);
				statement_body();
				setState(373);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(UNLESS);
				setState(376);
				cond_expression();
				setState(377);
				crlf();
				setState(378);
				statement_body();
				setState(379);
				elsif_statement();
				setState(380);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CorundumParser.WHILE, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(WHILE);
			setState(385);
			cond_expression();
			setState(386);
			crlf();
			setState(387);
			statement_body();
			setState(388);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CorundumParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public Init_expressionContext init_expression() {
			return getRuleContext(Init_expressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CorundumParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CorundumParser.SEMICOLON, i);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CorundumParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_for_statement);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(FOR);
				setState(391);
				match(LEFT_RBRACKET);
				setState(392);
				init_expression();
				setState(393);
				match(SEMICOLON);
				setState(394);
				cond_expression();
				setState(395);
				match(SEMICOLON);
				setState(396);
				loop_expression();
				setState(397);
				match(RIGHT_RBRACKET);
				setState(398);
				crlf();
				setState(399);
				statement_body();
				setState(400);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(FOR);
				setState(403);
				init_expression();
				setState(404);
				match(SEMICOLON);
				setState(405);
				cond_expression();
				setState(406);
				match(SEMICOLON);
				setState(407);
				loop_expression();
				setState(408);
				crlf();
				setState(409);
				statement_body();
				setState(410);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Init_expressionContext extends ParserRuleContext {
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public Init_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInit_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitInit_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_expressionContext init_expression() throws RecognitionException {
		Init_expressionContext _localctx = new Init_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_init_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			for_init_list(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class All_assignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public All_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterAll_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitAll_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitAll_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_assignmentContext all_assignment() throws RecognitionException {
		All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(416);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(417);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(418);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(419);
				dynamic_assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_init_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorundumParser.COMMA, 0); }
		public For_init_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFor_init_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFor_init_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFor_init_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_init_listContext for_init_list() throws RecognitionException {
		return for_init_list(0);
	}

	private For_init_listContext for_init_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_init_listContext _localctx = new For_init_listContext(_ctx, _parentState);
		For_init_listContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_for_init_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(423);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_init_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_init_list);
					setState(425);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(426);
					match(COMMA);
					setState(427);
					all_assignment();
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_expressionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterCond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitCond_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitCond_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			comparison_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_expressionContext extends ParserRuleContext {
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterLoop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitLoop_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitLoop_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			for_loop_list(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_loop_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorundumParser.COMMA, 0); }
		public For_loop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFor_loop_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFor_loop_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFor_loop_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_listContext for_loop_list() throws RecognitionException {
		return for_loop_list(0);
	}

	private For_loop_listContext for_loop_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_loop_listContext _localctx = new For_loop_listContext(_ctx, _parentState);
		For_loop_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_for_loop_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_loop_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_loop_list);
					setState(440);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(441);
					match(COMMA);
					setState(442);
					all_assignment();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_bodyContext extends ParserRuleContext {
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitStatement_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitStatement_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			statement_expression_list(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(CorundumParser.RETRY, 0); }
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterStatement_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitStatement_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitStatement_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		return statement_expression_list(0);
	}

	private Statement_expression_listContext statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, _parentState);
		Statement_expression_listContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(451);
				expression();
				setState(452);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(454);
				match(RETRY);
				setState(455);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(456);
				break_expression();
				setState(457);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(472);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(461);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(462);
						expression();
						setState(463);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(465);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(466);
						match(RETRY);
						setState(467);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(468);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(469);
						break_expression();
						setState(470);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CorundumParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorundumParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorundumParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CorundumParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(CorundumParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignment);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(478);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(479);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(482);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(483);
				rvalue(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dynamic_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CorundumParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorundumParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorundumParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CorundumParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(CorundumParser.EXP_ASSIGN, 0); }
		public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterDynamic_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitDynamic_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitDynamic_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
		Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dynamic_assignment);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(488);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(489);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(492);
				((Dynamic_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
					((Dynamic_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
				dynamic_result(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CorundumParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorundumParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorundumParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CorundumParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(CorundumParser.EXP_ASSIGN, 0); }
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInt_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInt_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitInt_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_int_assignment);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(498);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(499);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(502);
				((Int_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
					((Int_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(503);
				int_result(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Float_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CorundumParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CorundumParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CorundumParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CorundumParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(CorundumParser.EXP_ASSIGN, 0); }
		public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFloat_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFloat_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFloat_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_assignmentContext float_assignment() throws RecognitionException {
		Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_float_assignment);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(508);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(509);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(512);
				((Float_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
					((Float_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(513);
				float_result(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CorundumParser.PLUS_ASSIGN, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterString_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitString_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitString_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_string_assignment);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(518);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(519);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(522);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(523);
				string_result(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Initial_array_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public TerminalNode LEFT_SBRACKET() { return getToken(CorundumParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(CorundumParser.RIGHT_SBRACKET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public Initial_array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInitial_array_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInitial_array_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitInitial_array_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_array_assignmentContext initial_array_assignment() throws RecognitionException {
		Initial_array_assignmentContext _localctx = new Initial_array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_initial_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			((Initial_array_assignmentContext)_localctx).var_id = lvalue();
			setState(528);
			((Initial_array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(529);
			match(LEFT_SBRACKET);
			setState(530);
			match(RIGHT_SBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_assignmentContext extends ParserRuleContext {
		public Array_selectorContext arr_def;
		public Token op;
		public All_resultContext arr_val;
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CorundumParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitArray_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitArray_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			((Array_assignmentContext)_localctx).arr_def = array_selector();
			setState(533);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(534);
			((Array_assignmentContext)_localctx).arr_val = all_result();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(CorundumParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(CorundumParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitArray_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitArray_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(LEFT_SBRACKET);
			setState(537);
			array_definition_elements(0);
			setState(538);
			match(RIGHT_SBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_definition_elementsContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CorundumParser.COMMA, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterArray_definition_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitArray_definition_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitArray_definition_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(541);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(542);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(545);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(546);
					match(COMMA);
					setState(549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(547);
						int_result(0);
						}
						break;
					case 2:
						{
						setState(548);
						dynamic_result(0);
						}
						break;
					}
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_selectorContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(CorundumParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(CorundumParser.RIGHT_SBRACKET, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterArray_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitArray_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitArray_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_array_selector);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				id_();
				setState(557);
				match(LEFT_SBRACKET);
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(558);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(559);
					dynamic_result(0);
					}
					break;
				}
				setState(562);
				match(RIGHT_SBRACKET);
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				id_global();
				setState(565);
				match(LEFT_SBRACKET);
				setState(568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(566);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(567);
					dynamic_result(0);
					}
					break;
				}
				setState(570);
				match(RIGHT_SBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dynamic_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorundumParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorundumParser.MOD, 0); }
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CorundumParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Dynamic_Context dynamic_() {
			return getRuleContext(Dynamic_Context.class,0);
		}
		public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterDynamic_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitDynamic_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitDynamic_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_resultContext dynamic_result() throws RecognitionException {
		return dynamic_result(0);
	}

	private Dynamic_resultContext dynamic_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dynamic_resultContext _localctx = new Dynamic_resultContext(_ctx, _parentState);
		Dynamic_resultContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(575);
				int_result(0);
				setState(576);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(577);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(579);
				float_result(0);
				setState(580);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(581);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(583);
				string_result(0);
				setState(584);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(585);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(587);
				int_result(0);
				setState(588);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(591);
				float_result(0);
				setState(592);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(593);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(595);
				match(LEFT_RBRACKET);
				setState(596);
				dynamic_result(0);
				setState(597);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(599);
				dynamic_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(623);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(602);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(603);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(604);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(605);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(606);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(607);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(608);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(609);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(610);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(611);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(612);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(613);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(614);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(615);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(616);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(617);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(618);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(619);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(620);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(621);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(622);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dynamic_Context extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Function_call_assignmentContext function_call_assignment() {
			return getRuleContext(Function_call_assignmentContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public Dynamic_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterDynamic_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitDynamic_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitDynamic_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dynamic_Context dynamic_() throws RecognitionException {
		Dynamic_Context _localctx = new Dynamic_Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_dynamic_);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				id_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(630);
				array_selector();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_resultContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorundumParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorundumParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CorundumParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInt_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInt_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitInt_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(634);
				match(LEFT_RBRACKET);
				setState(635);
				int_result(0);
				setState(636);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(638);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(647);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(641);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(642);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(643);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(644);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(645);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(646);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Float_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorundumParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorundumParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CorundumParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFloat_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFloat_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFloat_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(653);
				int_result(0);
				setState(654);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(655);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(657);
				int_result(0);
				setState(658);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(659);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(661);
				match(LEFT_RBRACKET);
				setState(662);
				float_result(0);
				setState(663);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(665);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(680);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(668);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(669);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(670);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(671);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(672);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(673);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(674);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(675);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(676);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(677);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(678);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(679);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterString_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitString_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitString_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
			case INT:
				{
				setState(686);
				int_result(0);
				setState(687);
				((String_resultContext)_localctx).op = match(MUL);
				setState(688);
				string_result(3);
				}
				break;
			case LITERAL:
				{
				setState(690);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(699);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(693);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(694);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(695);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(696);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(697);
						((String_resultContext)_localctx).op = match(MUL);
						setState(698);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_listContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token op;
		public Comparison_listContext right;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(CorundumParser.BIT_AND, 0); }
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(CorundumParser.AND, 0); }
		public TerminalNode BIT_OR() { return getToken(CorundumParser.BIT_OR, 0); }
		public TerminalNode OR() { return getToken(CorundumParser.OR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterComparison_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitComparison_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitComparison_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_comparison_list);
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				((Comparison_listContext)_localctx).left = comparison();
				setState(705);
				((Comparison_listContext)_localctx).op = match(BIT_AND);
				setState(706);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				((Comparison_listContext)_localctx).left = comparison();
				setState(709);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(710);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				((Comparison_listContext)_localctx).left = comparison();
				setState(713);
				((Comparison_listContext)_localctx).op = match(BIT_OR);
				setState(714);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(716);
				((Comparison_listContext)_localctx).left = comparison();
				setState(717);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(718);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(720);
				match(LEFT_RBRACKET);
				setState(721);
				comparison_list();
				setState(722);
				match(RIGHT_RBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(724);
				comparison();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public Comp_varContext left;
		public Token op;
		public Comp_varContext right;
		public List<Comp_varContext> comp_var() {
			return getRuleContexts(Comp_varContext.class);
		}
		public Comp_varContext comp_var(int i) {
			return getRuleContext(Comp_varContext.class,i);
		}
		public TerminalNode LESS() { return getToken(CorundumParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CorundumParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(CorundumParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(CorundumParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CorundumParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CorundumParser.NOT_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_comparison);
		int _la;
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				((ComparisonContext)_localctx).left = comp_var();
				setState(728);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(729);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				((ComparisonContext)_localctx).left = comp_var();
				setState(732);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(733);
				((ComparisonContext)_localctx).right = comp_var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comp_varContext extends ParserRuleContext {
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public Comp_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterComp_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitComp_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitComp_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_varContext comp_var() throws RecognitionException {
		Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_comp_var);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(739);
				id_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LvalueContext extends ParserRuleContext {
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			id_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Initial_array_assignmentContext initial_array_assignment() {
			return getRuleContext(Initial_array_assignmentContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Global_setContext global_set() {
			return getRuleContext(Global_setContext.class,0);
		}
		public Global_getContext global_get() {
			return getRuleContext(Global_getContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CorundumParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(CorundumParser.BIT_NOT, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(CorundumParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(CorundumParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(CorundumParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(CorundumParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CorundumParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CorundumParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CorundumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CorundumParser.MINUS, 0); }
		public TerminalNode BIT_SHL() { return getToken(CorundumParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(CorundumParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(CorundumParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(CorundumParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(CorundumParser.BIT_XOR, 0); }
		public TerminalNode LESS() { return getToken(CorundumParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CorundumParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(CorundumParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(CorundumParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CorundumParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CorundumParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(CorundumParser.OR, 0); }
		public TerminalNode AND() { return getToken(CorundumParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitRvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitRvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(745);
				lvalue();
				}
				break;
			case 2:
				{
				setState(746);
				initial_array_assignment();
				}
				break;
			case 3:
				{
				setState(747);
				array_assignment();
				}
				break;
			case 4:
				{
				setState(748);
				int_result(0);
				}
				break;
			case 5:
				{
				setState(749);
				float_result(0);
				}
				break;
			case 6:
				{
				setState(750);
				string_result(0);
				}
				break;
			case 7:
				{
				setState(751);
				global_set();
				}
				break;
			case 8:
				{
				setState(752);
				global_get();
				}
				break;
			case 9:
				{
				setState(753);
				dynamic_assignment();
				}
				break;
			case 10:
				{
				setState(754);
				string_assignment();
				}
				break;
			case 11:
				{
				setState(755);
				float_assignment();
				}
				break;
			case 12:
				{
				setState(756);
				int_assignment();
				}
				break;
			case 13:
				{
				setState(757);
				assignment();
				}
				break;
			case 14:
				{
				setState(758);
				function_call();
				}
				break;
			case 15:
				{
				setState(759);
				literal_t();
				}
				break;
			case 16:
				{
				setState(760);
				bool_t();
				}
				break;
			case 17:
				{
				setState(761);
				float_t();
				}
				break;
			case 18:
				{
				setState(762);
				int_t();
				}
				break;
			case 19:
				{
				setState(763);
				nil_t();
				}
				break;
			case 20:
				{
				setState(764);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(765);
				rvalue(10);
				}
				break;
			case 21:
				{
				setState(766);
				match(LEFT_RBRACKET);
				setState(767);
				rvalue(0);
				setState(768);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(799);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(772);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(773);
						match(EXP);
						setState(774);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(775);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(776);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(777);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(778);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(779);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(780);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(781);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(782);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(783);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(784);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(785);
						match(BIT_AND);
						setState(786);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(787);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(788);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(789);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(790);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(791);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(792);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(793);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(794);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(795);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(796);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(797);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(798);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Break_expressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CorundumParser.BREAK, 0); }
		public Break_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterBreak_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitBreak_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitBreak_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(BREAK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(CorundumParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterLiteral_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitLiteral_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitLiteral_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CorundumParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterFloat_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitFloat_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitFloat_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(FLOAT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CorundumParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterInt_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitInt_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitInt_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CorundumParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CorundumParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterBool_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitBool_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitBool_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(CorundumParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterNil_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitNil_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitNil_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(NIL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Id_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CorundumParser.ID, 0); }
		public Id_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterId_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitId_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitId_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_Context id_() throws RecognitionException {
		Id_Context _localctx = new Id_Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_id_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Id_globalContext extends ParserRuleContext {
		public TerminalNode ID_GLOBAL() { return getToken(CorundumParser.ID_GLOBAL, 0); }
		public Id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterId_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitId_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitId_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_globalContext id_global() throws RecognitionException {
		Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(ID_GLOBAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Id_functionContext extends ParserRuleContext {
		public TerminalNode ID_FUNCTION() { return getToken(CorundumParser.ID_FUNCTION, 0); }
		public Id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterId_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitId_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitId_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_functionContext id_function() throws RecognitionException {
		Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(ID_FUNCTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CorundumParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(823);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(824);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(831);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(827);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(828);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(829);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(830);
						crlf();
						}
						break;
					}
					} 
				}
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_tokenContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CorundumParser.ELSE, 0); }
		public Else_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterElse_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitElse_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitElse_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_tokenContext else_token() throws RecognitionException {
		Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(ELSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(CorundumParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CorundumListener ) ((CorundumListener)listener).exitCrlf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CorundumVisitor ) return ((CorundumVisitor<? extends T>)visitor).visitCrlf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(CRLF);
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
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 36:
			return for_init_list_sempred((For_init_listContext)_localctx, predIndex);
		case 39:
			return for_loop_list_sempred((For_loop_listContext)_localctx, predIndex);
		case 41:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 50:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 52:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 54:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 55:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 56:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 61:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 71:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean for_init_list_sempred(For_init_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean for_loop_list_sempred(For_loop_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_expression_list_sempred(Statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 11);
		case 23:
			return precpred(_ctx, 9);
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 7);
		case 26:
			return precpred(_ctx, 6);
		case 27:
			return precpred(_ctx, 5);
		case 28:
			return precpred(_ctx, 4);
		case 29:
			return precpred(_ctx, 3);
		case 30:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 4);
		case 32:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u0349\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u009d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u00a3\b\u0001\n\u0001\f\u0001\u00a6\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b3\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00da\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00eb\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00ef"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00f8\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00fd\b\u0011\n\u0011\f\u0011\u0100\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0113\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u011a\b\u0016\n\u0016\f\u0016\u011d\t\u0016\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0121\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0127\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u012f\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0138"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u014f\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0167\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u017f\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u019d\b!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003#\u01a5\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u01ad\b$\n$\f$\u01b0\t$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01bc"+
		"\b\'\n\'\f\'\u01bf\t\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01cc\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u01d9\b)\n)"+
		"\f)\u01dc\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u01e6\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u01f0\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u01fa\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0204\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u020e\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00032\u0220\b2\u0001"+
		"2\u00012\u00012\u00012\u00032\u0226\b2\u00052\u0228\b2\n2\f2\u022b\t2"+
		"\u00013\u00013\u00013\u00013\u00033\u0231\b3\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00033\u0239\b3\u00013\u00013\u00033\u023d\b3\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00034\u0259\b4\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u0270\b4\n4"+
		"\f4\u0273\t4\u00015\u00015\u00015\u00035\u0278\b5\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u0280\b6\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00056\u0288\b6\n6\f6\u028b\t6\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u029b\b7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00057\u02a9\b7\n7\f7\u02ac\t7\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u02b4\b8\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00058\u02bc\b8\n8\f8\u02bf\t8\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u02d6\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u02e0\b:\u0001;\u0001"+
		";\u0001;\u0003;\u02e5\b;\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0003=\u0303\b=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0005=\u0320\b=\n=\f=\u0323\t=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001"+
		"@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001"+
		"E\u0001F\u0001F\u0001G\u0001G\u0001G\u0003G\u033a\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0005G\u0340\bG\nG\fG\u0343\tG\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0000\u000b\u0002HNRdhlnpz\u008eJ\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0000\n\u0001\u0000!&\u0001\u0000\u0016\u0018\u0001"+
		"\u0000\u0014\u0015\u0001\u0000\u001c\u001f\u0001\u0000\u001a\u001b\u0002"+
		"\u0000**//\u0001\u0000+,\u0001\u0000()\u0001\u0000-.\u0001\u0000\u0012"+
		"\u0013\u037e\u0000\u0094\u0001\u0000\u0000\u0000\u0002\u009c\u0001\u0000"+
		"\u0000\u0000\u0004\u00b2\u0001\u0000\u0000\u0000\u0006\u00b4\u0001\u0000"+
		"\u0000\u0000\b\u00b8\u0001\u0000\u0000\u0000\n\u00bc\u0001\u0000\u0000"+
		"\u0000\f\u00be\u0001\u0000\u0000\u0000\u000e\u00c0\u0001\u0000\u0000\u0000"+
		"\u0010\u00c3\u0001\u0000\u0000\u0000\u0012\u00c8\u0001\u0000\u0000\u0000"+
		"\u0014\u00ca\u0001\u0000\u0000\u0000\u0016\u00d9\u0001\u0000\u0000\u0000"+
		"\u0018\u00db\u0001\u0000\u0000\u0000\u001a\u00df\u0001\u0000\u0000\u0000"+
		"\u001c\u00ea\u0001\u0000\u0000\u0000\u001e\u00ee\u0001\u0000\u0000\u0000"+
		" \u00f7\u0001\u0000\u0000\u0000\"\u00f9\u0001\u0000\u0000\u0000$\u0101"+
		"\u0001\u0000\u0000\u0000&\u0103\u0001\u0000\u0000\u0000(\u0112\u0001\u0000"+
		"\u0000\u0000*\u0114\u0001\u0000\u0000\u0000,\u0116\u0001\u0000\u0000\u0000"+
		".\u0120\u0001\u0000\u0000\u00000\u0126\u0001\u0000\u0000\u00002\u0128"+
		"\u0001\u0000\u0000\u00004\u0130\u0001\u0000\u0000\u00006\u0137\u0001\u0000"+
		"\u0000\u00008\u0139\u0001\u0000\u0000\u0000:\u014e\u0001\u0000\u0000\u0000"+
		"<\u0166\u0001\u0000\u0000\u0000>\u017e\u0001\u0000\u0000\u0000@\u0180"+
		"\u0001\u0000\u0000\u0000B\u019c\u0001\u0000\u0000\u0000D\u019e\u0001\u0000"+
		"\u0000\u0000F\u01a4\u0001\u0000\u0000\u0000H\u01a6\u0001\u0000\u0000\u0000"+
		"J\u01b1\u0001\u0000\u0000\u0000L\u01b3\u0001\u0000\u0000\u0000N\u01b5"+
		"\u0001\u0000\u0000\u0000P\u01c0\u0001\u0000\u0000\u0000R\u01cb\u0001\u0000"+
		"\u0000\u0000T\u01e5\u0001\u0000\u0000\u0000V\u01ef\u0001\u0000\u0000\u0000"+
		"X\u01f9\u0001\u0000\u0000\u0000Z\u0203\u0001\u0000\u0000\u0000\\\u020d"+
		"\u0001\u0000\u0000\u0000^\u020f\u0001\u0000\u0000\u0000`\u0214\u0001\u0000"+
		"\u0000\u0000b\u0218\u0001\u0000\u0000\u0000d\u021c\u0001\u0000\u0000\u0000"+
		"f\u023c\u0001\u0000\u0000\u0000h\u0258\u0001\u0000\u0000\u0000j\u0277"+
		"\u0001\u0000\u0000\u0000l\u027f\u0001\u0000\u0000\u0000n\u029a\u0001\u0000"+
		"\u0000\u0000p\u02b3\u0001\u0000\u0000\u0000r\u02d5\u0001\u0000\u0000\u0000"+
		"t\u02df\u0001\u0000\u0000\u0000v\u02e4\u0001\u0000\u0000\u0000x\u02e6"+
		"\u0001\u0000\u0000\u0000z\u0302\u0001\u0000\u0000\u0000|\u0324\u0001\u0000"+
		"\u0000\u0000~\u0326\u0001\u0000\u0000\u0000\u0080\u0328\u0001\u0000\u0000"+
		"\u0000\u0082\u032a\u0001\u0000\u0000\u0000\u0084\u032c\u0001\u0000\u0000"+
		"\u0000\u0086\u032e\u0001\u0000\u0000\u0000\u0088\u0330\u0001\u0000\u0000"+
		"\u0000\u008a\u0332\u0001\u0000\u0000\u0000\u008c\u0334\u0001\u0000\u0000"+
		"\u0000\u008e\u0339\u0001\u0000\u0000\u0000\u0090\u0344\u0001\u0000\u0000"+
		"\u0000\u0092\u0346\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0002\u0001"+
		"\u0000\u0095\u0096\u0005\u0000\u0000\u0001\u0096\u0001\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0006\u0001\uffff\uffff\u0000\u0098\u0099\u0003\u0004"+
		"\u0002\u0000\u0099\u009a\u0003\u008eG\u0000\u009a\u009d\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0003\u008eG\u0000\u009c\u0097\u0001\u0000\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a4\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\n\u0002\u0000\u0000\u009f\u00a0\u0003\u0004\u0002\u0000\u00a0"+
		"\u00a1\u0003\u008eG\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009e"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0003"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00b3"+
		"\u0003\u0018\f\u0000\u00a8\u00b3\u0003\u0014\n\u0000\u00a9\u00b3\u0003"+
		"\f\u0006\u0000\u00aa\u00b3\u0003\u000e\u0007\u0000\u00ab\u00b3\u0003<"+
		"\u001e\u0000\u00ac\u00b3\u0003>\u001f\u0000\u00ad\u00b3\u0003z=\u0000"+
		"\u00ae\u00b3\u0003&\u0013\u0000\u00af\u00b3\u0003@ \u0000\u00b0\u00b3"+
		"\u0003B!\u0000\u00b1\u00b3\u0003\u0010\b\u0000\u00b2\u00a7\u0001\u0000"+
		"\u0000\u0000\u00b2\u00a8\u0001\u0000\u0000\u0000\u00b2\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u0005\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003x<\u0000"+
		"\u00b5\u00b6\u0005 \u0000\u0000\u00b6\u00b7\u0003\u008aE\u0000\u00b7\u0007"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u008aE\u0000\u00b9\u00ba\u0005"+
		" \u0000\u0000\u00ba\u00bb\u00036\u001b\u0000\u00bb\t\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0003\u008aE\u0000\u00bd\u000b\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0003(\u0014\u0000\u00bf\r\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0005\u0000\u0000\u00c1\u00c2\u0003~?\u0000\u00c2\u000f\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0005\t\u0000\u0000\u00c4\u00c5\u0003\u0092"+
		"I\u0000\u00c5\u00c6\u0003\u0012\t\u0000\u00c6\u00c7\u0005\u0006\u0000"+
		"\u0000\u00c7\u0011\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u0002\u0001"+
		"\u0000\u00c9\u0013\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\u0016\u000b"+
		"\u0000\u00cb\u00cc\u0003\u001a\r\u0000\u00cc\u00cd\u0005\u0006\u0000\u0000"+
		"\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0007\u0000\u0000"+
		"\u00cf\u00d0\u00055\u0000\u0000\u00d0\u00d1\u0003\u001e\u000f\u0000\u00d1"+
		"\u00d2\u0003\u0092I\u0000\u00d2\u00da\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u0007\u0000\u0000\u00d4\u00d5\u00055\u0000\u0000\u00d5\u00d6\u0003"+
		"\u001e\u000f\u0000\u00d6\u00d7\u0003 \u0010\u0000\u00d7\u00d8\u0003\u0092"+
		"I\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d3\u0001\u0000\u0000\u0000\u00da\u0017\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0003\u001c\u000e\u0000\u00dc\u00dd\u0003\u001a\r\u0000"+
		"\u00dd\u00de\u0005\u0006\u0000\u0000\u00de\u0019\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0003\u0002\u0001\u0000\u00e0\u001b\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005\u0007\u0000\u0000\u00e2\u00e3\u0003\u001e\u000f\u0000"+
		"\u00e3\u00e4\u0003\u0092I\u0000\u00e4\u00eb\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005\u0007\u0000\u0000\u00e6\u00e7\u0003\u001e\u000f\u0000\u00e7"+
		"\u00e8\u0003 \u0010\u0000\u00e8\u00e9\u0003\u0092I\u0000\u00e9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e1\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001"+
		"\u0000\u0000\u0000\u00eb\u001d\u0001\u0000\u0000\u0000\u00ec\u00ef\u0003"+
		"\u008cF\u0000\u00ed\u00ef\u0003\u0088D\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u001f\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u00050\u0000\u0000\u00f1\u00f8\u00051\u0000\u0000\u00f2"+
		"\u00f3\u00050\u0000\u0000\u00f3\u00f4\u0003\"\u0011\u0000\u00f4\u00f5"+
		"\u00051\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003"+
		"\"\u0011\u0000\u00f7\u00f0\u0001\u0000\u0000\u0000\u00f7\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8!\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fe\u0003$\u0012\u0000\u00fa\u00fb\u0005\u0002\u0000\u0000"+
		"\u00fb\u00fd\u0003$\u0012\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd"+
		"\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0003\u0088D\u0000\u0102%\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0005\b\u0000\u0000\u0104\u0105\u00036\u001b"+
		"\u0000\u0105\'\u0001\u0000\u0000\u0000\u0106\u0107\u0003\u001e\u000f\u0000"+
		"\u0107\u0108\u00050\u0000\u0000\u0108\u0109\u0003*\u0015\u0000\u0109\u010a"+
		"\u00051\u0000\u0000\u010a\u0113\u0001\u0000\u0000\u0000\u010b\u010c\u0003"+
		"\u001e\u000f\u0000\u010c\u010d\u0003*\u0015\u0000\u010d\u0113\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0003\u001e\u000f\u0000\u010f\u0110\u00050\u0000"+
		"\u0000\u0110\u0111\u00051\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000"+
		"\u0112\u0106\u0001\u0000\u0000\u0000\u0112\u010b\u0001\u0000\u0000\u0000"+
		"\u0112\u010e\u0001\u0000\u0000\u0000\u0113)\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0003,\u0016\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u011b\u0003"+
		".\u0017\u0000\u0117\u0118\u0005\u0002\u0000\u0000\u0118\u011a\u0003.\u0017"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c-\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u0121\u00030\u0018\u0000\u011f\u0121\u00032\u0019\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121/\u0001"+
		"\u0000\u0000\u0000\u0122\u0127\u0003l6\u0000\u0123\u0127\u0003n7\u0000"+
		"\u0124\u0127\u0003p8\u0000\u0125\u0127\u0003h4\u0000\u0126\u0122\u0001"+
		"\u0000\u0000\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0126\u0124\u0001"+
		"\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u01271\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0003\u0088D\u0000\u0129\u012e\u0005 \u0000\u0000"+
		"\u012a\u012f\u0003l6\u0000\u012b\u012f\u0003n7\u0000\u012c\u012f\u0003"+
		"p8\u0000\u012d\u012f\u0003h4\u0000\u012e\u012a\u0001\u0000\u0000\u0000"+
		"\u012e\u012b\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012f3\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0003(\u0014\u0000\u01315\u0001\u0000\u0000\u0000\u0132\u0138\u0003"+
		"l6\u0000\u0133\u0138\u0003n7\u0000\u0134\u0138\u0003p8\u0000\u0135\u0138"+
		"\u0003h4\u0000\u0136\u0138\u0003\n\u0005\u0000\u0137\u0132\u0001\u0000"+
		"\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000"+
		"\u0000\u0000\u01387\u0001\u0000\u0000\u0000\u0139\u013a\u0003:\u001d\u0000"+
		"\u013a9\u0001\u0000\u0000\u0000\u013b\u013c\u0005\f\u0000\u0000\u013c"+
		"\u013d\u0003J%\u0000\u013d\u013e\u0003\u0092I\u0000\u013e\u013f\u0003"+
		"P(\u0000\u013f\u014f\u0001\u0000\u0000\u0000\u0140\u0141\u0005\f\u0000"+
		"\u0000\u0141\u0142\u0003J%\u0000\u0142\u0143\u0003\u0092I\u0000\u0143"+
		"\u0144\u0003P(\u0000\u0144\u0145\u0003\u0090H\u0000\u0145\u0146\u0003"+
		"\u0092I\u0000\u0146\u0147\u0003P(\u0000\u0147\u014f\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0005\f\u0000\u0000\u0149\u014a\u0003J%\u0000\u014a"+
		"\u014b\u0003\u0092I\u0000\u014b\u014c\u0003P(\u0000\u014c\u014d\u0003"+
		":\u001d\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u013b\u0001\u0000"+
		"\u0000\u0000\u014e\u0140\u0001\u0000\u0000\u0000\u014e\u0148\u0001\u0000"+
		"\u0000\u0000\u014f;\u0001\u0000\u0000\u0000\u0150\u0151\u0005\n\u0000"+
		"\u0000\u0151\u0152\u0003J%\u0000\u0152\u0153\u0003\u0092I\u0000\u0153"+
		"\u0154\u0003P(\u0000\u0154\u0155\u0005\u0006\u0000\u0000\u0155\u0167\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0005\n\u0000\u0000\u0157\u0158\u0003J"+
		"%\u0000\u0158\u0159\u0003\u0092I\u0000\u0159\u015a\u0003P(\u0000\u015a"+
		"\u015b\u0003\u0090H\u0000\u015b\u015c\u0003\u0092I\u0000\u015c\u015d\u0003"+
		"P(\u0000\u015d\u015e\u0005\u0006\u0000\u0000\u015e\u0167\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0005\n\u0000\u0000\u0160\u0161\u0003J%\u0000\u0161"+
		"\u0162\u0003\u0092I\u0000\u0162\u0163\u0003P(\u0000\u0163\u0164\u0003"+
		"8\u001c\u0000\u0164\u0165\u0005\u0006\u0000\u0000\u0165\u0167\u0001\u0000"+
		"\u0000\u0000\u0166\u0150\u0001\u0000\u0000\u0000\u0166\u0156\u0001\u0000"+
		"\u0000\u0000\u0166\u015f\u0001\u0000\u0000\u0000\u0167=\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0005\r\u0000\u0000\u0169\u016a\u0003J%\u0000\u016a"+
		"\u016b\u0003\u0092I\u0000\u016b\u016c\u0003P(\u0000\u016c\u016d\u0005"+
		"\u0006\u0000\u0000\u016d\u017f\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"\r\u0000\u0000\u016f\u0170\u0003J%\u0000\u0170\u0171\u0003\u0092I\u0000"+
		"\u0171\u0172\u0003P(\u0000\u0172\u0173\u0003\u0090H\u0000\u0173\u0174"+
		"\u0003\u0092I\u0000\u0174\u0175\u0003P(\u0000\u0175\u0176\u0005\u0006"+
		"\u0000\u0000\u0176\u017f\u0001\u0000\u0000\u0000\u0177\u0178\u0005\r\u0000"+
		"\u0000\u0178\u0179\u0003J%\u0000\u0179\u017a\u0003\u0092I\u0000\u017a"+
		"\u017b\u0003P(\u0000\u017b\u017c\u00038\u001c\u0000\u017c\u017d\u0005"+
		"\u0006\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u0168\u0001"+
		"\u0000\u0000\u0000\u017e\u016e\u0001\u0000\u0000\u0000\u017e\u0177\u0001"+
		"\u0000\u0000\u0000\u017f?\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u000e"+
		"\u0000\u0000\u0181\u0182\u0003J%\u0000\u0182\u0183\u0003\u0092I\u0000"+
		"\u0183\u0184\u0003P(\u0000\u0184\u0185\u0005\u0006\u0000\u0000\u0185A"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u0011\u0000\u0000\u0187\u0188"+
		"\u00050\u0000\u0000\u0188\u0189\u0003D\"\u0000\u0189\u018a\u0005\u0003"+
		"\u0000\u0000\u018a\u018b\u0003J%\u0000\u018b\u018c\u0005\u0003\u0000\u0000"+
		"\u018c\u018d\u0003L&\u0000\u018d\u018e\u00051\u0000\u0000\u018e\u018f"+
		"\u0003\u0092I\u0000\u018f\u0190\u0003P(\u0000\u0190\u0191\u0005\u0006"+
		"\u0000\u0000\u0191\u019d\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u0011"+
		"\u0000\u0000\u0193\u0194\u0003D\"\u0000\u0194\u0195\u0005\u0003\u0000"+
		"\u0000\u0195\u0196\u0003J%\u0000\u0196\u0197\u0005\u0003\u0000\u0000\u0197"+
		"\u0198\u0003L&\u0000\u0198\u0199\u0003\u0092I\u0000\u0199\u019a\u0003"+
		"P(\u0000\u019a\u019b\u0005\u0006\u0000\u0000\u019b\u019d\u0001\u0000\u0000"+
		"\u0000\u019c\u0186\u0001\u0000\u0000\u0000\u019c\u0192\u0001\u0000\u0000"+
		"\u0000\u019dC\u0001\u0000\u0000\u0000\u019e\u019f\u0003H$\u0000\u019f"+
		"E\u0001\u0000\u0000\u0000\u01a0\u01a5\u0003X,\u0000\u01a1\u01a5\u0003"+
		"Z-\u0000\u01a2\u01a5\u0003\\.\u0000\u01a3\u01a5\u0003V+\u0000\u01a4\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5G\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0006$\uffff\uffff\u0000\u01a7\u01a8\u0003"+
		"F#\u0000\u01a8\u01ae\u0001\u0000\u0000\u0000\u01a9\u01aa\n\u0002\u0000"+
		"\u0000\u01aa\u01ab\u0005\u0002\u0000\u0000\u01ab\u01ad\u0003F#\u0000\u01ac"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af"+
		"I\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0003r9\u0000\u01b2K\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003N\'\u0000"+
		"\u01b4M\u0001\u0000\u0000\u0000\u01b5\u01b6\u0006\'\uffff\uffff\u0000"+
		"\u01b6\u01b7\u0003F#\u0000\u01b7\u01bd\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\n\u0002\u0000\u0000\u01b9\u01ba\u0005\u0002\u0000\u0000\u01ba\u01bc\u0003"+
		"F#\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01beO\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0003R)\u0000\u01c1Q\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0006)\uffff\uffff\u0000\u01c3\u01c4\u0003\u0004\u0002\u0000\u01c4\u01c5"+
		"\u0003\u008eG\u0000\u01c5\u01cc\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005"+
		"\u000f\u0000\u0000\u01c7\u01cc\u0003\u008eG\u0000\u01c8\u01c9\u0003|>"+
		"\u0000\u01c9\u01ca\u0003\u008eG\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c2\u0001\u0000\u0000\u0000\u01cb\u01c6\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cc\u01da\u0001\u0000\u0000\u0000"+
		"\u01cd\u01ce\n\u0003\u0000\u0000\u01ce\u01cf\u0003\u0004\u0002\u0000\u01cf"+
		"\u01d0\u0003\u008eG\u0000\u01d0\u01d9\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\n\u0002\u0000\u0000\u01d2\u01d3\u0005\u000f\u0000\u0000\u01d3\u01d9\u0003"+
		"\u008eG\u0000\u01d4\u01d5\n\u0001\u0000\u0000\u01d5\u01d6\u0003|>\u0000"+
		"\u01d6\u01d7\u0003\u008eG\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d8\u01d1\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"S\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0003x<\u0000\u01de\u01df\u0005 \u0000\u0000\u01df\u01e0\u0003z=\u0000"+
		"\u01e0\u01e6\u0001\u0000\u0000\u0000\u01e1\u01e2\u0003x<\u0000\u01e2\u01e3"+
		"\u0007\u0000\u0000\u0000\u01e3\u01e4\u0003z=\u0000\u01e4\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e5\u01dd\u0001\u0000\u0000\u0000\u01e5\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e6U\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003x<\u0000"+
		"\u01e8\u01e9\u0005 \u0000\u0000\u01e9\u01ea\u0003h4\u0000\u01ea\u01f0"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003x<\u0000\u01ec\u01ed\u0007\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0003h4\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000"+
		"\u01ef\u01e7\u0001\u0000\u0000\u0000\u01ef\u01eb\u0001\u0000\u0000\u0000"+
		"\u01f0W\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003x<\u0000\u01f2\u01f3"+
		"\u0005 \u0000\u0000\u01f3\u01f4\u0003l6\u0000\u01f4\u01fa\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0003x<\u0000\u01f6\u01f7\u0007\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0003l6\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f5\u0001\u0000\u0000\u0000\u01faY\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0003x<\u0000\u01fc\u01fd\u0005 \u0000"+
		"\u0000\u01fd\u01fe\u0003n7\u0000\u01fe\u0204\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0003x<\u0000\u0200\u0201\u0007\u0000\u0000\u0000\u0201\u0202\u0003"+
		"n7\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u01fb\u0001\u0000\u0000"+
		"\u0000\u0203\u01ff\u0001\u0000\u0000\u0000\u0204[\u0001\u0000\u0000\u0000"+
		"\u0205\u0206\u0003x<\u0000\u0206\u0207\u0005 \u0000\u0000\u0207\u0208"+
		"\u0003p8\u0000\u0208\u020e\u0001\u0000\u0000\u0000\u0209\u020a\u0003x"+
		"<\u0000\u020a\u020b\u0005!\u0000\u0000\u020b\u020c\u0003p8\u0000\u020c"+
		"\u020e\u0001\u0000\u0000\u0000\u020d\u0205\u0001\u0000\u0000\u0000\u020d"+
		"\u0209\u0001\u0000\u0000\u0000\u020e]\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0003x<\u0000\u0210\u0211\u0005 \u0000\u0000\u0211\u0212\u00052\u0000"+
		"\u0000\u0212\u0213\u00053\u0000\u0000\u0213_\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0003f3\u0000\u0215\u0216\u0005 \u0000\u0000\u0216\u0217\u0003"+
		"6\u001b\u0000\u0217a\u0001\u0000\u0000\u0000\u0218\u0219\u00052\u0000"+
		"\u0000\u0219\u021a\u0003d2\u0000\u021a\u021b\u00053\u0000\u0000\u021b"+
		"c\u0001\u0000\u0000\u0000\u021c\u021f\u00062\uffff\uffff\u0000\u021d\u0220"+
		"\u0003l6\u0000\u021e\u0220\u0003h4\u0000\u021f\u021d\u0001\u0000\u0000"+
		"\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220\u0229\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\n\u0001\u0000\u0000\u0222\u0225\u0005\u0002\u0000\u0000"+
		"\u0223\u0226\u0003l6\u0000\u0224\u0226\u0003h4\u0000\u0225\u0223\u0001"+
		"\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0228\u0001"+
		"\u0000\u0000\u0000\u0227\u0221\u0001\u0000\u0000\u0000\u0228\u022b\u0001"+
		"\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001"+
		"\u0000\u0000\u0000\u022ae\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0003\u0088D\u0000\u022d\u0230\u00052\u0000\u0000"+
		"\u022e\u0231\u0003l6\u0000\u022f\u0231\u0003h4\u0000\u0230\u022e\u0001"+
		"\u0000\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u00053\u0000\u0000\u0233\u023d\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0003\u008aE\u0000\u0235\u0238\u00052\u0000\u0000"+
		"\u0236\u0239\u0003l6\u0000\u0237\u0239\u0003h4\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u00053\u0000\u0000\u023b\u023d\u0001\u0000"+
		"\u0000\u0000\u023c\u022c\u0001\u0000\u0000\u0000\u023c\u0234\u0001\u0000"+
		"\u0000\u0000\u023dg\u0001\u0000\u0000\u0000\u023e\u023f\u00064\uffff\uffff"+
		"\u0000\u023f\u0240\u0003l6\u0000\u0240\u0241\u0007\u0001\u0000\u0000\u0241"+
		"\u0242\u0003h4\r\u0242\u0259\u0001\u0000\u0000\u0000\u0243\u0244\u0003"+
		"n7\u0000\u0244\u0245\u0007\u0001\u0000\u0000\u0245\u0246\u0003h4\u000b"+
		"\u0246\u0259\u0001\u0000\u0000\u0000\u0247\u0248\u0003p8\u0000\u0248\u0249"+
		"\u0005\u0016\u0000\u0000\u0249\u024a\u0003h4\b\u024a\u0259\u0001\u0000"+
		"\u0000\u0000\u024b\u024c\u0003l6\u0000\u024c\u024d\u0007\u0002\u0000\u0000"+
		"\u024d\u024e\u0003h4\u0006\u024e\u0259\u0001\u0000\u0000\u0000\u024f\u0250"+
		"\u0003n7\u0000\u0250\u0251\u0007\u0002\u0000\u0000\u0251\u0252\u0003h"+
		"4\u0004\u0252\u0259\u0001\u0000\u0000\u0000\u0253\u0254\u00050\u0000\u0000"+
		"\u0254\u0255\u0003h4\u0000\u0255\u0256\u00051\u0000\u0000\u0256\u0259"+
		"\u0001\u0000\u0000\u0000\u0257\u0259\u0003j5\u0000\u0258\u023e\u0001\u0000"+
		"\u0000\u0000\u0258\u0243\u0001\u0000\u0000\u0000\u0258\u0247\u0001\u0000"+
		"\u0000\u0000\u0258\u024b\u0001\u0000\u0000\u0000\u0258\u024f\u0001\u0000"+
		"\u0000\u0000\u0258\u0253\u0001\u0000\u0000\u0000\u0258\u0257\u0001\u0000"+
		"\u0000\u0000\u0259\u0271\u0001\u0000\u0000\u0000\u025a\u025b\n\n\u0000"+
		"\u0000\u025b\u025c\u0007\u0001\u0000\u0000\u025c\u0270\u0003h4\u000b\u025d"+
		"\u025e\n\u0003\u0000\u0000\u025e\u025f\u0007\u0002\u0000\u0000\u025f\u0270"+
		"\u0003h4\u0004\u0260\u0261\n\u000e\u0000\u0000\u0261\u0262\u0007\u0001"+
		"\u0000\u0000\u0262\u0270\u0003l6\u0000\u0263\u0264\n\f\u0000\u0000\u0264"+
		"\u0265\u0007\u0001\u0000\u0000\u0265\u0270\u0003n7\u0000\u0266\u0267\n"+
		"\t\u0000\u0000\u0267\u0268\u0005\u0016\u0000\u0000\u0268\u0270\u0003p"+
		"8\u0000\u0269\u026a\n\u0007\u0000\u0000\u026a\u026b\u0007\u0002\u0000"+
		"\u0000\u026b\u0270\u0003l6\u0000\u026c\u026d\n\u0005\u0000\u0000\u026d"+
		"\u026e\u0007\u0002\u0000\u0000\u026e\u0270\u0003n7\u0000\u026f\u025a\u0001"+
		"\u0000\u0000\u0000\u026f\u025d\u0001\u0000\u0000\u0000\u026f\u0260\u0001"+
		"\u0000\u0000\u0000\u026f\u0263\u0001\u0000\u0000\u0000\u026f\u0266\u0001"+
		"\u0000\u0000\u0000\u026f\u0269\u0001\u0000\u0000\u0000\u026f\u026c\u0001"+
		"\u0000\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272i\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0278\u0003\u0088"+
		"D\u0000\u0275\u0278\u00034\u001a\u0000\u0276\u0278\u0003f3\u0000\u0277"+
		"\u0274\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277"+
		"\u0276\u0001\u0000\u0000\u0000\u0278k\u0001\u0000\u0000\u0000\u0279\u027a"+
		"\u00066\uffff\uffff\u0000\u027a\u027b\u00050\u0000\u0000\u027b\u027c\u0003"+
		"l6\u0000\u027c\u027d\u00051\u0000\u0000\u027d\u0280\u0001\u0000\u0000"+
		"\u0000\u027e\u0280\u0003\u0082A\u0000\u027f\u0279\u0001\u0000\u0000\u0000"+
		"\u027f\u027e\u0001\u0000\u0000\u0000\u0280\u0289\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\n\u0004\u0000\u0000\u0282\u0283\u0007\u0001\u0000\u0000\u0283"+
		"\u0288\u0003l6\u0005\u0284\u0285\n\u0003\u0000\u0000\u0285\u0286\u0007"+
		"\u0002\u0000\u0000\u0286\u0288\u0003l6\u0004\u0287\u0281\u0001\u0000\u0000"+
		"\u0000\u0287\u0284\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000"+
		"\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000"+
		"\u0000\u028am\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u00067\uffff\uffff\u0000\u028d\u028e\u0003l6\u0000\u028e"+
		"\u028f\u0007\u0001\u0000\u0000\u028f\u0290\u0003n7\u0007\u0290\u029b\u0001"+
		"\u0000\u0000\u0000\u0291\u0292\u0003l6\u0000\u0292\u0293\u0007\u0002\u0000"+
		"\u0000\u0293\u0294\u0003n7\u0004\u0294\u029b\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u00050\u0000\u0000\u0296\u0297\u0003n7\u0000\u0297\u0298\u0005"+
		"1\u0000\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u029b\u0003\u0080"+
		"@\u0000\u029a\u028c\u0001\u0000\u0000\u0000\u029a\u0291\u0001\u0000\u0000"+
		"\u0000\u029a\u0295\u0001\u0000\u0000\u0000\u029a\u0299\u0001\u0000\u0000"+
		"\u0000\u029b\u02aa\u0001\u0000\u0000\u0000\u029c\u029d\n\b\u0000\u0000"+
		"\u029d\u029e\u0007\u0001\u0000\u0000\u029e\u02a9\u0003n7\t\u029f\u02a0"+
		"\n\u0005\u0000\u0000\u02a0\u02a1\u0007\u0002\u0000\u0000\u02a1\u02a9\u0003"+
		"n7\u0006\u02a2\u02a3\n\u0006\u0000\u0000\u02a3\u02a4\u0007\u0001\u0000"+
		"\u0000\u02a4\u02a9\u0003l6\u0000\u02a5\u02a6\n\u0003\u0000\u0000\u02a6"+
		"\u02a7\u0007\u0002\u0000\u0000\u02a7\u02a9\u0003l6\u0000\u02a8\u029c\u0001"+
		"\u0000\u0000\u0000\u02a8\u029f\u0001\u0000\u0000\u0000\u02a8\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a5\u0001\u0000\u0000\u0000\u02a9\u02ac\u0001"+
		"\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001"+
		"\u0000\u0000\u0000\u02abo\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ae\u00068\uffff\uffff\u0000\u02ae\u02af\u0003l6"+
		"\u0000\u02af\u02b0\u0005\u0016\u0000\u0000\u02b0\u02b1\u0003p8\u0003\u02b1"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b4\u0003~?\u0000\u02b3\u02ad\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b4\u02bd\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b6\n\u0002\u0000\u0000\u02b6\u02b7\u0005\u0014"+
		"\u0000\u0000\u02b7\u02bc\u0003p8\u0003\u02b8\u02b9\n\u0004\u0000\u0000"+
		"\u02b9\u02ba\u0005\u0016\u0000\u0000\u02ba\u02bc\u0003l6\u0000\u02bb\u02b5"+
		"\u0001\u0000\u0000\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bc\u02bf"+
		"\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be"+
		"\u0001\u0000\u0000\u0000\u02beq\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c1\u0003t:\u0000\u02c1\u02c2\u0005\'\u0000"+
		"\u0000\u02c2\u02c3\u0003r9\u0000\u02c3\u02d6\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c5\u0003t:\u0000\u02c5\u02c6\u0005-\u0000\u0000\u02c6\u02c7\u0003"+
		"r9\u0000\u02c7\u02d6\u0001\u0000\u0000\u0000\u02c8\u02c9\u0003t:\u0000"+
		"\u02c9\u02ca\u0005(\u0000\u0000\u02ca\u02cb\u0003r9\u0000\u02cb\u02d6"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cd\u0003t:\u0000\u02cd\u02ce\u0005."+
		"\u0000\u0000\u02ce\u02cf\u0003r9\u0000\u02cf\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d1\u00050\u0000\u0000\u02d1\u02d2\u0003r9\u0000\u02d2\u02d3"+
		"\u00051\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d6\u0003"+
		"t:\u0000\u02d5\u02c0\u0001\u0000\u0000\u0000\u02d5\u02c4\u0001\u0000\u0000"+
		"\u0000\u02d5\u02c8\u0001\u0000\u0000\u0000\u02d5\u02cc\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d0\u0001\u0000\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d6s\u0001\u0000\u0000\u0000\u02d7\u02d8\u0003v;\u0000\u02d8"+
		"\u02d9\u0007\u0003\u0000\u0000\u02d9\u02da\u0003v;\u0000\u02da\u02e0\u0001"+
		"\u0000\u0000\u0000\u02db\u02dc\u0003v;\u0000\u02dc\u02dd\u0007\u0004\u0000"+
		"\u0000\u02dd\u02de\u0003v;\u0000\u02de\u02e0\u0001\u0000\u0000\u0000\u02df"+
		"\u02d7\u0001\u0000\u0000\u0000\u02df\u02db\u0001\u0000\u0000\u0000\u02e0"+
		"u\u0001\u0000\u0000\u0000\u02e1\u02e5\u00036\u001b\u0000\u02e2\u02e5\u0003"+
		"f3\u0000\u02e3\u02e5\u0003\u0088D\u0000\u02e4\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e5w\u0001\u0000\u0000\u0000\u02e6\u02e7\u0003\u0088D\u0000\u02e7"+
		"y\u0001\u0000\u0000\u0000\u02e8\u02e9\u0006=\uffff\uffff\u0000\u02e9\u0303"+
		"\u0003x<\u0000\u02ea\u0303\u0003^/\u0000\u02eb\u0303\u0003`0\u0000\u02ec"+
		"\u0303\u0003l6\u0000\u02ed\u0303\u0003n7\u0000\u02ee\u0303\u0003p8\u0000"+
		"\u02ef\u0303\u0003\b\u0004\u0000\u02f0\u0303\u0003\u0006\u0003\u0000\u02f1"+
		"\u0303\u0003V+\u0000\u02f2\u0303\u0003\\.\u0000\u02f3\u0303\u0003Z-\u0000"+
		"\u02f4\u0303\u0003X,\u0000\u02f5\u0303\u0003T*\u0000\u02f6\u0303\u0003"+
		"(\u0014\u0000\u02f7\u0303\u0003~?\u0000\u02f8\u0303\u0003\u0084B\u0000"+
		"\u02f9\u0303\u0003\u0080@\u0000\u02fa\u0303\u0003\u0082A\u0000\u02fb\u0303"+
		"\u0003\u0086C\u0000\u02fc\u02fd\u0007\u0005\u0000\u0000\u02fd\u0303\u0003"+
		"z=\n\u02fe\u02ff\u00050\u0000\u0000\u02ff\u0300\u0003z=\u0000\u0300\u0301"+
		"\u00051\u0000\u0000\u0301\u0303\u0001\u0000\u0000\u0000\u0302\u02e8\u0001"+
		"\u0000\u0000\u0000\u0302\u02ea\u0001\u0000\u0000\u0000\u0302\u02eb\u0001"+
		"\u0000\u0000\u0000\u0302\u02ec\u0001\u0000\u0000\u0000\u0302\u02ed\u0001"+
		"\u0000\u0000\u0000\u0302\u02ee\u0001\u0000\u0000\u0000\u0302\u02ef\u0001"+
		"\u0000\u0000\u0000\u0302\u02f0\u0001\u0000\u0000\u0000\u0302\u02f1\u0001"+
		"\u0000\u0000\u0000\u0302\u02f2\u0001\u0000\u0000\u0000\u0302\u02f3\u0001"+
		"\u0000\u0000\u0000\u0302\u02f4\u0001\u0000\u0000\u0000\u0302\u02f5\u0001"+
		"\u0000\u0000\u0000\u0302\u02f6\u0001\u0000\u0000\u0000\u0302\u02f7\u0001"+
		"\u0000\u0000\u0000\u0302\u02f8\u0001\u0000\u0000\u0000\u0302\u02f9\u0001"+
		"\u0000\u0000\u0000\u0302\u02fa\u0001\u0000\u0000\u0000\u0302\u02fb\u0001"+
		"\u0000\u0000\u0000\u0302\u02fc\u0001\u0000\u0000\u0000\u0302\u02fe\u0001"+
		"\u0000\u0000\u0000\u0303\u0321\u0001\u0000\u0000\u0000\u0304\u0305\n\u000b"+
		"\u0000\u0000\u0305\u0306\u0005\u0019\u0000\u0000\u0306\u0320\u0003z=\f"+
		"\u0307\u0308\n\t\u0000\u0000\u0308\u0309\u0007\u0001\u0000\u0000\u0309"+
		"\u0320\u0003z=\n\u030a\u030b\n\b\u0000\u0000\u030b\u030c\u0007\u0002\u0000"+
		"\u0000\u030c\u0320\u0003z=\t\u030d\u030e\n\u0007\u0000\u0000\u030e\u030f"+
		"\u0007\u0006\u0000\u0000\u030f\u0320\u0003z=\b\u0310\u0311\n\u0006\u0000"+
		"\u0000\u0311\u0312\u0005\'\u0000\u0000\u0312\u0320\u0003z=\u0007\u0313"+
		"\u0314\n\u0005\u0000\u0000\u0314\u0315\u0007\u0007\u0000\u0000\u0315\u0320"+
		"\u0003z=\u0006\u0316\u0317\n\u0004\u0000\u0000\u0317\u0318\u0007\u0003"+
		"\u0000\u0000\u0318\u0320\u0003z=\u0005\u0319\u031a\n\u0003\u0000\u0000"+
		"\u031a\u031b\u0007\u0004\u0000\u0000\u031b\u0320\u0003z=\u0004\u031c\u031d"+
		"\n\u0002\u0000\u0000\u031d\u031e\u0007\b\u0000\u0000\u031e\u0320\u0003"+
		"z=\u0003\u031f\u0304\u0001\u0000\u0000\u0000\u031f\u0307\u0001\u0000\u0000"+
		"\u0000\u031f\u030a\u0001\u0000\u0000\u0000\u031f\u030d\u0001\u0000\u0000"+
		"\u0000\u031f\u0310\u0001\u0000\u0000\u0000\u031f\u0313\u0001\u0000\u0000"+
		"\u0000\u031f\u0316\u0001\u0000\u0000\u0000\u031f\u0319\u0001\u0000\u0000"+
		"\u0000\u031f\u031c\u0001\u0000\u0000\u0000\u0320\u0323\u0001\u0000\u0000"+
		"\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000"+
		"\u0000\u0322{\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000\u0000"+
		"\u0324\u0325\u0005\u0010\u0000\u0000\u0325}\u0001\u0000\u0000\u0000\u0326"+
		"\u0327\u0005\u0001\u0000\u0000\u0327\u007f\u0001\u0000\u0000\u0000\u0328"+
		"\u0329\u0005:\u0000\u0000\u0329\u0081\u0001\u0000\u0000\u0000\u032a\u032b"+
		"\u00059\u0000\u0000\u032b\u0083\u0001\u0000\u0000\u0000\u032c\u032d\u0007"+
		"\t\u0000\u0000\u032d\u0085\u0001\u0000\u0000\u0000\u032e\u032f\u00054"+
		"\u0000\u0000\u032f\u0087\u0001\u0000\u0000\u0000\u0330\u0331\u0005;\u0000"+
		"\u0000\u0331\u0089\u0001\u0000\u0000\u0000\u0332\u0333\u0005<\u0000\u0000"+
		"\u0333\u008b\u0001\u0000\u0000\u0000\u0334\u0335\u0005=\u0000\u0000\u0335"+
		"\u008d\u0001\u0000\u0000\u0000\u0336\u0337\u0006G\uffff\uffff\u0000\u0337"+
		"\u033a\u0005\u0003\u0000\u0000\u0338\u033a\u0003\u0092I\u0000\u0339\u0336"+
		"\u0001\u0000\u0000\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u033a\u0341"+
		"\u0001\u0000\u0000\u0000\u033b\u033c\n\u0004\u0000\u0000\u033c\u0340\u0005"+
		"\u0003\u0000\u0000\u033d\u033e\n\u0003\u0000\u0000\u033e\u0340\u0003\u0092"+
		"I\u0000\u033f\u033b\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000\u0000"+
		"\u0000\u0340\u0343\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000"+
		"\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u008f\u0001\u0000\u0000"+
		"\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0344\u0345\u0005\u000b\u0000"+
		"\u0000\u0345\u0091\u0001\u0000\u0000\u0000\u0346\u0347\u0005\u0004\u0000"+
		"\u0000\u0347\u0093\u0001\u0000\u0000\u00009\u009c\u00a4\u00b2\u00d9\u00ea"+
		"\u00ee\u00f7\u00fe\u0112\u011b\u0120\u0126\u012e\u0137\u014e\u0166\u017e"+
		"\u019c\u01a4\u01ae\u01bd\u01cb\u01d8\u01da\u01e5\u01ef\u01f9\u0203\u020d"+
		"\u021f\u0225\u0229\u0230\u0238\u023c\u0258\u026f\u0271\u0277\u027f\u0287"+
		"\u0289\u029a\u02a8\u02aa\u02b3\u02bb\u02bd\u02d5\u02df\u02e4\u0302\u031f"+
		"\u0321\u0339\u033f\u0341";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/Felipe Pieschacon/Desktop/Traductor_Cpp2Java/grammar\cpp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, GLOBAL=8, END=9, 
		IMPORT=10, RESOURCE=11, INT=12, VAR=13, IF=14, FI=15, ELSE=16, EXTEND=17, 
		BODY=18, IN=19, NI=20, CALL=21, FA=22, AF=23, LPARENT=24, RPARENT=25, 
		LBRACKET=26, RBRACKET=27, INITIAL=28, CONST=29, RETURNS=30, RETURN=31, 
		TO=32, DOWNTO=33, FINAL=34, OP=35, DO=36, OD=37, PROC=38, CO=39, OC=40, 
		CAP=41, SEND=42, DESTROY=43, BEGIN=44, RECEIVE=45, CREATE=46, OPTYPE=47, 
		BY=48, SUCHTHAT=49, TYPE=50, NULL=51, BOOL=52, VAL=53, RES=54, REF=55, 
		EXIT=56, NEXT=57, FILE=58, PRIVATE=59, OR=60, INDEX=61, MOD=62, STOP=63, 
		PROCEDURE=64, AND=65, REAL=66, ON=67, ROW=68, TRUE=69, SENDER=70, LEFT=71, 
		UP=72, ABORT=73, REPLY=74, PROCESS=75, CHAR=76, STRING=77, FALSE=78, LOW=79, 
		HIGH=80, NEW=81, ENUM=82, ANY=83, REC=84, PTR=85, UNION=86, VM=87, SEM=88, 
		XOR=89, SKP=90, FORWARD=91, SEPARATE=92, V=93, P=94, EJECUTA=95, NUM=96, 
		SEPARA=97, LBRACE=98, RBRACE=99, ASIGNACION=100, SWAP=101, INCREMENTO=102, 
		DECREMENTO=103, DESPLAZAR_IZQ=104, DESPLAZAR_DER=105, AUG=106, OPERADOR_ARITMETICO=107, 
		OPERADOR_COMPARACION=108, CADENA=109, ESP=110, LINE_COMMENT=111, ID=112;
	public static final int
		RULE_translationunit = 0, RULE_components = 1, RULE_global = 2, RULE_resource_specification = 3, 
		RULE_resource_body = 4, RULE_spec_body = 5, RULE_proc = 6, RULE_block = 7, 
		RULE_block_items = 8, RULE_block_item = 9, RULE_declarations = 10, RULE_constant = 11, 
		RULE_type = 12, RULE_op_type = 13, RULE_variable = 14, RULE_operation = 15, 
		RULE_statements = 16, RULE_explicit_call = 17, RULE_invocation = 18, RULE_sequential = 19, 
		RULE_op_invocation = 20, RULE_op_service = 21, RULE_in_cmd = 22, RULE_resource_control = 23, 
		RULE_t = 24, RULE_basic_type = 25, RULE_enum_def = 26, RULE_pointer_def = 27, 
		RULE_record_def = 28, RULE_union_def = 29, RULE_capability_def = 30, RULE_cap_for = 31, 
		RULE_prototype = 32, RULE_op_prototype = 33, RULE_op_res = 34, RULE_id_list = 35, 
		RULE_result_id = 36, RULE_type_res = 37, RULE_subscripts = 38, RULE_id_subs_lp = 39, 
		RULE_id_subs = 40, RULE_parameters = 41, RULE_parameters2 = 42, RULE_expression = 43, 
		RULE_op_log = 44, RULE_expr1 = 45, RULE_expr2 = 46, RULE_expr3 = 47, RULE_quantifier = 48, 
		RULE_quantifier1 = 49, RULE_quantifier2 = 50, RULE_direction = 51, RULE_step_opt = 52, 
		RULE_such_that_opt = 53, RULE_actuals = 54, RULE_qualified_id = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationunit", "components", "global", "resource_specification", 
			"resource_body", "spec_body", "proc", "block", "block_items", "block_item", 
			"declarations", "constant", "type", "op_type", "variable", "operation", 
			"statements", "explicit_call", "invocation", "sequential", "op_invocation", 
			"op_service", "in_cmd", "resource_control", "t", "basic_type", "enum_def", 
			"pointer_def", "record_def", "union_def", "capability_def", "cap_for", 
			"prototype", "op_prototype", "op_res", "id_list", "result_id", "type_res", 
			"subscripts", "id_subs_lp", "id_subs", "parameters", "parameters2", "expression", 
			"op_log", "expr1", "expr2", "expr3", "quantifier", "quantifier1", "quantifier2", 
			"direction", "step_opt", "such_that_opt", "actuals", "qualified_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "','", "'&'", "'!'", "'||'", "'.'", "'global'", "'end'", 
			"'import'", "'resource'", "'int'", "'var'", "'if'", "'fi'", "'else'", 
			"'extend'", "'body'", "'in'", "'ni'", "'call'", "'fa'", "'af'", "'('", 
			"')'", "'['", "']'", "'inital'", "'const'", "'returns'", "'return'", 
			"'to'", "'downto'", "'final'", "'op'", "'do'", "'od'", "'proc'", "'co'", 
			"'oc'", "'cap'", "'send'", "'destroy'", "'begin'", "'receive'", "'create'", 
			"'optype'", "'by'", "'st'", "'type'", "'null'", "'bool'", "'val'", "'res'", 
			"'ref'", "'exit'", "'next'", "'file'", "'private'", "'or'", "'index'", 
			"'mod'", "'stop'", "'procedure'", "'and'", "'real'", "'on'", "'row'", 
			"'true'", "'sender'", "'left'", "'up'", "'abort'", "'reply'", "'process'", 
			"'char'", "'string'", "'false'", "'low'", "'high'", "'new'", "'enum'", 
			"'any'", "'rec'", "'ptr'", "'union'", "'vm'", "'sem'", "'xor'", "'skip'", 
			"'forward'", "'separate'", "'V'", "'P'", "'->'", null, "'[]'", "'{'", 
			"'}'", "':='", "':=:'", "'++'", "'--'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "GLOBAL", "END", "IMPORT", 
			"RESOURCE", "INT", "VAR", "IF", "FI", "ELSE", "EXTEND", "BODY", "IN", 
			"NI", "CALL", "FA", "AF", "LPARENT", "RPARENT", "LBRACKET", "RBRACKET", 
			"INITIAL", "CONST", "RETURNS", "RETURN", "TO", "DOWNTO", "FINAL", "OP", 
			"DO", "OD", "PROC", "CO", "OC", "CAP", "SEND", "DESTROY", "BEGIN", "RECEIVE", 
			"CREATE", "OPTYPE", "BY", "SUCHTHAT", "TYPE", "NULL", "BOOL", "VAL", 
			"RES", "REF", "EXIT", "NEXT", "FILE", "PRIVATE", "OR", "INDEX", "MOD", 
			"STOP", "PROCEDURE", "AND", "REAL", "ON", "ROW", "TRUE", "SENDER", "LEFT", 
			"UP", "ABORT", "REPLY", "PROCESS", "CHAR", "STRING", "FALSE", "LOW", 
			"HIGH", "NEW", "ENUM", "ANY", "REC", "PTR", "UNION", "VM", "SEM", "XOR", 
			"SKP", "FORWARD", "SEPARATE", "V", "P", "EJECUTA", "NUM", "SEPARA", "LBRACE", 
			"RBRACE", "ASIGNACION", "SWAP", "INCREMENTO", "DECREMENTO", "DESPLAZAR_IZQ", 
			"DESPLAZAR_DER", "AUG", "OPERADOR_ARITMETICO", "OPERADOR_COMPARACION", 
			"CADENA", "ESP", "LINE_COMMENT", "ID"
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
	public String getGrammarFileName() { return "cpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static String tran = "";

	public cppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationunitContext extends ParserRuleContext {
		public ComponentsContext components;
		public ComponentsContext components() {
			return getRuleContext(ComponentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(cppParser.EOF, 0); }
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitTranslationunit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitTranslationunit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((TranslationunitContext)_localctx).components = components();
			setState(113);
			match(EOF);
			 tran = ((TranslationunitContext)_localctx).components.trad; 
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

	public static class ComponentsContext extends ParserRuleContext {
		public String trad;
		public GlobalContext global;
		public Resource_specificationContext resource_specification;
		public ComponentsContext t1;
		public Resource_bodyContext resource_body;
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public Resource_specificationContext resource_specification() {
			return getRuleContext(Resource_specificationContext.class,0);
		}
		public ComponentsContext components() {
			return getRuleContext(ComponentsContext.class,0);
		}
		public Resource_bodyContext resource_body() {
			return getRuleContext(Resource_bodyContext.class,0);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitComponents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_components);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((ComponentsContext)_localctx).global = global();
				((ComponentsContext)_localctx).trad =  ((ComponentsContext)_localctx).global.trad;
				}
				break;
			case RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((ComponentsContext)_localctx).resource_specification = resource_specification();
				((ComponentsContext)_localctx).trad =  ((ComponentsContext)_localctx).resource_specification.trad;
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GLOBAL) | (1L << RESOURCE) | (1L << BODY))) != 0)) {
					{
					setState(121);
					((ComponentsContext)_localctx).t1 = components();
					_localctx.trad += ((ComponentsContext)_localctx).t1.trad;
					}
				}

				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				((ComponentsContext)_localctx).resource_body = resource_body();
				((ComponentsContext)_localctx).trad =  ((ComponentsContext)_localctx).resource_body.trad;
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

	public static class GlobalContext extends ParserRuleContext {
		public String trad;
		public ConstantContext constant;
		public TypeContext type;
		public TerminalNode GLOBAL() { return getToken(cppParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public TerminalNode END() { return getToken(cppParser.END, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(GLOBAL);
			setState(132);
			match(ID);
			((GlobalContext)_localctx).trad =  "";
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(134);
				((GlobalContext)_localctx).constant = constant();
				_localctx.trad += ((GlobalContext)_localctx).constant.trad;
				}
				break;
			case TYPE:
				{
				setState(137);
				((GlobalContext)_localctx).type = type();
				_localctx.trad += ((GlobalContext)_localctx).type.trad;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			match(END);
			_localctx.trad += System.lineSeparator();
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

	public static class Resource_specificationContext extends ParserRuleContext {
		public String trad;
		public String ca;
		public Token ID;
		public DeclarationsContext declarations;
		public Spec_bodyContext spec_body;
		public ParametersContext parameters;
		public StatementsContext statements;
		public BlockContext t1;
		public ProcContext proc;
		public BlockContext t2;
		public TerminalNode RESOURCE() { return getToken(cppParser.RESOURCE, 0); }
		public List<TerminalNode> ID() { return getTokens(cppParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cppParser.ID, i);
		}
		public TerminalNode IMPORT() { return getToken(cppParser.IMPORT, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<Spec_bodyContext> spec_body() {
			return getRuleContexts(Spec_bodyContext.class);
		}
		public Spec_bodyContext spec_body(int i) {
			return getRuleContext(Spec_bodyContext.class,i);
		}
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public List<TerminalNode> END() { return getTokens(cppParser.END); }
		public TerminalNode END(int i) {
			return getToken(cppParser.END, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode INITIAL() { return getToken(cppParser.INITIAL, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(cppParser.FINAL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Resource_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterResource_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitResource_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitResource_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_specificationContext resource_specification() throws RecognitionException {
		Resource_specificationContext _localctx = new Resource_specificationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_resource_specification);
		int _la;
		try {
			int _alt;
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(RESOURCE);
				setState(146);
				((Resource_specificationContext)_localctx).ID = match(ID);
				((Resource_specificationContext)_localctx).trad =  "procedure " + (((Resource_specificationContext)_localctx).ID!=null?((Resource_specificationContext)_localctx).ID.getText():null) +"(";
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPORT) {
					{
					setState(148);
					match(IMPORT);
					setState(149);
					((Resource_specificationContext)_localctx).ID = match(ID);
					}
				}

				((Resource_specificationContext)_localctx).ca =  "";
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << OP) | (1L << OPTYPE) | (1L << TYPE))) != 0)) {
					{
					{
					setState(153);
					((Resource_specificationContext)_localctx).declarations = declarations();
					_localctx.ca += ((Resource_specificationContext)_localctx).declarations.trad+System.lineSeparator();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						((Resource_specificationContext)_localctx).spec_body = spec_body(_localctx.ca);
						_localctx.trad += ((Resource_specificationContext)_localctx).spec_body.trad;
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(RESOURCE);
				setState(170);
				((Resource_specificationContext)_localctx).ID = match(ID);
				setState(171);
				match(LPARENT);
				((Resource_specificationContext)_localctx).trad =  "procedure "+ (((Resource_specificationContext)_localctx).ID!=null?((Resource_specificationContext)_localctx).ID.getText():null) +"(";
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(173);
					((Resource_specificationContext)_localctx).parameters = parameters();
					_localctx.trad += ((Resource_specificationContext)_localctx).parameters.trad;
					}
				}

				setState(178);
				match(RPARENT);
				_localctx.trad+= ");"+System.lineSeparator();
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(180);
						((Resource_specificationContext)_localctx).declarations = declarations();
						_localctx.trad += ((Resource_specificationContext)_localctx).declarations.trad;
						}
						} 
					}
					setState(187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				_localctx.trad += System.lineSeparator()+ "begin" + System.lineSeparator();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF) | (1L << IN) | (1L << CALL) | (1L << FA) | (1L << RETURN) | (1L << OP) | (1L << DO) | (1L << CO) | (1L << SEND) | (1L << DESTROY) | (1L << RECEIVE) | (1L << EXIT) | (1L << NEXT))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (REPLY - 74)) | (1L << (SKP - 74)) | (1L << (ID - 74)))) != 0)) {
					{
					{
					setState(189);
					((Resource_specificationContext)_localctx).statements = statements();
					_localctx.trad += ((Resource_specificationContext)_localctx).statements.trad;
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIAL) {
					{
					setState(197);
					match(INITIAL);
					setState(198);
					((Resource_specificationContext)_localctx).t1 = block();
					setState(199);
					match(END);
					_localctx.trad += System.lineSeparator()+((Resource_specificationContext)_localctx).t1.trad;
					}
				}

				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					((Resource_specificationContext)_localctx).proc = proc();
					_localctx.trad += ((Resource_specificationContext)_localctx).proc.trad;
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PROC );
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(211);
					match(FINAL);
					setState(212);
					((Resource_specificationContext)_localctx).t2 = block();
					setState(213);
					match(END);
					_localctx.trad += System.lineSeparator()+((Resource_specificationContext)_localctx).t2.trad;
					}
				}

				setState(218);
				match(END);
				_localctx.trad += System.lineSeparator()+ "end;" + System.lineSeparator();
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

	public static class Resource_bodyContext extends ParserRuleContext {
		public String trad;
		public DeclarationsContext declarations;
		public BlockContext t1;
		public ProcContext proc;
		public BlockContext t2;
		public TerminalNode BODY() { return getToken(cppParser.BODY, 0); }
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public List<TerminalNode> END() { return getTokens(cppParser.END); }
		public TerminalNode END(int i) {
			return getToken(cppParser.END, i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(cppParser.INITIAL, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(cppParser.FINAL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Resource_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterResource_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitResource_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitResource_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_bodyContext resource_body() throws RecognitionException {
		Resource_bodyContext _localctx = new Resource_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_resource_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(BODY);
			setState(224);
			match(ID);
			((Resource_bodyContext)_localctx).trad =  "";
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << OP) | (1L << OPTYPE) | (1L << TYPE))) != 0)) {
				{
				setState(226);
				((Resource_bodyContext)_localctx).declarations = declarations();
				_localctx.trad += ((Resource_bodyContext)_localctx).declarations.trad;
				}
			}

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(231);
				match(INITIAL);
				setState(232);
				((Resource_bodyContext)_localctx).t1 = block();
				setState(233);
				match(END);
				_localctx.trad += ((Resource_bodyContext)_localctx).t1.trad;
				}
			}

			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				((Resource_bodyContext)_localctx).proc = proc();
				_localctx.trad += ((Resource_bodyContext)_localctx).proc.trad;
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROC );
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(245);
				match(FINAL);
				setState(246);
				((Resource_bodyContext)_localctx).t2 = block();
				setState(247);
				match(END);
				_localctx.trad += ((Resource_bodyContext)_localctx).t2.trad;
				}
			}

			setState(252);
			match(END);
			_localctx.trad += System.lineSeparator()+ "end" + System.lineSeparator();
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

	public static class Spec_bodyContext extends ParserRuleContext {
		public String declar;
		public String trad;
		public ParametersContext parameters;
		public BlockContext t1;
		public BlockContext t2;
		public BlockContext t3;
		public List<TerminalNode> END() { return getTokens(cppParser.END); }
		public TerminalNode END(int i) {
			return getToken(cppParser.END, i);
		}
		public TerminalNode BODY() { return getToken(cppParser.BODY, 0); }
		public List<TerminalNode> ID() { return getTokens(cppParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cppParser.ID, i);
		}
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(cppParser.INITIAL, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(cppParser.FINAL, 0); }
		public TerminalNode RESOURCE() { return getToken(cppParser.RESOURCE, 0); }
		public TerminalNode SEPARATE() { return getToken(cppParser.SEPARATE, 0); }
		public Spec_bodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Spec_bodyContext(ParserRuleContext parent, int invokingState, String declar) {
			super(parent, invokingState);
			this.declar = declar;
		}
		@Override public int getRuleIndex() { return RULE_spec_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterSpec_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitSpec_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitSpec_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_bodyContext spec_body(String declar) throws RecognitionException {
		Spec_bodyContext _localctx = new Spec_bodyContext(_ctx, getState(), declar);
		enterRule(_localctx, 10, RULE_spec_body);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(END);
				((Spec_bodyContext)_localctx).trad =  ");"+System.lineSeparator()+_localctx.declar;
				_localctx.trad += System.lineSeparator()+ "begin" + System.lineSeparator()+ "end;" + System.lineSeparator();
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(BODY);
				setState(259);
				match(ID);
				((Spec_bodyContext)_localctx).trad =  "";
				setState(261);
				match(LPARENT);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(262);
					((Spec_bodyContext)_localctx).parameters = parameters();
					_localctx.trad += ((Spec_bodyContext)_localctx).parameters.trad;
					}
				}

				setState(267);
				match(RPARENT);
				_localctx.trad += ");"+System.lineSeparator()+_localctx.declar + System.lineSeparator()+ "begin" + System.lineSeparator();
				setState(269);
				((Spec_bodyContext)_localctx).t1 = block();
				_localctx.trad += ((Spec_bodyContext)_localctx).t1.trad;
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIAL) {
					{
					setState(271);
					match(INITIAL);
					setState(272);
					((Spec_bodyContext)_localctx).t2 = block();
					setState(273);
					match(END);
					_localctx.trad += ((Spec_bodyContext)_localctx).t2.trad;
					}
				}

				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PROC) {
					{
					{
					setState(278);
					proc();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(284);
					match(FINAL);
					setState(285);
					((Spec_bodyContext)_localctx).t3 = block();
					setState(286);
					match(END);
					_localctx.trad += ((Spec_bodyContext)_localctx).t3.trad;
					}
				}

				setState(291);
				match(END);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(292);
					match(ID);
					}
				}

				_localctx.trad += System.lineSeparator()+ "end;" + System.lineSeparator();
				}
				break;
			case RESOURCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(RESOURCE);
				setState(298);
				match(ID);
				((Spec_bodyContext)_localctx).trad =  "";
				setState(300);
				match(LPARENT);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(301);
					((Spec_bodyContext)_localctx).parameters = parameters();
					_localctx.trad += ((Spec_bodyContext)_localctx).parameters.trad;
					}
				}

				setState(306);
				match(RPARENT);
				setState(307);
				match(SEPARATE);
				_localctx.trad += ");"+System.lineSeparator();
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

	public static class ProcContext extends ParserRuleContext {
		public String trad;
		public Token ID;
		public Id_subs_lpContext id_subs_lp;
		public Result_idContext result_id;
		public BlockContext block;
		public TerminalNode PROC() { return getToken(cppParser.PROC, 0); }
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(cppParser.END, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(cppParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(PROC);
			setState(312);
			((ProcContext)_localctx).ID = match(ID);
			setState(313);
			match(LPARENT);
			((ProcContext)_localctx).trad =  "function "+ (((ProcContext)_localctx).ID!=null?((ProcContext)_localctx).ID.getText():null) +"(";
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(315);
				((ProcContext)_localctx).id_subs_lp = id_subs_lp(0);
				_localctx.trad += ((ProcContext)_localctx).id_subs_lp.trad;
				}
			}

			setState(320);
			match(RPARENT);
			_localctx.trad+= ")";
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(322);
				match(RETURNS);
				setState(323);
				((ProcContext)_localctx).result_id = result_id();
				_localctx.trad += " : "+((ProcContext)_localctx).result_id.trad;
				}
				break;
			}
			setState(328);
			((ProcContext)_localctx).block = block();
			_localctx.trad += ";"+System.lineSeparator()+((ProcContext)_localctx).block.trad;
			setState(330);
			match(END);
			_localctx.trad += System.lineSeparator()+ "end;" + System.lineSeparator();
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
		public String trad;
		public Block_itemsContext block_items;
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((BlockContext)_localctx).block_items = block_items(0);
			((BlockContext)_localctx).trad =  ((BlockContext)_localctx).block_items.trad;
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

	public static class Block_itemsContext extends ParserRuleContext {
		public String trad;
		public Block_itemsContext t1;
		public Block_itemContext block_item;
		public Block_itemContext block_item() {
			return getRuleContext(Block_itemContext.class,0);
		}
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public Block_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterBlock_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitBlock_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitBlock_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemsContext block_items() throws RecognitionException {
		return block_items(0);
	}

	private Block_itemsContext block_items(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Block_itemsContext _localctx = new Block_itemsContext(_ctx, _parentState);
		Block_itemsContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_block_items, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			((Block_itemsContext)_localctx).trad =  "";
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(338);
				((Block_itemsContext)_localctx).block_item = block_item();
				_localctx.trad += ((Block_itemsContext)_localctx).block_item.trad;
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Block_itemsContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_block_items);
					setState(343);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					((Block_itemsContext)_localctx).trad =  ((Block_itemsContext)_localctx).t1.trad;
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(345);
						match(T__0);
						_localctx.trad += ";" + System.lineSeparator();
						}
					}

					setState(349);
					((Block_itemsContext)_localctx).block_item = block_item();
					_localctx.trad += ((Block_itemsContext)_localctx).block_item.trad;
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Block_itemContext extends ParserRuleContext {
		public String trad;
		public DeclarationsContext declarations;
		public StatementsContext statements;
		public ExpressionContext expression;
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemContext block_item() throws RecognitionException {
		Block_itemContext _localctx = new Block_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block_item);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((Block_itemContext)_localctx).declarations = declarations();
				((Block_itemContext)_localctx).trad =  ((Block_itemContext)_localctx).declarations.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				((Block_itemContext)_localctx).statements = statements();
				((Block_itemContext)_localctx).trad =  ((Block_itemContext)_localctx).statements.trad;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				((Block_itemContext)_localctx).expression = expression();
				((Block_itemContext)_localctx).trad =  ((Block_itemContext)_localctx).expression.trad;
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

	public static class DeclarationsContext extends ParserRuleContext {
		public String trad;
		public ConstantContext constant;
		public DeclarationsContext declarations;
		public TypeContext type;
		public Op_typeContext op_type;
		public VariableContext variable;
		public OperationContext operation;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Op_typeContext op_type() {
			return getRuleContext(Op_typeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarations);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				((DeclarationsContext)_localctx).constant = constant();
				((DeclarationsContext)_localctx).trad =  ((DeclarationsContext)_localctx).constant.trad;
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(370);
					((DeclarationsContext)_localctx).declarations = declarations();
					_localctx.trad += ((DeclarationsContext)_localctx).declarations.trad;
					}
					break;
				}
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				((DeclarationsContext)_localctx).type = type();
				((DeclarationsContext)_localctx).trad =  ((DeclarationsContext)_localctx).type.trad;
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(377);
					((DeclarationsContext)_localctx).declarations = declarations();
					_localctx.trad += ((DeclarationsContext)_localctx).declarations.trad;
					}
					break;
				}
				}
				break;
			case OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				((DeclarationsContext)_localctx).op_type = op_type();
				((DeclarationsContext)_localctx).trad =  ((DeclarationsContext)_localctx).op_type.trad;
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(384);
					((DeclarationsContext)_localctx).declarations = declarations();
					_localctx.trad += ((DeclarationsContext)_localctx).declarations.trad;
					}
					break;
				}
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				((DeclarationsContext)_localctx).variable = variable();
				((DeclarationsContext)_localctx).trad =  ((DeclarationsContext)_localctx).variable.trad;
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				((DeclarationsContext)_localctx).operation = operation();
				((DeclarationsContext)_localctx).trad =  ((DeclarationsContext)_localctx).operation.trad;
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(394);
					((DeclarationsContext)_localctx).declarations = declarations();
					_localctx.trad += ((DeclarationsContext)_localctx).declarations.trad;
					}
					break;
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

	public static class ConstantContext extends ParserRuleContext {
		public String trad;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode CONST() { return getToken(cppParser.CONST, 0); }
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(cppParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(CONST);
			setState(402);
			((ConstantContext)_localctx).ID = match(ID);
			setState(403);
			match(ASIGNACION);
			setState(404);
			((ConstantContext)_localctx).expression = expression();
			((ConstantContext)_localctx).trad =  "const"+System.lineSeparator()+(((ConstantContext)_localctx).ID!=null?((ConstantContext)_localctx).ID.getText():null)+" := "+((ConstantContext)_localctx).expression.trad;
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

	public static class TypeContext extends ParserRuleContext {
		public String trad;
		public Token TYPE;
		public Token ID;
		public Token OPERADOR_COMPARACION;
		public TContext t;
		public Type_resContext type_res;
		public TerminalNode TYPE() { return getToken(cppParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public TerminalNode OPERADOR_COMPARACION() { return getToken(cppParser.OPERADOR_COMPARACION, 0); }
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Type_resContext type_res() {
			return getRuleContext(Type_resContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((TypeContext)_localctx).TYPE = match(TYPE);
			setState(408);
			((TypeContext)_localctx).ID = match(ID);
			setState(409);
			((TypeContext)_localctx).OPERADOR_COMPARACION = match(OPERADOR_COMPARACION);
			setState(410);
			((TypeContext)_localctx).t = t();
			setState(411);
			((TypeContext)_localctx).type_res = type_res();
			((TypeContext)_localctx).trad =  (((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null) + " " + (((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null) +" "+ (((TypeContext)_localctx).OPERADOR_COMPARACION!=null?((TypeContext)_localctx).OPERADOR_COMPARACION.getText():null) +" "+ ((TypeContext)_localctx).t.trad + ((TypeContext)_localctx).type_res.trad;
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

	public static class Op_typeContext extends ParserRuleContext {
		public String trad;
		public Token OPTYPE;
		public Token ID;
		public Token OPERADOR_COMPARACION;
		public ParametersContext parameters;
		public Result_idContext result_id;
		public TerminalNode OPTYPE() { return getToken(cppParser.OPTYPE, 0); }
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public TerminalNode OPERADOR_COMPARACION() { return getToken(cppParser.OPERADOR_COMPARACION, 0); }
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(cppParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public Op_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterOp_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitOp_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitOp_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_typeContext op_type() throws RecognitionException {
		Op_typeContext _localctx = new Op_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((Op_typeContext)_localctx).OPTYPE = match(OPTYPE);
			setState(415);
			((Op_typeContext)_localctx).ID = match(ID);
			setState(416);
			((Op_typeContext)_localctx).OPERADOR_COMPARACION = match(OPERADOR_COMPARACION);
			setState(417);
			match(LPARENT);
			((Op_typeContext)_localctx).trad =  (((Op_typeContext)_localctx).OPTYPE!=null?((Op_typeContext)_localctx).OPTYPE.getText():null)+ " "+(((Op_typeContext)_localctx).ID!=null?((Op_typeContext)_localctx).ID.getText():null)+ " "+(((Op_typeContext)_localctx).OPERADOR_COMPARACION!=null?((Op_typeContext)_localctx).OPERADOR_COMPARACION.getText():null)+ " ( ";
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(419);
				((Op_typeContext)_localctx).parameters = parameters();
				_localctx.trad += ((Op_typeContext)_localctx).parameters.trad;
				}
			}

			setState(424);
			match(RPARENT);
			_localctx.trad += ") ";
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(426);
				match(RETURNS);
				setState(427);
				((Op_typeContext)_localctx).result_id = result_id();
				_localctx.trad += " : "+((Op_typeContext)_localctx).result_id.trad;
				}
				break;
			}
			_localctx.trad += ";";
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

	public static class VariableContext extends ParserRuleContext {
		public String trad;
		public Id_subs_lpContext id_subs_lp;
		public TContext t;
		public ExpressionContext expression;
		public TerminalNode VAR() { return getToken(cppParser.VAR, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(cppParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(VAR);
				setState(435);
				((VariableContext)_localctx).id_subs_lp = id_subs_lp(0);
				setState(436);
				match(T__1);
				setState(437);
				((VariableContext)_localctx).t = t();
				((VariableContext)_localctx).trad =  "var"+System.lineSeparator() + ((VariableContext)_localctx).id_subs_lp.trad+" : "+ ((VariableContext)_localctx).t.trad;
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(439);
					match(ASIGNACION);
					setState(440);
					((VariableContext)_localctx).expression = expression();
					_localctx.trad += " = "+((VariableContext)_localctx).expression.trad;
					}
					break;
				}
				_localctx.trad += ";"+System.lineSeparator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(VAR);
				setState(448);
				((VariableContext)_localctx).id_subs_lp = id_subs_lp(0);
				setState(449);
				match(ASIGNACION);
				setState(450);
				((VariableContext)_localctx).expression = expression();
				((VariableContext)_localctx).trad =  "var"+System.lineSeparator()+((VariableContext)_localctx).id_subs_lp.trad+" := "+((VariableContext)_localctx).expression.trad+";"+ System.lineSeparator();
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

	public static class OperationContext extends ParserRuleContext {
		public String trad;
		public Token OP;
		public Id_subs_lpContext id_subs_lp;
		public Op_prototypeContext op_prototype;
		public Result_idContext result_id;
		public Token ID;
		public TerminalNode OP() { return getToken(cppParser.OP, 0); }
		public List<Id_subs_lpContext> id_subs_lp() {
			return getRuleContexts(Id_subs_lpContext.class);
		}
		public Id_subs_lpContext id_subs_lp(int i) {
			return getRuleContext(Id_subs_lpContext.class,i);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(cppParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(cppParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cppParser.ID, i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operation);
		int _la;
		try {
			int _alt;
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				((OperationContext)_localctx).OP = match(OP);
				setState(456);
				((OperationContext)_localctx).id_subs_lp = id_subs_lp(0);
				setState(457);
				((OperationContext)_localctx).op_prototype = op_prototype();
				((OperationContext)_localctx).trad =  (((OperationContext)_localctx).OP!=null?((OperationContext)_localctx).OP.getText():null)+ " " + ((OperationContext)_localctx).id_subs_lp.trad +" "+((OperationContext)_localctx).op_prototype.trad; 
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(459);
					match(RETURNS);
					setState(460);
					((OperationContext)_localctx).result_id = result_id();
					_localctx.trad += " : "+((OperationContext)_localctx).result_id.trad;
					}
					break;
				}
				_localctx.trad += ";"+ System.lineSeparator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				((OperationContext)_localctx).OP = match(OP);
				((OperationContext)_localctx).trad =  (((OperationContext)_localctx).OP!=null?((OperationContext)_localctx).OP.getText():null) +" ";
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(472);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ID) {
							{
							setState(469);
							((OperationContext)_localctx).id_subs_lp = id_subs_lp(0);
							_localctx.trad += ((OperationContext)_localctx).id_subs_lp.trad + " ";
							}
						}

						setState(474);
						match(T__1);
						setState(475);
						((OperationContext)_localctx).ID = match(ID);
						_localctx.trad +=": "+(((OperationContext)_localctx).ID!=null?((OperationContext)_localctx).ID.getText():null);
						setState(479);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(477);
							match(T__2);
							_localctx.trad += " , ";
							}
							break;
						}
						}
						} 
					}
					setState(485);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				_localctx.trad += ";" + System.lineSeparator();
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

	public static class StatementsContext extends ParserRuleContext {
		public String trad;
		public SequentialContext sequential;
		public Op_invocationContext op_invocation;
		public Op_serviceContext op_service;
		public Resource_controlContext resource_control;
		public Explicit_callContext explicit_call;
		public SequentialContext sequential() {
			return getRuleContext(SequentialContext.class,0);
		}
		public Op_invocationContext op_invocation() {
			return getRuleContext(Op_invocationContext.class,0);
		}
		public Op_serviceContext op_service() {
			return getRuleContext(Op_serviceContext.class,0);
		}
		public Resource_controlContext resource_control() {
			return getRuleContext(Resource_controlContext.class,0);
		}
		public Explicit_callContext explicit_call() {
			return getRuleContext(Explicit_callContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statements);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				((StatementsContext)_localctx).sequential = sequential();
				((StatementsContext)_localctx).trad =  ((StatementsContext)_localctx).sequential.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				((StatementsContext)_localctx).op_invocation = op_invocation();
				((StatementsContext)_localctx).trad =  ((StatementsContext)_localctx).op_invocation.trad;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				((StatementsContext)_localctx).op_service = op_service();
				((StatementsContext)_localctx).trad =  ((StatementsContext)_localctx).op_service.trad;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				((StatementsContext)_localctx).resource_control = resource_control();
				((StatementsContext)_localctx).trad =  ((StatementsContext)_localctx).resource_control.trad;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				((StatementsContext)_localctx).explicit_call = explicit_call();
				((StatementsContext)_localctx).trad =  ((StatementsContext)_localctx).explicit_call.trad;
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

	public static class Explicit_callContext extends ParserRuleContext {
		public String trad;
		public Token CALL;
		public InvocationContext invocation;
		public TerminalNode CALL() { return getToken(cppParser.CALL, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Explicit_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterExplicit_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitExplicit_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitExplicit_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_callContext explicit_call() throws RecognitionException {
		Explicit_callContext _localctx = new Explicit_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			((Explicit_callContext)_localctx).CALL = match(CALL);
			setState(507);
			((Explicit_callContext)_localctx).invocation = invocation();
			((Explicit_callContext)_localctx).trad =  (((Explicit_callContext)_localctx).CALL!=null?((Explicit_callContext)_localctx).CALL.getText():null) +" "+((Explicit_callContext)_localctx).invocation.trad+";"+System.lineSeparator();
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

	public static class InvocationContext extends ParserRuleContext {
		public String trad;
		public ExpressionContext expression;
		public ActualsContext actuals;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			((InvocationContext)_localctx).expression = expression();
			setState(511);
			match(LPARENT);
			((InvocationContext)_localctx).trad =  ((InvocationContext)_localctx).expression.trad + " (";
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LPARENT) | (1L << NULL))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NUM - 69)) | (1L << (CADENA - 69)) | (1L << (ID - 69)))) != 0)) {
				{
				setState(513);
				((InvocationContext)_localctx).actuals = actuals();
				_localctx.trad += ((InvocationContext)_localctx).actuals.trad;
				}
			}

			setState(518);
			match(RPARENT);
			_localctx.trad += ")";
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

	public static class SequentialContext extends ParserRuleContext {
		public String trad;
		public VariableContext variable;
		public ExpressionContext expression;
		public Expr1Context expr1;
		public BlockContext block;
		public Quantifier1Context quantifier1;
		public TerminalNode SKP() { return getToken(cppParser.SKP, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(cppParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENTO() { return getToken(cppParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(cppParser.DECREMENTO, 0); }
		public TerminalNode IF() { return getToken(cppParser.IF, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode EJECUTA() { return getToken(cppParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FI() { return getToken(cppParser.FI, 0); }
		public TerminalNode SEPARA() { return getToken(cppParser.SEPARA, 0); }
		public TerminalNode DO() { return getToken(cppParser.DO, 0); }
		public TerminalNode OD() { return getToken(cppParser.OD, 0); }
		public TerminalNode FA() { return getToken(cppParser.FA, 0); }
		public Quantifier1Context quantifier1() {
			return getRuleContext(Quantifier1Context.class,0);
		}
		public TerminalNode AF() { return getToken(cppParser.AF, 0); }
		public TerminalNode EXIT() { return getToken(cppParser.EXIT, 0); }
		public TerminalNode NEXT() { return getToken(cppParser.NEXT, 0); }
		public SequentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterSequential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitSequential(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitSequential(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequentialContext sequential() throws RecognitionException {
		SequentialContext _localctx = new SequentialContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sequential);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(SKP);
				((SequentialContext)_localctx).trad =  "skip";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				((SequentialContext)_localctx).variable = variable();
				setState(524);
				match(ASIGNACION);
				setState(525);
				((SequentialContext)_localctx).expression = expression();
				((SequentialContext)_localctx).trad =  ((SequentialContext)_localctx).variable.trad + " := " + ((SequentialContext)_localctx).expression.trad+";"+System.lineSeparator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				((SequentialContext)_localctx).variable = variable();
				setState(529);
				match(INCREMENTO);
				((SequentialContext)_localctx).trad =  "inc("+ ((SequentialContext)_localctx).variable.trad+");"+System.lineSeparator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				((SequentialContext)_localctx).variable = variable();
				setState(533);
				match(DECREMENTO);
				((SequentialContext)_localctx).trad =  "dec("+ ((SequentialContext)_localctx).variable.trad+");"+System.lineSeparator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				match(IF);
				setState(537);
				((SequentialContext)_localctx).expr1 = expr1();
				setState(538);
				match(EJECUTA);
				setState(539);
				((SequentialContext)_localctx).block = block();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARA) {
					{
					setState(540);
					match(SEPARA);
					}
				}

				setState(543);
				match(FI);
				((SequentialContext)_localctx).trad =  "if "+ ((SequentialContext)_localctx).expr1.trad + " then"+System.lineSeparator()+((SequentialContext)_localctx).block.trad+System.lineSeparator();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(546);
				match(DO);
				setState(547);
				((SequentialContext)_localctx).expr1 = expr1();
				setState(548);
				match(EJECUTA);
				setState(549);
				((SequentialContext)_localctx).block = block();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARA) {
					{
					setState(550);
					match(SEPARA);
					}
				}

				setState(553);
				match(OD);
				((SequentialContext)_localctx).trad =  "do "+ ((SequentialContext)_localctx).expr1.trad + " then"+System.lineSeparator()+((SequentialContext)_localctx).block.trad+System.lineSeparator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(556);
				match(FA);
				setState(557);
				((SequentialContext)_localctx).quantifier1 = quantifier1();
				setState(558);
				match(EJECUTA);
				setState(559);
				((SequentialContext)_localctx).block = block();
				setState(560);
				match(AF);
				((SequentialContext)_localctx).trad =  "for "+((SequentialContext)_localctx).quantifier1.trad+" do"+System.lineSeparator()+((SequentialContext)_localctx).block.trad+System.lineSeparator();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(563);
				match(EXIT);
				((SequentialContext)_localctx).trad =  "exit";
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(565);
				match(NEXT);
				((SequentialContext)_localctx).trad =  "next";
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

	public static class Op_invocationContext extends ParserRuleContext {
		public String trad;
		public OperationContext operation;
		public ExpressionContext expression;
		public InvocationContext invocation;
		public QuantifierContext quantifier;
		public BlockContext block;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode CALL() { return getToken(cppParser.CALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEND() { return getToken(cppParser.SEND, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TerminalNode CO() { return getToken(cppParser.CO, 0); }
		public TerminalNode OC() { return getToken(cppParser.OC, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TerminalNode EJECUTA() { return getToken(cppParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Op_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterOp_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitOp_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitOp_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_invocationContext op_invocation() throws RecognitionException {
		Op_invocationContext _localctx = new Op_invocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op_invocation);
		int _la;
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				((Op_invocationContext)_localctx).trad =  "";
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(570);
					match(CALL);
					((Op_invocationContext)_localctx).trad =  "call ";
					}
				}

				setState(574);
				((Op_invocationContext)_localctx).operation = operation();
				_localctx.trad += ((Op_invocationContext)_localctx).operation.trad;
				setState(579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(576);
					((Op_invocationContext)_localctx).expression = expression();
					_localctx.trad += " "+((Op_invocationContext)_localctx).expression.trad;
					}
					break;
				}
				_localctx.trad += ";"+System.lineSeparator();
				}
				break;
			case SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(SEND);
				setState(584);
				((Op_invocationContext)_localctx).invocation = invocation();
				((Op_invocationContext)_localctx).trad =  "send "+ ((Op_invocationContext)_localctx).invocation.trad+ ";"+System.lineSeparator();
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				match(CO);
				((Op_invocationContext)_localctx).trad =  "co ";
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT) {
					{
					setState(589);
					((Op_invocationContext)_localctx).quantifier = quantifier();
					_localctx.trad += ((Op_invocationContext)_localctx).quantifier.trad+" ";
					}
				}

				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(594);
					match(CALL);
					_localctx.trad += "call ";
					}
				}

				setState(598);
				((Op_invocationContext)_localctx).operation = operation();
				_localctx.trad += ((Op_invocationContext)_localctx).operation.trad+" ";
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LPARENT) | (1L << NULL))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NUM - 69)) | (1L << (CADENA - 69)) | (1L << (ID - 69)))) != 0)) {
					{
					setState(600);
					((Op_invocationContext)_localctx).expression = expression();
					_localctx.trad += ((Op_invocationContext)_localctx).expression.trad+" ";
					}
				}

				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EJECUTA) {
					{
					setState(605);
					match(EJECUTA);
					setState(606);
					((Op_invocationContext)_localctx).block = block();
					_localctx.trad += "do "+((Op_invocationContext)_localctx).block.trad+" ";
					}
				}

				setState(611);
				match(OC);
				_localctx.trad += "oc;"+System.lineSeparator();
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

	public static class Op_serviceContext extends ParserRuleContext {
		public String trad;
		public In_cmdContext in_cmd;
		public OperationContext operation;
		public VariableContext variable;
		public TerminalNode IN() { return getToken(cppParser.IN, 0); }
		public TerminalNode NI() { return getToken(cppParser.NI, 0); }
		public List<In_cmdContext> in_cmd() {
			return getRuleContexts(In_cmdContext.class);
		}
		public In_cmdContext in_cmd(int i) {
			return getRuleContext(In_cmdContext.class,i);
		}
		public TerminalNode RECEIVE() { return getToken(cppParser.RECEIVE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(cppParser.RETURN, 0); }
		public TerminalNode REPLY() { return getToken(cppParser.REPLY, 0); }
		public Op_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterOp_service(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitOp_service(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitOp_service(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_serviceContext op_service() throws RecognitionException {
		Op_serviceContext _localctx = new Op_serviceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_service);
		int _la;
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				match(IN);
				((Op_serviceContext)_localctx).trad =  "in ";
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPARENT || _la==ID) {
					{
					{
					setState(618);
					((Op_serviceContext)_localctx).in_cmd = in_cmd();
					_localctx.trad += ((Op_serviceContext)_localctx).in_cmd.trad+" ";
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				match(NI);
				_localctx.trad += "ni;"+System.lineSeparator();
				}
				break;
			case RECEIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(RECEIVE);
				setState(629);
				((Op_serviceContext)_localctx).operation = operation();
				((Op_serviceContext)_localctx).trad =  "recieve "+((Op_serviceContext)_localctx).operation.trad + " ";
				setState(634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(631);
					((Op_serviceContext)_localctx).variable = variable();
					_localctx.trad += ((Op_serviceContext)_localctx).variable.trad+" ";
					}
					break;
				}
				_localctx.trad += ";"+System.lineSeparator();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				match(RETURN);
				((Op_serviceContext)_localctx).trad =  "return;"+System.lineSeparator();
				}
				break;
			case REPLY:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				match(REPLY);
				((Op_serviceContext)_localctx).trad =  "reply;"+System.lineSeparator();
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

	public static class In_cmdContext extends ParserRuleContext {
		public String trad;
		public QuantifierContext quantifier;
		public Qualified_idContext qualified_id;
		public SubscriptsContext subscripts;
		public Id_listContext id_list;
		public Expr1Context expr1;
		public ExpressionContext expression;
		public Result_idContext result_id;
		public BlockContext block;
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public TerminalNode EJECUTA() { return getToken(cppParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode BY() { return getToken(cppParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(cppParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public TerminalNode SEPARA() { return getToken(cppParser.SEPARA, 0); }
		public In_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterIn_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitIn_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitIn_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_cmdContext in_cmd() throws RecognitionException {
		In_cmdContext _localctx = new In_cmdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_in_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((In_cmdContext)_localctx).trad =  "";
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(645);
				((In_cmdContext)_localctx).quantifier = quantifier();
				((In_cmdContext)_localctx).trad =  ((In_cmdContext)_localctx).quantifier.trad+" ";
				}
			}

			setState(650);
			((In_cmdContext)_localctx).qualified_id = qualified_id();
			_localctx.trad += ((In_cmdContext)_localctx).qualified_id.trad+" ";
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(652);
				((In_cmdContext)_localctx).subscripts = subscripts();
				_localctx.trad += ((In_cmdContext)_localctx).subscripts.trad+" ";
				}
			}

			setState(657);
			match(LPARENT);
			_localctx.trad += "(";
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(659);
				((In_cmdContext)_localctx).id_list = id_list();
				_localctx.trad += ((In_cmdContext)_localctx).id_list.trad;
				}
				break;
			}
			setState(664);
			match(RPARENT);
			_localctx.trad += ") ";
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(666);
				match(T__3);
				setState(667);
				((In_cmdContext)_localctx).expr1 = expr1();
				_localctx.trad += "and "+((In_cmdContext)_localctx).expr1.trad+" ";
				}
			}

			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(672);
				match(BY);
				setState(673);
				((In_cmdContext)_localctx).expression = expression();
				_localctx.trad += "by "+((In_cmdContext)_localctx).expression.trad+" ";
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(678);
				match(RETURNS);
				setState(679);
				((In_cmdContext)_localctx).result_id = result_id();
				_localctx.trad += ": "+((In_cmdContext)_localctx).result_id.trad+" ";
				}
			}

			setState(684);
			match(EJECUTA);
			setState(685);
			((In_cmdContext)_localctx).block = block();
			_localctx.trad += "do "+((In_cmdContext)_localctx).block.trad;
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARA) {
				{
				setState(687);
				match(SEPARA);
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

	public static class Resource_controlContext extends ParserRuleContext {
		public String trad;
		public Token t1;
		public Token t2;
		public ActualsContext actuals;
		public Token t3;
		public ExpressionContext expression;
		public TerminalNode ASIGNACION() { return getToken(cppParser.ASIGNACION, 0); }
		public TerminalNode CREATE() { return getToken(cppParser.CREATE, 0); }
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public List<TerminalNode> ID() { return getTokens(cppParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cppParser.ID, i);
		}
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public TerminalNode ON() { return getToken(cppParser.ON, 0); }
		public TerminalNode DESTROY() { return getToken(cppParser.DESTROY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Resource_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterResource_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitResource_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitResource_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_controlContext resource_control() throws RecognitionException {
		Resource_controlContext _localctx = new Resource_controlContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_resource_control);
		int _la;
		try {
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				((Resource_controlContext)_localctx).t1 = match(ID);
				setState(691);
				match(ASIGNACION);
				setState(692);
				match(CREATE);
				setState(693);
				((Resource_controlContext)_localctx).t2 = match(ID);
				setState(694);
				match(LPARENT);
				((Resource_controlContext)_localctx).trad =  (((Resource_controlContext)_localctx).t1!=null?((Resource_controlContext)_localctx).t1.getText():null)+" := create "+(((Resource_controlContext)_localctx).t2!=null?((Resource_controlContext)_localctx).t2.getText():null)+"(";
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LPARENT) | (1L << NULL))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NUM - 69)) | (1L << (CADENA - 69)) | (1L << (ID - 69)))) != 0)) {
					{
					setState(696);
					((Resource_controlContext)_localctx).actuals = actuals();
					_localctx.trad += ((Resource_controlContext)_localctx).actuals.trad;
					}
				}

				setState(701);
				match(RPARENT);
				_localctx.trad += ") ";
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(703);
					match(ON);
					setState(704);
					((Resource_controlContext)_localctx).t3 = match(ID);
					_localctx.trad += "on "+(((Resource_controlContext)_localctx).t3!=null?((Resource_controlContext)_localctx).t3.getText():null);
					}
					break;
				}
				}
				break;
			case DESTROY:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(DESTROY);
				setState(709);
				((Resource_controlContext)_localctx).expression = expression();
				((Resource_controlContext)_localctx).trad =  "destroy "+((Resource_controlContext)_localctx).expression.trad+";"+System.lineSeparator();
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

	public static class TContext extends ParserRuleContext {
		public String trad;
		public Basic_typeContext basic_type;
		public Enum_defContext enum_def;
		public Pointer_defContext pointer_def;
		public Record_defContext record_def;
		public Union_defContext union_def;
		public Capability_defContext capability_def;
		public TContext t;
		public Qualified_idContext qualified_id;
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
		}
		public Pointer_defContext pointer_def() {
			return getRuleContext(Pointer_defContext.class,0);
		}
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Union_defContext union_def() {
			return getRuleContext(Union_defContext.class,0);
		}
		public Capability_defContext capability_def() {
			return getRuleContext(Capability_defContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_t);
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FILE:
			case REAL:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				((TContext)_localctx).basic_type = basic_type();
				((TContext)_localctx).trad =  ((TContext)_localctx).basic_type.trad;
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				((TContext)_localctx).enum_def = enum_def();
				((TContext)_localctx).trad =  ((TContext)_localctx).enum_def.trad;
				}
				break;
			case PTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				((TContext)_localctx).pointer_def = pointer_def();
				((TContext)_localctx).trad =  ((TContext)_localctx).pointer_def.trad;
				}
				break;
			case REC:
				enterOuterAlt(_localctx, 4);
				{
				setState(723);
				((TContext)_localctx).record_def = record_def();
				((TContext)_localctx).trad =  ((TContext)_localctx).record_def.trad;
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				((TContext)_localctx).union_def = union_def();
				((TContext)_localctx).trad =  ((TContext)_localctx).union_def.trad;
				}
				break;
			case CAP:
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				((TContext)_localctx).capability_def = capability_def();
				((TContext)_localctx).trad =  ((TContext)_localctx).capability_def.trad;
				setState(734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(731);
					((TContext)_localctx).t = t();
					_localctx.trad += " "+((TContext)_localctx).t.trad;
					}
					break;
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(736);
				((TContext)_localctx).qualified_id = qualified_id();
				((TContext)_localctx).trad =  ((TContext)_localctx).qualified_id.trad;
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

	public static class Basic_typeContext extends ParserRuleContext {
		public String trad;
		public TerminalNode BOOL() { return getToken(cppParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(cppParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(cppParser.INT, 0); }
		public TerminalNode FILE() { return getToken(cppParser.FILE, 0); }
		public TerminalNode REAL() { return getToken(cppParser.REAL, 0); }
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitBasic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitBasic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_basic_type);
		try {
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				match(BOOL);
				((Basic_typeContext)_localctx).trad =  "boolean";
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(CHAR);
				((Basic_typeContext)_localctx).trad =  "char";
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(INT);
				((Basic_typeContext)_localctx).trad =  "integer";
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				match(FILE);
				((Basic_typeContext)_localctx).trad =  "file";
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(749);
				match(REAL);
				((Basic_typeContext)_localctx).trad =  "real";
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

	public static class Enum_defContext extends ParserRuleContext {
		public String trad;
		public Id_listContext id_list;
		public TerminalNode ENUM() { return getToken(cppParser.ENUM, 0); }
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public Enum_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterEnum_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitEnum_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitEnum_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_defContext enum_def() throws RecognitionException {
		Enum_defContext _localctx = new Enum_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(ENUM);
			setState(754);
			match(LPARENT);
			setState(755);
			((Enum_defContext)_localctx).id_list = id_list();
			setState(756);
			match(RPARENT);
			((Enum_defContext)_localctx).trad =  "enum("+((Enum_defContext)_localctx).id_list.trad+")";
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

	public static class Pointer_defContext extends ParserRuleContext {
		public String trad;
		public TypeContext type;
		public TerminalNode PTR() { return getToken(cppParser.PTR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ANY() { return getToken(cppParser.ANY, 0); }
		public Pointer_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterPointer_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitPointer_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitPointer_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_defContext pointer_def() throws RecognitionException {
		Pointer_defContext _localctx = new Pointer_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pointer_def);
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(PTR);
				setState(760);
				((Pointer_defContext)_localctx).type = type();
				((Pointer_defContext)_localctx).trad =  "^"+((Pointer_defContext)_localctx).type.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				match(PTR);
				setState(764);
				match(ANY);
				((Pointer_defContext)_localctx).trad =  "^any";
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

	public static class Record_defContext extends ParserRuleContext {
		public String trad;
		public Id_subs_lpContext id_subs_lp;
		public TContext t;
		public ExpressionContext expression;
		public TerminalNode REC() { return getToken(cppParser.REC, 0); }
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public TerminalNode ASIGNACION() { return getToken(cppParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterRecord_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitRecord_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitRecord_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_record_def);
		int _la;
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				match(REC);
				setState(769);
				match(LPARENT);
				setState(770);
				((Record_defContext)_localctx).id_subs_lp = id_subs_lp(0);
				setState(771);
				match(T__1);
				setState(772);
				((Record_defContext)_localctx).t = t();
				((Record_defContext)_localctx).trad =  "rec("+((Record_defContext)_localctx).id_subs_lp.trad+" : "+((Record_defContext)_localctx).t.trad;
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(774);
					match(ASIGNACION);
					setState(775);
					((Record_defContext)_localctx).expression = expression();
					_localctx.trad += " = "+((Record_defContext)_localctx).expression.trad;
					}
				}

				setState(780);
				match(RPARENT);
				_localctx.trad += ")";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(REC);
				setState(784);
				match(LPARENT);
				setState(785);
				((Record_defContext)_localctx).id_subs_lp = id_subs_lp(0);
				setState(786);
				match(ASIGNACION);
				setState(787);
				((Record_defContext)_localctx).expression = expression();
				setState(788);
				match(RPARENT);
				((Record_defContext)_localctx).trad =  "rec("+((Record_defContext)_localctx).id_subs_lp.trad+" := "+((Record_defContext)_localctx).expression.trad+")";
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

	public static class Union_defContext extends ParserRuleContext {
		public String trad;
		public Id_subs_lpContext id_subs_lp;
		public TContext t;
		public ExpressionContext expression;
		public TerminalNode UNION() { return getToken(cppParser.UNION, 0); }
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public TerminalNode ASIGNACION() { return getToken(cppParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterUnion_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitUnion_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitUnion_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_defContext union_def() throws RecognitionException {
		Union_defContext _localctx = new Union_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_union_def);
		int _la;
		try {
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(UNION);
				setState(794);
				match(LPARENT);
				setState(795);
				((Union_defContext)_localctx).id_subs_lp = id_subs_lp(0);
				setState(796);
				match(T__1);
				setState(797);
				((Union_defContext)_localctx).t = t();
				((Union_defContext)_localctx).trad =  "union("+((Union_defContext)_localctx).id_subs_lp.trad+" : "+((Union_defContext)_localctx).t.trad;
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(799);
					match(ASIGNACION);
					setState(800);
					((Union_defContext)_localctx).expression = expression();
					_localctx.trad += " = "+((Union_defContext)_localctx).expression.trad;
					}
				}

				setState(805);
				match(RPARENT);
				_localctx.trad += ")";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				match(UNION);
				setState(809);
				match(LPARENT);
				setState(810);
				((Union_defContext)_localctx).id_subs_lp = id_subs_lp(0);
				setState(811);
				match(ASIGNACION);
				setState(812);
				((Union_defContext)_localctx).expression = expression();
				setState(813);
				match(RPARENT);
				((Union_defContext)_localctx).trad =  "union("+((Union_defContext)_localctx).id_subs_lp.trad+" := "+((Union_defContext)_localctx).expression.trad+")";
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

	public static class Capability_defContext extends ParserRuleContext {
		public String trad;
		public Cap_forContext cap_for;
		public TerminalNode CAP() { return getToken(cppParser.CAP, 0); }
		public Cap_forContext cap_for() {
			return getRuleContext(Cap_forContext.class,0);
		}
		public Capability_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capability_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterCapability_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitCapability_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitCapability_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capability_defContext capability_def() throws RecognitionException {
		Capability_defContext _localctx = new Capability_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(CAP);
			setState(819);
			((Capability_defContext)_localctx).cap_for = cap_for();
			((Capability_defContext)_localctx).trad =  "cap "+ ((Capability_defContext)_localctx).cap_for.trad;
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

	public static class Cap_forContext extends ParserRuleContext {
		public String trad;
		public Qualified_idContext qualified_id;
		public Op_prototypeContext op_prototype;
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public TerminalNode SEM() { return getToken(cppParser.SEM, 0); }
		public TerminalNode VM() { return getToken(cppParser.VM, 0); }
		public Cap_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cap_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterCap_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitCap_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitCap_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cap_forContext cap_for() throws RecognitionException {
		Cap_forContext _localctx = new Cap_forContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cap_for);
		try {
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				((Cap_forContext)_localctx).qualified_id = qualified_id();
				((Cap_forContext)_localctx).trad =  ((Cap_forContext)_localctx).qualified_id.trad;
				}
				break;
			case LPARENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				((Cap_forContext)_localctx).op_prototype = op_prototype();
				((Cap_forContext)_localctx).trad =  ((Cap_forContext)_localctx).op_prototype.trad;
				}
				break;
			case SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				match(SEM);
				((Cap_forContext)_localctx).trad =  "sem";
				}
				break;
			case VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(830);
				match(VM);
				((Cap_forContext)_localctx).trad =  "vm";
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

	public static class PrototypeContext extends ParserRuleContext {
		public String trad;
		public ParametersContext parameters;
		public Result_idContext result_id;
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public TerminalNode RETURNS() { return getToken(cppParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public PrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitPrototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrototypeContext prototype() throws RecognitionException {
		PrototypeContext _localctx = new PrototypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(LPARENT);
			setState(835);
			((PrototypeContext)_localctx).parameters = parameters();
			setState(836);
			match(RPARENT);
			((PrototypeContext)_localctx).trad = "("+((PrototypeContext)_localctx).parameters.trad+")";
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(838);
				match(RETURNS);
				setState(839);
				((PrototypeContext)_localctx).result_id = result_id();
				_localctx.trad += " : "+((PrototypeContext)_localctx).result_id.trad;
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

	public static class Op_prototypeContext extends ParserRuleContext {
		public String trad;
		public PrototypeContext prototype;
		public Op_resContext op_res;
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(cppParser.LBRACE, 0); }
		public Op_resContext op_res() {
			return getRuleContext(Op_resContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(cppParser.RBRACE, 0); }
		public Op_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterOp_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitOp_prototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitOp_prototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_prototypeContext op_prototype() throws RecognitionException {
		Op_prototypeContext _localctx = new Op_prototypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			((Op_prototypeContext)_localctx).prototype = prototype();
			((Op_prototypeContext)_localctx).trad =  ((Op_prototypeContext)_localctx).prototype.trad;
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(846);
				match(LBRACE);
				setState(847);
				((Op_prototypeContext)_localctx).op_res = op_res();
				setState(848);
				match(RBRACE);
				_localctx.trad += "{"+((Op_prototypeContext)_localctx).op_res.trad+"}";
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

	public static class Op_resContext extends ParserRuleContext {
		public String trad;
		public TerminalNode CALL() { return getToken(cppParser.CALL, 0); }
		public TerminalNode SEND() { return getToken(cppParser.SEND, 0); }
		public Op_resContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_res; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterOp_res(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitOp_res(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitOp_res(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_resContext op_res() throws RecognitionException {
		Op_resContext _localctx = new Op_resContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_res);
		try {
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				match(CALL);
				((Op_resContext)_localctx).trad =  "call";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(SEND);
				((Op_resContext)_localctx).trad =  "send";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				match(CALL);
				setState(858);
				match(T__2);
				setState(859);
				match(SEND);
				((Op_resContext)_localctx).trad =  "call, send";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(861);
				match(SEND);
				setState(862);
				match(T__2);
				setState(863);
				match(CALL);
				((Op_resContext)_localctx).trad =  "send, call";
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

	public static class Id_listContext extends ParserRuleContext {
		public String trad;
		public ExpressionContext expression;
		public Id_listContext id_list;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_id_list);
		int _la;
		try {
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				((Id_listContext)_localctx).expression = expression();
				((Id_listContext)_localctx).trad =  ((Id_listContext)_localctx).expression.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Id_listContext)_localctx).trad =  "";
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LPARENT) | (1L << NULL))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NUM - 69)) | (1L << (CADENA - 69)) | (1L << (ID - 69)))) != 0)) {
					{
					setState(871);
					((Id_listContext)_localctx).expression = expression();
					setState(872);
					match(T__2);
					setState(873);
					((Id_listContext)_localctx).id_list = id_list();
					((Id_listContext)_localctx).trad =  ((Id_listContext)_localctx).expression.trad+", "+((Id_listContext)_localctx).id_list.trad;
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((Id_listContext)_localctx).trad =  "";
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LPARENT) | (1L << NULL))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NUM - 69)) | (1L << (CADENA - 69)) | (1L << (ID - 69)))) != 0)) {
					{
					setState(879);
					((Id_listContext)_localctx).expression = expression();
					setState(880);
					match(T__1);
					setState(881);
					((Id_listContext)_localctx).id_list = id_list();
					((Id_listContext)_localctx).trad =  ((Id_listContext)_localctx).expression.trad+" : "+((Id_listContext)_localctx).id_list.trad;
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

	public static class Result_idContext extends ParserRuleContext {
		public String trad;
		public TContext t;
		public Id_listContext id_list;
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Result_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterResult_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitResult_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitResult_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_idContext result_id() throws RecognitionException {
		Result_idContext _localctx = new Result_idContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_result_id);
		try {
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				((Result_idContext)_localctx).t = t();
				((Result_idContext)_localctx).trad =  ((Result_idContext)_localctx).t.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Result_idContext)_localctx).trad =  "";
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(892);
					((Result_idContext)_localctx).id_list = id_list();
					setState(893);
					match(T__1);
					setState(894);
					((Result_idContext)_localctx).t = t();
					((Result_idContext)_localctx).trad =  ((Result_idContext)_localctx).id_list.trad+" : "+((Result_idContext)_localctx).t.trad;
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

	public static class Type_resContext extends ParserRuleContext {
		public String trad;
		public Token ID;
		public TerminalNode LBRACE() { return getToken(cppParser.LBRACE, 0); }
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public TerminalNode RBRACE() { return getToken(cppParser.RBRACE, 0); }
		public Type_resContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_res; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterType_res(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitType_res(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitType_res(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_resContext type_res() throws RecognitionException {
		Type_resContext _localctx = new Type_resContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_type_res);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Type_resContext)_localctx).trad =  "";
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(902);
				match(LBRACE);
				setState(903);
				((Type_resContext)_localctx).ID = match(ID);
				setState(904);
				match(RBRACE);
				((Type_resContext)_localctx).trad =  "{"+(((Type_resContext)_localctx).ID!=null?((Type_resContext)_localctx).ID.getText():null)+"}";
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

	public static class SubscriptsContext extends ParserRuleContext {
		public String trad;
		public Id_listContext id_list;
		public TerminalNode LBRACKET() { return getToken(cppParser.LBRACKET, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(cppParser.RBRACKET, 0); }
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterSubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitSubscripts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitSubscripts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subscripts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(LBRACKET);
			setState(909);
			((SubscriptsContext)_localctx).id_list = id_list();
			setState(910);
			match(RBRACKET);
			((SubscriptsContext)_localctx).trad = "["+((SubscriptsContext)_localctx).id_list.trad+"]";
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

	public static class Id_subs_lpContext extends ParserRuleContext {
		public String trad;
		public Id_subs_lpContext t1;
		public Id_subsContext id_subs;
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Id_subs_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterId_subs_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitId_subs_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitId_subs_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subs_lpContext id_subs_lp() throws RecognitionException {
		return id_subs_lp(0);
	}

	private Id_subs_lpContext id_subs_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_subs_lpContext _localctx = new Id_subs_lpContext(_ctx, _parentState);
		Id_subs_lpContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(914);
			((Id_subs_lpContext)_localctx).id_subs = id_subs();
			((Id_subs_lpContext)_localctx).trad =  ((Id_subs_lpContext)_localctx).id_subs.trad;
			}
			_ctx.stop = _input.LT(-1);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_subs_lpContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_id_subs_lp);
					setState(917);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(918);
					match(T__2);
					setState(919);
					((Id_subs_lpContext)_localctx).id_subs = id_subs();
					((Id_subs_lpContext)_localctx).trad =  ((Id_subs_lpContext)_localctx).t1.trad+", "+((Id_subs_lpContext)_localctx).id_subs.trad;
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class Id_subsContext extends ParserRuleContext {
		public String trad;
		public Token ID;
		public SubscriptsContext subscripts;
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Id_subsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterId_subs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitId_subs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitId_subs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subsContext id_subs() throws RecognitionException {
		Id_subsContext _localctx = new Id_subsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_id_subs);
		try {
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				((Id_subsContext)_localctx).ID = match(ID);
				((Id_subsContext)_localctx).trad =  (((Id_subsContext)_localctx).ID!=null?((Id_subsContext)_localctx).ID.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				((Id_subsContext)_localctx).ID = match(ID);
				setState(930);
				((Id_subsContext)_localctx).subscripts = subscripts();
				((Id_subsContext)_localctx).trad =  (((Id_subsContext)_localctx).ID!=null?((Id_subsContext)_localctx).ID.getText():null)+" "+((Id_subsContext)_localctx).subscripts.trad;
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

	public static class ParametersContext extends ParserRuleContext {
		public String trad;
		public Parameters2Context parameters2;
		public ParametersContext parameters;
		public Parameters2Context parameters2() {
			return getRuleContext(Parameters2Context.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameters);
		try {
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				((ParametersContext)_localctx).parameters2 = parameters2();
				((ParametersContext)_localctx).trad =  ((ParametersContext)_localctx).parameters2.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				((ParametersContext)_localctx).parameters2 = parameters2();
				setState(939);
				match(T__0);
				setState(940);
				((ParametersContext)_localctx).parameters = parameters();
				((ParametersContext)_localctx).trad =  ((ParametersContext)_localctx).parameters2.trad+"; "+((ParametersContext)_localctx).parameters.trad;
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

	public static class Parameters2Context extends ParserRuleContext {
		public String trad;
		public Id_subs_lpContext id_subs_lp;
		public TContext t;
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Parameters2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterParameters2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitParameters2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitParameters2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters2Context parameters2() throws RecognitionException {
		Parameters2Context _localctx = new Parameters2Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameters2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			((Parameters2Context)_localctx).id_subs_lp = id_subs_lp(0);
			setState(946);
			match(T__1);
			setState(947);
			((Parameters2Context)_localctx).t = t();
			((Parameters2Context)_localctx).trad =  ((Parameters2Context)_localctx).id_subs_lp.trad+" : "+((Parameters2Context)_localctx).t.trad;
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
		public String trad;
		public Expr1Context expr1;
		public Op_logContext op_log;
		public ExpressionContext expression;
		public Token ID;
		public ActualsContext actuals;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Op_logContext op_log() {
			return getRuleContext(Op_logContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(cppParser.ASIGNACION, 0); }
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression);
		int _la;
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				((ExpressionContext)_localctx).expr1 = expr1();
				setState(951);
				((ExpressionContext)_localctx).op_log = op_log();
				setState(952);
				((ExpressionContext)_localctx).expression = expression();
				((ExpressionContext)_localctx).trad =  ((ExpressionContext)_localctx).expr1.trad+" "+((ExpressionContext)_localctx).op_log.trad+" "+((ExpressionContext)_localctx).expression.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				match(T__4);
				setState(956);
				((ExpressionContext)_localctx).expr1 = expr1();
				((ExpressionContext)_localctx).trad =  "!"+((ExpressionContext)_localctx).expr1.trad;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				((ExpressionContext)_localctx).expr1 = expr1();
				((ExpressionContext)_localctx).trad =  ((ExpressionContext)_localctx).expr1.trad;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
				((ExpressionContext)_localctx).expr1 = expr1();
				setState(963);
				match(ASIGNACION);
				setState(964);
				((ExpressionContext)_localctx).expression = expression();
				((ExpressionContext)_localctx).trad =  ((ExpressionContext)_localctx).expr1.trad + " := "+((ExpressionContext)_localctx).expression.trad;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				((ExpressionContext)_localctx).trad =  "";
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(968);
					((ExpressionContext)_localctx).ID = match(ID);
					((ExpressionContext)_localctx).trad =  (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null);
					}
				}

				setState(972);
				match(LPARENT);
				_localctx.trad += "(";
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LPARENT) | (1L << NULL))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NUM - 69)) | (1L << (CADENA - 69)) | (1L << (ID - 69)))) != 0)) {
					{
					setState(974);
					((ExpressionContext)_localctx).actuals = actuals();
					_localctx.trad += ((ExpressionContext)_localctx).actuals.trad;
					}
				}

				setState(979);
				match(RPARENT);
				_localctx.trad += ")";
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

	public static class Op_logContext extends ParserRuleContext {
		public String trad;
		public Op_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterOp_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitOp_log(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitOp_log(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logContext op_log() throws RecognitionException {
		Op_logContext _localctx = new Op_logContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_op_log);
		try {
			setState(987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				match(T__3);
				((Op_logContext)_localctx).trad =  " and ";
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				match(T__5);
				((Op_logContext)_localctx).trad =  " or ";
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

	public static class Expr1Context extends ParserRuleContext {
		public String trad;
		public Expr2Context expr2;
		public Token OPERADOR_COMPARACION;
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode OPERADOR_COMPARACION() { return getToken(cppParser.OPERADOR_COMPARACION, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr1);
		try {
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				((Expr1Context)_localctx).expr2 = expr2();
				setState(990);
				((Expr1Context)_localctx).OPERADOR_COMPARACION = match(OPERADOR_COMPARACION);
				setState(991);
				((Expr1Context)_localctx).expr2 = expr2();
				((Expr1Context)_localctx).trad =  ((Expr1Context)_localctx).expr2.trad+" "+(((Expr1Context)_localctx).OPERADOR_COMPARACION!=null?((Expr1Context)_localctx).OPERADOR_COMPARACION.getText():null)+" "+((Expr1Context)_localctx).expr2.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				((Expr1Context)_localctx).expr2 = expr2();
				((Expr1Context)_localctx).trad =  ((Expr1Context)_localctx).expr2.trad;
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

	public static class Expr2Context extends ParserRuleContext {
		public String trad;
		public Expr3Context expr3;
		public Token OPERADOR_ARITMETICO;
		public Expr2Context expr2;
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public TerminalNode OPERADOR_ARITMETICO() { return getToken(cppParser.OPERADOR_ARITMETICO, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr2);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				((Expr2Context)_localctx).expr3 = expr3();
				setState(1000);
				((Expr2Context)_localctx).OPERADOR_ARITMETICO = match(OPERADOR_ARITMETICO);
				setState(1001);
				((Expr2Context)_localctx).expr2 = expr2();
				((Expr2Context)_localctx).trad =  ((Expr2Context)_localctx).expr3.trad+" "+(((Expr2Context)_localctx).OPERADOR_ARITMETICO!=null?((Expr2Context)_localctx).OPERADOR_ARITMETICO.getText():null)+" "+((Expr2Context)_localctx).expr2.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				((Expr2Context)_localctx).expr3 = expr3();
				((Expr2Context)_localctx).trad =  ((Expr2Context)_localctx).expr3.trad;
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

	public static class Expr3Context extends ParserRuleContext {
		public String trad;
		public Token ID;
		public Token NUM;
		public Token TRUE;
		public Token FALSE;
		public Id_subs_lpContext id_subs_lp;
		public Qualified_idContext qualified_id;
		public Token CADENA;
		public Token NULL;
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public TerminalNode NUM() { return getToken(cppParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(cppParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(cppParser.FALSE, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(cppParser.CADENA, 0); }
		public TerminalNode NULL() { return getToken(cppParser.NULL, 0); }
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr3);
		try {
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				((Expr3Context)_localctx).ID = match(ID);
				((Expr3Context)_localctx).trad =  (((Expr3Context)_localctx).ID!=null?((Expr3Context)_localctx).ID.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				((Expr3Context)_localctx).NUM = match(NUM);
				((Expr3Context)_localctx).trad =  (((Expr3Context)_localctx).NUM!=null?((Expr3Context)_localctx).NUM.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				((Expr3Context)_localctx).TRUE = match(TRUE);
				((Expr3Context)_localctx).trad =  (((Expr3Context)_localctx).TRUE!=null?((Expr3Context)_localctx).TRUE.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1015);
				((Expr3Context)_localctx).FALSE = match(FALSE);
				((Expr3Context)_localctx).trad =  (((Expr3Context)_localctx).FALSE!=null?((Expr3Context)_localctx).FALSE.getText():null);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1017);
				((Expr3Context)_localctx).id_subs_lp = id_subs_lp(0);
				((Expr3Context)_localctx).trad =  ((Expr3Context)_localctx).id_subs_lp.trad;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1020);
				((Expr3Context)_localctx).qualified_id = qualified_id();
				((Expr3Context)_localctx).trad =  ((Expr3Context)_localctx).qualified_id.trad;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1023);
				((Expr3Context)_localctx).CADENA = match(CADENA);
				((Expr3Context)_localctx).trad =  (((Expr3Context)_localctx).CADENA!=null?((Expr3Context)_localctx).CADENA.getText():null);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1025);
				((Expr3Context)_localctx).NULL = match(NULL);
				((Expr3Context)_localctx).trad =  (((Expr3Context)_localctx).NULL!=null?((Expr3Context)_localctx).NULL.getText():null);
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

	public static class QuantifierContext extends ParserRuleContext {
		public String trad;
		public Quantifier1Context quantifier1;
		public TerminalNode LPARENT() { return getToken(cppParser.LPARENT, 0); }
		public Quantifier1Context quantifier1() {
			return getRuleContext(Quantifier1Context.class,0);
		}
		public TerminalNode RPARENT() { return getToken(cppParser.RPARENT, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(LPARENT);
			setState(1030);
			((QuantifierContext)_localctx).quantifier1 = quantifier1();
			setState(1031);
			match(RPARENT);
			((QuantifierContext)_localctx).trad =  "("+((QuantifierContext)_localctx).quantifier1.trad+")";
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

	public static class Quantifier1Context extends ParserRuleContext {
		public String trad;
		public Quantifier2Context quantifier2;
		public Quantifier1Context quantifier1;
		public Quantifier2Context quantifier2() {
			return getRuleContext(Quantifier2Context.class,0);
		}
		public Quantifier1Context quantifier1() {
			return getRuleContext(Quantifier1Context.class,0);
		}
		public Quantifier1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterQuantifier1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitQuantifier1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitQuantifier1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier1Context quantifier1() throws RecognitionException {
		Quantifier1Context _localctx = new Quantifier1Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_quantifier1);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				((Quantifier1Context)_localctx).quantifier2 = quantifier2();
				((Quantifier1Context)_localctx).trad =  ((Quantifier1Context)_localctx).quantifier2.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				((Quantifier1Context)_localctx).quantifier2 = quantifier2();
				setState(1038);
				match(T__2);
				setState(1039);
				((Quantifier1Context)_localctx).quantifier1 = quantifier1();
				((Quantifier1Context)_localctx).trad =  ((Quantifier1Context)_localctx).quantifier2.trad + ", "+ ((Quantifier1Context)_localctx).quantifier1.trad;
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

	public static class Quantifier2Context extends ParserRuleContext {
		public String trad;
		public Token ID;
		public ExpressionContext t1;
		public DirectionContext direction;
		public ExpressionContext t2;
		public Step_optContext step_opt;
		public Such_that_optContext such_that_opt;
		public TerminalNode ID() { return getToken(cppParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(cppParser.ASIGNACION, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Step_optContext step_opt() {
			return getRuleContext(Step_optContext.class,0);
		}
		public Such_that_optContext such_that_opt() {
			return getRuleContext(Such_that_optContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Quantifier2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterQuantifier2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitQuantifier2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitQuantifier2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier2Context quantifier2() throws RecognitionException {
		Quantifier2Context _localctx = new Quantifier2Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_quantifier2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			((Quantifier2Context)_localctx).ID = match(ID);
			setState(1045);
			match(ASIGNACION);
			setState(1046);
			((Quantifier2Context)_localctx).t1 = expression();
			setState(1047);
			((Quantifier2Context)_localctx).direction = direction();
			setState(1048);
			((Quantifier2Context)_localctx).t2 = expression();
			setState(1049);
			((Quantifier2Context)_localctx).step_opt = step_opt();
			setState(1050);
			((Quantifier2Context)_localctx).such_that_opt = such_that_opt();
			((Quantifier2Context)_localctx).trad =  (((Quantifier2Context)_localctx).ID!=null?((Quantifier2Context)_localctx).ID.getText():null) + " := "+((Quantifier2Context)_localctx).t1.trad+" "+((Quantifier2Context)_localctx).direction.trad+" "+((Quantifier2Context)_localctx).t2.trad+" "+((Quantifier2Context)_localctx).step_opt.trad+" "+((Quantifier2Context)_localctx).such_that_opt.trad;
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

	public static class DirectionContext extends ParserRuleContext {
		public String trad;
		public TerminalNode TO() { return getToken(cppParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(cppParser.DOWNTO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_direction);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				match(TO);
				((DirectionContext)_localctx).trad =  "to";
				}
				break;
			case DOWNTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				match(DOWNTO);
				((DirectionContext)_localctx).trad =  "down to";
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

	public static class Step_optContext extends ParserRuleContext {
		public String trad;
		public Token BY;
		public ExpressionContext expression;
		public TerminalNode BY() { return getToken(cppParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Step_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterStep_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitStep_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitStep_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_optContext step_opt() throws RecognitionException {
		Step_optContext _localctx = new Step_optContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_step_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Step_optContext)_localctx).trad =  "";
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1060);
				((Step_optContext)_localctx).BY = match(BY);
				setState(1061);
				((Step_optContext)_localctx).expression = expression();
				((Step_optContext)_localctx).trad =  (((Step_optContext)_localctx).BY!=null?((Step_optContext)_localctx).BY.getText():null)+" "+((Step_optContext)_localctx).expression.trad;
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

	public static class Such_that_optContext extends ParserRuleContext {
		public String trad;
		public Token SUCHTHAT;
		public ExpressionContext expression;
		public TerminalNode SUCHTHAT() { return getToken(cppParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Such_that_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_such_that_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterSuch_that_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitSuch_that_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitSuch_that_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Such_that_optContext such_that_opt() throws RecognitionException {
		Such_that_optContext _localctx = new Such_that_optContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_such_that_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Such_that_optContext)_localctx).trad =  "";
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(1067);
				((Such_that_optContext)_localctx).SUCHTHAT = match(SUCHTHAT);
				setState(1068);
				((Such_that_optContext)_localctx).expression = expression();
				((Such_that_optContext)_localctx).trad =  (((Such_that_optContext)_localctx).SUCHTHAT!=null?((Such_that_optContext)_localctx).SUCHTHAT.getText():null)+" "+((Such_that_optContext)_localctx).expression.trad;
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

	public static class ActualsContext extends ParserRuleContext {
		public String trad;
		public ExpressionContext expression;
		public ActualsContext actuals;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public ActualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterActuals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitActuals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitActuals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualsContext actuals() throws RecognitionException {
		ActualsContext _localctx = new ActualsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_actuals);
		try {
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				((ActualsContext)_localctx).expression = expression();
				((ActualsContext)_localctx).trad =  ((ActualsContext)_localctx).expression.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				((ActualsContext)_localctx).expression = expression();
				setState(1077);
				match(T__2);
				setState(1078);
				((ActualsContext)_localctx).actuals = actuals();
				((ActualsContext)_localctx).trad =  ((ActualsContext)_localctx).expression.trad + ", " + ((ActualsContext)_localctx).actuals.trad;
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

	public static class Qualified_idContext extends ParserRuleContext {
		public String trad;
		public Token ID;
		public Token t1;
		public Token t2;
		public List<TerminalNode> ID() { return getTokens(cppParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cppParser.ID, i);
		}
		public Qualified_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).enterQualified_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cppListener ) ((cppListener)listener).exitQualified_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cppVisitor ) return ((cppVisitor<? extends T>)visitor).visitQualified_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_idContext qualified_id() throws RecognitionException {
		Qualified_idContext _localctx = new Qualified_idContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualified_id);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				((Qualified_idContext)_localctx).ID = match(ID);
				((Qualified_idContext)_localctx).trad =  (((Qualified_idContext)_localctx).ID!=null?((Qualified_idContext)_localctx).ID.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				((Qualified_idContext)_localctx).t1 = match(ID);
				setState(1086);
				match(T__6);
				setState(1087);
				((Qualified_idContext)_localctx).t2 = match(ID);
				((Qualified_idContext)_localctx).trad =  (((Qualified_idContext)_localctx).t1!=null?((Qualified_idContext)_localctx).t1.getText():null) +"."+ (((Qualified_idContext)_localctx).t2!=null?((Qualified_idContext)_localctx).t2.getText():null);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return block_items_sempred((Block_itemsContext)_localctx, predIndex);
		case 39:
			return id_subs_lp_sempred((Id_subs_lpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_items_sempred(Block_itemsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_subs_lp_sempred(Id_subs_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3r\u0446\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\177\n\3\3\3\3\3\3\3\5\3\u0084\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0099\n\5\3\5\3\5\3\5\3\5\7\5\u009f\n\5\f\5\16\5\u00a2\13\5\3"+
		"\5\3\5\3\5\7\5\u00a7\n\5\f\5\16\5\u00aa\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u00b3\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u00ba\n\5\f\5\16\5\u00bd\13\5"+
		"\3\5\3\5\3\5\3\5\7\5\u00c3\n\5\f\5\16\5\u00c6\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00cd\n\5\3\5\3\5\3\5\6\5\u00d2\n\5\r\5\16\5\u00d3\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u00db\n\5\3\5\3\5\3\5\5\5\u00e0\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00e8\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ef\n\6\3\6\3\6\3\6\6\6\u00f4"+
		"\n\6\r\6\16\6\u00f5\3\6\3\6\3\6\3\6\3\6\5\6\u00fd\n\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u010c\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0117\n\7\3\7\7\7\u011a\n\7\f\7\16\7\u011d\13\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0124\n\7\3\7\3\7\5\7\u0128\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0133\n\7\3\7\3\7\3\7\5\7\u0138\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0141\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0149\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0158\n\n\3\n"+
		"\3\n\3\n\3\n\5\n\u015e\n\n\3\n\3\n\3\n\7\n\u0163\n\n\f\n\16\n\u0166\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0171\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0178\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u017f\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0186\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0190\n"+
		"\f\5\f\u0192\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01a9\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u01b1\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u01be\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u01c8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01d2"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01db\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u01e2\n\21\7\21\u01e4\n\21\f\21\16\21\u01e7\13\21\3\21"+
		"\5\21\u01ea\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u01fb\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0207\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0220\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u022a"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u023a\n\25\3\26\3\26\3\26\5\26\u023f\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0246\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0253\n\26\3\26\3\26\5\26\u0257\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u025e\n\26\3\26\3\26\3\26\3\26\5\26\u0264\n\26\3\26\3\26"+
		"\3\26\5\26\u0269\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u0270\n\27\f\27\16"+
		"\27\u0273\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u027d\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0285\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u028b\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0292\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0299\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02a1\n\30"+
		"\3\30\3\30\3\30\3\30\5\30\u02a7\n\30\3\30\3\30\3\30\3\30\5\30\u02ad\n"+
		"\30\3\30\3\30\3\30\3\30\5\30\u02b3\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u02be\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u02c5\n"+
		"\31\3\31\3\31\3\31\3\31\5\31\u02cb\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u02e1\n\32\3\32\3\32\3\32\5\32\u02e6\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u02f2\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0301\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u030d\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u031a\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0326\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0333\n\37\3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u0343\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u034d"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u0356\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\5$\u0364\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u036f\n%\3%\3%\3%\3%\3"+
		"%\3%\5%\u0377\n%\5%\u0379\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0384\n&\5"+
		"&\u0386\n&\3\'\3\'\3\'\3\'\3\'\5\'\u038d\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\7)\u039d\n)\f)\16)\u03a0\13)\3*\3*\3*\3*\3*\3*\5*\u03a8"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u03b2\n+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u03cd\n-\3-\3-\3-\3-"+
		"\3-\5-\u03d4\n-\3-\3-\5-\u03d8\n-\3.\3.\3.\3.\5.\u03de\n.\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\5/\u03e8\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u03f2\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0406\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0415\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0424\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u042b\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u0432"+
		"\n\67\38\38\38\38\38\38\38\38\58\u043c\n8\39\39\39\39\39\39\59\u0444\n"+
		"9\39\2\4\22P:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\2\2\u049d\2r\3\2\2\2\4\u0083\3\2\2"+
		"\2\6\u0085\3\2\2\2\b\u00df\3\2\2\2\n\u00e1\3\2\2\2\f\u0137\3\2\2\2\16"+
		"\u0139\3\2\2\2\20\u014f\3\2\2\2\22\u0152\3\2\2\2\24\u0170\3\2\2\2\26\u0191"+
		"\3\2\2\2\30\u0193\3\2\2\2\32\u0199\3\2\2\2\34\u01a0\3\2\2\2\36\u01c7\3"+
		"\2\2\2 \u01e9\3\2\2\2\"\u01fa\3\2\2\2$\u01fc\3\2\2\2&\u0200\3\2\2\2(\u0239"+
		"\3\2\2\2*\u0268\3\2\2\2,\u0284\3\2\2\2.\u0286\3\2\2\2\60\u02ca\3\2\2\2"+
		"\62\u02e5\3\2\2\2\64\u02f1\3\2\2\2\66\u02f3\3\2\2\28\u0300\3\2\2\2:\u0319"+
		"\3\2\2\2<\u0332\3\2\2\2>\u0334\3\2\2\2@\u0342\3\2\2\2B\u0344\3\2\2\2D"+
		"\u034e\3\2\2\2F\u0363\3\2\2\2H\u0378\3\2\2\2J\u0385\3\2\2\2L\u0387\3\2"+
		"\2\2N\u038e\3\2\2\2P\u0393\3\2\2\2R\u03a7\3\2\2\2T\u03b1\3\2\2\2V\u03b3"+
		"\3\2\2\2X\u03d7\3\2\2\2Z\u03dd\3\2\2\2\\\u03e7\3\2\2\2^\u03f1\3\2\2\2"+
		"`\u0405\3\2\2\2b\u0407\3\2\2\2d\u0414\3\2\2\2f\u0416\3\2\2\2h\u0423\3"+
		"\2\2\2j\u0425\3\2\2\2l\u042c\3\2\2\2n\u043b\3\2\2\2p\u0443\3\2\2\2rs\5"+
		"\4\3\2st\7\2\2\3tu\b\2\1\2u\3\3\2\2\2vw\5\6\4\2wx\b\3\1\2x\u0084\3\2\2"+
		"\2yz\5\b\5\2z~\b\3\1\2{|\5\4\3\2|}\b\3\1\2}\177\3\2\2\2~{\3\2\2\2~\177"+
		"\3\2\2\2\177\u0084\3\2\2\2\u0080\u0081\5\n\6\2\u0081\u0082\b\3\1\2\u0082"+
		"\u0084\3\2\2\2\u0083v\3\2\2\2\u0083y\3\2\2\2\u0083\u0080\3\2\2\2\u0084"+
		"\5\3\2\2\2\u0085\u0086\7\n\2\2\u0086\u0087\7r\2\2\u0087\u008e\b\4\1\2"+
		"\u0088\u0089\5\30\r\2\u0089\u008a\b\4\1\2\u008a\u008f\3\2\2\2\u008b\u008c"+
		"\5\32\16\2\u008c\u008d\b\4\1\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2\2\2"+
		"\u008e\u008b\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092"+
		"\b\4\1\2\u0092\7\3\2\2\2\u0093\u0094\7\r\2\2\u0094\u0095\7r\2\2\u0095"+
		"\u0098\b\5\1\2\u0096\u0097\7\f\2\2\u0097\u0099\7r\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a0\b\5\1\2\u009b"+
		"\u009c\5\26\f\2\u009c\u009d\b\5\1\2\u009d\u009f\3\2\2\2\u009e\u009b\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a8\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\b\5"+
		"\1\2\u00a5\u00a7\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00e0\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae\7\32\2\2\u00ae"+
		"\u00b2\b\5\1\2\u00af\u00b0\5T+\2\u00b0\u00b1\b\5\1\2\u00b1\u00b3\3\2\2"+
		"\2\u00b2\u00af\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\7\33\2\2\u00b5\u00bb\b\5\1\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\b\5\1\2"+
		"\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c4\b\5\1\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\b\5\1\2\u00c1\u00c3\3"+
		"\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\36"+
		"\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\b\5\1\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2"+
		"\2\2\u00ce\u00cf\5\16\b\2\u00cf\u00d0\b\5\1\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6\u00d7\5\20\t\2\u00d7"+
		"\u00d8\7\13\2\2\u00d8\u00d9\b\5\1\2\u00d9\u00db\3\2\2\2\u00da\u00d5\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\13\2\2\u00dd"+
		"\u00de\b\5\1\2\u00de\u00e0\3\2\2\2\u00df\u0093\3\2\2\2\u00df\u00ab\3\2"+
		"\2\2\u00e0\t\3\2\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e7"+
		"\b\6\1\2\u00e4\u00e5\5\26\f\2\u00e5\u00e6\b\6\1\2\u00e6\u00e8\3\2\2\2"+
		"\u00e7\u00e4\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ee\3\2\2\2\u00e9\u00ea"+
		"\7\36\2\2\u00ea\u00eb\5\20\t\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed\b\6\1"+
		"\2\u00ed\u00ef\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3"+
		"\3\2\2\2\u00f0\u00f1\5\16\b\2\u00f1\u00f2\b\6\1\2\u00f2\u00f4\3\2\2\2"+
		"\u00f3\u00f0\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8\u00f9\5\20\t\2\u00f9"+
		"\u00fa\7\13\2\2\u00fa\u00fb\b\6\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f7\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\13\2\2\u00ff"+
		"\u0100\b\6\1\2\u0100\13\3\2\2\2\u0101\u0102\7\13\2\2\u0102\u0103\b\7\1"+
		"\2\u0103\u0138\b\7\1\2\u0104\u0105\7\24\2\2\u0105\u0106\7r\2\2\u0106\u0107"+
		"\b\7\1\2\u0107\u010b\7\32\2\2\u0108\u0109\5T+\2\u0109\u010a\b\7\1\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\7\33\2\2\u010e\u010f\b\7\1\2\u010f\u0110\5\20\t\2\u0110"+
		"\u0116\b\7\1\2\u0111\u0112\7\36\2\2\u0112\u0113\5\20\t\2\u0113\u0114\7"+
		"\13\2\2\u0114\u0115\b\7\1\2\u0115\u0117\3\2\2\2\u0116\u0111\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u011b\3\2\2\2\u0118\u011a\5\16\b\2\u0119\u0118\3"+
		"\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u0123\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7$\2\2\u011f\u0120\5\20"+
		"\t\2\u0120\u0121\7\13\2\2\u0121\u0122\b\7\1\2\u0122\u0124\3\2\2\2\u0123"+
		"\u011e\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\7\13"+
		"\2\2\u0126\u0128\7r\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\b\7\1\2\u012a\u0138\3\2\2\2\u012b\u012c\7\r"+
		"\2\2\u012c\u012d\7r\2\2\u012d\u012e\b\7\1\2\u012e\u0132\7\32\2\2\u012f"+
		"\u0130\5T+\2\u0130\u0131\b\7\1\2\u0131\u0133\3\2\2\2\u0132\u012f\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\33\2\2\u0135"+
		"\u0136\7^\2\2\u0136\u0138\b\7\1\2\u0137\u0101\3\2\2\2\u0137\u0104\3\2"+
		"\2\2\u0137\u012b\3\2\2\2\u0138\r\3\2\2\2\u0139\u013a\7(\2\2\u013a\u013b"+
		"\7r\2\2\u013b\u013c\7\32\2\2\u013c\u0140\b\b\1\2\u013d\u013e\5P)\2\u013e"+
		"\u013f\b\b\1\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\33\2\2\u0143\u0148\b\b\1\2\u0144"+
		"\u0145\7 \2\2\u0145\u0146\5J&\2\u0146\u0147\b\b\1\2\u0147\u0149\3\2\2"+
		"\2\u0148\u0144\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\5\20\t\2\u014b\u014c\b\b\1\2\u014c\u014d\7\13\2\2\u014d\u014e\b\b\1\2"+
		"\u014e\17\3\2\2\2\u014f\u0150\5\22\n\2\u0150\u0151\b\t\1\2\u0151\21\3"+
		"\2\2\2\u0152\u0153\b\n\1\2\u0153\u0157\b\n\1\2\u0154\u0155\5\24\13\2\u0155"+
		"\u0156\b\n\1\2\u0156\u0158\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0164\3\2\2\2\u0159\u015a\f\3\2\2\u015a\u015d\b\n\1\2\u015b"+
		"\u015c\7\3\2\2\u015c\u015e\b\n\1\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5\24\13\2\u0160\u0161\b\n\1\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0159\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\23\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168"+
		"\5\26\f\2\u0168\u0169\b\13\1\2\u0169\u0171\3\2\2\2\u016a\u016b\5\"\22"+
		"\2\u016b\u016c\b\13\1\2\u016c\u0171\3\2\2\2\u016d\u016e\5X-\2\u016e\u016f"+
		"\b\13\1\2\u016f\u0171\3\2\2\2\u0170\u0167\3\2\2\2\u0170\u016a\3\2\2\2"+
		"\u0170\u016d\3\2\2\2\u0171\25\3\2\2\2\u0172\u0173\5\30\r\2\u0173\u0177"+
		"\b\f\1\2\u0174\u0175\5\26\f\2\u0175\u0176\b\f\1\2\u0176\u0178\3\2\2\2"+
		"\u0177\u0174\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0192\3\2\2\2\u0179\u017a"+
		"\5\32\16\2\u017a\u017e\b\f\1\2\u017b\u017c\5\26\f\2\u017c\u017d\b\f\1"+
		"\2\u017d\u017f\3\2\2\2\u017e\u017b\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0192"+
		"\3\2\2\2\u0180\u0181\5\34\17\2\u0181\u0185\b\f\1\2\u0182\u0183\5\26\f"+
		"\2\u0183\u0184\b\f\1\2\u0184\u0186\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0192\3\2\2\2\u0187\u0188\5\36\20\2\u0188\u0189\b\f\1\2"+
		"\u0189\u0192\3\2\2\2\u018a\u018b\5 \21\2\u018b\u018f\b\f\1\2\u018c\u018d"+
		"\5\26\f\2\u018d\u018e\b\f\1\2\u018e\u0190\3\2\2\2\u018f\u018c\3\2\2\2"+
		"\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0172\3\2\2\2\u0191\u0179"+
		"\3\2\2\2\u0191\u0180\3\2\2\2\u0191\u0187\3\2\2\2\u0191\u018a\3\2\2\2\u0192"+
		"\27\3\2\2\2\u0193\u0194\7\37\2\2\u0194\u0195\7r\2\2\u0195\u0196\7f\2\2"+
		"\u0196\u0197\5X-\2\u0197\u0198\b\r\1\2\u0198\31\3\2\2\2\u0199\u019a\7"+
		"\64\2\2\u019a\u019b\7r\2\2\u019b\u019c\7n\2\2\u019c\u019d\5\62\32\2\u019d"+
		"\u019e\5L\'\2\u019e\u019f\b\16\1\2\u019f\33\3\2\2\2\u01a0\u01a1\7\61\2"+
		"\2\u01a1\u01a2\7r\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4\7\32\2\2\u01a4\u01a8"+
		"\b\17\1\2\u01a5\u01a6\5T+\2\u01a6\u01a7\b\17\1\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a5\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\7\33"+
		"\2\2\u01ab\u01b0\b\17\1\2\u01ac\u01ad\7 \2\2\u01ad\u01ae\5J&\2\u01ae\u01af"+
		"\b\17\1\2\u01af\u01b1\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b0\u01b1\3\2\2\2"+
		"\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b\17\1\2\u01b3\35\3\2\2\2\u01b4\u01b5"+
		"\7\17\2\2\u01b5\u01b6\5P)\2\u01b6\u01b7\7\4\2\2\u01b7\u01b8\5\62\32\2"+
		"\u01b8\u01bd\b\20\1\2\u01b9\u01ba\7f\2\2\u01ba\u01bb\5X-\2\u01bb\u01bc"+
		"\b\20\1\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01be\3\2\2\2"+
		"\u01be\u01bf\3\2\2\2\u01bf\u01c0\b\20\1\2\u01c0\u01c8\3\2\2\2\u01c1\u01c2"+
		"\7\17\2\2\u01c2\u01c3\5P)\2\u01c3\u01c4\7f\2\2\u01c4\u01c5\5X-\2\u01c5"+
		"\u01c6\b\20\1\2\u01c6\u01c8\3\2\2\2\u01c7\u01b4\3\2\2\2\u01c7\u01c1\3"+
		"\2\2\2\u01c8\37\3\2\2\2\u01c9\u01ca\7%\2\2\u01ca\u01cb\5P)\2\u01cb\u01cc"+
		"\5D#\2\u01cc\u01d1\b\21\1\2\u01cd\u01ce\7 \2\2\u01ce\u01cf\5J&\2\u01cf"+
		"\u01d0\b\21\1\2\u01d0\u01d2\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01d2\3"+
		"\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\b\21\1\2\u01d4\u01ea\3\2\2\2\u01d5"+
		"\u01d6\7%\2\2\u01d6\u01e5\b\21\1\2\u01d7\u01d8\5P)\2\u01d8\u01d9\b\21"+
		"\1\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01dd\7\4\2\2\u01dd\u01de\7r\2\2\u01de\u01e1\b\21"+
		"\1\2\u01df\u01e0\7\5\2\2\u01e0\u01e2\b\21\1\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01da\3\2\2\2\u01e4\u01e7\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01ea\b\21\1\2\u01e9\u01c9\3\2\2\2\u01e9\u01d5\3"+
		"\2\2\2\u01ea!\3\2\2\2\u01eb\u01ec\5(\25\2\u01ec\u01ed\b\22\1\2\u01ed\u01fb"+
		"\3\2\2\2\u01ee\u01ef\5*\26\2\u01ef\u01f0\b\22\1\2\u01f0\u01fb\3\2\2\2"+
		"\u01f1\u01f2\5,\27\2\u01f2\u01f3\b\22\1\2\u01f3\u01fb\3\2\2\2\u01f4\u01f5"+
		"\5\60\31\2\u01f5\u01f6\b\22\1\2\u01f6\u01fb\3\2\2\2\u01f7\u01f8\5$\23"+
		"\2\u01f8\u01f9\b\22\1\2\u01f9\u01fb\3\2\2\2\u01fa\u01eb\3\2\2\2\u01fa"+
		"\u01ee\3\2\2\2\u01fa\u01f1\3\2\2\2\u01fa\u01f4\3\2\2\2\u01fa\u01f7\3\2"+
		"\2\2\u01fb#\3\2\2\2\u01fc\u01fd\7\27\2\2\u01fd\u01fe\5&\24\2\u01fe\u01ff"+
		"\b\23\1\2\u01ff%\3\2\2\2\u0200\u0201\5X-\2\u0201\u0202\7\32\2\2\u0202"+
		"\u0206\b\24\1\2\u0203\u0204\5n8\2\u0204\u0205\b\24\1\2\u0205\u0207\3\2"+
		"\2\2\u0206\u0203\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\7\33\2\2\u0209\u020a\b\24\1\2\u020a\'\3\2\2\2\u020b\u020c\7\\\2"+
		"\2\u020c\u023a\b\25\1\2\u020d\u020e\5\36\20\2\u020e\u020f\7f\2\2\u020f"+
		"\u0210\5X-\2\u0210\u0211\b\25\1\2\u0211\u023a\3\2\2\2\u0212\u0213\5\36"+
		"\20\2\u0213\u0214\7h\2\2\u0214\u0215\b\25\1\2\u0215\u023a\3\2\2\2\u0216"+
		"\u0217\5\36\20\2\u0217\u0218\7i\2\2\u0218\u0219\b\25\1\2\u0219\u023a\3"+
		"\2\2\2\u021a\u021b\7\20\2\2\u021b\u021c\5\\/\2\u021c\u021d\7a\2\2\u021d"+
		"\u021f\5\20\t\2\u021e\u0220\7c\2\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0222\7\21\2\2\u0222\u0223\b\25\1\2\u0223"+
		"\u023a\3\2\2\2\u0224\u0225\7&\2\2\u0225\u0226\5\\/\2\u0226\u0227\7a\2"+
		"\2\u0227\u0229\5\20\t\2\u0228\u022a\7c\2\2\u0229\u0228\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7\'\2\2\u022c\u022d\b\25\1\2"+
		"\u022d\u023a\3\2\2\2\u022e\u022f\7\30\2\2\u022f\u0230\5d\63\2\u0230\u0231"+
		"\7a\2\2\u0231\u0232\5\20\t\2\u0232\u0233\7\31\2\2\u0233\u0234\b\25\1\2"+
		"\u0234\u023a\3\2\2\2\u0235\u0236\7:\2\2\u0236\u023a\b\25\1\2\u0237\u0238"+
		"\7;\2\2\u0238\u023a\b\25\1\2\u0239\u020b\3\2\2\2\u0239\u020d\3\2\2\2\u0239"+
		"\u0212\3\2\2\2\u0239\u0216\3\2\2\2\u0239\u021a\3\2\2\2\u0239\u0224\3\2"+
		"\2\2\u0239\u022e\3\2\2\2\u0239\u0235\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		")\3\2\2\2\u023b\u023e\b\26\1\2\u023c\u023d\7\27\2\2\u023d\u023f\b\26\1"+
		"\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241"+
		"\5 \21\2\u0241\u0245\b\26\1\2\u0242\u0243\5X-\2\u0243\u0244\b\26\1\2\u0244"+
		"\u0246\3\2\2\2\u0245\u0242\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0248\b\26\1\2\u0248\u0269\3\2\2\2\u0249\u024a\7,\2\2\u024a"+
		"\u024b\5&\24\2\u024b\u024c\b\26\1\2\u024c\u0269\3\2\2\2\u024d\u024e\7"+
		")\2\2\u024e\u0252\b\26\1\2\u024f\u0250\5b\62\2\u0250\u0251\b\26\1\2\u0251"+
		"\u0253\3\2\2\2\u0252\u024f\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0256\3\2"+
		"\2\2\u0254\u0255\7\27\2\2\u0255\u0257\b\26\1\2\u0256\u0254\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\5 \21\2\u0259\u025d\b\26"+
		"\1\2\u025a\u025b\5X-\2\u025b\u025c\b\26\1\2\u025c\u025e\3\2\2\2\u025d"+
		"\u025a\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0263\3\2\2\2\u025f\u0260\7a"+
		"\2\2\u0260\u0261\5\20\t\2\u0261\u0262\b\26\1\2\u0262\u0264\3\2\2\2\u0263"+
		"\u025f\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\7*"+
		"\2\2\u0266\u0267\b\26\1\2\u0267\u0269\3\2\2\2\u0268\u023b\3\2\2\2\u0268"+
		"\u0249\3\2\2\2\u0268\u024d\3\2\2\2\u0269+\3\2\2\2\u026a\u026b\7\25\2\2"+
		"\u026b\u0271\b\27\1\2\u026c\u026d\5.\30\2\u026d\u026e\b\27\1\2\u026e\u0270"+
		"\3\2\2\2\u026f\u026c\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7\26"+
		"\2\2\u0275\u0285\b\27\1\2\u0276\u0277\7/\2\2\u0277\u0278\5 \21\2\u0278"+
		"\u027c\b\27\1\2\u0279\u027a\5\36\20\2\u027a\u027b\b\27\1\2\u027b\u027d"+
		"\3\2\2\2\u027c\u0279\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u027f\b\27\1\2\u027f\u0285\3\2\2\2\u0280\u0281\7!\2\2\u0281\u0285\b\27"+
		"\1\2\u0282\u0283\7L\2\2\u0283\u0285\b\27\1\2\u0284\u026a\3\2\2\2\u0284"+
		"\u0276\3\2\2\2\u0284\u0280\3\2\2\2\u0284\u0282\3\2\2\2\u0285-\3\2\2\2"+
		"\u0286\u028a\b\30\1\2\u0287\u0288\5b\62\2\u0288\u0289\b\30\1\2\u0289\u028b"+
		"\3\2\2\2\u028a\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\5p9\2\u028d\u0291\b\30\1\2\u028e\u028f\5N(\2\u028f\u0290\b\30\1"+
		"\2\u0290\u0292\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293\u0294\7\32\2\2\u0294\u0298\b\30\1\2\u0295\u0296\5H%\2\u0296"+
		"\u0297\b\30\1\2\u0297\u0299\3\2\2\2\u0298\u0295\3\2\2\2\u0298\u0299\3"+
		"\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\7\33\2\2\u029b\u02a0\b\30\1\2\u029c"+
		"\u029d\7\6\2\2\u029d\u029e\5\\/\2\u029e\u029f\b\30\1\2\u029f\u02a1\3\2"+
		"\2\2\u02a0\u029c\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a6\3\2\2\2\u02a2"+
		"\u02a3\7\62\2\2\u02a3\u02a4\5X-\2\u02a4\u02a5\b\30\1\2\u02a5\u02a7\3\2"+
		"\2\2\u02a6\u02a2\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02ac\3\2\2\2\u02a8"+
		"\u02a9\7 \2\2\u02a9\u02aa\5J&\2\u02aa\u02ab\b\30\1\2\u02ab\u02ad\3\2\2"+
		"\2\u02ac\u02a8\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af"+
		"\7a\2\2\u02af\u02b0\5\20\t\2\u02b0\u02b2\b\30\1\2\u02b1\u02b3\7c\2\2\u02b2"+
		"\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3/\3\2\2\2\u02b4\u02b5\7r\2\2\u02b5"+
		"\u02b6\7f\2\2\u02b6\u02b7\7\60\2\2\u02b7\u02b8\7r\2\2\u02b8\u02b9\7\32"+
		"\2\2\u02b9\u02bd\b\31\1\2\u02ba\u02bb\5n8\2\u02bb\u02bc\b\31\1\2\u02bc"+
		"\u02be\3\2\2\2\u02bd\u02ba\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2"+
		"\2\2\u02bf\u02c0\7\33\2\2\u02c0\u02c4\b\31\1\2\u02c1\u02c2\7E\2\2\u02c2"+
		"\u02c3\7r\2\2\u02c3\u02c5\b\31\1\2\u02c4\u02c1\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02cb\3\2\2\2\u02c6\u02c7\7-\2\2\u02c7\u02c8\5X-\2\u02c8\u02c9"+
		"\b\31\1\2\u02c9\u02cb\3\2\2\2\u02ca\u02b4\3\2\2\2\u02ca\u02c6\3\2\2\2"+
		"\u02cb\61\3\2\2\2\u02cc\u02cd\5\64\33\2\u02cd\u02ce\b\32\1\2\u02ce\u02e6"+
		"\3\2\2\2\u02cf\u02d0\5\66\34\2\u02d0\u02d1\b\32\1\2\u02d1\u02e6\3\2\2"+
		"\2\u02d2\u02d3\58\35\2\u02d3\u02d4\b\32\1\2\u02d4\u02e6\3\2\2\2\u02d5"+
		"\u02d6\5:\36\2\u02d6\u02d7\b\32\1\2\u02d7\u02e6\3\2\2\2\u02d8\u02d9\5"+
		"<\37\2\u02d9\u02da\b\32\1\2\u02da\u02e6\3\2\2\2\u02db\u02dc\5> \2\u02dc"+
		"\u02e0\b\32\1\2\u02dd\u02de\5\62\32\2\u02de\u02df\b\32\1\2\u02df\u02e1"+
		"\3\2\2\2\u02e0\u02dd\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e6\3\2\2\2\u02e2"+
		"\u02e3\5p9\2\u02e3\u02e4\b\32\1\2\u02e4\u02e6\3\2\2\2\u02e5\u02cc\3\2"+
		"\2\2\u02e5\u02cf\3\2\2\2\u02e5\u02d2\3\2\2\2\u02e5\u02d5\3\2\2\2\u02e5"+
		"\u02d8\3\2\2\2\u02e5\u02db\3\2\2\2\u02e5\u02e2\3\2\2\2\u02e6\63\3\2\2"+
		"\2\u02e7\u02e8\7\66\2\2\u02e8\u02f2\b\33\1\2\u02e9\u02ea\7N\2\2\u02ea"+
		"\u02f2\b\33\1\2\u02eb\u02ec\7\16\2\2\u02ec\u02f2\b\33\1\2\u02ed\u02ee"+
		"\7<\2\2\u02ee\u02f2\b\33\1\2\u02ef\u02f0\7D\2\2\u02f0\u02f2\b\33\1\2\u02f1"+
		"\u02e7\3\2\2\2\u02f1\u02e9\3\2\2\2\u02f1\u02eb\3\2\2\2\u02f1\u02ed\3\2"+
		"\2\2\u02f1\u02ef\3\2\2\2\u02f2\65\3\2\2\2\u02f3\u02f4\7T\2\2\u02f4\u02f5"+
		"\7\32\2\2\u02f5\u02f6\5H%\2\u02f6\u02f7\7\33\2\2\u02f7\u02f8\b\34\1\2"+
		"\u02f8\67\3\2\2\2\u02f9\u02fa\7W\2\2\u02fa\u02fb\5\32\16\2\u02fb\u02fc"+
		"\b\35\1\2\u02fc\u0301\3\2\2\2\u02fd\u02fe\7W\2\2\u02fe\u02ff\7U\2\2\u02ff"+
		"\u0301\b\35\1\2\u0300\u02f9\3\2\2\2\u0300\u02fd\3\2\2\2\u03019\3\2\2\2"+
		"\u0302\u0303\7V\2\2\u0303\u0304\7\32\2\2\u0304\u0305\5P)\2\u0305\u0306"+
		"\7\4\2\2\u0306\u0307\5\62\32\2\u0307\u030c\b\36\1\2\u0308\u0309\7f\2\2"+
		"\u0309\u030a\5X-\2\u030a\u030b\b\36\1\2\u030b\u030d\3\2\2\2\u030c\u0308"+
		"\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\7\33\2\2"+
		"\u030f\u0310\b\36\1\2\u0310\u031a\3\2\2\2\u0311\u0312\7V\2\2\u0312\u0313"+
		"\7\32\2\2\u0313\u0314\5P)\2\u0314\u0315\7f\2\2\u0315\u0316\5X-\2\u0316"+
		"\u0317\7\33\2\2\u0317\u0318\b\36\1\2\u0318\u031a\3\2\2\2\u0319\u0302\3"+
		"\2\2\2\u0319\u0311\3\2\2\2\u031a;\3\2\2\2\u031b\u031c\7X\2\2\u031c\u031d"+
		"\7\32\2\2\u031d\u031e\5P)\2\u031e\u031f\7\4\2\2\u031f\u0320\5\62\32\2"+
		"\u0320\u0325\b\37\1\2\u0321\u0322\7f\2\2\u0322\u0323\5X-\2\u0323\u0324"+
		"\b\37\1\2\u0324\u0326\3\2\2\2\u0325\u0321\3\2\2\2\u0325\u0326\3\2\2\2"+
		"\u0326\u0327\3\2\2\2\u0327\u0328\7\33\2\2\u0328\u0329\b\37\1\2\u0329\u0333"+
		"\3\2\2\2\u032a\u032b\7X\2\2\u032b\u032c\7\32\2\2\u032c\u032d\5P)\2\u032d"+
		"\u032e\7f\2\2\u032e\u032f\5X-\2\u032f\u0330\7\33\2\2\u0330\u0331\b\37"+
		"\1\2\u0331\u0333\3\2\2\2\u0332\u031b\3\2\2\2\u0332\u032a\3\2\2\2\u0333"+
		"=\3\2\2\2\u0334\u0335\7+\2\2\u0335\u0336\5@!\2\u0336\u0337\b \1\2\u0337"+
		"?\3\2\2\2\u0338\u0339\5p9\2\u0339\u033a\b!\1\2\u033a\u0343\3\2\2\2\u033b"+
		"\u033c\5D#\2\u033c\u033d\b!\1\2\u033d\u0343\3\2\2\2\u033e\u033f\7Z\2\2"+
		"\u033f\u0343\b!\1\2\u0340\u0341\7Y\2\2\u0341\u0343\b!\1\2\u0342\u0338"+
		"\3\2\2\2\u0342\u033b\3\2\2\2\u0342\u033e\3\2\2\2\u0342\u0340\3\2\2\2\u0343"+
		"A\3\2\2\2\u0344\u0345\7\32\2\2\u0345\u0346\5T+\2\u0346\u0347\7\33\2\2"+
		"\u0347\u034c\b\"\1\2\u0348\u0349\7 \2\2\u0349\u034a\5J&\2\u034a\u034b"+
		"\b\"\1\2\u034b\u034d\3\2\2\2\u034c\u0348\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"C\3\2\2\2\u034e\u034f\5B\"\2\u034f\u0355\b#\1\2\u0350\u0351\7d\2\2\u0351"+
		"\u0352\5F$\2\u0352\u0353\7e\2\2\u0353\u0354\b#\1\2\u0354\u0356\3\2\2\2"+
		"\u0355\u0350\3\2\2\2\u0355\u0356\3\2\2\2\u0356E\3\2\2\2\u0357\u0358\7"+
		"\27\2\2\u0358\u0364\b$\1\2\u0359\u035a\7,\2\2\u035a\u0364\b$\1\2\u035b"+
		"\u035c\7\27\2\2\u035c\u035d\7\5\2\2\u035d\u035e\7,\2\2\u035e\u0364\b$"+
		"\1\2\u035f\u0360\7,\2\2\u0360\u0361\7\5\2\2\u0361\u0362\7\27\2\2\u0362"+
		"\u0364\b$\1\2\u0363\u0357\3\2\2\2\u0363\u0359\3\2\2\2\u0363\u035b\3\2"+
		"\2\2\u0363\u035f\3\2\2\2\u0364G\3\2\2\2\u0365\u0366\5X-\2\u0366\u0367"+
		"\b%\1\2\u0367\u0379\3\2\2\2\u0368\u036e\b%\1\2\u0369\u036a\5X-\2\u036a"+
		"\u036b\7\5\2\2\u036b\u036c\5H%\2\u036c\u036d\b%\1\2\u036d\u036f\3\2\2"+
		"\2\u036e\u0369\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0379\3\2\2\2\u0370\u0376"+
		"\b%\1\2\u0371\u0372\5X-\2\u0372\u0373\7\4\2\2\u0373\u0374\5H%\2\u0374"+
		"\u0375\b%\1\2\u0375\u0377\3\2\2\2\u0376\u0371\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u0379\3\2\2\2\u0378\u0365\3\2\2\2\u0378\u0368\3\2\2\2\u0378"+
		"\u0370\3\2\2\2\u0379I\3\2\2\2\u037a\u037b\5\62\32\2\u037b\u037c\b&\1\2"+
		"\u037c\u0386\3\2\2\2\u037d\u0383\b&\1\2\u037e\u037f\5H%\2\u037f\u0380"+
		"\7\4\2\2\u0380\u0381\5\62\32\2\u0381\u0382\b&\1\2\u0382\u0384\3\2\2\2"+
		"\u0383\u037e\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u037a"+
		"\3\2\2\2\u0385\u037d\3\2\2\2\u0386K\3\2\2\2\u0387\u038c\b\'\1\2\u0388"+
		"\u0389\7d\2\2\u0389\u038a\7r\2\2\u038a\u038b\7e\2\2\u038b\u038d\b\'\1"+
		"\2\u038c\u0388\3\2\2\2\u038c\u038d\3\2\2\2\u038dM\3\2\2\2\u038e\u038f"+
		"\7\34\2\2\u038f\u0390\5H%\2\u0390\u0391\7\35\2\2\u0391\u0392\b(\1\2\u0392"+
		"O\3\2\2\2\u0393\u0394\b)\1\2\u0394\u0395\5R*\2\u0395\u0396\b)\1\2\u0396"+
		"\u039e\3\2\2\2\u0397\u0398\f\3\2\2\u0398\u0399\7\5\2\2\u0399\u039a\5R"+
		"*\2\u039a\u039b\b)\1\2\u039b\u039d\3\2\2\2\u039c\u0397\3\2\2\2\u039d\u03a0"+
		"\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039fQ\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a1\u03a2\7r\2\2\u03a2\u03a8\b*\1\2\u03a3\u03a4\7r\2"+
		"\2\u03a4\u03a5\5N(\2\u03a5\u03a6\b*\1\2\u03a6\u03a8\3\2\2\2\u03a7\u03a1"+
		"\3\2\2\2\u03a7\u03a3\3\2\2\2\u03a8S\3\2\2\2\u03a9\u03aa\5V,\2\u03aa\u03ab"+
		"\b+\1\2\u03ab\u03b2\3\2\2\2\u03ac\u03ad\5V,\2\u03ad\u03ae\7\3\2\2\u03ae"+
		"\u03af\5T+\2\u03af\u03b0\b+\1\2\u03b0\u03b2\3\2\2\2\u03b1\u03a9\3\2\2"+
		"\2\u03b1\u03ac\3\2\2\2\u03b2U\3\2\2\2\u03b3\u03b4\5P)\2\u03b4\u03b5\7"+
		"\4\2\2\u03b5\u03b6\5\62\32\2\u03b6\u03b7\b,\1\2\u03b7W\3\2\2\2\u03b8\u03b9"+
		"\5\\/\2\u03b9\u03ba\5Z.\2\u03ba\u03bb\5X-\2\u03bb\u03bc\b-\1\2\u03bc\u03d8"+
		"\3\2\2\2\u03bd\u03be\7\7\2\2\u03be\u03bf\5\\/\2\u03bf\u03c0\b-\1\2\u03c0"+
		"\u03d8\3\2\2\2\u03c1\u03c2\5\\/\2\u03c2\u03c3\b-\1\2\u03c3\u03d8\3\2\2"+
		"\2\u03c4\u03c5\5\\/\2\u03c5\u03c6\7f\2\2\u03c6\u03c7\5X-\2\u03c7\u03c8"+
		"\b-\1\2\u03c8\u03d8\3\2\2\2\u03c9\u03cc\b-\1\2\u03ca\u03cb\7r\2\2\u03cb"+
		"\u03cd\b-\1\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2"+
		"\2\2\u03ce\u03cf\7\32\2\2\u03cf\u03d3\b-\1\2\u03d0\u03d1\5n8\2\u03d1\u03d2"+
		"\b-\1\2\u03d2\u03d4\3\2\2\2\u03d3\u03d0\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u03d6\7\33\2\2\u03d6\u03d8\b-\1\2\u03d7\u03b8\3\2"+
		"\2\2\u03d7\u03bd\3\2\2\2\u03d7\u03c1\3\2\2\2\u03d7\u03c4\3\2\2\2\u03d7"+
		"\u03c9\3\2\2\2\u03d8Y\3\2\2\2\u03d9\u03da\7\6\2\2\u03da\u03de\b.\1\2\u03db"+
		"\u03dc\7\b\2\2\u03dc\u03de\b.\1\2\u03dd\u03d9\3\2\2\2\u03dd\u03db\3\2"+
		"\2\2\u03de[\3\2\2\2\u03df\u03e0\5^\60\2\u03e0\u03e1\7n\2\2\u03e1\u03e2"+
		"\5^\60\2\u03e2\u03e3\b/\1\2\u03e3\u03e8\3\2\2\2\u03e4\u03e5\5^\60\2\u03e5"+
		"\u03e6\b/\1\2\u03e6\u03e8\3\2\2\2\u03e7\u03df\3\2\2\2\u03e7\u03e4\3\2"+
		"\2\2\u03e8]\3\2\2\2\u03e9\u03ea\5`\61\2\u03ea\u03eb\7m\2\2\u03eb\u03ec"+
		"\5^\60\2\u03ec\u03ed\b\60\1\2\u03ed\u03f2\3\2\2\2\u03ee\u03ef\5`\61\2"+
		"\u03ef\u03f0\b\60\1\2\u03f0\u03f2\3\2\2\2\u03f1\u03e9\3\2\2\2\u03f1\u03ee"+
		"\3\2\2\2\u03f2_\3\2\2\2\u03f3\u03f4\7r\2\2\u03f4\u0406\b\61\1\2\u03f5"+
		"\u03f6\7b\2\2\u03f6\u0406\b\61\1\2\u03f7\u03f8\7G\2\2\u03f8\u0406\b\61"+
		"\1\2\u03f9\u03fa\7P\2\2\u03fa\u0406\b\61\1\2\u03fb\u03fc\5P)\2\u03fc\u03fd"+
		"\b\61\1\2\u03fd\u0406\3\2\2\2\u03fe\u03ff\5p9\2\u03ff\u0400\b\61\1\2\u0400"+
		"\u0406\3\2\2\2\u0401\u0402\7o\2\2\u0402\u0406\b\61\1\2\u0403\u0404\7\65"+
		"\2\2\u0404\u0406\b\61\1\2\u0405\u03f3\3\2\2\2\u0405\u03f5\3\2\2\2\u0405"+
		"\u03f7\3\2\2\2\u0405\u03f9\3\2\2\2\u0405\u03fb\3\2\2\2\u0405\u03fe\3\2"+
		"\2\2\u0405\u0401\3\2\2\2\u0405\u0403\3\2\2\2\u0406a\3\2\2\2\u0407\u0408"+
		"\7\32\2\2\u0408\u0409\5d\63\2\u0409\u040a\7\33\2\2\u040a\u040b\b\62\1"+
		"\2\u040bc\3\2\2\2\u040c\u040d\5f\64\2\u040d\u040e\b\63\1\2\u040e\u0415"+
		"\3\2\2\2\u040f\u0410\5f\64\2\u0410\u0411\7\5\2\2\u0411\u0412\5d\63\2\u0412"+
		"\u0413\b\63\1\2\u0413\u0415\3\2\2\2\u0414\u040c\3\2\2\2\u0414\u040f\3"+
		"\2\2\2\u0415e\3\2\2\2\u0416\u0417\7r\2\2\u0417\u0418\7f\2\2\u0418\u0419"+
		"\5X-\2\u0419\u041a\5h\65\2\u041a\u041b\5X-\2\u041b\u041c\5j\66\2\u041c"+
		"\u041d\5l\67\2\u041d\u041e\b\64\1\2\u041eg\3\2\2\2\u041f\u0420\7\"\2\2"+
		"\u0420\u0424\b\65\1\2\u0421\u0422\7#\2\2\u0422\u0424\b\65\1\2\u0423\u041f"+
		"\3\2\2\2\u0423\u0421\3\2\2\2\u0424i\3\2\2\2\u0425\u042a\b\66\1\2\u0426"+
		"\u0427\7\62\2\2\u0427\u0428\5X-\2\u0428\u0429\b\66\1\2\u0429\u042b\3\2"+
		"\2\2\u042a\u0426\3\2\2\2\u042a\u042b\3\2\2\2\u042bk\3\2\2\2\u042c\u0431"+
		"\b\67\1\2\u042d\u042e\7\63\2\2\u042e\u042f\5X-\2\u042f\u0430\b\67\1\2"+
		"\u0430\u0432\3\2\2\2\u0431\u042d\3\2\2\2\u0431\u0432\3\2\2\2\u0432m\3"+
		"\2\2\2\u0433\u0434\5X-\2\u0434\u0435\b8\1\2\u0435\u043c\3\2\2\2\u0436"+
		"\u0437\5X-\2\u0437\u0438\7\5\2\2\u0438\u0439\5n8\2\u0439\u043a\b8\1\2"+
		"\u043a\u043c\3\2\2\2\u043b\u0433\3\2\2\2\u043b\u0436\3\2\2\2\u043co\3"+
		"\2\2\2\u043d\u043e\7r\2\2\u043e\u0444\b9\1\2\u043f\u0440\7r\2\2\u0440"+
		"\u0441\7\t\2\2\u0441\u0442\7r\2\2\u0442\u0444\b9\1\2\u0443\u043d\3\2\2"+
		"\2\u0443\u043f\3\2\2\2\u0444q\3\2\2\2i~\u0083\u008e\u0098\u00a0\u00a8"+
		"\u00b2\u00bb\u00c4\u00cc\u00d3\u00da\u00df\u00e7\u00ee\u00f5\u00fc\u010b"+
		"\u0116\u011b\u0123\u0127\u0132\u0137\u0140\u0148\u0157\u015d\u0164\u0170"+
		"\u0177\u017e\u0185\u018f\u0191\u01a8\u01b0\u01bd\u01c7\u01d1\u01da\u01e1"+
		"\u01e5\u01e9\u01fa\u0206\u021f\u0229\u0239\u023e\u0245\u0252\u0256\u025d"+
		"\u0263\u0268\u0271\u027c\u0284\u028a\u0291\u0298\u02a0\u02a6\u02ac\u02b2"+
		"\u02bd\u02c4\u02ca\u02e0\u02e5\u02f1\u0300\u030c\u0319\u0325\u0332\u0342"+
		"\u034c\u0355\u0363\u036e\u0376\u0378\u0383\u0385\u038c\u039e\u03a7\u03b1"+
		"\u03cc\u03d3\u03d7\u03dd\u03e7\u03f1\u0405\u0414\u0423\u042a\u0431\u043b"+
		"\u0443";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
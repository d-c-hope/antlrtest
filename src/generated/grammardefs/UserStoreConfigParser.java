// Generated from grammardefs/UserStoreConfig.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UserStoreConfigParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DEF=8, ENDDEF=9, 
		META=10, ENDMETA=11, HMETHOD=12, DIGITS=13, STRING=14, WS=15, NEWLINE=16;
	public static final int
		RULE_userstoredesc = 0, RULE_items = 1, RULE_pathline = 2, RULE_path = 3, 
		RULE_pathsegments = 4, RULE_labelid = 5, RULE_labelidname = 6, RULE_methods = 7, 
		RULE_docref = 8, RULE_label = 9, RULE_object = 10, RULE_objectproperties = 11, 
		RULE_objname = 12, RULE_name = 13, RULE_type = 14, RULE_validator = 15, 
		RULE_metasection = 16, RULE_metaproperties = 17, RULE_value = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"userstoredesc", "items", "pathline", "path", "pathsegments", "labelid", 
			"labelidname", "methods", "docref", "label", "object", "objectproperties", 
			"objname", "name", "type", "validator", "metasection", "metaproperties", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'<'", "'>'", "'('", "','", "')'", "':'", "'def'", "'enddef'", 
			"'meta'", "'endmeta'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DEF", "ENDDEF", "META", 
			"ENDMETA", "HMETHOD", "DIGITS", "STRING", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "UserStoreConfig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UserStoreConfigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class UserstoredescContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UserStoreConfigParser.EOF, 0); }
		public UserstoredescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userstoredesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterUserstoredesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitUserstoredesc(this);
		}
	}

	public final UserstoredescContext userstoredesc() throws RecognitionException {
		UserstoredescContext _localctx = new UserstoredescContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_userstoredesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			items();
			setState(39);
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

	public static class ItemsContext extends ParserRuleContext {
		public PathlineContext pathline() {
			return getRuleContext(PathlineContext.class,0);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(UserStoreConfigParser.NEWLINE, 0); }
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitItems(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_items);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				pathline();
				setState(42);
				items();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				object();
				setState(45);
				items();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(NEWLINE);
				setState(48);
				items();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class PathlineContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public DocrefContext docref() {
			return getRuleContext(DocrefContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(UserStoreConfigParser.NEWLINE, 0); }
		public TerminalNode WS() { return getToken(UserStoreConfigParser.WS, 0); }
		public PathlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterPathline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitPathline(this);
		}
	}

	public final PathlineContext pathline() throws RecognitionException {
		PathlineContext _localctx = new PathlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pathline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			path();
			setState(53);
			methods();
			setState(54);
			docref();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(55);
				match(WS);
				}
			}

			setState(58);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public PathsegmentsContext pathsegments() {
			return getRuleContext(PathsegmentsContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			pathsegments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathsegmentsContext extends ParserRuleContext {
		public PathsegmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathsegments; }
	 
		public PathsegmentsContext() { }
		public void copyFrom(PathsegmentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SINGLELABELContext extends PathsegmentsContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public SINGLELABELContext(PathsegmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterSINGLELABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitSINGLELABEL(this);
		}
	}
	public static class LABELIDPAIRContext extends PathsegmentsContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabelidContext labelid() {
			return getRuleContext(LabelidContext.class,0);
		}
		public PathsegmentsContext pathsegments() {
			return getRuleContext(PathsegmentsContext.class,0);
		}
		public LABELIDPAIRContext(PathsegmentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterLABELIDPAIR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitLABELIDPAIR(this);
		}
	}

	public final PathsegmentsContext pathsegments() throws RecognitionException {
		PathsegmentsContext _localctx = new PathsegmentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pathsegments);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new LABELIDPAIRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__0);
				setState(63);
				label();
				setState(64);
				match(T__0);
				setState(65);
				labelid();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(66);
					pathsegments();
					}
				}

				}
				break;
			case 2:
				_localctx = new SINGLELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__0);
				setState(70);
				label();
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

	public static class LabelidContext extends ParserRuleContext {
		public LabelidnameContext labelidname() {
			return getRuleContext(LabelidnameContext.class,0);
		}
		public LabelidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterLabelid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitLabelid(this);
		}
	}

	public final LabelidContext labelid() throws RecognitionException {
		LabelidContext _localctx = new LabelidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labelid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__1);
			setState(74);
			labelidname();
			setState(75);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelidnameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public LabelidnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelidname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterLabelidname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitLabelidname(this);
		}
	}

	public final LabelidnameContext labelidname() throws RecognitionException {
		LabelidnameContext _localctx = new LabelidnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_labelidname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodsContext extends ParserRuleContext {
		public List<TerminalNode> HMETHOD() { return getTokens(UserStoreConfigParser.HMETHOD); }
		public TerminalNode HMETHOD(int i) {
			return getToken(UserStoreConfigParser.HMETHOD, i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitMethods(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__3);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(HMETHOD);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(81);
					match(T__4);
					}
				}

				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HMETHOD );
			setState(88);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocrefContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public DocrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterDocref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitDocref(this);
		}
	}

	public final DocrefContext docref() throws RecognitionException {
		DocrefContext _localctx = new DocrefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_docref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(UserStoreConfigParser.DEF, 0); }
		public ObjnameContext objname() {
			return getRuleContext(ObjnameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(UserStoreConfigParser.NEWLINE, 0); }
		public TerminalNode ENDDEF() { return getToken(UserStoreConfigParser.ENDDEF, 0); }
		public List<ObjectpropertiesContext> objectproperties() {
			return getRuleContexts(ObjectpropertiesContext.class);
		}
		public ObjectpropertiesContext objectproperties(int i) {
			return getRuleContext(ObjectpropertiesContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(DEF);
			setState(95);
			objname();
			setState(96);
			match(NEWLINE);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				objectproperties();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==META || _la==STRING );
			setState(102);
			match(ENDDEF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectpropertiesContext extends ParserRuleContext {
		public MetasectionContext metasection() {
			return getRuleContext(MetasectionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(UserStoreConfigParser.NEWLINE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValidatorContext validator() {
			return getRuleContext(ValidatorContext.class,0);
		}
		public ObjectpropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectproperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterObjectproperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitObjectproperties(this);
		}
	}

	public final ObjectpropertiesContext objectproperties() throws RecognitionException {
		ObjectpropertiesContext _localctx = new ObjectpropertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectproperties);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				metasection();
				setState(105);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				name();
				setState(108);
				type();
				setState(109);
				validator();
				setState(110);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				name();
				setState(113);
				type();
				setState(114);
				match(NEWLINE);
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

	public static class ObjnameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public ObjnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterObjname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitObjname(this);
		}
	}

	public final ObjnameContext objname() throws RecognitionException {
		ObjnameContext _localctx = new ObjnameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidatorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public ValidatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterValidator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitValidator(this);
		}
	}

	public final ValidatorContext validator() throws RecognitionException {
		ValidatorContext _localctx = new ValidatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_validator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetasectionContext extends ParserRuleContext {
		public TerminalNode META() { return getToken(UserStoreConfigParser.META, 0); }
		public TerminalNode NEWLINE() { return getToken(UserStoreConfigParser.NEWLINE, 0); }
		public TerminalNode ENDMETA() { return getToken(UserStoreConfigParser.ENDMETA, 0); }
		public List<MetapropertiesContext> metaproperties() {
			return getRuleContexts(MetapropertiesContext.class);
		}
		public MetapropertiesContext metaproperties(int i) {
			return getRuleContext(MetapropertiesContext.class,i);
		}
		public MetasectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metasection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterMetasection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitMetasection(this);
		}
	}

	public final MetasectionContext metasection() throws RecognitionException {
		MetasectionContext _localctx = new MetasectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_metasection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(META);
			setState(127);
			match(NEWLINE);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				metaproperties();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(133);
			match(ENDMETA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetapropertiesContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(UserStoreConfigParser.NEWLINE, 0); }
		public MetapropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaproperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterMetaproperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitMetaproperties(this);
		}
	}

	public final MetapropertiesContext metaproperties() throws RecognitionException {
		MetapropertiesContext _localctx = new MetapropertiesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_metaproperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			name();
			setState(136);
			match(T__6);
			setState(137);
			value();
			setState(138);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\65\n\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\5\6F\n\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\tU\n"+
		"\t\6\tW\n\t\r\t\16\tX\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\6\fe\n"+
		"\f\r\f\16\ff\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\rw\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\6\22\u0084"+
		"\n\22\r\22\16\22\u0085\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u0089\2("+
		"\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b>\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16"+
		"O\3\2\2\2\20Q\3\2\2\2\22\\\3\2\2\2\24^\3\2\2\2\26`\3\2\2\2\30v\3\2\2\2"+
		"\32x\3\2\2\2\34z\3\2\2\2\36|\3\2\2\2 ~\3\2\2\2\"\u0080\3\2\2\2$\u0089"+
		"\3\2\2\2&\u008e\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+,\5\6\4\2,-\5\4"+
		"\3\2-\65\3\2\2\2./\5\26\f\2/\60\5\4\3\2\60\65\3\2\2\2\61\62\7\22\2\2\62"+
		"\65\5\4\3\2\63\65\3\2\2\2\64+\3\2\2\2\64.\3\2\2\2\64\61\3\2\2\2\64\63"+
		"\3\2\2\2\65\5\3\2\2\2\66\67\5\b\5\2\678\5\20\t\28:\5\22\n\29;\7\21\2\2"+
		":9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\22\2\2=\7\3\2\2\2>?\5\n\6\2?\t\3\2"+
		"\2\2@A\7\3\2\2AB\5\24\13\2BC\7\3\2\2CE\5\f\7\2DF\5\n\6\2ED\3\2\2\2EF\3"+
		"\2\2\2FJ\3\2\2\2GH\7\3\2\2HJ\5\24\13\2I@\3\2\2\2IG\3\2\2\2J\13\3\2\2\2"+
		"KL\7\4\2\2LM\5\16\b\2MN\7\5\2\2N\r\3\2\2\2OP\7\20\2\2P\17\3\2\2\2QV\7"+
		"\6\2\2RT\7\16\2\2SU\7\7\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VR\3\2\2\2WX"+
		"\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\b\2\2[\21\3\2\2\2\\]\7\20\2"+
		"\2]\23\3\2\2\2^_\7\20\2\2_\25\3\2\2\2`a\7\n\2\2ab\5\32\16\2bd\7\22\2\2"+
		"ce\5\30\r\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\13\2"+
		"\2i\27\3\2\2\2jk\5\"\22\2kl\7\22\2\2lw\3\2\2\2mn\5\34\17\2no\5\36\20\2"+
		"op\5 \21\2pq\7\22\2\2qw\3\2\2\2rs\5\34\17\2st\5\36\20\2tu\7\22\2\2uw\3"+
		"\2\2\2vj\3\2\2\2vm\3\2\2\2vr\3\2\2\2w\31\3\2\2\2xy\7\20\2\2y\33\3\2\2"+
		"\2z{\7\20\2\2{\35\3\2\2\2|}\7\20\2\2}\37\3\2\2\2~\177\7\20\2\2\177!\3"+
		"\2\2\2\u0080\u0081\7\f\2\2\u0081\u0083\7\22\2\2\u0082\u0084\5$\23\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\r\2\2\u0088#\3\2\2\2\u0089\u008a"+
		"\5\34\17\2\u008a\u008b\7\t\2\2\u008b\u008c\5&\24\2\u008c\u008d\7\22\2"+
		"\2\u008d%\3\2\2\2\u008e\u008f\7\20\2\2\u008f\'\3\2\2\2\13\64:EITXfv\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
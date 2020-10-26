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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DEF=7, ENDDEF=8, META=9, 
		ENDMETA=10, HMETHOD=11, DIGITS=12, STRING=13, WS=14, NEWLINE=15;
	public static final int
		RULE_userstoredesc = 0, RULE_items = 1, RULE_pathline = 2, RULE_path = 3, 
		RULE_pathsegments = 4, RULE_labelid = 5, RULE_methods = 6, RULE_docref = 7, 
		RULE_label = 8, RULE_object = 9, RULE_objectproperties = 10, RULE_objname = 11, 
		RULE_name = 12, RULE_type = 13, RULE_validator = 14, RULE_metasection = 15, 
		RULE_metaproperties = 16, RULE_value = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"userstoredesc", "items", "pathline", "path", "pathsegments", "labelid", 
			"methods", "docref", "label", "object", "objectproperties", "objname", 
			"name", "type", "validator", "metasection", "metaproperties", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'<id>'", "'('", "','", "')'", "':'", "'def'", "'enddef'", 
			"'meta'", "'endmeta'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "DEF", "ENDDEF", "META", "ENDMETA", 
			"HMETHOD", "DIGITS", "STRING", "WS", "NEWLINE"
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
			setState(36);
			items();
			setState(37);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				pathline();
				setState(40);
				items();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				object();
				setState(43);
				items();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(NEWLINE);
				setState(46);
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
			setState(50);
			path();
			setState(51);
			methods();
			setState(52);
			docref();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(53);
				match(WS);
				}
			}

			setState(56);
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
			setState(58);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new LABELIDPAIRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__0);
				setState(61);
				label();
				setState(62);
				match(T__0);
				setState(63);
				labelid();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(64);
					pathsegments();
					}
				}

				}
				break;
			case 2:
				_localctx = new SINGLELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__0);
				setState(68);
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
			setState(71);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				match(HMETHOD);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(75);
					match(T__3);
					}
				}

				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HMETHOD );
			setState(82);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 14, RULE_docref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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
		enterRule(_localctx, 16, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 18, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DEF);
			setState(89);
			objname();
			setState(90);
			match(NEWLINE);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				objectproperties();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==META || _la==STRING );
			setState(96);
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
		enterRule(_localctx, 20, RULE_objectproperties);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				metasection();
				setState(99);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				name();
				setState(102);
				type();
				setState(103);
				validator();
				setState(104);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				name();
				setState(107);
				type();
				setState(108);
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
		enterRule(_localctx, 22, RULE_objname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		enterRule(_localctx, 24, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		enterRule(_localctx, 26, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		enterRule(_localctx, 28, RULE_validator);
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
		enterRule(_localctx, 30, RULE_metasection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(META);
			setState(121);
			match(NEWLINE);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				metaproperties();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(127);
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
		enterRule(_localctx, 32, RULE_metaproperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			name();
			setState(130);
			match(T__5);
			setState(131);
			value();
			setState(132);
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
		enterRule(_localctx, 34, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\3\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6D\n\6"+
		"\3\6\3\6\5\6H\n\6\3\7\3\7\3\b\3\b\3\b\5\bO\n\b\6\bQ\n\b\r\b\16\bR\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\6\13_\n\13\r\13\16\13`\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fq\n\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\6\21~\n\21\r\21\16\21\177"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\2\2\u0084\2&\3\2\2\2\4\62\3\2\2\2\6"+
		"\64\3\2\2\2\b<\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16K\3\2\2\2\20V\3\2\2\2\22"+
		"X\3\2\2\2\24Z\3\2\2\2\26p\3\2\2\2\30r\3\2\2\2\32t\3\2\2\2\34v\3\2\2\2"+
		"\36x\3\2\2\2 z\3\2\2\2\"\u0083\3\2\2\2$\u0088\3\2\2\2&\'\5\4\3\2\'(\7"+
		"\2\2\3(\3\3\2\2\2)*\5\6\4\2*+\5\4\3\2+\63\3\2\2\2,-\5\24\13\2-.\5\4\3"+
		"\2.\63\3\2\2\2/\60\7\21\2\2\60\63\5\4\3\2\61\63\3\2\2\2\62)\3\2\2\2\62"+
		",\3\2\2\2\62/\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\5\b\5\2\65\66\5"+
		"\16\b\2\668\5\20\t\2\679\7\20\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7"+
		"\21\2\2;\7\3\2\2\2<=\5\n\6\2=\t\3\2\2\2>?\7\3\2\2?@\5\22\n\2@A\7\3\2\2"+
		"AC\5\f\7\2BD\5\n\6\2CB\3\2\2\2CD\3\2\2\2DH\3\2\2\2EF\7\3\2\2FH\5\22\n"+
		"\2G>\3\2\2\2GE\3\2\2\2H\13\3\2\2\2IJ\7\4\2\2J\r\3\2\2\2KP\7\5\2\2LN\7"+
		"\r\2\2MO\7\6\2\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PL\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\7\2\2U\17\3\2\2\2VW\7\17\2\2W\21\3\2\2"+
		"\2XY\7\17\2\2Y\23\3\2\2\2Z[\7\t\2\2[\\\5\30\r\2\\^\7\21\2\2]_\5\26\f\2"+
		"^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\n\2\2c\25\3\2\2"+
		"\2de\5 \21\2ef\7\21\2\2fq\3\2\2\2gh\5\32\16\2hi\5\34\17\2ij\5\36\20\2"+
		"jk\7\21\2\2kq\3\2\2\2lm\5\32\16\2mn\5\34\17\2no\7\21\2\2oq\3\2\2\2pd\3"+
		"\2\2\2pg\3\2\2\2pl\3\2\2\2q\27\3\2\2\2rs\7\17\2\2s\31\3\2\2\2tu\7\17\2"+
		"\2u\33\3\2\2\2vw\7\17\2\2w\35\3\2\2\2xy\7\17\2\2y\37\3\2\2\2z{\7\13\2"+
		"\2{}\7\21\2\2|~\5\"\22\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\f\2\2\u0082!\3\2\2\2\u0083"+
		"\u0084\5\32\16\2\u0084\u0085\7\b\2\2\u0085\u0086\5$\23\2\u0086\u0087\7"+
		"\21\2\2\u0087#\3\2\2\2\u0088\u0089\7\17\2\2\u0089%\3\2\2\2\13\628CGNR"+
		"`p\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
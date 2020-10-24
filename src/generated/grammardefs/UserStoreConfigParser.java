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
		T__0=1, T__1=2, DEF=3, ENDDEF=4, DIGITS=5, STRING=6, WS=7, NEWLINE=8;
	public static final int
		RULE_userstoredesc = 0, RULE_items = 1, RULE_pathline = 2, RULE_path = 3, 
		RULE_pathsegments = 4, RULE_labelid = 5, RULE_label = 6, RULE_object = 7, 
		RULE_objectproperties = 8, RULE_objname = 9, RULE_name = 10, RULE_type = 11, 
		RULE_validator = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"userstoredesc", "items", "pathline", "path", "pathsegments", "labelid", 
			"label", "object", "objectproperties", "objname", "name", "type", "validator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'<id>'", "'def'", "'enddef'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DEF", "ENDDEF", "DIGITS", "STRING", "WS", "NEWLINE"
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
			setState(26);
			items();
			setState(27);
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				pathline();
				setState(30);
				items();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				object();
				setState(33);
				items();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(NEWLINE);
				setState(36);
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
			setState(40);
			path();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(41);
				match(WS);
				}
			}

			setState(44);
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
			setState(46);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new LABELIDPAIRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__0);
				setState(49);
				label();
				setState(50);
				match(T__0);
				setState(51);
				labelid();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(52);
					pathsegments();
					}
				}

				}
				break;
			case 2:
				_localctx = new SINGLELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__0);
				setState(56);
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
			setState(59);
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
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
		enterRule(_localctx, 14, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DEF);
			setState(64);
			objname();
			setState(65);
			match(NEWLINE);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				objectproperties();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(71);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValidatorContext validator() {
			return getRuleContext(ValidatorContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(UserStoreConfigParser.NEWLINE, 0); }
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
		enterRule(_localctx, 16, RULE_objectproperties);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				name();
				setState(74);
				type();
				setState(75);
				validator();
				setState(76);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				name();
				setState(79);
				type();
				setState(80);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				name();
				setState(83);
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
		enterRule(_localctx, 18, RULE_objname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
		enterRule(_localctx, 20, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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
		enterRule(_localctx, 22, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 24, RULE_validator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\nb\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3)\n\3\3\4\3\4\5\4-\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\68"+
		"\n\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\6\tF\n\t\r\t\16"+
		"\tG\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nX\n\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\2\2]\2\34\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b\60\3\2\2\2\n;\3"+
		"\2\2\2\f=\3\2\2\2\16?\3\2\2\2\20A\3\2\2\2\22W\3\2\2\2\24Y\3\2\2\2\26["+
		"\3\2\2\2\30]\3\2\2\2\32_\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2"+
		"\2\2\37 \5\6\4\2 !\5\4\3\2!)\3\2\2\2\"#\5\20\t\2#$\5\4\3\2$)\3\2\2\2%"+
		"&\7\n\2\2&)\5\4\3\2\')\3\2\2\2(\37\3\2\2\2(\"\3\2\2\2(%\3\2\2\2(\'\3\2"+
		"\2\2)\5\3\2\2\2*,\5\b\5\2+-\7\t\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7"+
		"\n\2\2/\7\3\2\2\2\60\61\5\n\6\2\61\t\3\2\2\2\62\63\7\3\2\2\63\64\5\16"+
		"\b\2\64\65\7\3\2\2\65\67\5\f\7\2\668\5\n\6\2\67\66\3\2\2\2\678\3\2\2\2"+
		"8<\3\2\2\29:\7\3\2\2:<\5\16\b\2;\62\3\2\2\2;9\3\2\2\2<\13\3\2\2\2=>\7"+
		"\4\2\2>\r\3\2\2\2?@\7\b\2\2@\17\3\2\2\2AB\7\5\2\2BC\5\24\13\2CE\7\n\2"+
		"\2DF\5\22\n\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\6"+
		"\2\2J\21\3\2\2\2KL\5\26\f\2LM\5\30\r\2MN\5\32\16\2NO\7\n\2\2OX\3\2\2\2"+
		"PQ\5\26\f\2QR\5\30\r\2RS\7\n\2\2SX\3\2\2\2TU\5\26\f\2UV\7\n\2\2VX\3\2"+
		"\2\2WK\3\2\2\2WP\3\2\2\2WT\3\2\2\2X\23\3\2\2\2YZ\7\b\2\2Z\25\3\2\2\2["+
		"\\\7\b\2\2\\\27\3\2\2\2]^\7\b\2\2^\31\3\2\2\2_`\7\b\2\2`\33\3\2\2\2\b"+
		"(,\67;GW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
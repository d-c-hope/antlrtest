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
		T__0=1, T__1=2, DIGITS=3, STRING=4, WS=5, NEWLINE=6;
	public static final int
		RULE_userstoredesc = 0, RULE_pathlines = 1, RULE_more = 2, RULE_pathline = 3, 
		RULE_path = 4, RULE_pathsegments = 5, RULE_labelid = 6, RULE_label = 7, 
		RULE_string = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"userstoredesc", "pathlines", "more", "pathline", "path", "pathsegments", 
			"labelid", "label", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'<id>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DIGITS", "STRING", "WS", "NEWLINE"
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
		public PathlinesContext pathlines() {
			return getRuleContext(PathlinesContext.class,0);
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
			setState(18);
			pathlines();
			setState(19);
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

	public static class PathlinesContext extends ParserRuleContext {
		public PathlineContext pathline() {
			return getRuleContext(PathlineContext.class,0);
		}
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public PathlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterPathlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitPathlines(this);
		}
	}

	public final PathlinesContext pathlines() throws RecognitionException {
		PathlinesContext _localctx = new PathlinesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pathlines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			pathline();
			setState(22);
			more();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreContext extends ParserRuleContext {
		public PathlinesContext pathlines() {
			return getRuleContext(PathlinesContext.class,0);
		}
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitMore(this);
		}
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_more);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				pathlines();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
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
		enterRule(_localctx, 6, RULE_pathline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			path();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(29);
				match(WS);
				}
			}

			setState(32);
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
		enterRule(_localctx, 8, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
		enterRule(_localctx, 10, RULE_pathsegments);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new LABELIDPAIRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(T__0);
				setState(37);
				label();
				setState(38);
				match(T__0);
				setState(39);
				labelid();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(40);
					pathsegments();
					}
				}

				}
				break;
			case 2:
				_localctx = new SINGLELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__0);
				setState(44);
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
		enterRule(_localctx, 12, RULE_labelid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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
		enterRule(_localctx, 14, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UserStoreConfigParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserStoreConfigListener ) ((UserStoreConfigListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b8\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\5\4\35\n\4\3\5\3\5\5\5!\n\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7,\n\7\3\7\3\7\5\7\60\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\62\2\24\3\2\2\2\4\27\3\2\2\2\6\34\3"+
		"\2\2\2\b\36\3\2\2\2\n$\3\2\2\2\f/\3\2\2\2\16\61\3\2\2\2\20\63\3\2\2\2"+
		"\22\65\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\5\b\5\2"+
		"\30\31\5\6\4\2\31\5\3\2\2\2\32\35\5\4\3\2\33\35\3\2\2\2\34\32\3\2\2\2"+
		"\34\33\3\2\2\2\35\7\3\2\2\2\36 \5\n\6\2\37!\7\7\2\2 \37\3\2\2\2 !\3\2"+
		"\2\2!\"\3\2\2\2\"#\7\b\2\2#\t\3\2\2\2$%\5\f\7\2%\13\3\2\2\2&\'\7\3\2\2"+
		"\'(\5\20\t\2()\7\3\2\2)+\5\16\b\2*,\5\f\7\2+*\3\2\2\2+,\3\2\2\2,\60\3"+
		"\2\2\2-.\7\3\2\2.\60\5\20\t\2/&\3\2\2\2/-\3\2\2\2\60\r\3\2\2\2\61\62\7"+
		"\4\2\2\62\17\3\2\2\2\63\64\7\6\2\2\64\21\3\2\2\2\65\66\7\6\2\2\66\23\3"+
		"\2\2\2\6\34 +/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
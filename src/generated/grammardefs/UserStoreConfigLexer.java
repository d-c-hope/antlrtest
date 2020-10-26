// Generated from grammardefs/UserStoreConfig.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UserStoreConfigLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DEF=7, ENDDEF=8, META=9, 
		ENDMETA=10, HMETHOD=11, DIGITS=12, STRING=13, WS=14, NEWLINE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "DEF", "ENDDEF", "META", 
			"ENDMETA", "HMETHOD", "DIGITS", "STRING", "WS", "NEWLINE"
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


	public UserStoreConfigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UserStoreConfig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fV\n\f\3\r"+
		"\6\rY\n\r\r\r\16\rZ\3\16\3\16\7\16_\n\16\f\16\16\16b\13\16\3\17\6\17e"+
		"\n\17\r\17\16\17f\3\17\3\17\3\20\6\20l\n\20\r\20\16\20m\2\2\21\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3"+
		"\2\7\3\2\62;\6\2\62;C\\c|\u0080\u0080\7\2--/\60\62;C\\c|\4\2\13\13\"\""+
		"\4\2\f\f\17\17\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3"+
		"!\3\2\2\2\5#\3\2\2\2\7(\3\2\2\2\t*\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60"+
		"\3\2\2\2\21\64\3\2\2\2\23;\3\2\2\2\25@\3\2\2\2\27U\3\2\2\2\31X\3\2\2\2"+
		"\33\\\3\2\2\2\35d\3\2\2\2\37k\3\2\2\2!\"\7\61\2\2\"\4\3\2\2\2#$\7>\2\2"+
		"$%\7k\2\2%&\7f\2\2&\'\7@\2\2\'\6\3\2\2\2()\7*\2\2)\b\3\2\2\2*+\7.\2\2"+
		"+\n\3\2\2\2,-\7+\2\2-\f\3\2\2\2./\7<\2\2/\16\3\2\2\2\60\61\7f\2\2\61\62"+
		"\7g\2\2\62\63\7h\2\2\63\20\3\2\2\2\64\65\7g\2\2\65\66\7p\2\2\66\67\7f"+
		"\2\2\678\7f\2\289\7g\2\29:\7h\2\2:\22\3\2\2\2;<\7o\2\2<=\7g\2\2=>\7v\2"+
		"\2>?\7c\2\2?\24\3\2\2\2@A\7g\2\2AB\7p\2\2BC\7f\2\2CD\7o\2\2DE\7g\2\2E"+
		"F\7v\2\2FG\7c\2\2G\26\3\2\2\2HI\7i\2\2IJ\7g\2\2JV\7v\2\2KL\7r\2\2LM\7"+
		"w\2\2MV\7v\2\2NO\7r\2\2OP\7q\2\2PQ\7u\2\2QV\7v\2\2RS\7f\2\2ST\7g\2\2T"+
		"V\7n\2\2UH\3\2\2\2UK\3\2\2\2UN\3\2\2\2UR\3\2\2\2V\30\3\2\2\2WY\t\2\2\2"+
		"XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\32\3\2\2\2\\`\t\3\2\2]_\t\4"+
		"\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\34\3\2\2\2b`\3\2\2\2ce\t"+
		"\5\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\17\2\2i\36"+
		"\3\2\2\2jl\t\6\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n \3\2\2\2\b"+
		"\2UZ`fm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
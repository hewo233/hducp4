// Generated from SysYLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SysYLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST=1, INT=2, FLOAT=3, VOID=4, IF=5, ELSE=6, WHILE=7, BREAK=8, CONTINUE=9, 
		RETURN=10, PLUS=11, MINUS=12, MUL=13, DIV=14, MOD=15, ASSIGN=16, EQ=17, 
		NEQ=18, LT=19, GT=20, LE=21, GE=22, NOT=23, AND=24, OR=25, L_PAREN=26, 
		R_PAREN=27, L_BRACE=28, R_BRACE=29, L_BRACKT=30, R_BRACKT=31, COMMA=32, 
		SEMICOLON=33, IDENT=34, INTEGER_CONST=35, WS=36, LINE_COMMENT=37, MULTILINE_COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONST", "INT", "FLOAT", "VOID", "IF", "ELSE", "WHILE", "BREAK", "CONTINUE", 
			"RETURN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "ASSIGN", "EQ", "NEQ", 
			"LT", "GT", "LE", "GE", "NOT", "AND", "OR", "L_PAREN", "R_PAREN", "L_BRACE", 
			"R_BRACE", "L_BRACKT", "R_BRACKT", "COMMA", "SEMICOLON", "IDENT", "INTEGER_CONST", 
			"WS", "LINE_COMMENT", "MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'int'", "'float'", "'void'", "'if'", "'else'", "'while'", 
			"'break'", "'continue'", "'return'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'!'", "'&&'", "'||'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST", "INT", "FLOAT", "VOID", "IF", "ELSE", "WHILE", "BREAK", 
			"CONTINUE", "RETURN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "ASSIGN", 
			"EQ", "NEQ", "LT", "GT", "LE", "GE", "NOT", "AND", "OR", "L_PAREN", "R_PAREN", 
			"L_BRACE", "R_BRACE", "L_BRACKT", "R_BRACKT", "COMMA", "SEMICOLON", "IDENT", 
			"INTEGER_CONST", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
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


	public SysYLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SysYLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\7#\u00bf\n#\f#\16#\u00c2\13"+
		"#\3$\3$\3$\7$\u00c7\n$\f$\16$\u00ca\13$\3$\3$\6$\u00ce\n$\r$\16$\u00cf"+
		"\3$\3$\3$\6$\u00d5\n$\r$\16$\u00d6\5$\u00d9\n$\3%\6%\u00dc\n%\r%\16%\u00dd"+
		"\3%\3%\3&\3&\3&\3&\7&\u00e6\n&\f&\16&\u00e9\13&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\7\'\u00f3\n\'\f\'\16\'\u00f6\13\'\3\'\3\'\3\'\3\'\3\'\4\u00e7\u00f4"+
		"\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62"+
		";\3\2\629\4\2ZZzz\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u0105\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5U\3\2\2\2\7Y\3\2\2\2\t_\3\2\2\2\13d\3"+
		"\2\2\2\rg\3\2\2\2\17l\3\2\2\2\21r\3\2\2\2\23x\3\2\2\2\25\u0081\3\2\2\2"+
		"\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37"+
		"\u0090\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0097\3\2\2\2\'\u009a\3"+
		"\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2-\u00a1\3\2\2\2/\u00a4\3\2\2\2\61"+
		"\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2\2\29\u00b0"+
		"\3\2\2\2;\u00b2\3\2\2\2=\u00b4\3\2\2\2?\u00b6\3\2\2\2A\u00b8\3\2\2\2C"+
		"\u00ba\3\2\2\2E\u00bc\3\2\2\2G\u00d8\3\2\2\2I\u00db\3\2\2\2K\u00e1\3\2"+
		"\2\2M\u00ee\3\2\2\2OP\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7u\2\2ST\7v\2\2T\4\3"+
		"\2\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X\6\3\2\2\2YZ\7h\2\2Z[\7n\2\2[\\\7q\2"+
		"\2\\]\7c\2\2]^\7v\2\2^\b\3\2\2\2_`\7x\2\2`a\7q\2\2ab\7k\2\2bc\7f\2\2c"+
		"\n\3\2\2\2de\7k\2\2ef\7h\2\2f\f\3\2\2\2gh\7g\2\2hi\7n\2\2ij\7u\2\2jk\7"+
		"g\2\2k\16\3\2\2\2lm\7y\2\2mn\7j\2\2no\7k\2\2op\7n\2\2pq\7g\2\2q\20\3\2"+
		"\2\2rs\7d\2\2st\7t\2\2tu\7g\2\2uv\7c\2\2vw\7m\2\2w\22\3\2\2\2xy\7e\2\2"+
		"yz\7q\2\2z{\7p\2\2{|\7v\2\2|}\7k\2\2}~\7p\2\2~\177\7w\2\2\177\u0080\7"+
		"g\2\2\u0080\24\3\2\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7v\2\2\u0084\u0085\7w\2\2\u0085\u0086\7t\2\2\u0086\u0087\7p\2\2\u0087"+
		"\26\3\2\2\2\u0088\u0089\7-\2\2\u0089\30\3\2\2\2\u008a\u008b\7/\2\2\u008b"+
		"\32\3\2\2\2\u008c\u008d\7,\2\2\u008d\34\3\2\2\2\u008e\u008f\7\61\2\2\u008f"+
		"\36\3\2\2\2\u0090\u0091\7\'\2\2\u0091 \3\2\2\2\u0092\u0093\7?\2\2\u0093"+
		"\"\3\2\2\2\u0094\u0095\7?\2\2\u0095\u0096\7?\2\2\u0096$\3\2\2\2\u0097"+
		"\u0098\7#\2\2\u0098\u0099\7?\2\2\u0099&\3\2\2\2\u009a\u009b\7>\2\2\u009b"+
		"(\3\2\2\2\u009c\u009d\7@\2\2\u009d*\3\2\2\2\u009e\u009f\7>\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\u00a3\7?\2\2\u00a3.\3"+
		"\2\2\2\u00a4\u00a5\7#\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7(\2\2\u00a7\u00a8"+
		"\7(\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7~\2\2\u00aa\u00ab\7~\2\2\u00ab\64"+
		"\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7+\2\2\u00af"+
		"8\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7\177\2\2\u00b3"+
		"<\3\2\2\2\u00b4\u00b5\7]\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7_\2\2\u00b7@"+
		"\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9B\3\2\2\2\u00ba\u00bb\7=\2\2\u00bbD\3"+
		"\2\2\2\u00bc\u00c0\t\2\2\2\u00bd\u00bf\t\3\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1F\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3\u00d9\7\62\2\2\u00c4\u00c8\t\4\2\2\u00c5\u00c7"+
		"\t\5\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00d9\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\62"+
		"\2\2\u00cc\u00ce\t\6\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d9\3\2\2\2\u00d1\u00d2\7\62"+
		"\2\2\u00d2\u00d4\t\7\2\2\u00d3\u00d5\t\b\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00c3\3\2\2\2\u00d8\u00c4\3\2\2\2\u00d8\u00cb\3\2\2\2\u00d8"+
		"\u00d1\3\2\2\2\u00d9H\3\2\2\2\u00da\u00dc\t\t\2\2\u00db\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\b%\2\2\u00e0J\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2"+
		"\u00e3\7\61\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6\13\2\2\2\u00e5\u00e4\3"+
		"\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\f\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\b&\2\2\u00edL\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0"+
		"\7,\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\13\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9\7\61\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\b\'\2\2\u00fbN\3\2\2\2\13\2\u00c0\u00c8\u00cf"+
		"\u00d6\u00d8\u00dd\u00e7\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
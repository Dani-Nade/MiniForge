// Generated from c:/Users/danis/OneDrive/Desktop/UNI/FOM/Project/Project finale/Minilang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, FOR=4, ASSERT=5, ASSIGN=6, EQUALS=7, NE=8, LT=9, 
		GT=10, LE=11, GE=12, PLUS=13, MINUS=14, LPAREN=15, RPAREN=16, LBRACE=17, 
		RBRACE=18, LBRACK=19, RBRACK=20, SEMI=21, NAME=22, NUMBER=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHILE", "FOR", "ASSERT", "ASSIGN", "EQUALS", "NE", "LT", 
			"GT", "LE", "GE", "PLUS", "MINUS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "NAME", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'for'", "'assert'", "':='", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'+'", null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "FOR", "ASSERT", "ASSIGN", "EQUALS", "NE", 
			"LT", "GT", "LE", "GE", "PLUS", "MINUS", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "NAME", "NUMBER", "WS"
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


	public MiniLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Minilang.g4"; }

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
		"\u0004\u0000\u0018\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0005\u0015r\b\u0015\n\u0015\f\u0015u\t\u0015\u0001\u0016\u0004"+
		"\u0016x\b\u0016\u000b\u0016\f\u0016y\u0001\u0017\u0004\u0017}\b\u0017"+
		"\u000b\u0017\f\u0017~\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u0018\u0001\u0000\u0005\u0002\u0000--\u2212\u2212\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0084\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00011\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u00059"+
		"\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tC\u0001\u0000"+
		"\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rM\u0001\u0000\u0000\u0000"+
		"\u000fP\u0001\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013U"+
		"\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000"+
		"\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000"+
		"\u001da\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000!e\u0001"+
		"\u0000\u0000\u0000#g\u0001\u0000\u0000\u0000%i\u0001\u0000\u0000\u0000"+
		"\'k\u0001\u0000\u0000\u0000)m\u0001\u0000\u0000\u0000+o\u0001\u0000\u0000"+
		"\u0000-w\u0001\u0000\u0000\u0000/|\u0001\u0000\u0000\u000012\u0005i\u0000"+
		"\u000023\u0005f\u0000\u00003\u0002\u0001\u0000\u0000\u000045\u0005e\u0000"+
		"\u000056\u0005l\u0000\u000067\u0005s\u0000\u000078\u0005e\u0000\u0000"+
		"8\u0004\u0001\u0000\u0000\u00009:\u0005w\u0000\u0000:;\u0005h\u0000\u0000"+
		";<\u0005i\u0000\u0000<=\u0005l\u0000\u0000=>\u0005e\u0000\u0000>\u0006"+
		"\u0001\u0000\u0000\u0000?@\u0005f\u0000\u0000@A\u0005o\u0000\u0000AB\u0005"+
		"r\u0000\u0000B\b\u0001\u0000\u0000\u0000CD\u0005a\u0000\u0000DE\u0005"+
		"s\u0000\u0000EF\u0005s\u0000\u0000FG\u0005e\u0000\u0000GH\u0005r\u0000"+
		"\u0000HI\u0005t\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005:\u0000"+
		"\u0000KL\u0005=\u0000\u0000L\f\u0001\u0000\u0000\u0000MN\u0005=\u0000"+
		"\u0000NO\u0005=\u0000\u0000O\u000e\u0001\u0000\u0000\u0000PQ\u0005!\u0000"+
		"\u0000QR\u0005=\u0000\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005<\u0000"+
		"\u0000T\u0012\u0001\u0000\u0000\u0000UV\u0005>\u0000\u0000V\u0014\u0001"+
		"\u0000\u0000\u0000WX\u0005<\u0000\u0000XY\u0005=\u0000\u0000Y\u0016\u0001"+
		"\u0000\u0000\u0000Z[\u0005>\u0000\u0000[\\\u0005=\u0000\u0000\\\u0018"+
		"\u0001\u0000\u0000\u0000]^\u0005+\u0000\u0000^\u001a\u0001\u0000\u0000"+
		"\u0000_`\u0007\u0000\u0000\u0000`\u001c\u0001\u0000\u0000\u0000ab\u0005"+
		"(\u0000\u0000b\u001e\u0001\u0000\u0000\u0000cd\u0005)\u0000\u0000d \u0001"+
		"\u0000\u0000\u0000ef\u0005{\u0000\u0000f\"\u0001\u0000\u0000\u0000gh\u0005"+
		"}\u0000\u0000h$\u0001\u0000\u0000\u0000ij\u0005[\u0000\u0000j&\u0001\u0000"+
		"\u0000\u0000kl\u0005]\u0000\u0000l(\u0001\u0000\u0000\u0000mn\u0005;\u0000"+
		"\u0000n*\u0001\u0000\u0000\u0000os\u0007\u0001\u0000\u0000pr\u0007\u0002"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t,\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vx\u0007\u0003\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z.\u0001\u0000\u0000\u0000{}\u0007\u0004\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0006\u0017\u0000\u0000\u00810\u0001\u0000\u0000\u0000\u0004\u0000"+
		"sy~\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
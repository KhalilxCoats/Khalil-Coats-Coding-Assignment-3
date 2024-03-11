// Generated from C:/Users/khali/OneDrive/Documents/CS 320/Coding Assignment 3-1/src/MathOps.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MathOpsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCIENTIFIC_NUMBER=1, BASE10=2, BASEe=3, SIN=4, COS=5, TAN=6, ASIN=7, ACOS=8, 
		ATAN=9, SINH=10, COSH=11, TANH=12, FACTORIAL=13, LPAREN=14, RPAREN=15, 
		PLUS=16, MINUS=17, TIMES=18, DIV=19, POW=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SCIENTIFIC_NUMBER", "NUMBER", "UNSIGNED_INTEGER", "E", "SIGN", "BASE10", 
			"BASEe", "SIN", "COS", "TAN", "ASIN", "ACOS", "ATAN", "SINH", "COSH", 
			"TANH", "FACTORIAL", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
			"POW", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'log'", "'ln'", "'sin'", "'cos'", "'tan'", "'asin'", "'acos'", 
			"'atan'", "'sinh'", "'cosh'", "'tanh'", "'!'", "'('", "')'", "'+'", "'-'", 
			"'x'", "'\\u00F7'", "'**'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCIENTIFIC_NUMBER", "BASE10", "BASEe", "SIN", "COS", "TAN", "ASIN", 
			"ACOS", "ATAN", "SINH", "COSH", "TANH", "FACTORIAL", "LPAREN", "RPAREN", 
			"PLUS", "MINUS", "TIMES", "DIV", "POW", "WS"
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


	public MathOpsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathOps.g4"; }

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
		"\u0004\u0000\u0015\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"7\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0001\u0004"+
		"\u0001>\b\u0001\u000b\u0001\f\u0001?\u0001\u0001\u0001\u0001\u0004\u0001"+
		"D\b\u0001\u000b\u0001\f\u0001E\u0003\u0001H\b\u0001\u0001\u0001\u0003"+
		"\u0001K\b\u0001\u0001\u0002\u0004\u0002N\b\u0002\u000b\u0002\f\u0002O"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u0099\b\u0018\u000b"+
		"\u0018\f\u0018\u009a\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001"+
		"\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0002\r\u0003\u000f"+
		"\u0004\u0011\u0005\u0013\u0006\u0015\u0007\u0017\b\u0019\t\u001b\n\u001d"+
		"\u000b\u001f\f!\r#\u000e%\u000f\'\u0010)\u0011+\u0012-\u0013/\u00141\u0015"+
		"\u0001\u0000\u0004\u0002\u0000ee\u03c0\u03c0\u0002\u0000EEee\u0002\u0000"+
		"++--\u0003\u0000\t\n\r\r  \u00a1\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u0003J\u0001\u0000\u0000"+
		"\u0000\u0005M\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000\u0000\u0000\t"+
		"S\u0001\u0000\u0000\u0000\u000bU\u0001\u0000\u0000\u0000\rY\u0001\u0000"+
		"\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011`\u0001\u0000\u0000"+
		"\u0000\u0013d\u0001\u0000\u0000\u0000\u0015h\u0001\u0000\u0000\u0000\u0017"+
		"m\u0001\u0000\u0000\u0000\u0019r\u0001\u0000\u0000\u0000\u001bw\u0001"+
		"\u0000\u0000\u0000\u001d|\u0001\u0000\u0000\u0000\u001f\u0081\u0001\u0000"+
		"\u0000\u0000!\u0086\u0001\u0000\u0000\u0000#\u0088\u0001\u0000\u0000\u0000"+
		"%\u008a\u0001\u0000\u0000\u0000\'\u008c\u0001\u0000\u0000\u0000)\u008e"+
		"\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000\u0000-\u0092\u0001\u0000"+
		"\u0000\u0000/\u0094\u0001\u0000\u0000\u00001\u0098\u0001\u0000\u0000\u0000"+
		"3:\u0003\u0003\u0001\u000046\u0003\u0007\u0003\u000057\u0003\t\u0004\u0000"+
		"65\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000089\u0003\u0005\u0002\u00009;\u0001\u0000\u0000\u0000:4\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0002\u0001\u0000\u0000\u0000"+
		"<>\u000209\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?"+
		"=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@G\u0001\u0000\u0000"+
		"\u0000AC\u0005.\u0000\u0000BD\u000209\u0000CB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IK\u0007\u0000\u0000\u0000J=\u0001"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0004\u0001\u0000\u0000"+
		"\u0000LN\u000209\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0006\u0001\u0000"+
		"\u0000\u0000QR\u0007\u0001\u0000\u0000R\b\u0001\u0000\u0000\u0000ST\u0007"+
		"\u0002\u0000\u0000T\n\u0001\u0000\u0000\u0000UV\u0005l\u0000\u0000VW\u0005"+
		"o\u0000\u0000WX\u0005g\u0000\u0000X\f\u0001\u0000\u0000\u0000YZ\u0005"+
		"l\u0000\u0000Z[\u0005n\u0000\u0000[\u000e\u0001\u0000\u0000\u0000\\]\u0005"+
		"s\u0000\u0000]^\u0005i\u0000\u0000^_\u0005n\u0000\u0000_\u0010\u0001\u0000"+
		"\u0000\u0000`a\u0005c\u0000\u0000ab\u0005o\u0000\u0000bc\u0005s\u0000"+
		"\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005t\u0000\u0000ef\u0005a\u0000"+
		"\u0000fg\u0005n\u0000\u0000g\u0014\u0001\u0000\u0000\u0000hi\u0005a\u0000"+
		"\u0000ij\u0005s\u0000\u0000jk\u0005i\u0000\u0000kl\u0005n\u0000\u0000"+
		"l\u0016\u0001\u0000\u0000\u0000mn\u0005a\u0000\u0000no\u0005c\u0000\u0000"+
		"op\u0005o\u0000\u0000pq\u0005s\u0000\u0000q\u0018\u0001\u0000\u0000\u0000"+
		"rs\u0005a\u0000\u0000st\u0005t\u0000\u0000tu\u0005a\u0000\u0000uv\u0005"+
		"n\u0000\u0000v\u001a\u0001\u0000\u0000\u0000wx\u0005s\u0000\u0000xy\u0005"+
		"i\u0000\u0000yz\u0005n\u0000\u0000z{\u0005h\u0000\u0000{\u001c\u0001\u0000"+
		"\u0000\u0000|}\u0005c\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005s\u0000"+
		"\u0000\u007f\u0080\u0005h\u0000\u0000\u0080\u001e\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005t\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084"+
		"\u0005n\u0000\u0000\u0084\u0085\u0005h\u0000\u0000\u0085 \u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005!\u0000\u0000\u0087\"\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005(\u0000\u0000\u0089$\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005)\u0000\u0000\u008b&\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"+\u0000\u0000\u008d(\u0001\u0000\u0000\u0000\u008e\u008f\u0005-\u0000"+
		"\u0000\u008f*\u0001\u0000\u0000\u0000\u0090\u0091\u0005x\u0000\u0000\u0091"+
		",\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u00f7\u0000\u0000\u0093.\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005*\u0000\u0000\u0095\u0096\u0005*\u0000"+
		"\u0000\u00960\u0001\u0000\u0000\u0000\u0097\u0099\u0007\u0003\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0018\u0000\u0000"+
		"\u009d2\u0001\u0000\u0000\u0000\t\u00006:?EGJO\u009a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
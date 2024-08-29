// Generated from /home/linky/Proyects/University/SextoSemestre/LenguajesDeProgramacion/calculadora-antlr4/calculadoraJava/calculadora.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class calculadoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MUL=3, DIV=4, ADD=5, SUB=6, ABS=7, FLOAT=8, INT=9, NEWLINE=10, 
		WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "MUL", "DIV", "ADD", "SUB", "ABS", "FLOAT", "INT", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MUL", "DIV", "ADD", "SUB", "ABS", "FLOAT", "INT", 
			"NEWLINE", "WS"
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


	public calculadoraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculadora.g4"; }

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
		"\u0004\u0000\u000bJ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0004\u0007\'\b\u0007\u000b\u0007\f\u0007(\u0001"+
		"\u0007\u0001\u0007\u0005\u0007-\b\u0007\n\u0007\f\u00070\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u00074\b\u0007\u000b\u0007\f\u00075\u0003\u0007"+
		"8\b\u0007\u0001\b\u0004\b;\b\b\u000b\b\f\b<\u0001\t\u0003\t@\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0004\nE\b\n\u000b\n\f\nF\u0001\n\u0001\n\u0000\u0000"+
		"\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0002\u0001\u0000"+
		"09\u0002\u0000\t\t  P\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000"+
		"\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005\u001b\u0001\u0000"+
		"\u0000\u0000\u0007\u001d\u0001\u0000\u0000\u0000\t\u001f\u0001\u0000\u0000"+
		"\u0000\u000b!\u0001\u0000\u0000\u0000\r#\u0001\u0000\u0000\u0000\u000f"+
		"7\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000\u0000\u0013?\u0001"+
		"\u0000\u0000\u0000\u0015D\u0001\u0000\u0000\u0000\u0017\u0018\u0005(\u0000"+
		"\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a\u0005)\u0000\u0000"+
		"\u001a\u0004\u0001\u0000\u0000\u0000\u001b\u001c\u0005*\u0000\u0000\u001c"+
		"\u0006\u0001\u0000\u0000\u0000\u001d\u001e\u0005/\u0000\u0000\u001e\b"+
		"\u0001\u0000\u0000\u0000\u001f \u0005+\u0000\u0000 \n\u0001\u0000\u0000"+
		"\u0000!\"\u0005-\u0000\u0000\"\f\u0001\u0000\u0000\u0000#$\u0005|\u0000"+
		"\u0000$\u000e\u0001\u0000\u0000\u0000%\'\u0007\u0000\u0000\u0000&%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*.\u0005.\u0000\u0000"+
		"+-\u0007\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/8\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000013\u0005.\u0000\u000024\u0007\u0000"+
		"\u0000\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"7&\u0001\u0000\u0000\u000071\u0001\u0000\u0000\u00008\u0010\u0001\u0000"+
		"\u0000\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=\u0012\u0001\u0000\u0000\u0000>@\u0005\r\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\n\u0000"+
		"\u0000B\u0014\u0001\u0000\u0000\u0000CE\u0007\u0001\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0006\n\u0000\u0000"+
		"I\u0016\u0001\u0000\u0000\u0000\b\u0000(.57<?F\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
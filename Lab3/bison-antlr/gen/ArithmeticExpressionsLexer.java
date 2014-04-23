// Generated from /Users/gtkachenko/Dropbox/Programming/Effective_parsing/Lab3/bison-antlr/antlr_src/ArithmeticExpressions.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticExpressionsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, VAR=3, NEWLINE=4, WS=5, AND=6, OR=7, XOR=8, NOT=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "VAR", "NEWLINE", "WS", "'and'", "'or'", "'xor'", "'not'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "VAR", "NEWLINE", "WS", "AND", "OR", "XOR", "NOT"
	};


	public ArithmeticExpressionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArithmeticExpressions.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\66\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\5\5\35\n\5\3\5\3\5\3\6\6\6\"\n\6\r\6\16\6#\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\2\2\13"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\4\3\2c|\4\2\13\13\"\"\67"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2"+
		"\7\31\3\2\2\2\t\34\3\2\2\2\13!\3\2\2\2\r\'\3\2\2\2\17+\3\2\2\2\21.\3\2"+
		"\2\2\23\62\3\2\2\2\25\26\7+\2\2\26\4\3\2\2\2\27\30\7*\2\2\30\6\3\2\2\2"+
		"\31\32\t\2\2\2\32\b\3\2\2\2\33\35\7\17\2\2\34\33\3\2\2\2\34\35\3\2\2\2"+
		"\35\36\3\2\2\2\36\37\7\f\2\2\37\n\3\2\2\2 \"\t\3\2\2! \3\2\2\2\"#\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\b\6\2\2&\f\3\2\2\2\'(\7c\2\2()\7"+
		"p\2\2)*\7f\2\2*\16\3\2\2\2+,\7q\2\2,-\7t\2\2-\20\3\2\2\2./\7z\2\2/\60"+
		"\7q\2\2\60\61\7t\2\2\61\22\3\2\2\2\62\63\7p\2\2\63\64\7q\2\2\64\65\7v"+
		"\2\2\65\24\3\2\2\2\5\2\34#\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
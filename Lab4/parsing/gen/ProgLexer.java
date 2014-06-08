// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab4/parsing/grammars/parsing_grammar/Prog.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, NEWLINE=5, WS=6, NON_TERM_NAME=7, TERM_NAME=8, 
		LEFT_PAREN=9, RIGHT_PAREN=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'''", "':'", "';'", "'|'", "NEWLINE", "WS", "NON_TERM_NAME", "TERM_NAME", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "NEWLINE", "WS", "NON_TERM_NAME", "TERM_NAME", 
		"LEFT_PAREN", "RIGHT_PAREN"
	};


	public ProgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Prog.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f9\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\5\6!\n\6\3\6\3\6\3\7\6\7&\n\7"+
		"\r\7\16\7\'\3\7\3\7\3\b\6\b-\n\b\r\b\16\b.\3\t\6\t\62\n\t\r\t\16\t\63"+
		"\3\n\3\n\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\3\2\5\4\2\13\13\"\"\4\2aac|\4\2C\\aa<\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\35\3"+
		"\2\2\2\13 \3\2\2\2\r%\3\2\2\2\17,\3\2\2\2\21\61\3\2\2\2\23\65\3\2\2\2"+
		"\25\67\3\2\2\2\27\30\7)\2\2\30\4\3\2\2\2\31\32\7<\2\2\32\6\3\2\2\2\33"+
		"\34\7=\2\2\34\b\3\2\2\2\35\36\7~\2\2\36\n\3\2\2\2\37!\7\17\2\2 \37\3\2"+
		"\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\f\2\2#\f\3\2\2\2$&\t\2\2\2%$\3\2\2\2&\'"+
		"\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b\7\2\2*\16\3\2\2\2+-\t\3\2"+
		"\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\20\3\2\2\2\60\62\t\4\2\2\61"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\22\3\2\2\2\65"+
		"\66\7*\2\2\66\24\3\2\2\2\678\7+\2\28\26\3\2\2\2\7\2 \'.\63\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
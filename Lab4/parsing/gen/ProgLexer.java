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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, NEWLINE=9, 
		WS=10, NON_TERM_NAME=11, TERM_NAME=12, LEFT_PAREN=13, RIGHT_PAREN=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'@header'", "'''", "'{'", "':'", "'@members'", "'}'", "';'", "'|'", "NEWLINE", 
		"WS", "NON_TERM_NAME", "TERM_NAME", "'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NEWLINE", 
		"WS", "NON_TERM_NAME", "TERM_NAME", "LEFT_PAREN", "RIGHT_PAREN"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\5\n>\n\n\3\n\3\n\3\13\6\13C\n\13\r\13\16\13D\3\13"+
		"\3\13\3\f\6\fJ\n\f\r\f\16\fK\3\r\6\rO\n\r\r\r\16\rP\3\16\3\16\3\17\3\17"+
		"\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\3\2\5\4\2\13\13\"\"\4\2aac|\4\2C\\aaY\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\3\37\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2"+
		"\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23=\3\2\2\2\25B\3\2\2\2\27I\3"+
		"\2\2\2\31N\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37 \7B\2\2 !\7j\2\2!\"\7g\2"+
		"\2\"#\7c\2\2#$\7f\2\2$%\7g\2\2%&\7t\2\2&\4\3\2\2\2\'(\7)\2\2(\6\3\2\2"+
		"\2)*\7}\2\2*\b\3\2\2\2+,\7<\2\2,\n\3\2\2\2-.\7B\2\2./\7o\2\2/\60\7g\2"+
		"\2\60\61\7o\2\2\61\62\7d\2\2\62\63\7g\2\2\63\64\7t\2\2\64\65\7u\2\2\65"+
		"\f\3\2\2\2\66\67\7\177\2\2\67\16\3\2\2\289\7=\2\29\20\3\2\2\2:;\7~\2\2"+
		";\22\3\2\2\2<>\7\17\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\f\2\2@\24\3"+
		"\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\b"+
		"\13\2\2G\26\3\2\2\2HJ\t\3\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"L\30\3\2\2\2MO\t\4\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\32\3\2"+
		"\2\2RS\7*\2\2S\34\3\2\2\2TU\7+\2\2U\36\3\2\2\2\7\2=DKP\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
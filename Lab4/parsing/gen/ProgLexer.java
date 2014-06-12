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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		WS=10, NEWLINE=11, NON_TERM_NAME=12, TERM_NAME=13, MIX_CASE_NAME=14, JAVACODE=15, 
		LEFT_PAREN=16, RIGHT_PAREN=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'@header'", "'''", "']'", "'['", "':'", "'returns'", "'@members'", "';'", 
		"'|'", "WS", "NEWLINE", "NON_TERM_NAME", "TERM_NAME", "MIX_CASE_NAME", 
		"JAVACODE", "'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"WS", "NEWLINE", "NON_TERM_NAME", "TERM_NAME", "MIX_CASE_NAME", "JAVACODE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\6\13L\n\13\r\13\16\13M\3\13\3\13\3\f\5\fS\n\f\3\f\3\f\3"+
		"\r\6\rX\n\r\r\r\16\rY\3\16\6\16]\n\16\r\16\16\16^\3\17\6\17b\n\17\r\17"+
		"\16\17c\3\20\3\20\6\20h\n\20\r\20\16\20i\3\20\5\20m\n\20\7\20o\n\20\f"+
		"\20\16\20r\13\20\3\20\3\20\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3"+
		"\2\7\4\2\13\13\"\"\4\2aac|\4\2C\\aa\5\2C\\aac|\4\2}}\177\177\u0080\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\3%\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2"+
		"\2\2\17=\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25K\3\2\2\2\27R\3\2\2\2\31W\3"+
		"\2\2\2\33\\\3\2\2\2\35a\3\2\2\2\37e\3\2\2\2!u\3\2\2\2#w\3\2\2\2%&\7B\2"+
		"\2&\'\7j\2\2\'(\7g\2\2()\7c\2\2)*\7f\2\2*+\7g\2\2+,\7t\2\2,\4\3\2\2\2"+
		"-.\7)\2\2.\6\3\2\2\2/\60\7_\2\2\60\b\3\2\2\2\61\62\7]\2\2\62\n\3\2\2\2"+
		"\63\64\7<\2\2\64\f\3\2\2\2\65\66\7t\2\2\66\67\7g\2\2\678\7v\2\289\7w\2"+
		"\29:\7t\2\2:;\7p\2\2;<\7u\2\2<\16\3\2\2\2=>\7B\2\2>?\7o\2\2?@\7g\2\2@"+
		"A\7o\2\2AB\7d\2\2BC\7g\2\2CD\7t\2\2DE\7u\2\2E\20\3\2\2\2FG\7=\2\2G\22"+
		"\3\2\2\2HI\7~\2\2I\24\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NO\3\2\2\2OP\b\13\2\2P\26\3\2\2\2QS\7\17\2\2RQ\3\2\2\2RS\3\2"+
		"\2\2ST\3\2\2\2TU\7\f\2\2U\30\3\2\2\2VX\t\3\2\2WV\3\2\2\2XY\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\32\3\2\2\2[]\t\4\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2"+
		"^_\3\2\2\2_\34\3\2\2\2`b\t\5\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2d\36\3\2\2\2ep\7}\2\2fh\n\6\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jl\3\2\2\2km\5\37\20\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2ng\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\177\2\2t \3\2\2\2u"+
		"v\7*\2\2v\"\3\2\2\2wx\7+\2\2x$\3\2\2\2\13\2MRY^cilp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, VAR=6, INT=7, NEWLINE=8, WS=9, 
		MUL=10, DIV=11, ADD=12, SUB=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'^'", "')'", "'('", "'='", "';'", "VAR", "INT", "NEWLINE", "WS", "'*'", 
		"'/'", "'+'", "'-'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "VAR", "INT", "NEWLINE", "WS", 
		"MUL", "DIV", "ADD", "SUB"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17H\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\6\7)\n\7\r\7\16\7*\3\b\5\b.\n\b\3\b\6\b\61\n\b\r\b\16\b\62\3\t\5"+
		"\t\66\n\t\3\t\3\t\3\n\6\n;\n\n\r\n\16\n<\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\3\2\6\4\2C\\c|\3\2//\3\2\62;\4\2\13\13\"\"L\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2"+
		"\2\2\r(\3\2\2\2\17-\3\2\2\2\21\65\3\2\2\2\23:\3\2\2\2\25@\3\2\2\2\27B"+
		"\3\2\2\2\31D\3\2\2\2\33F\3\2\2\2\35\36\7`\2\2\36\4\3\2\2\2\37 \7+\2\2"+
		" \6\3\2\2\2!\"\7*\2\2\"\b\3\2\2\2#$\7?\2\2$\n\3\2\2\2%&\7=\2\2&\f\3\2"+
		"\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\16\3\2\2\2,"+
		".\t\3\2\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\t\4\2\2\60/\3\2\2\2\61\62"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\20\3\2\2\2\64\66\7\17\2\2\65\64"+
		"\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\f\2\28\22\3\2\2\29;\t\5\2\2"+
		":9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\b\n\2\2?\24\3\2\2"+
		"\2@A\7,\2\2A\26\3\2\2\2BC\7\61\2\2C\30\3\2\2\2DE\7-\2\2E\32\3\2\2\2FG"+
		"\7/\2\2G\34\3\2\2\2\b\2*-\62\65<\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
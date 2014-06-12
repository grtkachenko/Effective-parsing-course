// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab3_2/bison-antlr/antlr_src/BoolExpressions.g4 by ANTLR 4.x
import org.StructureGraphic.v1.DSTreeNode;

         import java.awt.*;
         import java.util.Arrays;
         import java.util.ArrayList;
         import java.util.List;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoolExpressionsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, AND=2, OR=3, XOR=4, NOT=5, LEFT_PAREN=6, RIGHT_PAREN=7, NEWLINE=8, 
		WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"VAR", "'and'", "'or'", "'xor'", "'not'", "'('", "')'", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"VAR", "AND", "OR", "XOR", "NOT", "LEFT_PAREN", "RIGHT_PAREN", "NEWLINE", 
		"WS"
	};

	public class Tree implements DSTreeNode {
	              private String nodeName;
	              private List<Tree> children;

	              public Tree(String nodeName, Tree... children) {
	                  this.nodeName = nodeName;
	                  this.children = Arrays.asList(children);
	              }

	              public Tree(String nodeName) {
	                  this.nodeName = nodeName;
	              }

	              @Override
	              public String toString() {
	                  if (children == null) {
	                      return nodeName;
	                  }

	                  StringBuilder builder = new StringBuilder();
	                  builder.append("(" + nodeName);

	                  for (Tree child : children) {
	                      builder.append(" " + child);
	                  }
	                  builder.append(")");
	                  return builder.toString();
	              }

	              @Override
	              public DSTreeNode[] DSgetChildren() {
	                  return children != null ? children.toArray(new DSTreeNode[children.size()]) : new DSTreeNode[0];
	              }

	              @Override
	              public Object DSgetValue() {
	                  return nodeName;
	              }

	              @Override
	              public Color DSgetColor() {
	                  return children == null ? Color.RED : null;
	              }

	          }
	          List<Tree> trees = new ArrayList<Tree>();



	public BoolExpressionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BoolExpressions.g4"; }

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
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\5\t,\n\t\3\t\3\t\3\n\6\n\61\n\n\r\n\16\n\62\3\n\3\n\2\2\13"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\3\4\2\13\13\"\"\67\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\33\3"+
		"\2\2\2\t\36\3\2\2\2\13\"\3\2\2\2\r&\3\2\2\2\17(\3\2\2\2\21+\3\2\2\2\23"+
		"\60\3\2\2\2\25\26\4cf\2\26\4\3\2\2\2\27\30\7c\2\2\30\31\7p\2\2\31\32\7"+
		"f\2\2\32\6\3\2\2\2\33\34\7q\2\2\34\35\7t\2\2\35\b\3\2\2\2\36\37\7z\2\2"+
		"\37 \7q\2\2 !\7t\2\2!\n\3\2\2\2\"#\7p\2\2#$\7q\2\2$%\7v\2\2%\f\3\2\2\2"+
		"&\'\7*\2\2\'\16\3\2\2\2()\7+\2\2)\20\3\2\2\2*,\7\17\2\2+*\3\2\2\2+,\3"+
		"\2\2\2,-\3\2\2\2-.\7\f\2\2.\22\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\b\n\2\2\65\24\3"+
		"\2\2\2\5\2+\62\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
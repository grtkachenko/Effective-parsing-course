// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab3_2/bison-antlr/antlr_src/BoolExpressions.g4 by ANTLR 4.x
import org.StructureGraphic.v1.DSTreeNode;

         import java.awt.*;
         import java.util.Arrays;
         import java.util.ArrayList;
         import java.util.List;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoolExpressionsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, AND=2, OR=3, XOR=4, NOT=5, LEFT_PAREN=6, RIGHT_PAREN=7, NEWLINE=8, 
		WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "VAR", "'and'", "'or'", "'xor'", "'not'", "'('", "')'", "NEWLINE", 
		"WS"
	};
	public static final int
		RULE_pascal_exp = 0, RULE_boolexp = 1, RULE_boolexp_prime = 2, RULE_term = 3, 
		RULE_term_prime = 4, RULE_factor = 5;
	public static final String[] ruleNames = {
		"pascal_exp", "boolexp", "boolexp_prime", "term", "term_prime", "factor"
	};

	@Override
	public String getGrammarFileName() { return "BoolExpressions.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

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


	public BoolExpressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Pascal_expContext extends ParserRuleContext {
		public Tree tree;
		public BoolexpContext boolexp;
		public TerminalNode NEWLINE() { return getToken(BoolExpressionsParser.NEWLINE, 0); }
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public Pascal_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pascal_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).enterPascal_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).exitPascal_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolExpressionsVisitor ) return ((BoolExpressionsVisitor<? extends T>)visitor).visitPascal_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pascal_expContext pascal_exp() throws RecognitionException {
		Pascal_expContext _localctx = new Pascal_expContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pascal_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); ((Pascal_expContext)_localctx).boolexp = boolexp();
			setState(13); match(NEWLINE);
			 ((Pascal_expContext)_localctx).tree =  new Tree("pascal_exp", ((Pascal_expContext)_localctx).boolexp.tree); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolexpContext extends ParserRuleContext {
		public Tree tree;
		public TermContext term;
		public Boolexp_primeContext boolexp_prime;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Boolexp_primeContext boolexp_prime() {
			return getRuleContext(Boolexp_primeContext.class,0);
		}
		public BoolexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).enterBoolexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).exitBoolexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolExpressionsVisitor ) return ((BoolExpressionsVisitor<? extends T>)visitor).visitBoolexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexpContext boolexp() throws RecognitionException {
		BoolexpContext _localctx = new BoolexpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_boolexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); ((BoolexpContext)_localctx).term = term();
			setState(17); ((BoolexpContext)_localctx).boolexp_prime = boolexp_prime();
			 ((BoolexpContext)_localctx).tree =  new Tree("boolexp", ((BoolexpContext)_localctx).term.tree, ((BoolexpContext)_localctx).boolexp_prime.tree); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexp_primeContext extends ParserRuleContext {
		public Tree tree;
		public TermContext term;
		public Boolexp_primeContext boolexp_prime;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Boolexp_primeContext boolexp_prime() {
			return getRuleContext(Boolexp_primeContext.class,0);
		}
		public TerminalNode XOR() { return getToken(BoolExpressionsParser.XOR, 0); }
		public TerminalNode OR() { return getToken(BoolExpressionsParser.OR, 0); }
		public Boolexp_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexp_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).enterBoolexp_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).exitBoolexp_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolExpressionsVisitor ) return ((BoolExpressionsVisitor<? extends T>)visitor).visitBoolexp_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexp_primeContext boolexp_prime() throws RecognitionException {
		Boolexp_primeContext _localctx = new Boolexp_primeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_boolexp_prime);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); match(OR);
				setState(21); ((Boolexp_primeContext)_localctx).term = term();
				setState(22); ((Boolexp_primeContext)_localctx).boolexp_prime = boolexp_prime();
				 ((Boolexp_primeContext)_localctx).tree =  new Tree("boolexp_prime", new Tree("OR"), ((Boolexp_primeContext)_localctx).term.tree, _localctx.tree); 
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); match(XOR);
				setState(26); ((Boolexp_primeContext)_localctx).term = term();
				setState(27); ((Boolexp_primeContext)_localctx).boolexp_prime = boolexp_prime();
				 ((Boolexp_primeContext)_localctx).tree =  new Tree("boolexp_prime", new Tree("XOR"), ((Boolexp_primeContext)_localctx).term.tree, _localctx.tree); 
				}
				break;
			case RIGHT_PAREN:
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Tree tree;
		public FactorContext factor;
		public Term_primeContext term_prime;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_primeContext term_prime() {
			return getRuleContext(Term_primeContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolExpressionsVisitor ) return ((BoolExpressionsVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); ((TermContext)_localctx).factor = factor();
			setState(34); ((TermContext)_localctx).term_prime = term_prime();
			 ((TermContext)_localctx).tree =  new Tree("term", ((TermContext)_localctx).factor.tree, ((TermContext)_localctx).term_prime.tree); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_primeContext extends ParserRuleContext {
		public Tree tree;
		public FactorContext factor;
		public Term_primeContext term_prime;
		public TerminalNode AND() { return getToken(BoolExpressionsParser.AND, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_primeContext term_prime() {
			return getRuleContext(Term_primeContext.class,0);
		}
		public Term_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).enterTerm_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).exitTerm_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolExpressionsVisitor ) return ((BoolExpressionsVisitor<? extends T>)visitor).visitTerm_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_primeContext term_prime() throws RecognitionException {
		Term_primeContext _localctx = new Term_primeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term_prime);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); match(AND);
				setState(38); ((Term_primeContext)_localctx).factor = factor();
				setState(39); ((Term_primeContext)_localctx).term_prime = term_prime();
				 ((Term_primeContext)_localctx).tree =  new Tree("term_prime", new Tree("AND"), ((Term_primeContext)_localctx).factor.tree, _localctx.tree); 
				}
				break;
			case OR:
			case XOR:
			case RIGHT_PAREN:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Tree tree;
		public FactorContext not_factor;
		public BoolexpContext boolexp;
		public TerminalNode VAR() { return getToken(BoolExpressionsParser.VAR, 0); }
		public TerminalNode NOT() { return getToken(BoolExpressionsParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(BoolExpressionsParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(BoolExpressionsParser.LEFT_PAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolExpressionsVisitor ) return ((BoolExpressionsVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(VAR);
				 ((FactorContext)_localctx).tree =  new Tree("factor", new Tree("VAR")); 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); match(NOT);
				setState(48); ((FactorContext)_localctx).not_factor = factor();
				 ((FactorContext)_localctx).tree =  new Tree("factor", new Tree("NOT"), ((FactorContext)_localctx).not_factor.tree); 
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); match(LEFT_PAREN);
				setState(52); ((FactorContext)_localctx).boolexp = boolexp();
				setState(53); match(RIGHT_PAREN);
				 ((FactorContext)_localctx).tree =  new Tree("factor", new Tree("("), ((FactorContext)_localctx).boolexp.tree, new Tree(")")); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\"\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6.\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7;\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2;\2\16\3\2\2\2\4\22\3\2\2\2\6!"+
		"\3\2\2\2\b#\3\2\2\2\n-\3\2\2\2\f:\3\2\2\2\16\17\5\4\3\2\17\20\7\n\2\2"+
		"\20\21\b\2\1\2\21\3\3\2\2\2\22\23\5\b\5\2\23\24\5\6\4\2\24\25\b\3\1\2"+
		"\25\5\3\2\2\2\26\27\7\5\2\2\27\30\5\b\5\2\30\31\5\6\4\2\31\32\b\4\1\2"+
		"\32\"\3\2\2\2\33\34\7\6\2\2\34\35\5\b\5\2\35\36\5\6\4\2\36\37\b\4\1\2"+
		"\37\"\3\2\2\2 \"\3\2\2\2!\26\3\2\2\2!\33\3\2\2\2! \3\2\2\2\"\7\3\2\2\2"+
		"#$\5\f\7\2$%\5\n\6\2%&\b\5\1\2&\t\3\2\2\2\'(\7\4\2\2()\5\f\7\2)*\5\n\6"+
		"\2*+\b\6\1\2+.\3\2\2\2,.\3\2\2\2-\'\3\2\2\2-,\3\2\2\2.\13\3\2\2\2/\60"+
		"\7\3\2\2\60;\b\7\1\2\61\62\7\7\2\2\62\63\5\f\7\2\63\64\b\7\1\2\64;\3\2"+
		"\2\2\65\66\7\b\2\2\66\67\5\4\3\2\678\7\t\2\289\b\7\1\29;\3\2\2\2:/\3\2"+
		"\2\2:\61\3\2\2\2:\65\3\2\2\2;\r\3\2\2\2\5!-:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
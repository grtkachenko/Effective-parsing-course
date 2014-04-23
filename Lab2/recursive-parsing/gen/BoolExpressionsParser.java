// Generated from /Users/gtkachenko/Dropbox/Programming/Effective_parsing/Lab2/recursive-parsing/antlr_src/BoolExpressions.g4 by ANTLR 4.x
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
		T__1=1, T__0=2, VAR=3, NEWLINE=4, WS=5, AND=6, OR=7, XOR=8, NOT=9;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "VAR", "NEWLINE", "WS", "'and'", "'or'", "'xor'", 
		"'not'"
	};
	public static final int
		RULE_prog = 0, RULE_boolexp = 1, RULE_boolexp_prime = 2, RULE_term = 3, 
		RULE_term_prime = 4, RULE_factor = 5;
	public static final String[] ruleNames = {
		"prog", "boolexp", "boolexp_prime", "term", "term_prime", "factor"
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

	public BoolExpressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(BoolExpressionsParser.NEWLINE, 0); }
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolExpressionsListener ) ((BoolExpressionsListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolExpressionsVisitor ) return ((BoolExpressionsVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); boolexp();
			setState(13); match(NEWLINE);
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
			setState(15); term();
			setState(16); boolexp_prime();
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
		int _la;
		try {
			setState(23);
			switch (_input.LA(1)) {
			case OR:
			case XOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==XOR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(19); term();
				setState(20); boolexp_prime();
				}
				break;
			case 1:
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

	public static class TermContext extends ParserRuleContext {
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
			setState(25); factor();
			setState(26); term_prime();
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
			setState(33);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); match(AND);
				setState(29); factor();
				setState(30); term_prime();
				}
				break;
			case 1:
			case NEWLINE:
			case OR:
			case XOR:
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
		public TerminalNode VAR() { return getToken(BoolExpressionsParser.VAR, 0); }
		public TerminalNode NOT() { return getToken(BoolExpressionsParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
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
			setState(42);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); match(VAR);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); match(NOT);
				setState(37); factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); match(2);
				setState(39); boolexp();
				setState(40); match(1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\32\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6$\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7-\n\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\t\n,\2\16\3"+
		"\2\2\2\4\21\3\2\2\2\6\31\3\2\2\2\b\33\3\2\2\2\n#\3\2\2\2\f,\3\2\2\2\16"+
		"\17\5\4\3\2\17\20\7\6\2\2\20\3\3\2\2\2\21\22\5\b\5\2\22\23\5\6\4\2\23"+
		"\5\3\2\2\2\24\25\t\2\2\2\25\26\5\b\5\2\26\27\5\6\4\2\27\32\3\2\2\2\30"+
		"\32\3\2\2\2\31\24\3\2\2\2\31\30\3\2\2\2\32\7\3\2\2\2\33\34\5\f\7\2\34"+
		"\35\5\n\6\2\35\t\3\2\2\2\36\37\7\b\2\2\37 \5\f\7\2 !\5\n\6\2!$\3\2\2\2"+
		"\"$\3\2\2\2#\36\3\2\2\2#\"\3\2\2\2$\13\3\2\2\2%-\7\5\2\2&\'\7\13\2\2\'"+
		"-\5\f\7\2()\7\4\2\2)*\5\4\3\2*+\7\3\2\2+-\3\2\2\2,%\3\2\2\2,&\3\2\2\2"+
		",(\3\2\2\2-\r\3\2\2\2\5\31#,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
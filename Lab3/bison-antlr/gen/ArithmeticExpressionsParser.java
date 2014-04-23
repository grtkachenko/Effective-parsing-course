// Generated from /Users/gtkachenko/Dropbox/Programming/Effective_parsing/Lab3/bison-antlr/antlr_src/ArithmeticExpressions.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticExpressionsParser extends Parser {
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
		RULE_boolexp = 0, RULE_boolexp_prime = 1, RULE_term = 2, RULE_term_prime = 3, 
		RULE_factor = 4;
	public static final String[] ruleNames = {
		"boolexp", "boolexp_prime", "term", "term_prime", "factor"
	};

	@Override
	public String getGrammarFileName() { return "ArithmeticExpressions.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticExpressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterBoolexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitBoolexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitBoolexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexpContext boolexp() throws RecognitionException {
		BoolexpContext _localctx = new BoolexpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_boolexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); term();
			setState(11); boolexp_prime();
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
		public TerminalNode NEWLINE() { return getToken(ArithmeticExpressionsParser.NEWLINE, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Boolexp_primeContext boolexp_prime() {
			return getRuleContext(Boolexp_primeContext.class,0);
		}
		public TerminalNode XOR() { return getToken(ArithmeticExpressionsParser.XOR, 0); }
		public TerminalNode OR() { return getToken(ArithmeticExpressionsParser.OR, 0); }
		public Boolexp_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexp_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterBoolexp_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitBoolexp_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitBoolexp_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexp_primeContext boolexp_prime() throws RecognitionException {
		Boolexp_primeContext _localctx = new Boolexp_primeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_boolexp_prime);
		int _la;
		try {
			setState(19);
			switch (_input.LA(1)) {
			case OR:
			case XOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==XOR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(14); term();
				setState(15); boolexp_prime();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(18); match(NEWLINE);
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
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); factor();
			setState(22); term_prime();
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
		public TerminalNode NEWLINE() { return getToken(ArithmeticExpressionsParser.NEWLINE, 0); }
		public TerminalNode AND() { return getToken(ArithmeticExpressionsParser.AND, 0); }
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
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterTerm_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitTerm_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitTerm_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_primeContext term_prime() throws RecognitionException {
		Term_primeContext _localctx = new Term_primeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term_prime);
		try {
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); match(AND);
				setState(25); factor();
				setState(26); term_prime();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29); match(NEWLINE);
				}
				break;
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
		public TerminalNode VAR() { return getToken(ArithmeticExpressionsParser.VAR, 0); }
		public TerminalNode NOT() { return getToken(ArithmeticExpressionsParser.NOT, 0); }
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
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); match(VAR);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); match(NOT);
				setState(34); factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 3);
				{
				setState(35); match(2);
				setState(36); boolexp();
				setState(37); match(1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\26"+
		"\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5!\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6*\n\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\t\n,\2\f\3\2\2\2\4\25\3"+
		"\2\2\2\6\27\3\2\2\2\b \3\2\2\2\n)\3\2\2\2\f\r\5\6\4\2\r\16\5\4\3\2\16"+
		"\3\3\2\2\2\17\20\t\2\2\2\20\21\5\6\4\2\21\22\5\4\3\2\22\26\3\2\2\2\23"+
		"\26\3\2\2\2\24\26\7\6\2\2\25\17\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26"+
		"\5\3\2\2\2\27\30\5\n\6\2\30\31\5\b\5\2\31\7\3\2\2\2\32\33\7\b\2\2\33\34"+
		"\5\n\6\2\34\35\5\b\5\2\35!\3\2\2\2\36!\3\2\2\2\37!\7\6\2\2 \32\3\2\2\2"+
		" \36\3\2\2\2 \37\3\2\2\2!\t\3\2\2\2\"*\7\5\2\2#$\7\13\2\2$*\5\n\6\2%&"+
		"\7\4\2\2&\'\5\2\2\2\'(\7\3\2\2(*\3\2\2\2)\"\3\2\2\2)#\3\2\2\2)%\3\2\2"+
		"\2*\13\3\2\2\2\5\25 )";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
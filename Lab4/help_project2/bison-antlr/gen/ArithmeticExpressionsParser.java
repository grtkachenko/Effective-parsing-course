// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab3_1/bison-antlr/antlr_src/ArithmeticExpressions.g4 by ANTLR 4.x

import java.util.*;

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
		INT=1, ID=2, ENDLINE=3, ENT_STMT=4, ASSIGN=5, PLUS=6, MINUS=7, MUL=8, 
		DIV=9, LEFT_PAREN=10, RIGHT_PAREN=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "ID", "ENDLINE", "';'", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'('", "')'", "WS"
	};
	public static final int
		RULE_calc = 0, RULE_statement = 1, RULE_expr = 2, RULE_expr_prime = 3, 
		RULE_term = 4, RULE_term_prime = 5, RULE_factor = 6;
	public static final String[] ruleNames = {
		"calc", "statement", "expr", "expr_prime", "term", "term_prime", "factor"
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


	Map<String, Integer> memory = new HashMap<String, Integer>();

	public ArithmeticExpressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CalcContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		return calc(0);
	}

	private CalcContext calc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalcContext _localctx = new CalcContext(_ctx, _parentState);
		CalcContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_calc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalcContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_calc);
					setState(15);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(16); statement();
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ENT_STMT() { return getToken(ArithmeticExpressionsParser.ENT_STMT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArithmeticExpressionsParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(ArithmeticExpressionsParser.ID, 0); }
		public TerminalNode ENDLINE() { return getToken(ArithmeticExpressionsParser.ENDLINE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); ((StatementContext)_localctx).ID = match(ID);
				setState(23); match(ASSIGN);
				setState(24); ((StatementContext)_localctx).expr = expr();
				setState(25); match(ENT_STMT);
				setState(26); match(ENDLINE);
				 System.out.println((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null) + "=" + ((StatementContext)_localctx).expr.value); memory.put((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expr.value); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); ((StatementContext)_localctx).expr = expr();
				setState(30); match(ENT_STMT);
				setState(31); match(ENDLINE);
				 System.out.println(((StatementContext)_localctx).expr.value); 
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public TermContext term;
		public Expr_primeContext expr_prime;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); ((ExprContext)_localctx).term = term();
			setState(37); ((ExprContext)_localctx).expr_prime = expr_prime(((ExprContext)_localctx).term.value);
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).expr_prime.value;
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

	public static class Expr_primeContext extends ParserRuleContext {
		public int i;
		public int value;
		public TermContext term;
		public Expr_primeContext e1;
		public Expr_primeContext e2;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ArithmeticExpressionsParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ArithmeticExpressionsParser.PLUS, 0); }
		public Expr_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_primeContext(ParserRuleContext parent, int invokingState, int i) {
			super(parent, invokingState);
			this.i = i;
		}
		@Override public int getRuleIndex() { return RULE_expr_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterExpr_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitExpr_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitExpr_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_primeContext expr_prime(int i) throws RecognitionException {
		Expr_primeContext _localctx = new Expr_primeContext(_ctx, getState(), i);
		enterRule(_localctx, 6, RULE_expr_prime);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case ENT_STMT:
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				((Expr_primeContext)_localctx).value =  _localctx.i;
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); match(PLUS);
				setState(42); ((Expr_primeContext)_localctx).term = term();
				setState(43); ((Expr_primeContext)_localctx).e1 = expr_prime(_localctx.i + ((Expr_primeContext)_localctx).term.value);
				((Expr_primeContext)_localctx).value =  ((Expr_primeContext)_localctx).e1.value;
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(46); match(MINUS);
				setState(47); ((Expr_primeContext)_localctx).term = term();
				setState(48); ((Expr_primeContext)_localctx).e2 = expr_prime(_localctx.i - ((Expr_primeContext)_localctx).term.value);
				((Expr_primeContext)_localctx).value =  ((Expr_primeContext)_localctx).e2.value;
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
		public int value;
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
		enterRule(_localctx, 8, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); ((TermContext)_localctx).factor = factor();
			setState(54); ((TermContext)_localctx).term_prime = term_prime(((TermContext)_localctx).factor.value);
			((TermContext)_localctx).value =  ((TermContext)_localctx).term_prime.value;
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
		public int i;
		public int value;
		public FactorContext factor;
		public Term_primeContext e3;
		public Term_primeContext e4;
		public TerminalNode MUL() { return getToken(ArithmeticExpressionsParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArithmeticExpressionsParser.DIV, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_primeContext term_prime() {
			return getRuleContext(Term_primeContext.class,0);
		}
		public Term_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Term_primeContext(ParserRuleContext parent, int invokingState, int i) {
			super(parent, invokingState);
			this.i = i;
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

	public final Term_primeContext term_prime(int i) throws RecognitionException {
		Term_primeContext _localctx = new Term_primeContext(_ctx, getState(), i);
		enterRule(_localctx, 10, RULE_term_prime);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case ENT_STMT:
			case PLUS:
			case MINUS:
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				((Term_primeContext)_localctx).value =  _localctx.i;
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(MUL);
				setState(59); ((Term_primeContext)_localctx).factor = factor();
				setState(60); ((Term_primeContext)_localctx).e3 = term_prime(_localctx.i * ((Term_primeContext)_localctx).factor.value);
				((Term_primeContext)_localctx).value =  ((Term_primeContext)_localctx).e3.value;
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); match(DIV);
				setState(64); ((Term_primeContext)_localctx).factor = factor();
				setState(65); ((Term_primeContext)_localctx).e4 = term_prime(_localctx.i / ((Term_primeContext)_localctx).factor.value);
				((Term_primeContext)_localctx).value =  ((Term_primeContext)_localctx).e4.value;
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
		public int value;
		public Token INT;
		public Token ID;
		public ExprContext expr;
		public TerminalNode INT() { return getToken(ArithmeticExpressionsParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArithmeticExpressionsParser.ID, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ArithmeticExpressionsParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ArithmeticExpressionsParser.LEFT_PAREN, 0); }
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
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); ((FactorContext)_localctx).INT = match(INT);
				((FactorContext)_localctx).value =  Integer.parseInt((((FactorContext)_localctx).INT!=null?((FactorContext)_localctx).INT.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); ((FactorContext)_localctx).ID = match(ID);
				((FactorContext)_localctx).value =  memory.get((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null));
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); match(LEFT_PAREN);
				setState(75); ((FactorContext)_localctx).expr = expr();
				setState(76); match(RIGHT_PAREN);
				((FactorContext)_localctx).value =  ((FactorContext)_localctx).expr.value;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return calc_sempred((CalcContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean calc_sempred(CalcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66\n"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7G\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\b\2\3\2\t\2\4\6\b\n"+
		"\f\16\2\2T\2\20\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2"+
		"\2\fF\3\2\2\2\16Q\3\2\2\2\20\25\b\2\1\2\21\22\f\4\2\2\22\24\5\4\3\2\23"+
		"\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27"+
		"\25\3\2\2\2\30\31\7\4\2\2\31\32\7\7\2\2\32\33\5\6\4\2\33\34\7\6\2\2\34"+
		"\35\7\5\2\2\35\36\b\3\1\2\36%\3\2\2\2\37 \5\6\4\2 !\7\6\2\2!\"\7\5\2\2"+
		"\"#\b\3\1\2#%\3\2\2\2$\30\3\2\2\2$\37\3\2\2\2%\5\3\2\2\2&\'\5\n\6\2\'"+
		"(\5\b\5\2()\b\4\1\2)\7\3\2\2\2*\66\b\5\1\2+,\7\b\2\2,-\5\n\6\2-.\5\b\5"+
		"\2./\b\5\1\2/\66\3\2\2\2\60\61\7\t\2\2\61\62\5\n\6\2\62\63\5\b\5\2\63"+
		"\64\b\5\1\2\64\66\3\2\2\2\65*\3\2\2\2\65+\3\2\2\2\65\60\3\2\2\2\66\t\3"+
		"\2\2\2\678\5\16\b\289\5\f\7\29:\b\6\1\2:\13\3\2\2\2;G\b\7\1\2<=\7\n\2"+
		"\2=>\5\16\b\2>?\5\f\7\2?@\b\7\1\2@G\3\2\2\2AB\7\13\2\2BC\5\16\b\2CD\5"+
		"\f\7\2DE\b\7\1\2EG\3\2\2\2F;\3\2\2\2F<\3\2\2\2FA\3\2\2\2G\r\3\2\2\2HI"+
		"\7\3\2\2IR\b\b\1\2JK\7\4\2\2KR\b\b\1\2LM\7\f\2\2MN\5\6\4\2NO\7\r\2\2O"+
		"P\b\b\1\2PR\3\2\2\2QH\3\2\2\2QJ\3\2\2\2QL\3\2\2\2R\17\3\2\2\2\7\25$\65"+
		"FQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
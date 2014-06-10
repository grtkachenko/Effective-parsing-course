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
		DIV=9, POW=10, LEFT_PAREN=11, RIGHT_PAREN=12, WS=13;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "ID", "ENDLINE", "';'", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'^'", "'('", "')'", "WS"
	};
	public static final int
		RULE_calc = 0, RULE_statement = 1, RULE_expr = 2, RULE_term = 3, RULE_power = 4, 
		RULE_minus = 5, RULE_factor = 6;
	public static final String[] ruleNames = {
		"calc", "statement", "expr", "term", "power", "minus", "factor"
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
				setState(24); ((StatementContext)_localctx).expr = expr(0);
				setState(25); match(ENT_STMT);
				setState(26); match(ENDLINE);
				 System.out.println((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null) + "=" + ((StatementContext)_localctx).expr.value); memory.put((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expr.value); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); ((StatementContext)_localctx).expr = expr(0);
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
		public ExprContext e1;
		public ExprContext e2;
		public TermContext term;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ArithmeticExpressionsParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ArithmeticExpressionsParser.PLUS, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(37); ((ExprContext)_localctx).term = term(0);
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).term.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(41); match(PLUS);
						setState(42); ((ExprContext)_localctx).term = term(0);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).e1.value + ((ExprContext)_localctx).term.value;
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(46); match(MINUS);
						setState(47); ((ExprContext)_localctx).term = term(0);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).e2.value - ((ExprContext)_localctx).term.value;
						}
						break;
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public int value;
		public TermContext t1;
		public TermContext t2;
		public PowerContext power;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ArithmeticExpressionsParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArithmeticExpressionsParser.DIV, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
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
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56); ((TermContext)_localctx).power = power();
			((TermContext)_localctx).value =  ((TermContext)_localctx).power.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(59);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(60); match(MUL);
						setState(61); ((TermContext)_localctx).power = power();
						((TermContext)_localctx).value =  ((TermContext)_localctx).t1.value * ((TermContext)_localctx).power.value;
						}
						break;

					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.t2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(64);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(65); match(DIV);
						setState(66); ((TermContext)_localctx).power = power();
						((TermContext)_localctx).value =  ((TermContext)_localctx).t2.value / ((TermContext)_localctx).power.value;
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class PowerContext extends ParserRuleContext {
		public int value;
		public MinusContext minus;
		public PowerContext p1;
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public TerminalNode POW() { return getToken(ArithmeticExpressionsParser.POW, 0); }
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_power);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); ((PowerContext)_localctx).minus = minus();
				((PowerContext)_localctx).value =  ((PowerContext)_localctx).minus.value;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); ((PowerContext)_localctx).minus = minus();
				setState(78); match(POW);
				setState(79); ((PowerContext)_localctx).p1 = power();
				((PowerContext)_localctx).value =  (int) Math.pow(((PowerContext)_localctx).minus.value, ((PowerContext)_localctx).p1.value);
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

	public static class MinusContext extends ParserRuleContext {
		public int value;
		public FactorContext factor;
		public MinusContext m1;
		public TerminalNode MINUS() { return getToken(ArithmeticExpressionsParser.MINUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_minus);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case INT:
			case ID:
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); ((MinusContext)_localctx).factor = factor();
				((MinusContext)_localctx).value =  ((MinusContext)_localctx).factor.value;
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); match(MINUS);
				setState(88); ((MinusContext)_localctx).m1 = minus();
				((MinusContext)_localctx).value =  -((MinusContext)_localctx).m1.value;
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
			setState(102);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); ((FactorContext)_localctx).INT = match(INT);
				((FactorContext)_localctx).value =  Integer.parseInt((((FactorContext)_localctx).INT!=null?((FactorContext)_localctx).INT.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); ((FactorContext)_localctx).ID = match(ID);
				((FactorContext)_localctx).value =  memory.get((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null));
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); match(LEFT_PAREN);
				setState(98); ((FactorContext)_localctx).expr = expr(0);
				setState(99); match(RIGHT_PAREN);
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

		case 2: return expr_sempred((ExprContext)_localctx, predIndex);

		case 3: return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);

		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);

		case 2: return precpred(_ctx, 1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\65\n\4\f"+
		"\4\16\48\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5H\n\5\f\5\16\5K\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6U\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bi\n\b\3\b\2\5\2\6\b\t\2\4\6\b\n\f\16\2\2m\2\20\3\2\2\2\4$\3\2\2\2"+
		"\6&\3\2\2\2\b9\3\2\2\2\nT\3\2\2\2\f]\3\2\2\2\16h\3\2\2\2\20\25\b\2\1\2"+
		"\21\22\f\4\2\2\22\24\5\4\3\2\23\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2"+
		"\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\31\7\4\2\2\31\32\7\7\2\2"+
		"\32\33\5\6\4\2\33\34\7\6\2\2\34\35\7\5\2\2\35\36\b\3\1\2\36%\3\2\2\2\37"+
		" \5\6\4\2 !\7\6\2\2!\"\7\5\2\2\"#\b\3\1\2#%\3\2\2\2$\30\3\2\2\2$\37\3"+
		"\2\2\2%\5\3\2\2\2&\'\b\4\1\2\'(\5\b\5\2()\b\4\1\2)\66\3\2\2\2*+\f\4\2"+
		"\2+,\7\b\2\2,-\5\b\5\2-.\b\4\1\2.\65\3\2\2\2/\60\f\3\2\2\60\61\7\t\2\2"+
		"\61\62\5\b\5\2\62\63\b\4\1\2\63\65\3\2\2\2\64*\3\2\2\2\64/\3\2\2\2\65"+
		"8\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\7\3\2\2\28\66\3\2\2\29:\b\5\1"+
		"\2:;\5\n\6\2;<\b\5\1\2<I\3\2\2\2=>\f\4\2\2>?\7\n\2\2?@\5\n\6\2@A\b\5\1"+
		"\2AH\3\2\2\2BC\f\3\2\2CD\7\13\2\2DE\5\n\6\2EF\b\5\1\2FH\3\2\2\2G=\3\2"+
		"\2\2GB\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KI\3\2\2\2LM\5"+
		"\f\7\2MN\b\6\1\2NU\3\2\2\2OP\5\f\7\2PQ\7\f\2\2QR\5\n\6\2RS\b\6\1\2SU\3"+
		"\2\2\2TL\3\2\2\2TO\3\2\2\2U\13\3\2\2\2VW\5\16\b\2WX\b\7\1\2X^\3\2\2\2"+
		"YZ\7\t\2\2Z[\5\f\7\2[\\\b\7\1\2\\^\3\2\2\2]V\3\2\2\2]Y\3\2\2\2^\r\3\2"+
		"\2\2_`\7\3\2\2`i\b\b\1\2ab\7\4\2\2bi\b\b\1\2cd\7\r\2\2de\5\6\4\2ef\7\16"+
		"\2\2fg\b\b\1\2gi\3\2\2\2h_\3\2\2\2ha\3\2\2\2hc\3\2\2\2i\17\3\2\2\2\13"+
		"\25$\64\66GIT]h";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
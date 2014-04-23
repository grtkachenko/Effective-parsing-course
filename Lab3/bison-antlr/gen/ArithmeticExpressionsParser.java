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
		T__3=1, T__2=2, T__1=3, T__0=4, VAR=5, INT=6, NEWLINE=7, WS=8, MUL=9, 
		DIV=10, ADD=11, SUB=12;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "'='", "';'", "VAR", "INT", "NEWLINE", "WS", 
		"'*'", "'/'", "'+'", "'-'"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_term = 3, RULE_factor = 4;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "term", "factor"
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
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << VAR) | (1L << INT) | (1L << SUB))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprOnlyContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(ArithmeticExpressionsParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprOnlyContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterExprOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitExprOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitExprOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(ArithmeticExpressionsParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ArithmeticExpressionsParser.VAR, 0); }
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(25);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15); match(VAR);
				setState(16); match(3);
				setState(17); expr(0);
				setState(18); match(4);
				setState(19); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new ExprOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21); expr(0);
				setState(22); match(4);
				setState(23); match(NEWLINE);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ArithmeticExpressionsParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(ArithmeticExpressionsParser.ADD, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddSubTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterAddSubTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitAddSubTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitAddSubTerm(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddSubTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(28); term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(30);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(31);
					((AddSubContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(32); term(0);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulDivContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ArithmeticExpressionsParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArithmeticExpressionsParser.DIV, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulDivFactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterMulDivFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitMulDivFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitMulDivFactor(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MulDivFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(39); factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(41);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(42);
					((MulDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
						((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(43); factor();
					}
					} 
				}
				setState(48);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ArithmeticExpressionsParser.SUB, 0); }
		public ParensContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends FactorContext {
		public TerminalNode VAR() { return getToken(ArithmeticExpressionsParser.VAR, 0); }
		public TerminalNode SUB() { return getToken(ArithmeticExpressionsParser.SUB, 0); }
		public VarContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends FactorContext {
		public TerminalNode INT() { return getToken(ArithmeticExpressionsParser.INT, 0); }
		public IntContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionsListener ) ((ArithmeticExpressionsListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionsVisitor ) return ((ArithmeticExpressionsVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49); match(INT);
				}
				break;

			case 2:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(50); match(SUB);
					}
					break;
				case VAR:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); match(VAR);
				}
				break;

			case 3:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(55); match(SUB);
					}
					break;
				case 2:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); match(2);
				setState(60); expr(0);
				setState(61); match(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);

		case 3: return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4$\n\4\f"+
		"\4\16\4\'\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\6\3"+
		"\6\3\6\5\6\67\n\6\3\6\3\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\6\2"+
		"\4\6\b\7\2\4\6\b\n\2\4\3\2\r\16\3\2\13\fF\2\r\3\2\2\2\4\33\3\2\2\2\6\35"+
		"\3\2\2\2\b(\3\2\2\2\nA\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2"+
		"\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\7\2\2\22\23\7\5\2\2\23"+
		"\24\5\6\4\2\24\25\7\6\2\2\25\26\7\t\2\2\26\34\3\2\2\2\27\30\5\6\4\2\30"+
		"\31\7\6\2\2\31\32\7\t\2\2\32\34\3\2\2\2\33\21\3\2\2\2\33\27\3\2\2\2\34"+
		"\5\3\2\2\2\35\36\b\4\1\2\36\37\5\b\5\2\37%\3\2\2\2 !\f\4\2\2!\"\t\2\2"+
		"\2\"$\5\b\5\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\7\3\2\2\2\'%\3"+
		"\2\2\2()\b\5\1\2)*\5\n\6\2*\60\3\2\2\2+,\f\4\2\2,-\t\3\2\2-/\5\n\6\2."+
		"+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\t\3\2\2\2\62\60\3\2"+
		"\2\2\63B\7\b\2\2\64\67\7\16\2\2\65\67\3\2\2\2\66\64\3\2\2\2\66\65\3\2"+
		"\2\2\678\3\2\2\28B\7\7\2\29<\7\16\2\2:<\3\2\2\2;9\3\2\2\2;:\3\2\2\2<="+
		"\3\2\2\2=>\7\4\2\2>?\5\6\4\2?@\7\3\2\2@B\3\2\2\2A\63\3\2\2\2A\66\3\2\2"+
		"\2A;\3\2\2\2B\13\3\2\2\2\t\17\33%\60\66;A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
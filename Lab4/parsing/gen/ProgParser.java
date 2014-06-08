// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab4/parsing/grammars/parsing_grammar/Prog.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, NEWLINE=5, WS=6, NON_TERM_NAME=7, TERM_NAME=8, 
		LEFT_PAREN=9, RIGHT_PAREN=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'''", "':'", "';'", "'|'", "NEWLINE", "WS", "NON_TERM_NAME", 
		"TERM_NAME", "'('", "')'"
	};
	public static final int
		RULE_prog = 0, RULE_cur_rule = 1, RULE_non_term_production = 2, RULE_node_non_term_production = 3, 
		RULE_term_production = 4;
	public static final String[] ruleNames = {
		"prog", "cur_rule", "non_term_production", "node_non_term_production", 
		"term_production"
	};

	@Override
	public String getGrammarFileName() { return "Prog.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<Cur_ruleContext> cur_rule() {
			return getRuleContexts(Cur_ruleContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ProgParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProgParser.NEWLINE, i);
		}
		public Cur_ruleContext cur_rule(int i) {
			return getRuleContext(Cur_ruleContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitProg(this);
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << NON_TERM_NAME) | (1L << TERM_NAME))) != 0)) {
				{
				setState(15);
				switch (_input.LA(1)) {
				case NON_TERM_NAME:
				case TERM_NAME:
					{
					{
					setState(10); cur_rule();
					setState(11); match(3);
					setState(12); match(NEWLINE);
					}
					}
					break;
				case NEWLINE:
					{
					setState(14); match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Cur_ruleContext extends ParserRuleContext {
		public Cur_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cur_rule; }
	 
		public Cur_ruleContext() { }
		public void copyFrom(Cur_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermLabelContext extends Cur_ruleContext {
		public TerminalNode TERM_NAME() { return getToken(ProgParser.TERM_NAME, 0); }
		public Term_productionContext term_production(int i) {
			return getRuleContext(Term_productionContext.class,i);
		}
		public List<Term_productionContext> term_production() {
			return getRuleContexts(Term_productionContext.class);
		}
		public TermLabelContext(Cur_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterTermLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitTermLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitTermLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonTermLabelContext extends Cur_ruleContext {
		public List<Non_term_productionContext> non_term_production() {
			return getRuleContexts(Non_term_productionContext.class);
		}
		public TerminalNode NON_TERM_NAME() { return getToken(ProgParser.NON_TERM_NAME, 0); }
		public Non_term_productionContext non_term_production(int i) {
			return getRuleContext(Non_term_productionContext.class,i);
		}
		public NonTermLabelContext(Cur_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterNonTermLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitNonTermLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitNonTermLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cur_ruleContext cur_rule() throws RecognitionException {
		Cur_ruleContext _localctx = new Cur_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cur_rule);
		int _la;
		try {
			setState(40);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				_localctx = new NonTermLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20); match(NON_TERM_NAME);
				setState(21); match(2);
				setState(22); non_term_production();
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(23); match(4);
					setState(24); non_term_production();
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TERM_NAME:
				_localctx = new TermLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30); match(TERM_NAME);
				setState(31); match(2);
				setState(32); term_production();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(33); match(4);
					setState(34); term_production();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Non_term_productionContext extends ParserRuleContext {
		public List<Node_non_term_productionContext> node_non_term_production() {
			return getRuleContexts(Node_non_term_productionContext.class);
		}
		public Node_non_term_productionContext node_non_term_production(int i) {
			return getRuleContext(Node_non_term_productionContext.class,i);
		}
		public Non_term_productionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_term_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterNon_term_production(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitNon_term_production(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitNon_term_production(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_term_productionContext non_term_production() throws RecognitionException {
		Non_term_productionContext _localctx = new Non_term_productionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_non_term_production);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(42); node_non_term_production();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Node_non_term_productionContext extends ParserRuleContext {
		public TerminalNode TERM_NAME() { return getToken(ProgParser.TERM_NAME, 0); }
		public TerminalNode NON_TERM_NAME() { return getToken(ProgParser.NON_TERM_NAME, 0); }
		public Node_non_term_productionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_non_term_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterNode_non_term_production(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitNode_non_term_production(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitNode_non_term_production(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_non_term_productionContext node_non_term_production() throws RecognitionException {
		Node_non_term_productionContext _localctx = new Node_non_term_productionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node_non_term_production);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==NON_TERM_NAME || _la==TERM_NAME) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Term_productionContext extends ParserRuleContext {
		public TerminalNode NON_TERM_NAME(int i) {
			return getToken(ProgParser.NON_TERM_NAME, i);
		}
		public List<TerminalNode> NON_TERM_NAME() { return getTokens(ProgParser.NON_TERM_NAME); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(ProgParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(ProgParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(ProgParser.LEFT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(ProgParser.RIGHT_PAREN, i);
		}
		public Term_productionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterTerm_production(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitTerm_production(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitTerm_production(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_productionContext term_production() throws RecognitionException {
		Term_productionContext _localctx = new Term_productionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term_production);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1) {
				{
				{
				setState(50); match(1);
				setState(51);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(52); match(1);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3&\n\3\f\3\16\3)\13\3\5\3+\n\3\3\4\7\4.\n\4\f\4\16\4\61\13\4\3"+
		"\5\3\5\3\6\3\6\3\6\7\68\n\6\f\6\16\6;\13\6\3\6\2\2\7\2\4\6\b\n\2\4\3\2"+
		"\t\n\4\2\t\t\13\f>\2\23\3\2\2\2\4*\3\2\2\2\6/\3\2\2\2\b\62\3\2\2\2\n9"+
		"\3\2\2\2\f\r\5\4\3\2\r\16\7\5\2\2\16\17\7\7\2\2\17\22\3\2\2\2\20\22\7"+
		"\7\2\2\21\f\3\2\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3"+
		"\2\2\2\24\3\3\2\2\2\25\23\3\2\2\2\26\27\7\t\2\2\27\30\7\4\2\2\30\35\5"+
		"\6\4\2\31\32\7\6\2\2\32\34\5\6\4\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36+\3\2\2\2\37\35\3\2\2\2 !\7\n\2\2!\"\7\4\2\2\""+
		"\'\5\n\6\2#$\7\6\2\2$&\5\n\6\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2"+
		"\2(+\3\2\2\2)\'\3\2\2\2*\26\3\2\2\2* \3\2\2\2+\5\3\2\2\2,.\5\b\5\2-,\3"+
		"\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61/\3\2\2\2\62\63"+
		"\t\2\2\2\63\t\3\2\2\2\64\65\7\3\2\2\65\66\t\3\2\2\668\7\3\2\2\67\64\3"+
		"\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\13\3\2\2\2;9\3\2\2\2\t\21\23\35"+
		"\'*/9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
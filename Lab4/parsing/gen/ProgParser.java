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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, NEWLINE=9, 
		WS=10, NON_TERM_NAME=11, TERM_NAME=12, LEFT_PAREN=13, RIGHT_PAREN=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'@header'", "'''", "'{'", "':'", "'@members'", "'}'", "';'", 
		"'|'", "NEWLINE", "WS", "NON_TERM_NAME", "TERM_NAME", "'('", "')'"
	};
	public static final int
		RULE_prog = 0, RULE_header = 1, RULE_members = 2, RULE_cur_rule = 3, RULE_non_term_production = 4, 
		RULE_node_non_term_production = 5, RULE_term_production = 6;
	public static final String[] ruleNames = {
		"prog", "header", "members", "cur_rule", "non_term_production", "node_non_term_production", 
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
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
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
			setState(15);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(14); header();
				}
			}

			setState(18);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(17); members();
				}
			}

			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << NON_TERM_NAME) | (1L << TERM_NAME))) != 0)) {
				{
				setState(25);
				switch (_input.LA(1)) {
				case NON_TERM_NAME:
				case TERM_NAME:
					{
					{
					setState(20); cur_rule();
					setState(21); match(7);
					setState(22); match(NEWLINE);
					}
					}
					break;
				case NEWLINE:
					{
					setState(24); match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class HeaderContext extends ParserRuleContext {
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(1);
			setState(31); match(3);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(32);
					matchWildcard();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
			setState(38); match(6);
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

	public static class MembersContext extends ParserRuleContext {
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(5);
			setState(41); match(3);
			{
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(42);
					matchWildcard();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
			setState(48); match(6);
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
		enterRule(_localctx, 6, RULE_cur_rule);
		int _la;
		try {
			setState(70);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				_localctx = new NonTermLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50); match(NON_TERM_NAME);
				setState(51); match(4);
				setState(52); non_term_production();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==8) {
					{
					{
					setState(53); match(8);
					setState(54); non_term_production();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TERM_NAME:
				_localctx = new TermLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60); match(TERM_NAME);
				setState(61); match(4);
				setState(62); term_production();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==8) {
					{
					{
					setState(63); match(8);
					setState(64); term_production();
					}
					}
					setState(69);
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
		enterRule(_localctx, 8, RULE_non_term_production);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(72); node_non_term_production();
				}
				}
				setState(77);
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
		enterRule(_localctx, 10, RULE_node_non_term_production);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
		enterRule(_localctx, 12, RULE_term_production);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(80); match(2);
				setState(81);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(82); match(2);
				}
				}
				setState(87);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\5\2\22\n\2\3\2\5\2\25\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\7\3$\n"+
		"\3\f\3\16\3\'\13\3\3\3\3\3\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"D\n\5\f\5\16\5G\13\5\5\5I\n\5\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3\b"+
		"\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\4%/\2\t\2\4\6\b\n\f\16\2\4\3\2\r"+
		"\16\4\2\r\r\17\20^\2\21\3\2\2\2\4 \3\2\2\2\6*\3\2\2\2\bH\3\2\2\2\nM\3"+
		"\2\2\2\fP\3\2\2\2\16W\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\21\22\3\2\2"+
		"\2\22\24\3\2\2\2\23\25\5\6\4\2\24\23\3\2\2\2\24\25\3\2\2\2\25\35\3\2\2"+
		"\2\26\27\5\b\5\2\27\30\7\t\2\2\30\31\7\13\2\2\31\34\3\2\2\2\32\34\7\13"+
		"\2\2\33\26\3\2\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36\3\3\2\2\2\37\35\3\2\2\2 !\7\3\2\2!%\7\5\2\2\"$\13\2\2\2#\"\3\2"+
		"\2\2$\'\3\2\2\2%&\3\2\2\2%#\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\b\2\2)\5"+
		"\3\2\2\2*+\7\7\2\2+/\7\5\2\2,.\13\2\2\2-,\3\2\2\2.\61\3\2\2\2/\60\3\2"+
		"\2\2/-\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\b\2\2\63\7\3\2\2\2\64"+
		"\65\7\r\2\2\65\66\7\6\2\2\66;\5\n\6\2\678\7\n\2\28:\5\n\6\29\67\3\2\2"+
		"\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<I\3\2\2\2=;\3\2\2\2>?\7\16\2\2?@\7\6"+
		"\2\2@E\5\16\b\2AB\7\n\2\2BD\5\16\b\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3"+
		"\2\2\2FI\3\2\2\2GE\3\2\2\2H\64\3\2\2\2H>\3\2\2\2I\t\3\2\2\2JL\5\f\7\2"+
		"KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OM\3\2\2\2PQ\t\2\2"+
		"\2Q\r\3\2\2\2RS\7\4\2\2ST\t\3\2\2TV\7\4\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2"+
		"\2\2WX\3\2\2\2X\17\3\2\2\2YW\3\2\2\2\r\21\24\33\35%/;EHMW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
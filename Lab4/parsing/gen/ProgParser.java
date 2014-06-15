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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		WS=10, NEWLINE=11, NON_TERM_NAME=12, TERM_NAME=13, MIX_CASE_NAME=14, JAVACODE=15, 
		LEFT_PAREN=16, RIGHT_PAREN=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'@header'", "'''", "']'", "'['", "':'", "'returns'", "'@members'", 
		"';'", "'|'", "WS", "NEWLINE", "NON_TERM_NAME", "TERM_NAME", "MIX_CASE_NAME", 
		"JAVACODE", "'('", "')'"
	};
	public static final int
		RULE_prog = 0, RULE_header = 1, RULE_members = 2, RULE_cur_rule = 3, RULE_non_term_production = 4, 
		RULE_node_non_term_production = 5, RULE_term_production = 6, RULE_decl_synth = 7, 
		RULE_type = 8;
	public static final String[] ruleNames = {
		"prog", "header", "members", "cur_rule", "non_term_production", "node_non_term_production", 
		"term_production", "decl_synth", "type"
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(18); match(NEWLINE);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24); header();
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(25); match(NEWLINE);
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(31); match(NEWLINE);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37); members();
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38); match(NEWLINE);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << NON_TERM_NAME) | (1L << TERM_NAME))) != 0)) {
				{
				setState(49);
				switch (_input.LA(1)) {
				case NON_TERM_NAME:
				case TERM_NAME:
					{
					{
					setState(44); cur_rule();
					setState(45); match(8);
					setState(46); match(NEWLINE);
					}
					}
					break;
				case NEWLINE:
					{
					setState(48); match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
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
	 
		public HeaderContext() { }
		public void copyFrom(HeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderLabelContext extends HeaderContext {
		public TerminalNode NEWLINE() { return getToken(ProgParser.NEWLINE, 0); }
		public TerminalNode JAVACODE() { return getToken(ProgParser.JAVACODE, 0); }
		public HeaderLabelContext(HeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterHeaderLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitHeaderLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitHeaderLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			_localctx = new HeaderLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(1);
			setState(55); match(JAVACODE);
			setState(56); match(NEWLINE);
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
	 
		public MembersContext() { }
		public void copyFrom(MembersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MembersLabelContext extends MembersContext {
		public TerminalNode NEWLINE() { return getToken(ProgParser.NEWLINE, 0); }
		public TerminalNode JAVACODE() { return getToken(ProgParser.JAVACODE, 0); }
		public MembersLabelContext(MembersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterMembersLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitMembersLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitMembersLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);
		try {
			_localctx = new MembersLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(7);
			setState(59); match(JAVACODE);
			setState(60); match(NEWLINE);
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
		public Decl_synthContext decl_synth() {
			return getRuleContext(Decl_synthContext.class,0);
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
			setState(85);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				_localctx = new NonTermLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62); match(NON_TERM_NAME);
				setState(64);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(63); decl_synth();
					}
				}

				setState(66); match(5);
				setState(67); non_term_production();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(68); match(9);
					setState(69); non_term_production();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TERM_NAME:
				_localctx = new TermLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(TERM_NAME);
				setState(76); match(5);
				setState(77); term_production();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(78); match(9);
					setState(79); term_production();
					}
					}
					setState(84);
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
		public TerminalNode JAVACODE() { return getToken(ProgParser.JAVACODE, 0); }
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(87); node_non_term_production();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_la = _input.LA(1);
			if (_la==JAVACODE) {
				{
				setState(93); match(JAVACODE);
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
			setState(96);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(98); match(2);
				setState(99);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(100); match(2);
				}
				}
				setState(105);
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

	public static class Decl_synthContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Decl_synthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_synth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterDecl_synth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitDecl_synth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitDecl_synth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_synthContext decl_synth() throws RecognitionException {
		Decl_synthContext _localctx = new Decl_synthContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl_synth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(6);
			setState(107); match(4);
			setState(108); type();
			setState(109); match(3);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TERM_NAME() { return getToken(ProgParser.TERM_NAME, 0); }
		public TerminalNode NON_TERM_NAME() { return getToken(ProgParser.NON_TERM_NAME, 0); }
		public TerminalNode MIX_CASE_NAME() { return getToken(ProgParser.MIX_CASE_NAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << TERM_NAME) | (1L << MIX_CASE_NAME))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23t\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5C"+
		"\n\5\3\5\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\5\3\5\3\5\7\5S"+
		"\n\5\f\5\16\5V\13\5\5\5X\n\5\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\5\6a\n\6"+
		"\3\7\3\7\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\16\17\4\2\16\16\22\23\3\2\16"+
		"\20w\2\27\3\2\2\2\48\3\2\2\2\6<\3\2\2\2\bW\3\2\2\2\n\\\3\2\2\2\fb\3\2"+
		"\2\2\16i\3\2\2\2\20l\3\2\2\2\22q\3\2\2\2\24\26\7\r\2\2\25\24\3\2\2\2\26"+
		"\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32"+
		"\36\5\4\3\2\33\35\7\r\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37$\3\2\2\2 \36\3\2\2\2!#\7\r\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2"+
		"\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'+\5\6\4\2(*\7\r\2\2)(\3\2\2\2*-\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,\65\3\2\2\2-+\3\2\2\2./\5\b\5\2/\60\7\n\2\2"+
		"\60\61\7\r\2\2\61\64\3\2\2\2\62\64\7\r\2\2\63.\3\2\2\2\63\62\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67\65\3\2\2\289\7"+
		"\3\2\29:\7\21\2\2:;\7\r\2\2;\5\3\2\2\2<=\7\t\2\2=>\7\21\2\2>?\7\r\2\2"+
		"?\7\3\2\2\2@B\7\16\2\2AC\5\20\t\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\7"+
		"\2\2EJ\5\n\6\2FG\7\13\2\2GI\5\n\6\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2KX\3\2\2\2LJ\3\2\2\2MN\7\17\2\2NO\7\7\2\2OT\5\16\b\2PQ\7\13\2\2"+
		"QS\5\16\b\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2"+
		"\2W@\3\2\2\2WM\3\2\2\2X\t\3\2\2\2Y[\5\f\7\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_a\7\21\2\2`_\3\2\2\2`a\3\2\2\2a\13"+
		"\3\2\2\2bc\t\2\2\2c\r\3\2\2\2de\7\4\2\2ef\t\3\2\2fh\7\4\2\2gd\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2\2ki\3\2\2\2lm\7\b\2\2mn\7\6\2"+
		"\2no\5\22\n\2op\7\5\2\2p\21\3\2\2\2qr\t\4\2\2r\23\3\2\2\2\17\27\36$+\63"+
		"\65BJTW\\`i";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		RULE_type = 8, RULE_var = 9;
	public static final String[] ruleNames = {
		"prog", "header", "members", "cur_rule", "non_term_production", "node_non_term_production", 
		"term_production", "decl_synth", "type", "var"
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(20); match(NEWLINE);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); header();
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(27); match(NEWLINE);
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(33); match(NEWLINE);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39); members();
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40); match(NEWLINE);
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << NON_TERM_NAME) | (1L << TERM_NAME))) != 0)) {
				{
				setState(51);
				switch (_input.LA(1)) {
				case NON_TERM_NAME:
				case TERM_NAME:
					{
					{
					setState(46); cur_rule();
					setState(47); match(8);
					setState(48); match(NEWLINE);
					}
					}
					break;
				case NEWLINE:
					{
					setState(50); match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55);
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
			setState(56); match(1);
			setState(57); match(JAVACODE);
			setState(58); match(NEWLINE);
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
			setState(60); match(7);
			setState(61); match(JAVACODE);
			setState(62); match(NEWLINE);
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
			setState(87);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				_localctx = new NonTermLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(NON_TERM_NAME);
				setState(66);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(65); decl_synth();
					}
				}

				setState(68); match(5);
				setState(69); non_term_production();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(70); match(9);
					setState(71); non_term_production();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TERM_NAME:
				_localctx = new TermLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(TERM_NAME);
				setState(78); match(5);
				setState(79); term_production();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(80); match(9);
					setState(81); term_production();
					}
					}
					setState(86);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(89); node_non_term_production();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_la = _input.LA(1);
			if (_la==JAVACODE) {
				{
				setState(95); match(JAVACODE);
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
			setState(98);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(100); match(2);
				setState(101);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(102); match(2);
				}
				}
				setState(107);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
			setState(108); match(6);
			setState(109); match(4);
			setState(110); type();
			setState(111); var();
			setState(112); match(3);
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
			setState(114);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode TERM_NAME() { return getToken(ProgParser.TERM_NAME, 0); }
		public TerminalNode NON_TERM_NAME() { return getToken(ProgParser.NON_TERM_NAME, 0); }
		public TerminalNode MIX_CASE_NAME() { return getToken(ProgParser.MIX_CASE_NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgListener ) ((ProgListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgVisitor ) return ((ProgVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\5\5E\n\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6\5"+
		"\6c\n\6\3\7\3\7\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\16"+
		"\17\4\2\16\16\22\23\3\2\16\20{\2\31\3\2\2\2\4:\3\2\2\2\6>\3\2\2\2\bY\3"+
		"\2\2\2\n^\3\2\2\2\fd\3\2\2\2\16k\3\2\2\2\20n\3\2\2\2\22t\3\2\2\2\24v\3"+
		"\2\2\2\26\30\7\r\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34 \5\4\3\2\35\37\7\r\2\2\36\35\3\2"+
		"\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!&\3\2\2\2\" \3\2\2\2#%\7\r\2\2"+
		"$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)-\5\6\4"+
		"\2*,\7\r\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\67\3\2\2\2/-\3\2"+
		"\2\2\60\61\5\b\5\2\61\62\7\n\2\2\62\63\7\r\2\2\63\66\3\2\2\2\64\66\7\r"+
		"\2\2\65\60\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8\3\3\2\2\29\67\3\2\2\2:;\7\3\2\2;<\7\21\2\2<=\7\r\2\2=\5\3\2\2\2>?\7"+
		"\t\2\2?@\7\21\2\2@A\7\r\2\2A\7\3\2\2\2BD\7\16\2\2CE\5\20\t\2DC\3\2\2\2"+
		"DE\3\2\2\2EF\3\2\2\2FG\7\7\2\2GL\5\n\6\2HI\7\13\2\2IK\5\n\6\2JH\3\2\2"+
		"\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MZ\3\2\2\2NL\3\2\2\2OP\7\17\2\2PQ\7\7"+
		"\2\2QV\5\16\b\2RS\7\13\2\2SU\5\16\b\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW"+
		"\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YB\3\2\2\2YO\3\2\2\2Z\t\3\2\2\2[]\5\f\7\2"+
		"\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2ac\7\21"+
		"\2\2ba\3\2\2\2bc\3\2\2\2c\13\3\2\2\2de\t\2\2\2e\r\3\2\2\2fg\7\4\2\2gh"+
		"\t\3\2\2hj\7\4\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2"+
		"mk\3\2\2\2no\7\b\2\2op\7\6\2\2pq\5\22\n\2qr\5\24\13\2rs\7\5\2\2s\21\3"+
		"\2\2\2tu\t\4\2\2u\23\3\2\2\2vw\t\4\2\2w\25\3\2\2\2\17\31 &-\65\67DLVY"+
		"^bk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
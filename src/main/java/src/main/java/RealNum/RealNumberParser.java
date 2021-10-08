// Generated from E:/code/testantlr/src/main/antlr4\RealNumber.g4 by ANTLR 4.9.1
package src.main.java.RealNum;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RealNumberParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUM=2, WS=3;
	public static final int
		RULE_realnum = 0, RULE_dicinum = 1, RULE_intnum = 2, RULE_num = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"realnum", "dicinum", "intnum", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RealNumber.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RealNumberParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RealnumContext extends ParserRuleContext {
		public IntnumContext intnum() {
			return getRuleContext(IntnumContext.class,0);
		}
		public DicinumContext dicinum() {
			return getRuleContext(DicinumContext.class,0);
		}
		public RealnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).enterRealnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).exitRealnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RealNumberVisitor ) return ((RealNumberVisitor<? extends T>)visitor).visitRealnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealnumContext realnum() throws RecognitionException {
		RealnumContext _localctx = new RealnumContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_realnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			intnum(0);
			setState(9);
			match(T__0);
			setState(10);
			dicinum(0);
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

	public static class DicinumContext extends ParserRuleContext {
		public DicinumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dicinum; }
	 
		public DicinumContext() { }
		public void copyFrom(DicinumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XiaoshuContext extends DicinumContext {
		public DicinumContext dicinum() {
			return getRuleContext(DicinumContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public XiaoshuContext(DicinumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).enterXiaoshu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).exitXiaoshu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RealNumberVisitor ) return ((RealNumberVisitor<? extends T>)visitor).visitXiaoshu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Danti0Context extends DicinumContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Danti0Context(DicinumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).enterDanti0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).exitDanti0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RealNumberVisitor ) return ((RealNumberVisitor<? extends T>)visitor).visitDanti0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DicinumContext dicinum() throws RecognitionException {
		return dicinum(0);
	}

	private DicinumContext dicinum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DicinumContext _localctx = new DicinumContext(_ctx, _parentState);
		DicinumContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_dicinum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Danti0Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(13);
			num();
			}
			_ctx.stop = _input.LT(-1);
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new XiaoshuContext(new DicinumContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_dicinum);
					setState(15);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(16);
					num();
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

	public static class IntnumContext extends ParserRuleContext {
		public IntnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intnum; }
	 
		public IntnumContext() { }
		public void copyFrom(IntnumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Danti1Context extends IntnumContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Danti1Context(IntnumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).enterDanti1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).exitDanti1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RealNumberVisitor ) return ((RealNumberVisitor<? extends T>)visitor).visitDanti1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZhengshuContext extends IntnumContext {
		public IntnumContext intnum() {
			return getRuleContext(IntnumContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ZhengshuContext(IntnumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).enterZhengshu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).exitZhengshu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RealNumberVisitor ) return ((RealNumberVisitor<? extends T>)visitor).visitZhengshu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntnumContext intnum() throws RecognitionException {
		return intnum(0);
	}

	private IntnumContext intnum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntnumContext _localctx = new IntnumContext(_ctx, _parentState);
		IntnumContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_intnum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Danti1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(23);
			num();
			}
			_ctx.stop = _input.LT(-1);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ZhengshuContext(new IntnumContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_intnum);
					setState(25);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(26);
					num();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(RealNumberParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RealNumberListener ) ((RealNumberListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RealNumberVisitor ) return ((RealNumberVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(NUM);
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
		case 1:
			return dicinum_sempred((DicinumContext)_localctx, predIndex);
		case 2:
			return intnum_sempred((IntnumContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dicinum_sempred(DicinumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean intnum_sempred(IntnumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\24\n\3\f\3"+
		"\16\3\27\13\3\3\4\3\4\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\5\3\5\3"+
		"\5\2\4\4\6\6\2\4\6\b\2\2\2\"\2\n\3\2\2\2\4\16\3\2\2\2\6\30\3\2\2\2\b\""+
		"\3\2\2\2\n\13\5\6\4\2\13\f\7\3\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17\b\3\1"+
		"\2\17\20\5\b\5\2\20\25\3\2\2\2\21\22\f\4\2\2\22\24\5\b\5\2\23\21\3\2\2"+
		"\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\25\3\2\2"+
		"\2\30\31\b\4\1\2\31\32\5\b\5\2\32\37\3\2\2\2\33\34\f\4\2\2\34\36\5\b\5"+
		"\2\35\33\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\37"+
		"\3\2\2\2\"#\7\4\2\2#\t\3\2\2\2\4\25\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from E:/code/testantlr/src/main/antlr4\CBinaryNum.g4 by ANTLR 4.9.1
package src.main.java.CBinaryNum;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CBinaryNumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LING=2, YI=3, WS=4;
	public static final int
		RULE_binaryNum = 0, RULE_fractiondig = 1, RULE_binarydig = 2, RULE_bit = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"binaryNum", "fractiondig", "binarydig", "bit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'0'", "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LING", "YI", "WS"
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
	public String getGrammarFileName() { return "CBinaryNum.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CBinaryNumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BinaryNumContext extends ParserRuleContext {
		public BinarydigContext binarydig() {
			return getRuleContext(BinarydigContext.class,0);
		}
		public FractiondigContext fractiondig() {
			return getRuleContext(FractiondigContext.class,0);
		}
		public BinaryNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).enterBinaryNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).exitBinaryNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBinaryNumVisitor ) return ((CBinaryNumVisitor<? extends T>)visitor).visitBinaryNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryNumContext binaryNum() throws RecognitionException {
		BinaryNumContext _localctx = new BinaryNumContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_binaryNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			binarydig(0);
			setState(9);
			match(T__0);
			setState(10);
			fractiondig(0);
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

	public static class FractiondigContext extends ParserRuleContext {
		public FractiondigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fractiondig; }
	 
		public FractiondigContext() { }
		public void copyFrom(FractiondigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XiaoshuContext extends FractiondigContext {
		public FractiondigContext fractiondig() {
			return getRuleContext(FractiondigContext.class,0);
		}
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public XiaoshuContext(FractiondigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).enterXiaoshu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).exitXiaoshu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBinaryNumVisitor ) return ((CBinaryNumVisitor<? extends T>)visitor).visitXiaoshu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Danti0Context extends FractiondigContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public Danti0Context(FractiondigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).enterDanti0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).exitDanti0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBinaryNumVisitor ) return ((CBinaryNumVisitor<? extends T>)visitor).visitDanti0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractiondigContext fractiondig() throws RecognitionException {
		return fractiondig(0);
	}

	private FractiondigContext fractiondig(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FractiondigContext _localctx = new FractiondigContext(_ctx, _parentState);
		FractiondigContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_fractiondig, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Danti0Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(13);
			bit();
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
					_localctx = new XiaoshuContext(new FractiondigContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_fractiondig);
					setState(15);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(16);
					bit();
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

	public static class BinarydigContext extends ParserRuleContext {
		public BinarydigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarydig; }
	 
		public BinarydigContext() { }
		public void copyFrom(BinarydigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Danti1Context extends BinarydigContext {
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public Danti1Context(BinarydigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).enterDanti1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).exitDanti1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBinaryNumVisitor ) return ((CBinaryNumVisitor<? extends T>)visitor).visitDanti1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZhengshuContext extends BinarydigContext {
		public BinarydigContext binarydig() {
			return getRuleContext(BinarydigContext.class,0);
		}
		public BitContext bit() {
			return getRuleContext(BitContext.class,0);
		}
		public ZhengshuContext(BinarydigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).enterZhengshu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).exitZhengshu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBinaryNumVisitor ) return ((CBinaryNumVisitor<? extends T>)visitor).visitZhengshu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinarydigContext binarydig() throws RecognitionException {
		return binarydig(0);
	}

	private BinarydigContext binarydig(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BinarydigContext _localctx = new BinarydigContext(_ctx, _parentState);
		BinarydigContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_binarydig, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Danti1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(23);
			bit();
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
					_localctx = new ZhengshuContext(new BinarydigContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_binarydig);
					setState(25);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(26);
					bit();
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

	public static class BitContext extends ParserRuleContext {
		public BitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit; }
	 
		public BitContext() { }
		public void copyFrom(BitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZeroContext extends BitContext {
		public TerminalNode LING() { return getToken(CBinaryNumParser.LING, 0); }
		public ZeroContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).enterZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).exitZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBinaryNumVisitor ) return ((CBinaryNumVisitor<? extends T>)visitor).visitZero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneContext extends BitContext {
		public TerminalNode YI() { return getToken(CBinaryNumParser.YI, 0); }
		public OneContext(BitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).enterOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBinaryNumListener ) ((CBinaryNumListener)listener).exitOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBinaryNumVisitor ) return ((CBinaryNumVisitor<? extends T>)visitor).visitOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitContext bit() throws RecognitionException {
		BitContext _localctx = new BitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bit);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LING:
				_localctx = new ZeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(LING);
				}
				break;
			case YI:
				_localctx = new OneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(YI);
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
		case 1:
			return fractiondig_sempred((FractiondigContext)_localctx, predIndex);
		case 2:
			return binarydig_sempred((BinarydigContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fractiondig_sempred(FractiondigContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean binarydig_sempred(BinarydigContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\'\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\24\n\3\f\3"+
		"\16\3\27\13\3\3\4\3\4\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\5\3\5\5"+
		"\5%\n\5\3\5\2\4\4\6\6\2\4\6\b\2\2\2%\2\n\3\2\2\2\4\16\3\2\2\2\6\30\3\2"+
		"\2\2\b$\3\2\2\2\n\13\5\6\4\2\13\f\7\3\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17"+
		"\b\3\1\2\17\20\5\b\5\2\20\25\3\2\2\2\21\22\f\4\2\2\22\24\5\b\5\2\23\21"+
		"\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\25"+
		"\3\2\2\2\30\31\b\4\1\2\31\32\5\b\5\2\32\37\3\2\2\2\33\34\f\4\2\2\34\36"+
		"\5\b\5\2\35\33\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2"+
		"\2!\37\3\2\2\2\"%\7\4\2\2#%\7\5\2\2$\"\3\2\2\2$#\3\2\2\2%\t\3\2\2\2\5"+
		"\25\37$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
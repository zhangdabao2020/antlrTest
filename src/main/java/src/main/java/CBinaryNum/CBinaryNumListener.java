// Generated from E:/code/testantlr/src/main/antlr4\CBinaryNum.g4 by ANTLR 4.9.1
package src.main.java.CBinaryNum;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CBinaryNumParser}.
 */
public interface CBinaryNumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CBinaryNumParser#binaryNum}.
	 * @param ctx the parse tree
	 */
	void enterBinaryNum(CBinaryNumParser.BinaryNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBinaryNumParser#binaryNum}.
	 * @param ctx the parse tree
	 */
	void exitBinaryNum(CBinaryNumParser.BinaryNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xiaoshu}
	 * labeled alternative in {@link CBinaryNumParser#fractiondig}.
	 * @param ctx the parse tree
	 */
	void enterXiaoshu(CBinaryNumParser.XiaoshuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xiaoshu}
	 * labeled alternative in {@link CBinaryNumParser#fractiondig}.
	 * @param ctx the parse tree
	 */
	void exitXiaoshu(CBinaryNumParser.XiaoshuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code danti0}
	 * labeled alternative in {@link CBinaryNumParser#fractiondig}.
	 * @param ctx the parse tree
	 */
	void enterDanti0(CBinaryNumParser.Danti0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code danti0}
	 * labeled alternative in {@link CBinaryNumParser#fractiondig}.
	 * @param ctx the parse tree
	 */
	void exitDanti0(CBinaryNumParser.Danti0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code danti1}
	 * labeled alternative in {@link CBinaryNumParser#binarydig}.
	 * @param ctx the parse tree
	 */
	void enterDanti1(CBinaryNumParser.Danti1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code danti1}
	 * labeled alternative in {@link CBinaryNumParser#binarydig}.
	 * @param ctx the parse tree
	 */
	void exitDanti1(CBinaryNumParser.Danti1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code zhengshu}
	 * labeled alternative in {@link CBinaryNumParser#binarydig}.
	 * @param ctx the parse tree
	 */
	void enterZhengshu(CBinaryNumParser.ZhengshuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zhengshu}
	 * labeled alternative in {@link CBinaryNumParser#binarydig}.
	 * @param ctx the parse tree
	 */
	void exitZhengshu(CBinaryNumParser.ZhengshuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zero}
	 * labeled alternative in {@link CBinaryNumParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterZero(CBinaryNumParser.ZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zero}
	 * labeled alternative in {@link CBinaryNumParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitZero(CBinaryNumParser.ZeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code one}
	 * labeled alternative in {@link CBinaryNumParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterOne(CBinaryNumParser.OneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code one}
	 * labeled alternative in {@link CBinaryNumParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitOne(CBinaryNumParser.OneContext ctx);
}
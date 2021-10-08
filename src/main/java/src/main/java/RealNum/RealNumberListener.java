// Generated from E:/code/testantlr/src/main/antlr4\RealNumber.g4 by ANTLR 4.9.1
package src.main.java.RealNum;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RealNumberParser}.
 */
public interface RealNumberListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RealNumberParser#realnum}.
	 * @param ctx the parse tree
	 */
	void enterRealnum(RealNumberParser.RealnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link RealNumberParser#realnum}.
	 * @param ctx the parse tree
	 */
	void exitRealnum(RealNumberParser.RealnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xiaoshu}
	 * labeled alternative in {@link RealNumberParser#dicinum}.
	 * @param ctx the parse tree
	 */
	void enterXiaoshu(RealNumberParser.XiaoshuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xiaoshu}
	 * labeled alternative in {@link RealNumberParser#dicinum}.
	 * @param ctx the parse tree
	 */
	void exitXiaoshu(RealNumberParser.XiaoshuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code danti0}
	 * labeled alternative in {@link RealNumberParser#dicinum}.
	 * @param ctx the parse tree
	 */
	void enterDanti0(RealNumberParser.Danti0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code danti0}
	 * labeled alternative in {@link RealNumberParser#dicinum}.
	 * @param ctx the parse tree
	 */
	void exitDanti0(RealNumberParser.Danti0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code danti1}
	 * labeled alternative in {@link RealNumberParser#intnum}.
	 * @param ctx the parse tree
	 */
	void enterDanti1(RealNumberParser.Danti1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code danti1}
	 * labeled alternative in {@link RealNumberParser#intnum}.
	 * @param ctx the parse tree
	 */
	void exitDanti1(RealNumberParser.Danti1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code zhengshu}
	 * labeled alternative in {@link RealNumberParser#intnum}.
	 * @param ctx the parse tree
	 */
	void enterZhengshu(RealNumberParser.ZhengshuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zhengshu}
	 * labeled alternative in {@link RealNumberParser#intnum}.
	 * @param ctx the parse tree
	 */
	void exitZhengshu(RealNumberParser.ZhengshuContext ctx);
	/**
	 * Enter a parse tree produced by {@link RealNumberParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(RealNumberParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link RealNumberParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(RealNumberParser.NumContext ctx);
}
// Generated from E:/code/testantlr/src/main/antlr4\CBinaryNum.g4 by ANTLR 4.9.1
package src.main.java.CBinaryNum;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CBinaryNumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CBinaryNumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CBinaryNumParser#binaryNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryNum(CBinaryNumParser.BinaryNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xiaoshu}
	 * labeled alternative in {@link CBinaryNumParser#fractiondig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXiaoshu(CBinaryNumParser.XiaoshuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code danti0}
	 * labeled alternative in {@link CBinaryNumParser#fractiondig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDanti0(CBinaryNumParser.Danti0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code danti1}
	 * labeled alternative in {@link CBinaryNumParser#binarydig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDanti1(CBinaryNumParser.Danti1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code zhengshu}
	 * labeled alternative in {@link CBinaryNumParser#binarydig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZhengshu(CBinaryNumParser.ZhengshuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zero}
	 * labeled alternative in {@link CBinaryNumParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZero(CBinaryNumParser.ZeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code one}
	 * labeled alternative in {@link CBinaryNumParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne(CBinaryNumParser.OneContext ctx);
}
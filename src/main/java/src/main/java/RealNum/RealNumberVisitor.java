// Generated from E:/code/testantlr/src/main/antlr4\RealNumber.g4 by ANTLR 4.9.1
package src.main.java.RealNum;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RealNumberParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RealNumberVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RealNumberParser#realnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealnum(RealNumberParser.RealnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xiaoshu}
	 * labeled alternative in {@link RealNumberParser#dicinum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXiaoshu(RealNumberParser.XiaoshuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code danti0}
	 * labeled alternative in {@link RealNumberParser#dicinum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDanti0(RealNumberParser.Danti0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code danti1}
	 * labeled alternative in {@link RealNumberParser#intnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDanti1(RealNumberParser.Danti1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code zhengshu}
	 * labeled alternative in {@link RealNumberParser#intnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZhengshu(RealNumberParser.ZhengshuContext ctx);
	/**
	 * Visit a parse tree produced by {@link RealNumberParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(RealNumberParser.NumContext ctx);
}
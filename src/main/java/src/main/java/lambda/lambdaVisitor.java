// Generated from E:/code/testantlr/src/main/antlr4\lambda.g4 by ANTLR 4.9.1
package src.main.java.lambda;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(lambdaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(lambdaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#function_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_(lambdaParser.Function_Context ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(lambdaParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#appfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppfunction(lambdaParser.AppfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(lambdaParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(lambdaParser.ConstantContext ctx);
}
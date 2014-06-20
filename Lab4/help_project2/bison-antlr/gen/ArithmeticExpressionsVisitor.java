// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab3_1/bison-antlr/antlr_src/ArithmeticExpressions.g4 by ANTLR 4.x

import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticExpressionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#term_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_prime(@NotNull ArithmeticExpressionsParser.Term_primeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ArithmeticExpressionsParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull ArithmeticExpressionsParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#expr_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prime(@NotNull ArithmeticExpressionsParser.Expr_primeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ArithmeticExpressionsParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(@NotNull ArithmeticExpressionsParser.CalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull ArithmeticExpressionsParser.FactorContext ctx);
}
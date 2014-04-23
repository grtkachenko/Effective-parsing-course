// Generated from /Users/gtkachenko/Dropbox/Programming/Effective_parsing/Lab3/bison-antlr/antlr_src/ArithmeticExpressions.g4 by ANTLR 4.x
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
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull ArithmeticExpressionsParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#boolexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexp(@NotNull ArithmeticExpressionsParser.BoolexpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull ArithmeticExpressionsParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#boolexp_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexp_prime(@NotNull ArithmeticExpressionsParser.Boolexp_primeContext ctx);
}
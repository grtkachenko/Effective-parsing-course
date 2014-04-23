// Generated from /Users/gtkachenko/Dropbox/Programming/Effective_parsing/Lab3/bison-antlr/antlr_src/ArithmeticExpressions.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticExpressionsParser}.
 */
public interface ArithmeticExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#term_prime}.
	 * @param ctx the parse tree
	 */
	void enterTerm_prime(@NotNull ArithmeticExpressionsParser.Term_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#term_prime}.
	 * @param ctx the parse tree
	 */
	void exitTerm_prime(@NotNull ArithmeticExpressionsParser.Term_primeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull ArithmeticExpressionsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull ArithmeticExpressionsParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void enterBoolexp(@NotNull ArithmeticExpressionsParser.BoolexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void exitBoolexp(@NotNull ArithmeticExpressionsParser.BoolexpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull ArithmeticExpressionsParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull ArithmeticExpressionsParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#boolexp_prime}.
	 * @param ctx the parse tree
	 */
	void enterBoolexp_prime(@NotNull ArithmeticExpressionsParser.Boolexp_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#boolexp_prime}.
	 * @param ctx the parse tree
	 */
	void exitBoolexp_prime(@NotNull ArithmeticExpressionsParser.Boolexp_primeContext ctx);
}
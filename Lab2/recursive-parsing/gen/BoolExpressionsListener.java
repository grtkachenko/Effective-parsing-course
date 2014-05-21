// Generated from /Users/gtkachenko/Dropbox/Programming/Effective_parsing/Lab2/recursive-parsing/antlr_src/BoolExpressions.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoolExpressionsParser}.
 */
public interface BoolExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoolExpressionsParser#term_prime}.
	 * @param ctx the parse tree
	 */
	void enterTerm_prime(@NotNull BoolExpressionsParser.Term_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolExpressionsParser#term_prime}.
	 * @param ctx the parse tree
	 */
	void exitTerm_prime(@NotNull BoolExpressionsParser.Term_primeContext ctx);

	/**
	 * Enter a parse tree produced by {@link BoolExpressionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull BoolExpressionsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolExpressionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull BoolExpressionsParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link BoolExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull BoolExpressionsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull BoolExpressionsParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link BoolExpressionsParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void enterBoolexp(@NotNull BoolExpressionsParser.BoolexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolExpressionsParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void exitBoolexp(@NotNull BoolExpressionsParser.BoolexpContext ctx);

	/**
	 * Enter a parse tree produced by {@link BoolExpressionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull BoolExpressionsParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolExpressionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull BoolExpressionsParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link BoolExpressionsParser#boolexp_prime}.
	 * @param ctx the parse tree
	 */
	void enterBoolexp_prime(@NotNull BoolExpressionsParser.Boolexp_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolExpressionsParser#boolexp_prime}.
	 * @param ctx the parse tree
	 */
	void exitBoolexp_prime(@NotNull BoolExpressionsParser.Boolexp_primeContext ctx);
}
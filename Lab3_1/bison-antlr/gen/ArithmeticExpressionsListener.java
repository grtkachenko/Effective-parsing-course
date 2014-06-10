// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab3_1/bison-antlr/antlr_src/ArithmeticExpressions.g4 by ANTLR 4.x

import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticExpressionsParser}.
 */
public interface ArithmeticExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ArithmeticExpressionsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ArithmeticExpressionsParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull ArithmeticExpressionsParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull ArithmeticExpressionsParser.MinusContext ctx);

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
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull ArithmeticExpressionsParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull ArithmeticExpressionsParser.PowerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ArithmeticExpressionsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ArithmeticExpressionsParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(@NotNull ArithmeticExpressionsParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(@NotNull ArithmeticExpressionsParser.CalcContext ctx);

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
}
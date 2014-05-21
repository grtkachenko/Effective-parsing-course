// Generated from /Users/gtkachenko/Dropbox/Programming/Effective_parsing/Lab3/bison-antlr/antlr_src/ArithmeticExpressions.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticExpressionsParser}.
 */
public interface ArithmeticExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#ExprOnly}.
	 * @param ctx the parse tree
	 */
	void enterExprOnly(@NotNull ArithmeticExpressionsParser.ExprOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#ExprOnly}.
	 * @param ctx the parse tree
	 */
	void exitExprOnly(@NotNull ArithmeticExpressionsParser.ExprOnlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#Parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull ArithmeticExpressionsParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#Parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull ArithmeticExpressionsParser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ArithmeticExpressionsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ArithmeticExpressionsParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#Assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull ArithmeticExpressionsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#Assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull ArithmeticExpressionsParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#SimpleDeg}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeg(@NotNull ArithmeticExpressionsParser.SimpleDegContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#SimpleDeg}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeg(@NotNull ArithmeticExpressionsParser.SimpleDegContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull ArithmeticExpressionsParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull ArithmeticExpressionsParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#AddSubTerm}.
	 * @param ctx the parse tree
	 */
	void enterAddSubTerm(@NotNull ArithmeticExpressionsParser.AddSubTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#AddSubTerm}.
	 * @param ctx the parse tree
	 */
	void exitAddSubTerm(@NotNull ArithmeticExpressionsParser.AddSubTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#Int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull ArithmeticExpressionsParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#Int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull ArithmeticExpressionsParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#Var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull ArithmeticExpressionsParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#Var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull ArithmeticExpressionsParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#FactorDeg}.
	 * @param ctx the parse tree
	 */
	void enterFactorDeg(@NotNull ArithmeticExpressionsParser.FactorDegContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#FactorDeg}.
	 * @param ctx the parse tree
	 */
	void exitFactorDeg(@NotNull ArithmeticExpressionsParser.FactorDegContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#MulDivFactor}.
	 * @param ctx the parse tree
	 */
	void enterMulDivFactor(@NotNull ArithmeticExpressionsParser.MulDivFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#MulDivFactor}.
	 * @param ctx the parse tree
	 */
	void exitMulDivFactor(@NotNull ArithmeticExpressionsParser.MulDivFactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionsParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull ArithmeticExpressionsParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionsParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull ArithmeticExpressionsParser.MulDivContext ctx);
}
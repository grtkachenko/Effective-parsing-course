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
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#Parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull ArithmeticExpressionsParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ArithmeticExpressionsParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull ArithmeticExpressionsParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#AddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull ArithmeticExpressionsParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull ArithmeticExpressionsParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#Var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull ArithmeticExpressionsParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionsParser#MulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull ArithmeticExpressionsParser.MulDivContext ctx);
}
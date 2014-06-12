// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab3_2/bison-antlr/antlr_src/BoolExpressions.g4 by ANTLR 4.x
import org.StructureGraphic.v1.DSTreeNode;

         import java.awt.*;
         import java.util.Arrays;
         import java.util.ArrayList;
         import java.util.List;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoolExpressionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoolExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BoolExpressionsParser#term_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_prime(@NotNull BoolExpressionsParser.Term_primeContext ctx);

	/**
	 * Visit a parse tree produced by {@link BoolExpressionsParser#pascal_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPascal_exp(@NotNull BoolExpressionsParser.Pascal_expContext ctx);

	/**
	 * Visit a parse tree produced by {@link BoolExpressionsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull BoolExpressionsParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link BoolExpressionsParser#boolexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexp(@NotNull BoolExpressionsParser.BoolexpContext ctx);

	/**
	 * Visit a parse tree produced by {@link BoolExpressionsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull BoolExpressionsParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link BoolExpressionsParser#boolexp_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexp_prime(@NotNull BoolExpressionsParser.Boolexp_primeContext ctx);
}
// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab4/parsing/grammars/parsing_grammar/Prog.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgParser#TermLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermLabel(@NotNull ProgParser.TermLabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ProgParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgParser#node_non_term_production}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_non_term_production(@NotNull ProgParser.Node_non_term_productionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgParser#NonTermLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTermLabel(@NotNull ProgParser.NonTermLabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgParser#non_term_production}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_term_production(@NotNull ProgParser.Non_term_productionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgParser#term_production}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_production(@NotNull ProgParser.Term_productionContext ctx);
}
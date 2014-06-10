// Generated from /Users/gtkachenko/Documents/Effective-parsing-course/Lab4/parsing/grammars/parsing_grammar/Prog.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgParser}.
 */
public interface ProgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgParser#TermLabel}.
	 * @param ctx the parse tree
	 */
	void enterTermLabel(@NotNull ProgParser.TermLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#TermLabel}.
	 * @param ctx the parse tree
	 */
	void exitTermLabel(@NotNull ProgParser.TermLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ProgParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ProgParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgParser#node_non_term_production}.
	 * @param ctx the parse tree
	 */
	void enterNode_non_term_production(@NotNull ProgParser.Node_non_term_productionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#node_non_term_production}.
	 * @param ctx the parse tree
	 */
	void exitNode_non_term_production(@NotNull ProgParser.Node_non_term_productionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgParser#NonTermLabel}.
	 * @param ctx the parse tree
	 */
	void enterNonTermLabel(@NotNull ProgParser.NonTermLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#NonTermLabel}.
	 * @param ctx the parse tree
	 */
	void exitNonTermLabel(@NotNull ProgParser.NonTermLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgParser#non_term_production}.
	 * @param ctx the parse tree
	 */
	void enterNon_term_production(@NotNull ProgParser.Non_term_productionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#non_term_production}.
	 * @param ctx the parse tree
	 */
	void exitNon_term_production(@NotNull ProgParser.Non_term_productionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(@NotNull ProgParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(@NotNull ProgParser.MembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull ProgParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull ProgParser.HeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgParser#term_production}.
	 * @param ctx the parse tree
	 */
	void enterTerm_production(@NotNull ProgParser.Term_productionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgParser#term_production}.
	 * @param ctx the parse tree
	 */
	void exitTerm_production(@NotNull ProgParser.Term_productionContext ctx);
}
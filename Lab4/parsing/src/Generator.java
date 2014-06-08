import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 08.06.14
 * Time: 18:13
 */
public class Generator {
    public static void parseFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);;
        ANTLRInputStream input = new ANTLRInputStream(is);
        ProgLexer lexer = new ProgLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProgParser parser = new ProgParser(tokens);

        final HashMap<String, NonTermNode> nonTerminals = new HashMap<String, NonTermNode>();
        final HashMap<String, TermNode> terminals = new HashMap<String, TermNode>();

        ProgVisitor<Object> visitor = new ProgBaseVisitor<Object>() {

            @Override
            public Object visitNonTermLabel(@NotNull ProgParser.NonTermLabelContext ctx) {
                String name = ctx.NON_TERM_NAME().getText();
                NonTermNode curNode = getNonTerminalNode(name);
                List<Production> productions = new ArrayList<Production>();
                for (ProgParser.Non_term_productionContext non_term_productionContext : ctx.non_term_production()) {
                    Production production = new Production();
                    for (ProgParser.Node_non_term_productionContext node : non_term_productionContext.node_non_term_production()) {
                        production.addNode(node.NON_TERM_NAME() != null ? getNonTerminalNode(node.NON_TERM_NAME().getText())
                            : getTerminalNode(node.TERM_NAME().getText()));
                    }
                    productions.add(production);
                }
                curNode.addProductions(productions);
                return super.visitNonTermLabel(ctx);
            }

            private TermNode getTerminalNode(String name) {
                if (!terminals.containsKey(name)) {
                    terminals.put(name, new TermNode(name));
                }
                return terminals.get(name);
            }

            private NonTermNode getNonTerminalNode(String name) {
                if (!nonTerminals.containsKey(name)) {
                    nonTerminals.put(name, new NonTermNode(name));
                }
                return nonTerminals.get(name);
            }

            @Override
            public Object visitTermLabel(@NotNull ProgParser.TermLabelContext ctx) {
                String name = ctx.TERM_NAME().getText();
                TermNode curNode = getTerminalNode(name);
                for (ProgParser.Term_productionContext term_productionContext : ctx.term_production()) {
                    for (TerminalNode node : term_productionContext.NON_TERM_NAME()) {
                        curNode.addStringProduction(node.getText());
                    }
                    for (TerminalNode node : term_productionContext.LEFT_PAREN()) {
                        curNode.addStringProduction(node.getText());
                    }
                    for (TerminalNode node : term_productionContext.RIGHT_PAREN()) {
                        curNode.addStringProduction(node.getText());
                    }
                }
                return super.visitTermLabel(ctx);
            }
        };
        visitor.visit(parser.prog());

        System.out.println(nonTerminals);
        System.out.println(terminals);
    }
}

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 08.06.14
 * Time: 18:13
 */
public class Generator {
    private static final String GENERATED_FILES_PATH = "generated_files";
    private static final String DEFAULT_PARSER_NAME = "MyParser";
    private static final String DEFAULT_LEXER_NAME = "LexicalAnalyzer";
    private static final String DEFAULT_TOKEN_FILE_NAME = "Token";
    private static final String EPS_NODE_NAME = "EPS";
    private static final String END_NODE_NAME = "END";
    private static final String END_MARKER = "$";

    private File file;

    /**
     * first node to be appeared
     */
    private NonTermNode startNode;
    private final HashMap<String, NonTermNode> nonTerminals = new HashMap<String, NonTermNode>();
    private final HashMap<String, TermNode> terminals = new HashMap<String, TermNode>();
    private final HashMap<Node, HashSet<String>> first = new HashMap<Node, HashSet<String>>();
    private final HashMap<NonTermNode, HashSet<String>> follow = new HashMap<NonTermNode, HashSet<String>>();

    public Generator(File file) {
        this.file = file;
    }

    public void generateFiles() throws IOException {
        InputStream is = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ProgLexer lexer = new ProgLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProgParser parser = new ProgParser(tokens);
        ProgVisitor<Object> visitor = new ProgBaseVisitor<Object>() {
            @Override
            public Object visitNonTermLabel(@NotNull ProgParser.NonTermLabelContext ctx) {
                String name = ctx.NON_TERM_NAME().getText();
                NonTermNode curNode = getNonTerminalNode(name);
                if (startNode == null) {
                    startNode = curNode;
                }
                List<Production> productions = new ArrayList<Production>();

                for (ProgParser.Non_term_productionContext non_term_productionContext : ctx.non_term_production()) {
                    Production production = new Production();

                    if (non_term_productionContext.node_non_term_production().isEmpty()) {
                        TermNode node = getTerminalNode(EPS_NODE_NAME);
                        node.addStringProduction("");
                        production.addNode(node);
                    }

                    for (ProgParser.Node_non_term_productionContext node : non_term_productionContext.node_non_term_production()) {
                        production.addNode(node.NON_TERM_NAME() != null ? getNonTerminalNode(node.NON_TERM_NAME().getText())
                            : getTerminalNode(node.TERM_NAME().getText()));
                    }
                    productions.add(production);
                }
                curNode.addProductions(productions);
                return super.visitNonTermLabel(ctx);
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
        TermNode endNode = getTerminalNode(END_NODE_NAME);
        endNode.addStringProduction(END_MARKER);
        terminals.put(END_NODE_NAME, endNode);

        cleanGenerateDirectory();
        generateParser();
        generateLexer();
        generateTokenFile();
        computeFirst();
        computeFollow();
        for (Node node : first.keySet()) {
//            System.out.println(node.name + " - " + first.get(node));
        }
        for (Node node : follow.keySet()) {
            System.out.println(node.name + " - " + follow.get(node));
        }
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

    private void computeFirst() {
        for (String name : terminals.keySet()) {
            HashSet<String> curFirstSet = new HashSet<String>(terminals.get(name).getProductionList());
            first.put(terminals.get(name), curFirstSet);
        }
        for (String name : nonTerminals.keySet()) {
            first.put(nonTerminals.get(name), new HashSet<String>());
        }

        while (true) {
            boolean needToBreak = true;
            for (String name : nonTerminals.keySet()) {
                for (Production production : nonTerminals.get(name).getProductionList()) {
                    for (int i = 0; i < production.getCount(); i++) {
                        boolean isOk = true;
                        for (int j = 0; j < i; j++) {
                            if (!first.get(production.getNode(j)).contains("")) {
                                isOk = false;
                                break;
                            }
                        }
                        if (isOk) {
                            for (String cur : first.get(production.getNode(i))) {
                                if (!first.get(nonTerminals.get(name)).contains(cur)) {
                                    first.get(nonTerminals.get(name)).add(cur);
                                    needToBreak = false;
                                }
                            }
                        }
                    }
                }
            }
            if (needToBreak) {
                break;
            }
        }
    }

    private void computeFollow() {
        for (String name : nonTerminals.keySet()) {
            follow.put(nonTerminals.get(name), new HashSet<String>());
        }
        follow.get(startNode).add(END_MARKER);
        while (true) {
            boolean needToBreak = true;
            for (String name : nonTerminals.keySet()) {
                for (Production production : nonTerminals.get(name).getProductionList()) {
                    for (int i = 0; i < production.getCount(); i++) {
                        if (!production.getNode(i).isTerminal) {
                            for (int j = i + 1; j < production.getCount(); j++) {
                                boolean isOk = true;
                                for (int k = i + 1; k < j; k++) {
                                    if (!first.get(production.getNode(k)).contains("")) {
                                        isOk = false;
                                        break;
                                    }
                                }
                                if (isOk) {
                                    for (String cur : first.get(production.getNode(j))) {
                                        if (cur.length() > 0 && !follow.get(production.getNode(i)).contains(cur)) {
                                            follow.get(production.getNode(i)).add(cur);
                                            needToBreak = false;
                                        }
                                    }
                                }

                            }
                            boolean isOk = true;
                            for (int j = i + 1; j < production.getCount(); j++) {
                                if (!first.get(production.getNode(j)).contains("")) {
                                    isOk = false;
                                    break;
                                }
                            }
                            if (isOk) {
                                for (String cur : follow.get(nonTerminals.get(name))) {
                                    if (cur.length() > 0 && !follow.get(production.getNode(i)).contains(cur)) {
                                        follow.get(production.getNode(i)).add(cur);
                                        needToBreak = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (needToBreak) {
                break;
            }
        }

    }

    private void generateParser() throws IOException {
        File file = new File(GENERATED_FILES_PATH, DEFAULT_PARSER_NAME + ".java");
        file.createNewFile();
        PrintWriter out = new PrintWriter(file);
        out.println("import java.io.InputStream;\n" +
                "import java.text.ParseException;\n");

        out.println("public class " + DEFAULT_PARSER_NAME + "{");
        out.println(String.format("    private LexicalAnalyzer lex;\n" +
                "\n" +
                "    public Tree parse(InputStream is) throws ParseException {\n" +
                "        lex = new LexicalAnalyzer(is);\n" +
                "        lex.nextToken();\n" +
                "        return null;\n" +
                "    }"));
        out.println("}");
        out.close();
    }

    private void generateTokenFile() throws IOException {
        File file = new File(GENERATED_FILES_PATH, DEFAULT_TOKEN_FILE_NAME + ".java");
        file.createNewFile();
        PrintWriter out = new PrintWriter(file);


        out.print("public enum " + DEFAULT_TOKEN_FILE_NAME + " {\n    ");
        List<String> tokenNames = new ArrayList<String>(terminals.keySet());
        for (int i = 0; i < tokenNames.size(); i++) {
            out.print(tokenNames.get(i).toUpperCase() + (i != tokenNames.size() - 1 ? ", " : ""));
        }
        out.println();
        out.println("}");
        out.close();
    }

    private void generateLexer() throws IOException {
        File file = new File(GENERATED_FILES_PATH, DEFAULT_LEXER_NAME + ".java");
        file.createNewFile();
        PrintWriter out = new PrintWriter(file);
        out.println("import java.io.IOException;\n" +
                "import java.io.InputStream;\n" +
                "import java.text.ParseException;\n");

        out.println("public class " + DEFAULT_LEXER_NAME + "{");

        out.println("    private InputStream is;\n" +
                "    private int curChar;\n" +
                "    private int curPos;\n" +
                "    private Token curToken;\n");

        out.println("    public LexicalAnalyzer(InputStream is) throws ParseException {\n" +
                "        this.is = is;\n" +
                "        curPos = 0;\n" +
                "        nextChar();\n" +
                "    }\n" +
                "\n" +
                "    private boolean isBlank(int c) {\n" +
                "        return c == ' ' || c == '\\r' || c == '\\n' || c == '\\t';\n" +
                "    }\n" +
                "\n" +
                "    private void nextChar() throws ParseException {\n" +
                "        curPos++;\n" +
                "        try {\n" +
                "            curChar = is.read();\n" +
                "        } catch (IOException e) {\n" +
                "            throw new ParseException(e.getMessage(), curPos);\n" +
                "        }\n" +
                "    }\n    public Token getCurToken() {\n" +
                "        return curToken;\n" +
                "    }\n" +
                "\n" +
                "    public int getCurPos() {\n" +
                "        return curPos;\n" +
                "    }\n");

        out.println("    public void nextToken() throws ParseException {\n" +
                "        while (isBlank(curChar)) {\n" +
                "            nextChar();\n" +
                "        }\n");
        out.println("        if (curChar == -1) {\n" +
                "            curToken = Token.END;\n" +
                "            return;\n" +
                "        }\n" +
                "        StringBuilder curTokenStringBuilder = new StringBuilder();\n" +
                "        while (!isBlank(curChar)) {\n" +
                "            curTokenStringBuilder.append((char) curChar);\n" +
                "            nextChar();\n" +
                "        }\n" +
                "        String curTokenString = curTokenStringBuilder.toString();\n");
        for (String curStringTerminal : terminals.keySet()) {
            for (String productionString : terminals.get(curStringTerminal).getProductionList()) {
                out.println(String.format("        if (\"%s\".equals(curTokenString)) {\n" +
                        "            curToken = Token.%s;\n            return;\n        }\n", productionString, curStringTerminal.toUpperCase()));
            }
        }
        out.println("    }\n}");
        out.close();

    }

    private void cleanGenerateDirectory() throws IOException {
        File file = new File(GENERATED_FILES_PATH);
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                child.delete();
            }
        }
    }
}

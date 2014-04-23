import org.StructureGraphic.v1.DSTreeNode;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 19.04.14
 * Time: 17:37
 */
public class Tree implements DSTreeNode {
    public static final String EPSILON = "epsilon";
    public static final String BOOLEXP = "boolexp";
    public static final String BOOLEXP_PRIME = "boolexp_prime";
    public static final String TERM = "term";
    public static final String TERM_PRIME = "term_prime";
    public static final String FACTOR = "factor";
    public static final String XOR = "xor";
    public static final String OR = "or";
    public static final String AND = "and";
    public static final String NOT = "not";

    private String nodeName;
    private List<Tree> children;
    private boolean isEpsilon = false;

    public Tree(String nodeName, Tree... children) {
        this(nodeName, false, children);
    }

    public Tree(String nodeName, boolean isEpsilon, Tree... children) {
        this.nodeName = nodeName;
        this.children = Arrays.asList(children);
        this.isEpsilon = isEpsilon;
    }

    public Tree(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public String toString() {
        if (children == null || (children.size() == 1 && children.get(0).isEpsilon)) {
            return nodeName;
        }

        StringBuilder builder = new StringBuilder();
        builder.append("(" + nodeName);

        for (Tree child : children) {
            builder.append(" " + child);
        }
        builder.append(")");
        return builder.toString();
    }

    @Override
    public DSTreeNode[] DSgetChildren() {
        return children != null ? children.toArray(new DSTreeNode[children.size()]) : new DSTreeNode[0];
    }

    @Override
    public Object DSgetValue() {
        return nodeName;
    }

    @Override
    public Color DSgetColor() {
        if (EPSILON.equals(nodeName)) {
            return Color.BLUE;
        }
        return children == null ? Color.RED : null;
    }
}

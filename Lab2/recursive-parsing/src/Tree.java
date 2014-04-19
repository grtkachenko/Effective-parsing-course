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
    public static final String BOOLEXP = "BOOLEAXNP";
    public static final String BOOLEXP_PRIME = "BOOLEXP'";
    public static final String TERM = "TERM";
    public static final String TERM_PRIME = "TERM'";
    public static final String FACTOR = "FACTOR'";
    public static final String XOR = "xor";
    public static final String OR = "or";
    public static final String AND = "and";
    public static final String NOT = "not";


    private String nodeName;
    private List<Tree> children;

    public Tree(String nodeName, Tree... children) {
        this.nodeName = nodeName;
        this.children = Arrays.asList(children);
    }

    public Tree(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Node : " + nodeName + "; Children :");
        if (children != null) {
            for (Tree child : children) {
                builder.append(child.nodeName + ", ");
            }

            for (Tree child : children) {
                builder.append("\n" + child);
            }

        }
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

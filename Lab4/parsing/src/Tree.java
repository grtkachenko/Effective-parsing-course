import org.StructureGraphic.v1.DSTreeNode;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 09.06.14
 * Time: 2:15
 */
public class Tree implements DSTreeNode {
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
        if (children == null) {
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
        return children == null ? Color.RED : null;
    }

}

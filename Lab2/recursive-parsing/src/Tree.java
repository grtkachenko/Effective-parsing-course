import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 19.04.14
 * Time: 17:37
 */
public class Tree {
    String node;

    List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Node : " + node + "; Children :");
        if (children != null) {
            for (Tree child : children) {
                builder.append(child.node + ", ");
            }

            for (Tree child : children) {
                builder.append("\n" + child);
            }

        }
        return builder.toString();
    }
}

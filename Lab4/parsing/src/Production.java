import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 08.06.14
 * Time: 20:18
 */
public class Production {
    private List<Node> nodes = new ArrayList<Node>();
    private String translatingSymbol;

    public void addNode(Node node) {
        nodes.add(node);
    }

    public int getCount() {
        return nodes.size();
    }

    public Node getNode(int pos) {
        return nodes.get(pos);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setTranslatingSymbol(String translatingSymbol) {
        this.translatingSymbol = translatingSymbol;
    }

    public String getTranslatingSymbol() {
        return translatingSymbol;
    }
}

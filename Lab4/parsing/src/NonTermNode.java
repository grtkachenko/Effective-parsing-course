import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 08.06.14
 * Time: 20:14
 */
public class NonTermNode extends Node {
    private List<Production> productionList = new ArrayList<Production>();

    public NonTermNode(String name) {
        super(name);
        isTerminal = false;
    }

    public void addProductions(List<Production> productions) {
        productionList.addAll(productions);
    }

    public List<Production> getProductionList() {
        return productionList;
    }

    @Override
    public String toString() {
        return name;
    }
}

package DOM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by devin on 8/16/15.
 */
public class Node {
    private List<Node> children;

    public Node() {
        this(new ArrayList<>());
    }

    public Node(List<Node> children) {
        this.children = children;
    }

    public Iterator<Node> getChildren() {
        return children.iterator();
    }
}

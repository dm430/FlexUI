package DOM;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by devin on 8/16/15.
 */
public class Element<T> extends Node {
    private String tagName;
    private Map<String, T> attributes;

    public Element() {
        attributes = new HashMap<>();
    }

    public Element(String tagName, Map<String, T> attributes, List<Node> children) {
        super(children);
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public Iterator<Map.Entry<String, T>> getAttributes() {
        return attributes.entrySet().iterator();
    }
}

package Parsers.HTML;

import DOM.Node;

/**
 * Created by devin on 8/19/15.
 */
public class HtmlParser {

    public Node parseElement() {
        Node node = null;

        return node;
    }

    public Node parseElements() {
        boolean parsing = true;

        while (parsing) {

        }

        //Temp so compiler shuts up.
        return null;
    }

    public Node parse(String source) {
        Node rootNode = parseElements();

        if (rootNode == null) {
            rootNode = new Node();
        }

        return rootNode;
    }
}

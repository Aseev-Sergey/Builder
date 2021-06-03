package sample.Nodes;

import sample.Nodes.Node;

public interface NodeBuilder {

    void buildRect();
    void buildRhombys();
    void buildCirc();
    void buildInnerCirc();
    void buildFilledCirc();
    Node getNode();
}

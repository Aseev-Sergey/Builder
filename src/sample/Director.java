package sample;

import sample.Nodes.Node;
import sample.Nodes.NodeBuilder;

public class Director {

    public Node construct(NodeBuilder nodeBuilder){

        nodeBuilder.buildRect();
        nodeBuilder.buildRhombys();
        nodeBuilder.buildCirc();
        nodeBuilder.buildInnerCirc();
        nodeBuilder.buildFilledCirc();
        return nodeBuilder.getNode();
    }
}

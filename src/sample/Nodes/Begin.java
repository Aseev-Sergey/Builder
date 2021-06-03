package sample.Nodes;

import sample.Nodes.Shapes.Circ;

public class Begin implements NodeBuilder {

    private Node begin;

    public Begin (){
        begin = new Node();
    }

    @Override
    public void buildRect() {

    }

    @Override
    public void buildRhombys() {

    }

    @Override
    public void buildCirc() {
        begin.setCirc(new Circ(30));
    }

    @Override
    public void buildFilledCirc() {

    }

    @Override
    public void buildInnerCirc() {

    }

    @Override
    public Node getNode() {
        return begin;
    }
}

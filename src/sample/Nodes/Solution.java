package sample.Nodes;

import sample.Nodes.Shapes.Rhombus;

public class Solution implements NodeBuilder {

    private Node solution;

    public Solution(){
        solution = new Node();
    }

    @Override
    public void buildRect() {

    }

    @Override
    public void buildRhombys() {
        solution.setRhombus(new Rhombus(120));
    }

    @Override
    public void buildCirc() {

    }

    @Override
    public void buildFilledCirc() {

    }

    @Override
    public void buildInnerCirc() {

    }

    @Override
    public Node getNode() {
        return solution;
    }
}

package sample;

public class Operation implements NodeBuilder {

    private Node operation;

    public Operation(){
        operation = new Node();
    }

    @Override
    public void buildRect() {
        operation.setRect(new Rect(120,70));
    }

    @Override
    public void buildRhombys() {

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
        return operation;
    }
}

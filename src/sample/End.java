package sample;

public class End implements NodeBuilder {

    private Node end;
    private double radius;

    public End(){
        end = new Node();
        radius=30;
    }

    @Override
    public void buildRect() {

    }

    @Override
    public void buildRhombys() {

    }

    @Override
    public void buildCirc() {
        end.setCirc(new Circ(radius));
    }

    @Override
    public void buildFilledCirc() {
        end.setFilledCirc(new FilledCirc(radius-10));
    }

    @Override
    public void buildInnerCirc() {
        end.setInnerCirc(new InnerCirc(radius-5));
    }

    @Override
    public Node getNode() {
        return end;
    }
}

package sample.schemes;

import sample.schemes.nodes.Arrows;
import sample.schemes.nodes.Begin;
import sample.schemes.nodes.End;
import sample.schemes.nodes.Operation;

public class Linear implements SchemeBuilder {

    private double x;
    private double y;
    private double r;
    private Scheme linear;

    public Linear(double startX, double startY, double radius){
        x = startX;
        y = startY;
        r = radius;
        linear = new Scheme();
    }

    @Override
    public void buildOper() {
        linear.setOperation(new Operation(x,y+50,120, 60));
        linear.setOperation(new Operation(x, y+140, 120, 60));
    }

    @Override
    public void buildSol() {

    }

    @Override
    public void buildBegin() {
        linear.setBegin(new Begin(x, y, r));
    }

    @Override
    public void buildEnd() {
        linear.setEnd(new End(x,y+250,r));
    }

    @Override
    public void buildArrow() {
        linear.setArrows(new Arrows(new double[]{
                x-10, y+40,
                x+10, y+40,
                x, y+50
        }, new double[]{
                x, y+20, x, y+40
        }));
        linear.setArrows(new Arrows(new double[]{
                x-10, y+130,
                x+10, y+130,
                x, y+140
        }, new double[]{
                x, y+110, x, y+130
        }));
        linear.setArrows(new Arrows(new double[]{
                x-10, y+220,
                x+10, y+220,
                x, y+230
        }, new double[]{
                x,y+200, x, y+220
        }));
    }

    @Override
    public Scheme getScheme() {
        return linear;
    }
}

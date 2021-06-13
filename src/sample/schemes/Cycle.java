package sample.schemes;

import sample.schemes.nodes.*;

public class Cycle implements SchemeBuilder {

    private double x;
    private double y;
    private double r;
    private Scheme cycle;

    public Cycle(double startX, double startY, double radius){
        x = startX;
        y = startY;
        r = radius;
        cycle = new Scheme();
    }

    @Override
    public void buildOper() {
        cycle.setOperation(new Operation(x,y+50,120, 60));
        cycle.setOperation(new Operation(x, y+310, 120, 60));

    }

    @Override
    public void buildSol() {
        cycle.setSolution(new Solution(x, y+160, 100));
    }

    @Override
    public void buildBegin() {
        cycle.setBegin(new Begin(x, y, r));
    }

    @Override
    public void buildEnd() {
        cycle.setEnd(new End(x, y+450, r));
    }

    @Override
    public void buildArrow() {
        cycle.setArrows(new Arrows(new double[]{
                x-10, y+40,
                x+10, y+40,
                x, y+50
        }, new double[]{
                x, y+20, x, y+40
        }));
        cycle.setArrows(new Arrows(new double[]{
                x-10, y+130,
                x+10, y+130,
                x, y+140
        }, new double[]{
                x, y+110, x, y+130
        }));
        cycle.setArrows(new Arrows(new double[]{
                x-10, y+300,
                x+10, y+300,
                x, y+310
        }, new double[]{
                x, y+280, x, y+300
        }));
        cycle.setArrows(new Arrows(new double[]{
                x-80, y+200,
                x-80, y+220,
                x-70, y+210
        }, new double[]{
                x, y+370, x, y+390,
                x, y+390, x-90, y+390,
                x-90, y+390, x-90,y+210,
                x-90, y+210, x-80, y+210
        }));
        cycle.setArrows(new Arrows(new double[]{
                x-10, y+420,
                x+10, y+420,
                x, y+430
        }, new double[]{
                x+70, y+210, x+90, y+210,
                x+90, y+210, x+90, y+400,
                x+90, y+400, x, y+400,
                x, y+400, x, y+420
        }));
    }

    @Override
    public Scheme getScheme() {
        return cycle;
    }
}

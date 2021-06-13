package sample.schemes;

import sample.schemes.nodes.*;

public class Branch implements SchemeBuilder {

    private double x;
    private double y;
    private double r;
    private Scheme branch;

    public Branch(double startX, double startY, double radius){
        x = startX;
        y = startY;
        r = radius;
        branch = new Scheme();
    }

    @Override
    public void buildOper() {
        branch.setOperation(new Operation(x, y+50, 120, 60));
        branch.setOperation(new Operation(x-100, y+250, 120, 60));
        branch.setOperation(new Operation(x+100, y+250, 120, 60));
    }

    @Override
    public void buildSol() {
        branch.setSolution(new Solution(x, y+160, 100));
    }

    @Override
    public void buildBegin() {
        branch.setBegin(new Begin(x, y, r));
    }

    @Override
    public void buildEnd() {
        branch.setEnd(new End(x, y+380,r));
    }

    @Override
    public void buildArrow() {
        branch.setArrows(new Arrows(new double[]{
                x-10, y+40,
                x+10, y+40,
                x, y+50
        }, new double[]{
                x, y+20, x, y+40
        }));
        branch.setArrows(new Arrows(new double[]{
                x-10, y+130,
                x+10, y+130,
                x, y+140
        }, new double[]{
                x, y+110, x, y+130
        }));
        branch.setArrows(new Arrows(new double[]{
                x-110, y+240,
                x-90, y+240,
                x-100, y+250
        }, new double[]{
                x-70, y+210, x-100, y+210,
                x-100, y+210, x-100, y+240
        }));
        branch.setArrows(new Arrows(new double[]{
                x+90, y+240,
                x+110, y+240,
                x+100, y+250
        }, new double[]{
                x+70, y+210, x+100, y+210,
                x+100, y+210, x+100, y+240
        }));
        branch.setArrows(new Arrows(new double[]{
                x-10, y+350,
                x+10, y+350,
                x, y+360
        }, new double[]{
                x-100, y+310, x-100, y+330,
                x-100, y+330, x, y+330,
                x, y+330, x, y+350
        }));
        branch.setArrows(new Arrows(new double[]{

        },new double[]{
                x+100, y+310, x+100, y+330,
                x+100, y+330, x, y+330
        }));
    }

    @Override
    public Scheme getScheme() {
        return branch;
    }
}

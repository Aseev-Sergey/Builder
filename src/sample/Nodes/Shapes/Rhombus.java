package sample.Nodes.Shapes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rhombus extends Rectangle {
    public Rhombus(double width){
        super(width, width, Color.WHITE);
        super.setX(50);
        super.setY(-100);
    }

}

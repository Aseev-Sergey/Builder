package sample.schemes.nodes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Operation extends Rectangle {
    public Operation(double startX, double startY, double width, double height){
        super(width, height, Color.LIGHTGREY);
        super.setArcHeight(50);
        super.setArcWidth(50);
        super.setX(startX-width / 2.0);
        super.setY(startY);
    }
}

package sample.schemes.nodes;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Solution extends Rectangle {
    public Solution(double startX, double startY, double width){
        super(width, width, Color.LIGHTGREY);
        super.setRotate(45);
        super.setX(startX - width / 2.0);
        super.setY(startY);
    }

}

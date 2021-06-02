package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rect extends Rectangle {
    public Rect(double width, double height){
        super(width, height, Color.WHITE);
        super.setArcHeight(50);
        super.setArcWidth(50);
    }
}

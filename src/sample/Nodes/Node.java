package sample.Nodes;

import javafx.scene.Group;
import sample.Nodes.Shapes.*;

public class Node extends Group {

    public Node(){}

    public void setRect(Rect obj){
        getChildren().add(obj);
    }

    public void setRhombus(Rhombus obj){
        getChildren().add(obj);
    }

    public void setCirc(Circ obj){
        getChildren().add(obj);
    }

    public void setFilledCirc(FilledCirc obj){
        getChildren().add(obj);
    }

    public void setInnerCirc(InnerCirc obj){
        getChildren().add(obj);
    }
}

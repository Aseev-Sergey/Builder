package sample.schemes;

import javafx.scene.Group;
import sample.schemes.nodes.*;

public class Scheme extends Group {

    public Scheme(){}

    public void setOperation(Operation obj){
        getChildren().add(obj);
    }

    public void setSolution(Solution obj){
        getChildren().add(obj);
    }

    public void setBegin(Begin obj){
        getChildren().add(obj);
    }

    public void setEnd(End obj){
        getChildren().addAll(obj.getOuter(), obj.getInner(),obj.getFilled());
    }

    public void setArrows(Arrows obj){
        getChildren().add(obj.getArrow());
        for(int index = 0; index < obj.getArrayLine().length; index++){
            getChildren().add(obj.getArrayLine()[index]);
        }
    }
}

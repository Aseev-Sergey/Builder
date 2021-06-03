package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import sample.Nodes.*;

public class Controller {

    public Pane pane;
    Director director = new Director();
    Node node = new Node();

public void clickBegin (ActionEvent actionEvent){
    paneClear();
    node = director.construct(new Begin());
    paneAdd(node);
}

public void clickEnd (ActionEvent actionEvent){
    paneClear();
    node = director.construct(new End());
    paneAdd(node);
}

public void clickOperation(ActionEvent actionEvent){
    paneClear();
    node = director.construct(new Operation());
    paneAdd(node);
}

public void clickSolution(ActionEvent actionEvent){
    paneClear();
    node = director.construct(new Solution());
    paneAdd(node);
    pane.setRotate(-45);
}

    public void clickClear(ActionEvent actionEvent){
        paneClear();
    }

    public void clickClose(ActionEvent actionEvent){
        Platform.exit();
    }

    private void paneClear(){
        pane.getChildren().clear();
        pane.setRotate(0);
    }

    private void paneAdd(Node node){
        pane.getChildren().add(node);
    }
}

package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import sample.schemes.*;

public class Controller {

    public Pane pane;
    Director director = new Director();
    Scheme scheme = new Scheme();
    final private double X = 195;
    final private double Y = 30;
    final private double R = 20;

    public void clickClear(ActionEvent actionEvent){
        paneClear();
    }

    public void clickClose(ActionEvent actionEvent){
        Platform.exit();
    }

    private void paneClear(){
        pane.getChildren().clear();
    }

    private void paneAdd(Scheme scheme){
        pane.getChildren().add(scheme);
    }

    public void clickLinear(ActionEvent actionEvent) {
        paneClear();
        scheme = director.construct(new Linear(X, Y, R));
        paneAdd(scheme);
    }

    public void clickBranch(ActionEvent actionEvent) {
        paneClear();
        scheme = director.construct(new Branch(X, Y, R));
        paneAdd(scheme);
    }

    public void clickCycle(ActionEvent actionEvent) {
        paneClear();
        scheme = director.construct(new Cycle(X, Y, R));
        paneAdd(scheme);
    }
}

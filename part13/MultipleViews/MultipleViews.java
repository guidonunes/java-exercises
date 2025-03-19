package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        BorderPane firstView = new BorderPane();
        firstView.setTop(new Label("First view!"));
        Button toSecondViewButton = new Button("To the second view!");
        firstView.setCenter(toSecondViewButton);

        VBox secondView = new VBox();
        Button toThirdViewButton = new Button("To the third view!");
        secondView.getChildren().addAll(toThirdViewButton, new Label("Second view!"));

        GridPane thirdView = new GridPane();
        thirdView.add(new Label("Third view!"), 0, 0);
        Button toFirstViewButton = new Button("To the first view!");
        thirdView.add(toFirstViewButton, 1, 1);

        Scene firstScene = new Scene(firstView, 300, 200);
        Scene secondScene = new Scene(secondView, 300, 200);
        Scene thirdScene = new Scene(thirdView, 300, 200);

        toSecondViewButton.setOnAction(event -> window.setScene(secondScene));
        toThirdViewButton.setOnAction(event -> window.setScene(thirdScene));
        toFirstViewButton.setOnAction(event -> window.setScene(firstScene));

        window.setScene(firstScene);
        window.setTitle("Multiple Views");
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}

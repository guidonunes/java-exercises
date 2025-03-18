package part13.NotifierApplication;

package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {

        TextField topText = new TextField();
        Button button = new Button("Update");
        Label bottomText = new Label();

        button.setOnAction((event) -> {
            bottomText.setText(topText.getText());
        });

        VBox componentGroup = new VBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(topText, button, bottomText);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();




    }


    public static void main(String[] args) {
        launch(args);
    }

}

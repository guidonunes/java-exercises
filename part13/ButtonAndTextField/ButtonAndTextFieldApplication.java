package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        textField.setPromptText("Enter text here");

        Button button = new Button("Click Me");

        HBox layout = new HBox();
        layout.getChildren().addAll(button, textField);

        layout.setSpacing(10);

        Scene scene = new Scene(layout, 300, 100);

        stage.setScene(scene);
        stage.setTitle("Button & Text Field Example");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

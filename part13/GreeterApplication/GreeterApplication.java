package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public void start(Stage window) throws Exception {
        Label instructionText = new Label("Enter your name and start.");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");
        Label errorMessage = new Label("");

        //creating layout and adding components to it
        GridPane firstLayout = new GridPane();


        firstLayout.add(instructionText, 0, 0);
        firstLayout.add(nameField, 0, 1);
        firstLayout.add(startButton, 0, 2);
        firstLayout.add(errorMessage, 0, 3);

        //styling the layout
        firstLayout.setPrefSize(300, 180);
        firstLayout.setAlignment(Pos.CENTER);
        firstLayout.setVgap(10);
        firstLayout.setHgap(10);
        firstLayout.setPadding(new Insets(20, 20, 20, 20));

        Scene firstScene = new Scene(firstLayout);

        Label greetingText = new Label();

        StackPane secondLayout = new StackPane();
        secondLayout.setPrefSize(300, 180);
        secondLayout.getChildren().add(greetingText);
        secondLayout.setAlignment(Pos.CENTER);

        Scene secondScene = new Scene(secondLayout);

        startButton.setOnAction((event) -> {
            String name = nameField.getText().trim();
            if(name.isEmpty()) {
                errorMessage.setText("Please enter your name!");
            } else {
                greetingText.setText("Welcome " + name + "!");
                window.setScene(secondScene);
            }
        });

        window.setScene(firstScene);
        window.setTitle("Greeter Application");
        window.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

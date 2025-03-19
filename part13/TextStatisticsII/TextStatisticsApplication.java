package part13.TextStatisticsII;

package textstatistics;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;


public class TextStatisticsApplication extends Application {


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea("");


        HBox statsBox = new HBox();
        statsBox.setSpacing(10);

        Label letterCountLabel = new Label("Letters: 0");
        Label wordCountLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is: ");

        statsBox.getChildren().addAll(letterCountLabel, wordCountLabel, longestWordLabel);

        layout.setCenter(textArea);
        layout.setBottom(statsBox);


        textArea.textProperty().addListener((ObservableValue<? extends String> change, String oldValue, String newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split("\\s+");
            int words = parts.length == 1 && parts[0].isEmpty() ? 0 : parts.length;
            String longest = Arrays.stream(parts)
                    .filter(word -> !word.isEmpty())
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .orElse("");


            letterCountLabel.setText("Letters: " + characters);
            wordCountLabel.setText("Words: " + words);
            longestWordLabel.setText("The longest word is: " + longest);
        });




        Scene view = new Scene(layout, 400, 300);
        window.setScene(view);
        window.setTitle("Text Statistics");
        window.show();

    }



    public static void main(String[] args) {
        launch(args);
    }

}

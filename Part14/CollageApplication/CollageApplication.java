package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        for (int y = 0; y < height / 2; y++) {
            for (int x = 0; x < width / 2; x++) {
                // Get original color (sampling every 2nd pixel)
                Color originalColor = imageReader.getColor(x * 2, y * 2);

                // Calculate negative color
                Color negativeColor = new Color(
                    1.0 - originalColor.getRed(),
                    1.0 - originalColor.getGreen(),
                    1.0 - originalColor.getBlue(),
                    originalColor.getOpacity()
                );

                // Copy negative to all four quadrants:
                // 1. Top-left
                imageWriter.setColor(x, y, negativeColor);
                // 2. Top-right
                imageWriter.setColor(x + width / 2, y, negativeColor);
                // 3. Bottom-left
                imageWriter.setColor(x, y + height / 2, negativeColor);
                // 4. Bottom-right
                imageWriter.setColor(x + width / 2, y + height / 2, negativeColor);
            }
        }

        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

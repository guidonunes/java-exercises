
package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage stage) {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        // Draw a smiley face when the application starts
        drawSmiley(painter);

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();

            painter.setFill(Color.BLACK);
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene view = new Scene(paintingLayout);
        stage.setScene(view);
        stage.show();
    }

    private void drawSmiley(GraphicsContext gc) {
        gc.setFill(Color.BLACK);

        // Draw head (a circle)
        gc.strokeOval(150, 100, 200, 200);

        // Draw eyes (two circles)
        gc.fillOval(200, 150, 30, 30);
        gc.fillOval(270, 150, 30, 30);

        // Draw mouth (a smile)
        gc.strokeArc(200, 180, 100, 80, 180, 180, javafx.scene.shape.ArcType.OPEN);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

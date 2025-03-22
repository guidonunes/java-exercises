package application;

import java.io.File;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) {

        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative Support (%)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative Support of Finnish Parties (1968-2008)");

        try (Scanner scanner = new Scanner(new File("partiesdata.tsv"))) {
            if(scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t");

                XYChart.Series<Number, Number> series = new XYChart.Series<>();
                series.setName(parts[0]);

                for(int i = 1; i < parts.length; i++) {
                    int year = 1968 + (i - 1) * 4;
                    if(!parts[i].equals("-")) {
                        double support = Double.valueOf(parts[i]);
                        series.getData().add(new XYChart.Data<>(year, support));
                    }

                }

                lineChart.getData().add(series);
            }

        } catch(Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Finnish Parties Support Over Time");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}

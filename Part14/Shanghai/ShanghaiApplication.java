package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;



public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Rank");

        xAxis.setAutoRanging(false);
        xAxis.setLowerBound(2006);
        xAxis.setUpperBound(2020);
        xAxis.setTickUnit(1);




        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series<Number, Number> rankingData = new XYChart.Series<>();
        rankingData.setName("Ranking");


        rankingData.getData().add(new XYChart.Data<>(2007, 73));
        rankingData.getData().add(new XYChart.Data<>(2008, 68));
        rankingData.getData().add(new XYChart.Data<>(2009, 72));
        rankingData.getData().add(new XYChart.Data<>(2010, 72));
        rankingData.getData().add(new XYChart.Data<>(2011, 74));
        rankingData.getData().add(new XYChart.Data<>(2012, 73));
        rankingData.getData().add(new XYChart.Data<>(2013, 76));
        rankingData.getData().add(new XYChart.Data<>(2014, 73));
        rankingData.getData().add(new XYChart.Data<>(2015, 67));
        rankingData.getData().add(new XYChart.Data<>(2016, 56));
        rankingData.getData().add(new XYChart.Data<>(2017, 56));

        lineChart.getData().add(rankingData);

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }

}

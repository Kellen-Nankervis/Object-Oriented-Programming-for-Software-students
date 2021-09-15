package com.example.hellofx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_15 extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();

        Polygon polygon = new Polygon();
        pane.getChildren().add(polygon);
        polygon.setFill(Color.RED);
        polygon.setStroke(Color.BLACK);
        polygon.setRotate(22.5);
        ObservableList<Double> list = polygon.getPoints();

        double centerX = 400 / 2, centerY = 400 / 2;
        double radius = Math.min(400, 400) * 0.4;

        int s = 6;
        for (int i = 0; i < s; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
        }

        Text text = new Text("STOP");
        text.setFont(Font.font("Times new Roman", FontWeight.BOLD, 75));
        text.setFill(Color.WHITE);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_15");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

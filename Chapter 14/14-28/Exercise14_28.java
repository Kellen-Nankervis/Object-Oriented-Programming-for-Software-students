package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Exercise14_28 extends Application {
    @Override
    public void start(Stage primaryStage){
        int i = (int)(Math.random() * 2);
        if(i == 1){
            i = 30;
        }else{
            i = 0;
        }
        ClockPane clock1 = new ClockPane((int)(Math.random()*12), i, 0);
        clock1.setSecondHandVisible(false);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock1);

        Scene scene = new Scene(pane, 1280, 720);
        primaryStage.setTitle("Exercise14_28__Clock_Pane_Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
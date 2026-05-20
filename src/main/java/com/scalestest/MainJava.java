package com.scalestest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainJava extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane(new Label("Scaleless Fishing"));
        Scene scene = new Scene(root, 1600, 800);

        stage.setTitle("Fis");
        stage.setScene(scene);
        stage.show();

        stage.setAlwaysOnTop(true);

        Image icon = new Image(getClass().getResourceAsStream("/Images/fissss.png"));
        stage.getIcons().add(icon);
        


    }

    public static void main(String[] args) {
        launch(args);
    }
}

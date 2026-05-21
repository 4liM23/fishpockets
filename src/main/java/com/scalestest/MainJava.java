package com.scalestest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.Taskbar;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class MainJava extends Application {

    @Override
    public void start(Stage stage) {
        
        setMacDockIcon();

        Image icon = new Image(getClass().getResourceAsStream("/Images/fissss.png"));
        // stage.getIcons().add(icon);
        
        ImageView iconView = new ImageView(icon);
        
        
        stage.setAlwaysOnTop(true);
        iconView.setFitWidth(2000);
        iconView.setFitHeight(1000);
        
        StackPane root = new StackPane(new Label("Scaleless Fishing"));
        root.getChildren().add(iconView);

        Scene scene = new Scene(root, 1600, 800);
        
        stage.getIcons().add(icon);
        
        
        stage.setTitle("Fis");
        stage.setScene(scene);
        stage.show();

        
    }



private void setMacDockIcon() {
    try {
        // 1. Only run this if the user is on a Mac
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            // 2. Load the same image file as an AWT BufferedImage stream
            InputStream is = getClass().getResourceAsStream("/Images/fissss.png");
            if (is != null) {
                BufferedImage image = ImageIO.read(is);
                
                // 3. Apply it directly to the system Taskbar layout
                Taskbar taskbar = Taskbar.getTaskbar();
                taskbar.setIconImage(image);
            }
        }
    } catch (Exception e) {
        // Fail silently or log if the system blocks it
        System.out.println("Could not set macOS Dock icon: " + e.getMessage());
    }
}



    public static void main(String[] args) {
        launch(args);
    }
}

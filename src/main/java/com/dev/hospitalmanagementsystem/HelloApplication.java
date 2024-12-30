package com.dev.hospitalmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

/**
 * @author Joseph
 * @version 1.0
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/dev/hospitalmanagementsystem/FXMLDocument.fxml"));
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("com/dev/hospitalmanagementsystem/FXMLDocument.fxml")));
        stage.setMinWidth(340);
        stage.setMinHeight(580);
        stage.setTitle("Hospital Management System");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
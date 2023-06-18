package com.example.projectp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("Gui(11).fxml"));
            Scene scene=new Scene(root);
            arg0.setScene(scene);
            arg0.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        launch(args);
    }

}

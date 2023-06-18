package com.example.projectp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.util.List;

public class Gui11 {
    @FXML
    private ImageView kiemtra;
    @FXML
    private VBox boxquestion;

    @FXML
    void kiemtra(ActionEvent event) {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("Gui(61).fxml"));
            Scene scene=new Scene(root);
            Stage ag0r=new Stage();
            ag0r.setScene(scene);
            ag0r.show();
            Stage a=(Stage)kiemtra.getScene().getWindow();
            a.hide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @FXML
    void editon(ActionEvent event) {
        try {

            Parent root=FXMLLoader.load(getClass().getResource("Gui(51).fxml"));
            Scene scene=new Scene(root);
            Stage ag0r=new Stage();
            ag0r.setScene(scene);
            ag0r.show();
            Stage a=(Stage)kiemtra.getScene().getWindow();
            a.hide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void handle(ActionEvent event) {
        try {

            Parent root=FXMLLoader.load(getClass().getResource("popup.fxml"));
            Scene scene=new Scene(root);
            Stage arg01=new Stage();
            arg01.setScene(scene);
            arg01.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void initialize() {
        List<String> labelValues = luucauhoi.getLabelValues();

        // Thêm các label mới vào VBox
        for (String value : labelValues) {
            Label label = new Label(value);
            ImageView imageview1=new ImageView(new Image("C:\\Users\\admin\\Desktop\\project here\\OOP project\\Project1\\src\\main\\java\\ImageView\\iconchuv.jpg"));
            label.setGraphic(imageview1);

            boxquestion.getChildren().add(label); // Thêm label vào VBox
        }

    }
}

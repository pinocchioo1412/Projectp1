package com.example.projectp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.stage.FileChooser;
import com.example.projectp.CheckFileFormat;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Gui22 implements Initializable {

    File file = new File("");
    @FXML
    private ImageView warning;
    @FXML
    private ImageView warning1;

    @FXML
    private ImageView warning2;
    @FXML
    private ImageView warning3;

    @FXML
    private Label dropfile;
    @FXML
    private TextField idnumber;

    @FXML
    private TextArea categoryinfor;
    @FXML
    private TextField categoryname;
    @FXML
    void ChooseFile(ActionEvent event) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Chọn tệp");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Microsoft Word Documents", "*.docx"));
        file = fileChooser.showOpenDialog(warning.getScene().getWindow());
        dropfile.setText(file.getName());
        warning.setVisible(false);
    }
    @FXML
    void DragFile(DragEvent event) {
        if (event.getGestureSource() != dropfile && event.getDragboard().hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }
        event.consume();

    }

    @FXML
    void DragFile1(DragEvent event) {
        Dragboard db = event.getDragboard();
        boolean success = false;
        if (db.hasFiles()) {
            success = true;
            warning.setVisible(false);
            file = db.getFiles().get(0);
            dropfile.setText(file.getName());

        }

        event.setDropCompleted(success);
        event.consume();

    }

    @FXML
    void Import(ActionEvent event) {
        if (file.getName().endsWith(".txt") || file.getName().endsWith(".docx")) {
            CheckFileFormat.getInstance().checkFormat(file.getPath());
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Wrong format");
            alert.show();
        }

    }

    @FXML
    void DragFile3(DragEvent event) {
        if (event.getGestureSource() != dropfile && event.getDragboard().hasFiles()) {
            dropfile.setStyle("-fx-background-color: #cdf40a");
        }
        event.consume();
    }

    @FXML
    void DragFile4(DragEvent event) {
        dropfile.setStyle("-fx-background-color: #ffffff");
        event.consume();
    }
    public void initialize(URL arg0, ResourceBundle arg1) {
        categoryinfor.setWrapText(true);
        categoryname.textProperty().addListener((Observable, oldvalue, newValue) -> {
            if (newValue.isEmpty()) {
                warning1.setVisible(true);
            } else {
                warning1.setVisible(false);
            }
        });
        idnumber.textProperty().addListener((Observable, oldvalue, newValue) -> {
            if (newValue.isEmpty()) {
                warning2.setVisible(true);
            } else {
                warning2.setVisible(false);
            }
        });
    }

}

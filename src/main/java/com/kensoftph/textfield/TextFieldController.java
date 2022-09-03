package com.kensoftph.textfield;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class TextFieldController implements Initializable {

    @FXML
    private Button deselect;

    @FXML
    private Button selectAll;

    @FXML
    private Button selectBackward;

    @FXML
    private Button selectForward;

    @FXML
    private Button selectNextWord;

    @FXML
    private Button selectPrevWord;

    @FXML
    private Label result;

    @FXML
    private TextField textField;

    @FXML
    void deselect(ActionEvent event) {
        textField.deselect();
    }

    @FXML
    void selectAll(ActionEvent event) {
        textField.selectAll();
    }

    @FXML
    void selectBackward(ActionEvent event) {
        textField.selectBackward();
    }

    @FXML
    void selectForward(ActionEvent event) {
        textField.selectForward();
    }

    @FXML
    void selectNextWord(ActionEvent event) {
        textField.selectNextWord();
    }

    @FXML
    void selectPrevWord(ActionEvent event) {
        textField.selectPreviousWord();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectAll.setFocusTraversable(false);
        deselect.setFocusTraversable(false);
        selectBackward.setFocusTraversable(false);
        selectForward.setFocusTraversable(false);
        selectNextWord.setFocusTraversable(false);
        selectPrevWord.setFocusTraversable(false);
        result.textProperty().bind(textField.textProperty());

        ContextMenu cm = new ContextMenu();
        MenuItem item1 = new MenuItem("Copy");
        MenuItem item2 = new MenuItem("Paste");
        cm.getItems().addAll(item1, item2);

        textField.setContextMenu(cm);

        item1.setOnAction(event -> {
            textField.copy();
        });

        item2.setOnAction(event -> {
            textField.paste();
        });
    }


}

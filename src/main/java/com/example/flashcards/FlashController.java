package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

public class FlashController {
    @FXML
    private Button importButton, introButton;

    @FXML
    private Label label0, label1, label2, label3, label4, label5, label6, label7;

    @FXML
    private Rectangle pi0, pi1, pi2, pi3, pi4, pi5, pi6, pi7;

    private IntroWindow iw = new IntroWindow();

    @FXML
    void editSetName(MouseEvent event) {
        Label clickedLabel = (Label) event.getSource();

        TextField txt = new TextField(clickedLabel.getText());
        clickedLabel.setText(" ");
        clickedLabel.setGraphic(txt);

        txt.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                clickedLabel.setText(txt.getText());
                clickedLabel.setGraphic(null);
            }
        });

    }

    @FXML
    void importSet(MouseEvent event) {

    }

    @FXML
    void openIntro(MouseEvent event) {
        iw.openWindow();
    }

    @FXML
    void openSet(MouseEvent event) {

    }
}
package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class TrainController {

    @FXML
    private Label additionalLabel, answerLabel, explanationLabel, questionLabel;

    @FXML
    private Label countAlmost, countNew, countRight, countSome, countTotal, countWrong;

    @FXML
    private Button almostRightButton, someRightButton, wrongButton, rightButton;

    @FXML
    private ImageView imageView;

    @FXML
    private Button showAnswerButton, hintButton, ignoreCardButton, settingsButton;

    @FXML
    void almostRight(MouseEvent event) {

    }

    @FXML
    void ignoreCard(MouseEvent event) {

    }

    @FXML
    void right(MouseEvent event) {

    }

    @FXML
    void settings(MouseEvent event) {

    }

    @FXML
    void showAnswer(MouseEvent event) {
        answerLabel.setOpacity(1);
        explanationLabel.setOpacity(1);
        wrongButton.setOpacity(1);
        someRightButton.setOpacity(1);
        almostRightButton.setOpacity(1);
        rightButton.setOpacity(1);
    }

    @FXML
    void showHint(MouseEvent event) {
        additionalLabel.setOpacity(1);
        imageView.setOpacity(1);
    }

    @FXML
    void someRight(MouseEvent event) {

    }

    @FXML
    void wrong(MouseEvent event) {

    }

}


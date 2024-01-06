package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FlashController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
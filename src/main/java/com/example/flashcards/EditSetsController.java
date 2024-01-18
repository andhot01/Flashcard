package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class EditSetsController {
    @FXML
    private ListView<?> cardsInSet;

    @FXML
    private Button deleteCardButton, newCardButton, searchCardButton;
    private Logic logic = new Logic();

    @FXML
    void deleteCard(MouseEvent event) {

    }

    @FXML
    void makeNewCard(MouseEvent event) {

    }

    @FXML
    void searchCard(MouseEvent event) {
        logic.loadTrivia();
    }

    @FXML
    void selectCard(MouseEvent event) {

    }


}

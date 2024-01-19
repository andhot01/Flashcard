package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class EditSetsController {
    @FXML
    private ListView<?> cardsInSet;

    @FXML
    private Button deleteCardButton, newCardButton, searchCardButton;
    private Logic logic = new Logic();

    public void initialize(){
        //set up if else statements for chosen rectangle with corresponding db table
    }

    @FXML
    void deleteCard(MouseEvent event) {
//metode fra dao kaldt igennem logic til at slette et kort
    }

    @FXML
    void makeNewCard(MouseEvent event) {
//metode fra dao kaldt igennem logic til at lave et nyt kort
    }

    @FXML
    void searchCard(MouseEvent event) {
        logic.loadTrivia();//attempt at showing cards
    }

    @FXML
    void selectCard(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2){
            //method from logic for edit
        }
    }

}

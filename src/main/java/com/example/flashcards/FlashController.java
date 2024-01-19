package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;

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
        Label clickedLabel = (Label) event.getSource();//get selected label to avoid repeating same code 8 times

        if (clickedLabel != label0) { //Turorial should be untouchable by user
//Turns label into textField for user input, empties label so previous text doesn't show
            TextField txt = new TextField(clickedLabel.getText());
            clickedLabel.setText(" ");
            clickedLabel.setGraphic(txt);

//when enter is pressed label returns with new text
            txt.setOnKeyPressed(keyEvent -> {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    clickedLabel.setText(txt.getText());
                    clickedLabel.setGraphic(null);
                }
            });
        }
//make method for db to keep changes
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
        if (event.getButton() == MouseButton.SECONDARY) {
            Rectangle clickedRectangle = (Rectangle) event.getSource();//selected rectangle for each set
            if (clickedRectangle != pi0) {//user should not be able to edit Tutorial
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("editSets.fxml"));
                    Stage edit = new Stage();
                    edit.setTitle("Edit set");
                    AnchorPane editLayout = loader.load();
                    Scene scene = new Scene(editLayout);
                    edit.setScene(scene);
                    edit.setResizable(false);

                    edit.show();

                } catch (IOException e){
                    System.out.println("Error");
                }
            }
        }

        if (event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2){
            Rectangle clickedREctangle = (Rectangle) event.getSource();

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("train.fxml"));
                Stage train = new Stage();
                train.setTitle("Train set");
                AnchorPane editLayout = loader.load();
                Scene scene = new Scene(editLayout);
                train.setScene(scene);
                train.setResizable(false);

                train.show();

            } catch (IOException e){
                System.out.println("Error");
            }
        }
    }
}
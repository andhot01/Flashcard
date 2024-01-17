/* This class loads another fxml file for a new window where the user can train a set
 */

package com.example.flashcards;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class TrainWindow {
    public void train(Rectangle clickedRectangle) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("train.fxml"));
            Stage train = new Stage();
            train.setTitle("Edit set");
            AnchorPane editLayout = loader.load();
            Scene scene = new Scene(editLayout);
            train.setScene(scene);
            train.setResizable(false);

            if (clickedRectangle.getId().equals("pi0")){
                //display arraylist 0
            } else if (clickedRectangle.getId().equals("pi1")){
                //arraylist 1
            } else if (clickedRectangle.getId().equals("pi2")){
                //arraylist 2
            } else if (clickedRectangle.getId().equals("pi3")){
                //arraylist 3
            } else if (clickedRectangle.getId().equals("pi4")){
                //arraylist 4
            } else if (clickedRectangle.getId().equals("pi5")){
                //arraylist 5
            } else if (clickedRectangle.getId().equals("pi6")){
                //arraylist 6
            } else if (clickedRectangle.getId().equals("pi7")){
                //arraylist 7
            }

            train.show();

        } catch (IOException e){
            System.out.println("Error");
        }
    }
}

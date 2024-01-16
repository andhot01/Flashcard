/*This class loads another fxml file for a new window where user can make changes to a set
*/

package com.example.flashcards;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class EditWindow {
    public void makeChange(Rectangle clickedRectangle) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("editSets.fxml"));
            Stage edit = new Stage();
            edit.setTitle("Edit set");
            AnchorPane editLayout = loader.load();
            Scene scene = new Scene(editLayout);
            edit.setScene(scene);

            EditSetsController controller = loader.getController();

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

            edit.show();

        } catch (IOException e){
            System.out.println("Error");
        }
    }
}

/* This class is here for the sole purpose of saving space in the controller, where the
openIntro() method calls it
*/

package com.example.flashcards;

import javafx.event.ActionEvent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class IntroWindow {
    private List<String> introTexts = new ArrayList<>();
    private int currentText = 0;
//til at holde styr på hvilke headerTexts vises frem

    public void openWindow(){
        Dialog intro = new Dialog();
        intro.setTitle("Inroduction");

//listen af headerTexts i den rækkefølge de skal vises frem
        introTexts.add("This is an introduction to the concept of FlashCards.\nYou can skip the intro and" +
                " explore on your own,\nbut it is recommended to read the following messages.");
        introTexts.add("To begin training with a set of flash cards click twice on\nits respective post-it. To" +
                " edit a set name, click on the\ntitle. To edit/delete cards or sets right-click on its" +
                "\nrespective post-it. If you want to import card sets,\nclick on the 'import' button.");
        introTexts.add("It is recommended to start with the 'Tutorial' card set for\nmore information on how to" +
                " use the application.\nEnjoy!\nThe following two messages are disclaimers and can be ignored.");
        introTexts.add("Flash cards are great tools to help memorize definitions,\nfacts or short pieces" +
                " of information, usually for a test.\nThey promote active recall in the brain and help" +
                " move\nthe information from short- to long-term memory.");
        introTexts.add("However flash cards can create an illusion of\ncompetence, relying on memory, but" +
                " not\ncomprehension of the terms. Use this program as a tool\nor fun activity, but don't" +
                " trust it completely for\nprofessional purposes.");

//knapperne til at styrre introduktionen
        intro.getDialogPane().getButtonTypes().addAll(ButtonType.PREVIOUS, ButtonType.NEXT, ButtonType.CLOSE);
        intro.setHeaderText(introTexts.get(currentText));//den første header

//event når man trykker på next, tæller op i listen og opdaterer header til den nuværende tekst
        intro.getDialogPane().lookupButton(ButtonType.NEXT).addEventFilter(ActionEvent.ACTION, event -> {
            if (currentText != introTexts.size()) {
                currentText++;

                if (currentText < introTexts.size()) {
                    intro.setHeaderText(introTexts.get(currentText));
                }
            }
            event.consume();//sikrer at vinduet ikke lukkes
        });

//event når man trykker på prvious, gør det samme som ^^
        intro.getDialogPane().lookupButton(ButtonType.PREVIOUS).addEventFilter(ActionEvent.ACTION, event -> {
            if (currentText != 0) { //kun hvis man ikke er på første side, så man ikke kan få negativ currentText
                currentText--;

                if (currentText < introTexts.size()) {
                    intro.setHeaderText(introTexts.get(currentText));
                }
            }
            event.consume();
        });

        VBox box = new VBox();
        intro.getDialogPane().setContent(box);
        intro.showAndWait();
    }
}

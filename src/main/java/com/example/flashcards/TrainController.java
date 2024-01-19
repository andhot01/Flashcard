/*TrainControlleren holder styr på svar og træning af sæt, her kan man også markere kort som
irrelevante, bede om hints og styrre hvor hyppigt "forkerte kort" skal vises igen
 */

package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class TrainController {

    @FXML
    private Label additionalLabel, answerLabel, explanationLabel, questionLabel;

    @FXML
    private Label countAlmost, countNew, countRight, countSome, countTotal, countWrong;

    private int almost, right, some, wrong, total;

    @FXML
    private Button almostRightButton, someRightButton, wrongButton, rightButton;

    @FXML
    private ImageView imageView;

    @FXML
    private Button showAnswerButton, hintButton, ignoreCardButton, settingsButton;

    public void initialize(){
        total = 3;
        String totalCards = String.valueOf(total);
        countTotal.setText(totalCards);
        //here set up if else statements for chosen rectangle with corresponding counters for labels and db table
    }
    @FXML
    void almostRight(MouseEvent event) {
        almost++;
        String almostRight = String.valueOf(almost);
        countAlmost.setText(almostRight);
        resetShowHint();
        resetShowAnswer();
        //show next question
    }
/*for every answer button the following happens: counter goes up, counter is turned into string and string is
set as text for the label, then hints are reset (additional info column and picture disappear, if there were
any) and the answer section is reset too (answer, explanation and answer buttons become invisible again until
'show answer' button is clicked)
 */
    @FXML
    void ignoreCard(MouseEvent event) {
//remove card from arraylist for training set and bring up next question
    }

    @FXML
    void right(MouseEvent event) {
        right++;
        String rightAnswer = String.valueOf(right);
        countRight.setText(rightAnswer);
        resetShowAnswer();
        resetShowHint();
        //show next question

        if (right == total){//when all cards are answered right, the set is complete
            Dialog setComplete = new Dialog();
            setComplete.setTitle("Set completed!");
            setComplete.setHeaderText("Congrats! You answered right to all the questions.\n" +
                    "You can train another set or restart this one");

            setComplete.getDialogPane().getButtonTypes().add(ButtonType.OK);
            setComplete.showAndWait();
        }
    }

    @FXML
    void settings(MouseEvent event) {//new dw for radioButton selection of frequency for card showing
        Dialog<String> frequency = new Dialog<>();
        frequency.setTitle("Choose frequency");
        frequency.setHeaderText("Choose how often you want to train 'wrong' cards:");

        frequency.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        RadioButton option1 = new RadioButton("Very often (less than a minute)");
        RadioButton option2 = new RadioButton("Fairly often (in the next 5 minutes)");
        RadioButton option3 = new RadioButton("Often (in the next 10 minutes)");
        RadioButton option4 = new RadioButton("Never again (not recommended)");

        ToggleGroup freq = new ToggleGroup();
        option1.setToggleGroup(freq);
        option2.setToggleGroup(freq);
        option3.setToggleGroup(freq);
        option4.setToggleGroup(freq);

        option1.setSelected(true);//fordi tomme radio knapper er grimme

        VBox vBox = new VBox();
        vBox.getChildren().addAll(option1, option2, option3, option4);

        frequency.getDialogPane().setContent(vBox);
        frequency.showAndWait();
    }
//Mangler algoritme delen hvor de forskellige valgmuligheder flytter på rækkefølgen i visning af kort

    @FXML
    void showAnswer(MouseEvent event) {//viser knapperne, svar og forklaring
        answerLabel.setOpacity(1);
        explanationLabel.setOpacity(1);
        wrongButton.setOpacity(1);
        someRightButton.setOpacity(1);
        almostRightButton.setOpacity(1);
        rightButton.setOpacity(1);
        rightButton.setDisable(false);
        almostRightButton.setDisable(false);
        someRightButton.setDisable(false);
        wrongButton.setDisable(false);
    }

    void resetShowAnswer(){//modsatte af show answer, gør så bruger ikke kan trykke på svar knapper ved fejl
        answerLabel.setOpacity(0);
        explanationLabel.setOpacity(0);
        wrongButton.setOpacity(0);
        someRightButton.setOpacity(0);
        almostRightButton.setOpacity(0);
        rightButton.setOpacity(0);
        rightButton.setDisable(true);
        almostRightButton.setDisable(true);
        someRightButton.setDisable(true);
        wrongButton.setDisable(true);
    }

    @FXML
    void showHint(MouseEvent event) {//viser ekstra oplysninger om sps og evt. billed hvis der er et
        additionalLabel.setOpacity(1);
        imageView.setOpacity(1);
    }

    void resetShowHint(){
        additionalLabel.setOpacity(0);
        imageView.setOpacity(0);
    }

    @FXML
    void someRight(MouseEvent event) {
        some++;
        String somewhatRight = String.valueOf(some);
        countSome.setText(somewhatRight);
        resetShowAnswer();
        resetShowHint();
        //show next question
    }

    @FXML
    void wrong(MouseEvent event) {
        wrong++;
        String wrongAnswer = String.valueOf(wrong);
        countWrong.setText(wrongAnswer);
        resetShowAnswer();
        resetShowHint();
        //show next question
    }

    //add reset/restart button and method to restart training - and/or mark as finished

}


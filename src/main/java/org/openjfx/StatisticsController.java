package org.openjfx;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class StatisticsController extends MainMenuController{
    TextField setScore1, setScore2, setScore3;
    public void initialize() throws IOException
    {
        setScore1.setText(String.valueOf(MainMenuController.score1));
        setScore2.setText(String.valueOf(MainMenuController.score2));
        setScore3.setText(String.valueOf(MainMenuController.score3));
    }

    @FXML
    private void switchToQuizMenu(ActionEvent event) throws IOException {
        App.setRoot("QuizMenu");
    }
}

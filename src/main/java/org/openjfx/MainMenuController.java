package org.openjfx;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController {
    public static int score1 = 0, score2 = 0, score3 = 0;

    @FXML
    private void switchToLessonMenu(ActionEvent event) throws IOException
    {
        App.setRoot("LessonMenu");
    }

    @FXML
    private void switchToQuizMenu(ActionEvent event) throws IOException
    {
        App.setRoot("Quiz");
    }

    @FXML
    private void exit(ActionEvent event) throws IOException
    {
        System.exit(0);
    }


}

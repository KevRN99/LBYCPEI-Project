package org.openjfx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

import java.io.IOException;

public class QuizMenuController extends MainMenuController
{
    RadioButton choice4q1, choice2q2, choice3q3, choice1q4, choice4q5, choice1q6, choice3q7, choice4q8, choice2q9, choice1q10,
            choice1q1quiz2, choice3q2quiz2, choice2q3quiz2, choice2q4quiz2, choice3q5quiz2, choice2q6quiz2, choice3q7quiz2,
            choice1q8quiz2, choice4q9quiz2, choice4q10quiz2, choice1q1quiz3, choice3q2quiz3, choice4q3quiz3, choice2q4quiz3,
            choice3q5quiz3, choice1q6quiz3, choice2q7quiz3, choice1q8quiz3, choice1q9quiz3, choice2q10quiz3;

    @FXML
    private void displayQuiz1(ActionEvent event) throws IOException
    {
        App.setRoot("Quiz1");
    }

    @FXML
    private void displayQuiz1Part2(ActionEvent event) throws IOException
    {
        App.setRoot("Quiz1P2");
    }

    @FXML
    private void displayQuiz2(ActionEvent event) throws IOException
    {
        App.setRoot("Quiz2");
    }

    @FXML
    private void displayQuiz2Part2(ActionEvent event) throws IOException
    {
        App.setRoot("Quiz2P2");
    }

    @FXML
    private void displayQuiz3(ActionEvent event) throws IOException
    {
        App.setRoot("Quiz3");
    }

    @FXML
    private void displayQuiz3Part2(ActionEvent event) throws IOException
    {
        App.setRoot("Quiz3P2");
    }

    @FXML
    private void switchToQuizMenu(ActionEvent event) throws IOException
    {
        App.setRoot("Quiz");
    }

    @FXML
    private void displayMainMenu(ActionEvent event) throws IOException
    {
        App.setRoot("MainMenu");
    }

    @FXML
    private void displayAnswerKeyQ1(ActionEvent event) throws IOException
    {
        App.setRoot("AnswerKeyQ1");
    }

    @FXML
    private void displayAnswerKeyQ2(ActionEvent event) throws IOException
    {
        App.setRoot("AnswerKeyQ2");
    }

    @FXML
    private void displayAnswerKeyQ3(ActionEvent event) throws IOException
    {
        App.setRoot("AnswerKeyQ3");
    }
//    @FXML
//    public void computeQuiz1() throws IOException {
//        if(choice4q1.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice2q2.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice3q3.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice1q4.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice4q5.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice1q6.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice3q7.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice4q8.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice2q9.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        if(choice1q10.isSelected())
//        {
//            MainMenuController.score1 += 1;
//        }
//        App.setRoot("Statistics");
//    }
//    public void computeQuiz2() throws IOException {
//        if(choice1q1quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice3q2quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice2q3quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice2q4quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice3q5quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice2q6quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice3q7quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice1q8quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice4q9quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        if(choice4q10quiz2.isSelected())
//        {
//            MainMenuController.score2 += 1;
//        }
//        App.setRoot("Statistics");
//    }
//    public void computeQuiz3() throws IOException {
//        if(choice1q1quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice3q2quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice4q3quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice2q4quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice3q5quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice1q6quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice2q7quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice1q8quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice1q9quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        if(choice2q10quiz3.isSelected())
//        {
//            MainMenuController.score3 += 1;
//        }
//        App.setRoot("Statistics");
//    }
}
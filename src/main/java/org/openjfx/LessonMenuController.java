package org.openjfx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LessonMenuController
{
    @FXML
    private void displayLesson1(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson1");
    }

    @FXML
    private void displayLesson2(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson2");
    }

    @FXML
    private void displayLesson2Part2(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson2P2");
    }

    @FXML
    private void displayLesson3(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson3");
    }

    @FXML
    private void displayLesson3Part2(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson3P2");
    }

    @FXML
    private void displayLesson4(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson4");
    }

    @FXML
    private void displayLesson4Part2(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson4P2");
    }

    @FXML
    private void displayLesson5(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson5");
    }

    @FXML
    private void displayLesson5Part2(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson5P2");
    }

    @FXML
    private void displayLesson6(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson6");
    }

    @FXML
    private void displayLesson6Part2(ActionEvent event) throws IOException
    {
        App.setRoot("Lesson6P2");
    }

    @FXML
    private void switchToLessonMenu(ActionEvent event) throws IOException
    {
        App.setRoot("LessonMenu");
    }

    @FXML
    private void displayMainMenu(ActionEvent event) throws IOException
    {
        App.setRoot("MainMenu");
    }
}
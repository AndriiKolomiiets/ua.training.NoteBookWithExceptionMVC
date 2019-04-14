package ua.training.exception.controller;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * This class is used to input, verify and check data form the console.
 * @version 1.0 13.04.2019
 * @author Andrii Kolomiiets
 */
public class InputOutputController {

    /**
     * getAndCheckUserInput method get user input with scanner and check input with regular expressions.
     * @param inputMessage - message user sees before the input starts
     * @param regexp - regular expression for checking user input
     * @param scanner - example of class Scanner for getting user input from console
     * @param view - instance of View class from the Controller
     * @param resourceBundle - instance of Resource.Bundle from the Controller
     */
    public String getAndCheckUserInput(String inputMessage, String regexp, Scanner scanner, ua.training.exception.view.View view, ResourceBundle resourceBundle) {
        while (true) {
            view.printMessage(inputMessage);
            String input = scanner.next();
            if (input.matches(regexp)) {
                return input;
            } else {
                view.printMessage(resourceBundle.getString("wrong.input.message"));
            }
        }
    }
}

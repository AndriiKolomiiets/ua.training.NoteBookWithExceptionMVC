package ua.training.exception;

import ua.training.exception.controller.Controller;
import ua.training.exception.model.Model;
import ua.training.exception.view.View;

/**
 * This is starting point of the program.
 * @author Andrii Kolomiiets
 * @version 1.0 7.04.2019
 */
public class NoteBookWithExceptionMVC {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller noteBookController = new Controller(model,view);
        noteBookController.processUser();
    }
}

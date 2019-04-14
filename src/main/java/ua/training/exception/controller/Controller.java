package ua.training.exception.controller;

import ua.training.exception.model.NotUniqueLoginException;
import ua.training.exception.view.View;
import ua.training.exception.model.Model;
import ua.training.exception.model.NoteBook;

import java.util.*;

/**
 * Controller
 *
 * @version 1.0 13.04.2019
 * @author Andrii Kolomiiets
 * <p>
 * This class is used to set Locale and check data form the InputOutputController.
 * @see InputOutputController
 * <p>
 * In case input is OK it can call Model class for writing data into NoteBook class.
 * @see Model
 * @see NoteBook
 * <p>
 * Controller display all the messages to the console with View class.
 * @see View
 * <p>
 * Controller uses regular expressions for checking user input.
 * Regexp and messages located in properties.
 */
public class Controller {
    private Model model;
    private View view;
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("message_and_regexp_en_GB",
            new Locale("en", "GB"));

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * This method is used to interact with user through View and InputOutputController
     * and send data to Model.
     * Method process First Name, Login, Email and send them to Model.
     * Method calls  view for displaying saved information.
     */
    public void processUser() {
        Scanner in = new Scanner(System.in);
        InputOutputController inputOutput = new InputOutputController();

        setLocale(in);

        String userName = inputOutput.getAndCheckUserInput(resourceBundle.getString("first.name.input.message"),
                resourceBundle.getString("first.last.name.regexp"), in, view, resourceBundle);
        model.setFirstName(userName);

        boolean isLoginOk = false;
        while (!isLoginOk) {
            try {
                String userLogin = inputOutput.getAndCheckUserInput(resourceBundle.getString("login.input.message"),
                        resourceBundle.getString("login.regexp"), in, view, resourceBundle);
                model.checkLogin(userLogin);
                model.setLogin(userLogin);
                isLoginOk = true;
            } catch (NotUniqueLoginException e) {
                System.err.println(e.getMessage());
            }
        }

        String userEmail = inputOutput.getAndCheckUserInput(resourceBundle.getString("email.input.message"),
                resourceBundle.getString("email.regexp"), in, view, resourceBundle);
        model.setEmail(userEmail);
        in.close();

        model.setCreateTime();
        view.printNote(model.getNoteBook());
    }

    /**
     * setLocation method changes NoteBook locale.
     */
    private void setLocale(Scanner scanner) {
        view.printMessage(resourceBundle.getString("locale.input.message"));

        String inputLocale = scanner.next();
        if (inputLocale.equalsIgnoreCase("ua")) {
            this.resourceBundle = ResourceBundle.getBundle("message_and_regexp_uk_UA",
                    new Locale("uk", "UA"));
        } else {
            this.resourceBundle = ResourceBundle.getBundle("message_and_regexp_en_GB");
        }
    }
}

package ua.training.exception.view;

import ua.training.exception.model.NoteBook;

/**
 * View class display messages and Note information on console.
 * @version 1.0 7.04.2019
 * @author Andrii Kolomiiets
 */
public class View {
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printNote(NoteBook noteBook){
        System.out.println(noteBook);
    }
}

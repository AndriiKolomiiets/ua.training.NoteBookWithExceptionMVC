package ua.training.exception.model;

import java.sql.SQLException;

/**
 * NotUniqueLoginException class calls in case user login isn't unique.
 * @version 1.0 13.04.2019
 * @author Andrii Kolomiiets
 */
public class NotUniqueLoginException extends SQLException {
    public NotUniqueLoginException(String message){
        super(message);
    }
}

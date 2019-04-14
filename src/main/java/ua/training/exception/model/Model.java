package ua.training.exception.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Model process user data and write it into NoteBook.
 * @version 1.0 13.04.2019
 * @author Andrii Kolomiiets
 */

public class Model {

    NoteBook noteBook = new NoteBook();

    public void setFirstName(String firstName) {
        noteBook.setFirstName(firstName);
    }

    public void setLogin(String login) {
        noteBook.setLogin(login);
    }

    public void setEmail(String email) {
        noteBook.setEmail(email);
    }

    /**
     * setCreateTime method sets creation time of user note.
     */
    public void setCreateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        noteBook.setCreateTime(dateFormat.format(date));
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }

    /**
     * This method checks user login and throws exception in case login isn't unique.
     */
    public boolean checkLogin(String userLogin) throws NotUniqueLoginException {
        DBImitation [] loginsInDB = DBImitation.values();
        for (DBImitation dbLogin : loginsInDB){
            if (dbLogin.getLogin().equalsIgnoreCase(userLogin))
                throw new NotUniqueLoginException("Login is't unique! You can't use login: "+userLogin);
        }
        return true;
    }
  /*      for (DBImitation login: DBImitation.)
    if (userLogin.equalsIgnoreCase(DBImitation.valueOf(userLogin))){}
    }*/
}

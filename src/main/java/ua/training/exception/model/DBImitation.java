package ua.training.exception.model;

/**
 * Data base imitation is used to store data like a data base.
 * Data from this class can't be modified.
 * @version 1.0 13.04.2019
 * @author Andrii Kolomiiets
 */
public enum DBImitation {
    NOTE_ONE("Mick", "Jager666", "jaga911@gmail.com"),
    NOTE_TWO("Nick", "thief", "nick.lambok@gmail.com"),
    NOTE_THREE("Gerard", "ruleBreAker", "rulbar@yahoo.com");

    private final String email;

    public String getLogin() {
        return login;
    }

    private final String login;
    private final String name;

    DBImitation(String name, String login, String email) {
        this.login = login;
        this.name = name;
        this.email = email;
    }

}

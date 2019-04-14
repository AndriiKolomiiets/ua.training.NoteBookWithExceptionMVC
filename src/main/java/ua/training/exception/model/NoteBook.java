package ua.training.exception.model;

/**
 * NoteBook class store user information.
 * @author Andrii Kolomiiets
 * @version 1.0 7.04.2019
 */
public class NoteBook {
    private String firstName;
    private String login;
    private String email;
    private String createTime;

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLogin(String nickName) {
        this.login = nickName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreateTime(String time) {
        this.createTime = time;
    }

    @Override
    public String toString() {
        return "\nNew note was created in NoteBook\nUser: " + getFirstName()
                + "\nLogin: " + getLogin()
                + "\nEmail: " + getEmail()
                + "\nProfile created: " + getCreateTime();
    }
}

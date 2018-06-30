package com.dylan.quizzgame.Model;

/**
 * Created by Dylan on 05/04/2018.
 */

public class User {
    private String userName;
    private String Password;
    private String Email;

    public User() {
    }

    public User(String userName, String password, String email) {
        this.userName = userName;
        Password = password;
        Email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

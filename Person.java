package com.example.myfirstfinalapplication;

public class Person {
    private String username;
    private String password;
    //private Image image;

    public Person(String username, String password) { //Image image
        this.username = username;
        this.password = password;
        //this.image = image;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    /*public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return this.image;
    }*/


}

package main.java;

import java.util.Date;

public class User {

    private String userName;
    private String name;
    private String lastName;
    private int age;
    private Date dob;
    private String email;

    public User(String userName, String name, String lastName, int age, Date dob, String email) {
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

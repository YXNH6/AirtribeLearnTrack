package com.airtribe.learntrack.entity;
import com.airtribe.learntrack.utils.IDGenerator;

public class Person {
    private int id;
    String firstName;
    String lastName;
    String email;

    public Person(String firstName, String lastName, String email) {
        this.id = IDGenerator.nextPersonId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public String getFirstName() { return firstName; }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getDisplayName() {
        return (firstName+ " "+ lastName);
    }
}

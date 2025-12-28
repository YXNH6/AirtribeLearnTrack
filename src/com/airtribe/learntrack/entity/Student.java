package com.airtribe.learntrack.entity;

public class Student extends Person {
    String batch;
    Boolean active;

    public Student(String firstName, String lastName, String email, String batch, Boolean active) {
        super(firstName, lastName, email);
        this.batch = batch;
        this.active = active;
    }

    public Student(String firstName, String lastName, String batch, Boolean active) {
        super(firstName, lastName, "abc@gmail.com");
        this.batch = batch;
        this.active = active;
    }

    public Boolean getActive() {
        return active;
    }

    public String getBatch() {
        return batch;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String getDisplayName() {
        return lastName + "," + firstName;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId='" + super.getId() + '\'' + ", studentName='" + this.getDisplayName() + '\'' + ", Email=" + email + '\'' + ", Batch=" + batch + '\'' + ", Active=" + active + '}';
    }

}

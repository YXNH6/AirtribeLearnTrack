package com.airtribe.learntrack.entity;

public class Trainer extends Person {
    int experience;
    String specialization;

    public Trainer(String firstName, String lastName, String email, int experience, String specialization){
        super(firstName, lastName, email);
        this.experience = experience;
        this.specialization=specialization;
    }

    public int getExperience() {
        return experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getDisplayName() {
        return "Trainer " + firstName + " " + lastName;
    }
}

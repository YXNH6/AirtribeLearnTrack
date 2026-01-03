package com.airtribe.learntrack.utils;

public class IDGenerator {
    private static int personCounter = 1;
    private static int courseCounter = 100;
    private static int enrollmentCounter = 1000;

    public static int nextPersonId() {
        return personCounter++;
    }

    public static int nextCourseId() {
        return courseCounter++;
    }

    public static int nextEnrollmentId() {
        return enrollmentCounter++;
    }
}
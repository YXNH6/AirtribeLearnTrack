package com.airtribe.learntrack.entity;
import com.airtribe.learntrack.utils.IDGenerator;

public class Course {
    private int courseId;
    String courseName;
    String description;
    int durationInWeeks;
    Boolean active;


    public Course(String courseName, String description, int durationInWeeks, Boolean active) {
        this.courseId = IDGenerator.nextCourseId();
        this.courseName = courseName;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.active = active;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDescription() {
        return description;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public Boolean getCourseStatus() {
        return active;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDescription(String description) {
        this.description = description;
    }

    public void setCourseDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    public void setCourseStatus(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Course{" + "Course ID='" + courseId + '\'' + ", Course Name ='" + courseName + '\'' + ", Description=" + description + '\'' + ", Duration in weeks=" + durationInWeeks + '\'' + ", Active=" + active + '}';
    }
}



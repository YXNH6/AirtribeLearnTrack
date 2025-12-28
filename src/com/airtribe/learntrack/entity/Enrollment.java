package com.airtribe.learntrack.entity;
import com.airtribe.learntrack.enums.EnrollmentStatus;
import com.airtribe.learntrack.utils.IDGenerator;
import java.time.LocalDate;

public class Enrollment {
    private int id;
    int studentId;
    int courseId;
    LocalDate enrollmentDate;
    EnrollmentStatus status;

    public Enrollment(int studentId, int courseId, LocalDate enrollmentDate, EnrollmentStatus status) {
        this.id = IDGenerator.nextEnrollmentId();
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public LocalDate getEnrollmentDate(){
        return enrollmentDate;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Enrollment{" + "Enrollment ID='" + id + '\'' + ", Student ID ='" + studentId + '\'' + ", Course ID=" + courseId + '\'' + ", Enrollment Date=" + enrollmentDate + '\'' + ", Enrollment Status=" + status + '}';
    }
}

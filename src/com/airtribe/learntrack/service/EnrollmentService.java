package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.enums.EnrollmentStatus;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EnrollmentService {
    private static List<Enrollment> enrollmentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private Enrollment findEnrollmentById(int id) {
        for (Enrollment e : enrollmentList) {
            if (e.getId() == id) {
                return e;
            }
        }
        throw new EntityNotFoundException("Enrollment with ID " + id + " not found.");
    }

    public void enrollStudentInCourse() {
        System.out.println("Enter Student Id: ");
        int studentId = sc.nextInt();
        System.out.println("Enter Course Id: ");
        int courseId = sc.nextInt();
        LocalDate today = LocalDate.now();

        Enrollment enrollment = new Enrollment(studentId, courseId, today, EnrollmentStatus.ACTIVE);
        enrollmentList.add(enrollment);
        System.out.println("Successfully enrolled student ID " + studentId + " in course ID " + courseId + " with status as " + enrollment.getStatus());
    }

    public void viewEnrollmentsForStudent() {
        if (enrollmentList.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }
        System.out.println("Enter student ID to list enrollments");
        int studentId = sc.nextInt();
        boolean found = false;
        for (Enrollment e : enrollmentList) {
            if (e.getStudentId() == studentId) {
                found = true;
                System.out.print(e);
            }
        }
        if (!found) {
            System.out.println("Student ID not found.");
        }
    }


    public void updateEnrollmentStatus() {
        if (enrollmentList.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }
        boolean toChange = true;
        while (toChange) {
            System.out.println("Enter enrollment ID to update: ");
            int id = sc.nextInt();
            sc.nextLine(); // Clear buffer
            Enrollment e = findEnrollmentById(id);

            System.out.println("Enter new status of enrollment : \n 1. COMPLETED \n 2. CANCELLED \n ---> Enter your choice(1-2)");
            int choice = sc.nextInt();
            if (choice == 1) {
                e.setStatus(EnrollmentStatus.COMPLETED);
                System.out.print("Updated enrollment status successfully.");
                toChange = false;
                break;
            } else if (choice == 2) {
                e.setStatus(EnrollmentStatus.CANCELLED);
                System.out.print("Updated enrollment status successfully.");
                toChange = false;
                break;
            } else {
                System.out.println("Invalid status. Please try again");
            }
        }
    }
}


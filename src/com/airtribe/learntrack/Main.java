package com.airtribe.learntrack;

import java.util.Scanner;

import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.service.CourseService;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while(running) {
            System.out.println("Welcome to LearnTrack : Student and Course Management System");
            System.out.println("Menu: \n 1. Student Management \n 2. Course Management \n 3. Enrollment Management \n 4. Exit");
            System.out.print("Enter menu option : ");
            int option = sc.nextInt();
            sc.nextLine(); //Consume extra newline character
            switch(option){
                case 1 : studentManagement();
                         break;
                case 2 : courseManagement();
                         break;
                case 3 : enrollmentManagement();
                         break;
                case 4 : running = false;
                         break;
                default : System.out.println("Invalid choice. Please try again.");

            }
        }
        System.out.println("You have exited LearnTrack.");
        sc.close();
    }

    private static void studentManagement() {
        boolean runStudentMenu = true;
        while(runStudentMenu){
            System.out.println("Enter sub-menu option: \n 1. Add new student \n 2. View all students \n 3. Search student by ID \n 4. De-activate a student \n 5. Exit \n --> Select option(1-5): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character
            StudentService ss = new StudentService();
            switch (choice) {
                case 1 : ss.addStudent();
                    break;
                case 2: ss.listStudents();
                    break;
                case 3: ss.findById();
                    break;
                case 4: ss.deactivateStudent();
                    break;
                case 5: runStudentMenu = false;
                        break;
                default: System.out.println("Invalid input. Please try again.");
            }

        }

    }
    private static void courseManagement() {
        boolean runCourseMenu = true;
        while(runCourseMenu){
            System.out.println("Enter sub-menu option: \n 1. Add new course \n 2. View all courses \n 3. De-activate a course \n 4. Exit \n --> Select option(1-4): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character
            CourseService cs = new CourseService();
            switch (choice) {
                case 1 : cs.addCourse();
                    break;
                case 2: cs.viewAll();
                    break;
                case 3: cs.deactivateCourse();
                    break;
                case 4: runCourseMenu = false;
                    break;
                default: System.out.println("Invalid input. Please try again.");
            }

        }
    }
    private static void enrollmentManagement() {
        boolean runEnrollmentMenu = true;
        while(runEnrollmentMenu){
            System.out.println("Enter sub-menu option: \n 1. Enroll a student in a course \n 2. View enrollments for a student \n 3. Mark enrollment as completed/cancelled \n 4. Exit \n --> Select option(1-4): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character
            EnrollmentService es = new EnrollmentService();
            switch (choice) {
                case 1 : es.enrollStudentInCourse();
                    break;
                case 2: es.viewEnrollmentsForStudent();
                    break;
                case 3: es.updateEnrollmentStatus();
                    break;
                case 4: runEnrollmentMenu = false;
                    break;
                default: System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
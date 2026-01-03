package com.airtribe.learntrack.service;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private Student findStudentById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new EntityNotFoundException("Student with ID " + id + " not found.");
    }

    public void addStudent() {
        System.out.println("Enter First Name: ");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lname = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Batch: ");
        String batch = sc.nextLine();
        Student student = new Student(fname, lname, email, batch, true);
        studentList.add(student);
        System.out.println("Student Added Successfully. " + student);
    }

    public void removeStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline character
        Student s = findStudentById(id);
        studentList.remove(s);
        System.out.println("Successfully removed student :" + s);
    }

    public void updateStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.print("Enter student ID whose record you would like to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline character

        Student s = findStudentById(id);
        System.out.println("Please enter updated information below \n First Name: ");
        String updatedFirstName = sc.nextLine();
        s.setFirstName(updatedFirstName);
        System.out.println("Last Name:");
        String updatedLastName = sc.nextLine();
        s.setLastName(updatedLastName);
        System.out.println("Email:");
        String updatedEmail = sc.nextLine();
        s.setEmail(updatedEmail);
        System.out.println("Batch:");
        String updatedBatch = sc.nextLine();
        s.setBatch(updatedBatch);
        System.out.println("Student record updated successfully.");
    }

    public void listStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void findById() {
        System.out.print("Enter student ID to search: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer
        Student student = findStudentById(id);
        System.out.println("Student found:");
        System.out.println(student);
    }

    public void deactivateStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.print("Enter student ID to deactivate: ");
        int id = sc.nextInt();
        Student s = findStudentById(id);
        s.setActive(Boolean.FALSE);
        System.out.println("Successfully deactivated student with id " + id);
    }
}

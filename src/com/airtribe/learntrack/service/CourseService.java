package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseService {
    private static List<Course> courseList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private Course findCourseById(int id) {
        for (Course c : courseList) {
            if (c.getCourseId() == id) {
                return c;
            }
        }
        throw new EntityNotFoundException("Course with ID " + id + " not found.");
    }

    public void addCourse(){
        System.out.println("Enter Course Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Course Description: ");
        String desc = sc.nextLine();
        System.out.println("Enter Duration in Weeks: ");
        int duration = sc.nextInt();

        Course course = new Course(name, desc, duration, true);
        courseList.add(course);
        System.out.println("Course Added Successfully. " + course);
    }

    public void viewAll(){
        if (courseList.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }
        for (Course c : courseList) {
            System.out.println(c);
        }
    }


    public void deactivateCourse() {
        System.out.print("Enter course ID to deactivate: ");
        int id = sc.nextInt();
        Course c = findCourseById(id);
        c.setCourseStatus(false);
        System.out.println("Successfully deactivated course with id " + id);
    }
}



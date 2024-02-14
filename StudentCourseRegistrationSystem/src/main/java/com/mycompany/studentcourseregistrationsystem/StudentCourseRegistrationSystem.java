/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentcourseregistrationsystem;

import java.util.List;

/**
 *
 * @author prade
 */
public class StudentCourseRegistrationSystem {

    public static void main(String[] args) {
        Course mathCourse = new Course("MATH101", "Introduction to Mathematics", "Basic math concepts", 30, List.of("Mon/Wed/Fri 9:00-10:30"));
        Course historyCourse = new Course("HIST101", "World History", "Overview of world history", 25, List.of("Tue/Thu 11:00-12:30"));

        // Creating students
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Course registration
        mathCourse.enrollStudent(student1);
        historyCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);

        // Course removal
        mathCourse.removeStudent(student2);
        
        

        // Displaying enrolled courses for each student
        System.out.println("Courses enrolled by " + student1.getName() + ":");
        for (Course course : student1.getRegisteredCourses()) {
            System.out.println(course.getCode() + " - " + course.getTitle());
        }

        System.out.println("Courses enrolled by " + student2.getName() + ":");
        for (Course course : student2.getRegisteredCourses()) {
            System.out.println(course.getCode() + " - " + course.getTitle());
        }
    }
}
    


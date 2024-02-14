/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentcourseregistrationsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prade
 */
public class Course {
    
    private String code;
    private String title;
    private String description;
    private int capacity;
    private List<String> schedule;
    private List<Student> enrolledStudents;

    public Course(String code, String title, String description, int capacity, List<String> schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgradecalculator;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        
        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks = scanner.nextInt();
            if(marks<=100&& marks>=0){
                 totalMarks += marks;
            }
            else{
                System.out.println("Wrong Number: Marks for Enter between 0 to 100 ");
                break;
            }
        }
        
        // Calculate total marks and average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
       
    }
}


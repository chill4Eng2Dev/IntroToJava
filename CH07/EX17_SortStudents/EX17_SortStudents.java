/**
 * (Sort students) Write a program that prompts the user to enter the number of students,
 * the students’ names, and their scores, and prints student names in decreasing
 * order of their scores.
 * 
 * Commentary: I will need to modify the selection sort to have two list passed through the
 * parameters. I will compare the score array elements to each other and sort accordingly,
 * while also sorting the names with the score sorts. I will print the arrays in descending
 * order after sorting as described in the problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 10/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.17
 */

import java.util.Scanner;

public class EX17_SortStudents {

    public static void main(String[] args) {
       
        // create scanner and declare variables
        Scanner input = new Scanner(System.in);
        String name = "";
        int numOfStudents, score;
        
        // assign number of students to arrays
        System.out.print("\nEnter number of students: ");
        numOfStudents = input.nextInt();
        
        // declare arrays
        String[] studentName = new String[numOfStudents];
        int[] scores = new int[numOfStudents];
        
        // assign user input to student name and student score array
        for (int i = 0; i < studentName.length; i++) {
            System.out.print("\nEnter Student Name: ");
            name = input.next();
            studentName[i] = name;
            System.out.print("Enter Student Score: ");
            score = input.nextInt();
            scores[i] = score;
        }
        
        // call selection sort to sort both array simultaneously
        selectionSortRevised(scores, studentName);
        
        // print output as described in problem statement
        System.out.println("The Student Name and Student Score in decreasing order is: ");
        for (int i = studentName.length - 1; i >= 0; i--) {
            System.out.printf("%10s%4d\n", studentName[i], scores[i]);
        }
                    
    }
    
    // revised selection sort method to take two arrays and sort them simultaneously
    public static void selectionSortRevised(int[] scores, String[] studentName) {
        
        for (int i = 0; i < scores.length - 1; i++) {
            // find the minimum in the score [i..scores.length-1] and store values from both arrays
            int currentMin = scores[i];
            int currentMinIndex = i;
            String minName = studentName[i];
            
            for (int j = i + 1; j < scores.length; j++) {
                if (currentMin > scores[j]) {
                    currentMin = scores[j];
                    minName = studentName[j];
                    currentMinIndex = j;
                }
            }
            
            // Swap scores[i] with scores[currentMinIndex] if necessary, along with student name
            if (currentMinIndex != i) {
                scores[currentMinIndex] = scores[i];
                studentName[currentMinIndex] = studentName[i];
                scores[i] = currentMin;
                studentName[i] = minName;
            }
        }
    }
                    
        
    }
        


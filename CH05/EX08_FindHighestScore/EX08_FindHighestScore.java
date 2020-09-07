/**
 * (Find the highest score) Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the name
 * of the student with the highest score.
 * 
 * Commentary: I will need to get user input to define how many iterations the for
 * loop will have. I will need to gather two inputs for each iteration from the user. 
 * These inputs will need to be compared with a "max" variable and this variable will
 * need to be updated if value is no longer max. I will print the output as requested
 * in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/31/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.8
 */

import java.util.Scanner;

public class EX08_FindHighestScore {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables
        String studentName = "", maxStudentName = "";
        double score, maxScore = 0;
        
        // gather number of students from user
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        
        // for loop to enter student name and score
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            studentName = input.next();
            
            System.out.print("Enter student score: ");
            score = input.nextInt();
            
            // if score larger than max score, then update max score and student
            if(score > maxScore) {
                maxScore = score;
                maxStudentName = studentName;
            }
        }
        
        // print max score and student name as stated in problem statement
        System.out.println("The student with the highest score of " + maxScore + " is " + maxStudentName);
        
    }
}

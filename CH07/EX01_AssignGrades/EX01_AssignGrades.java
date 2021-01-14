/**
 * (Assign grades) Write a program that reads student scores, gets the best score,
 * and then assigns grades based on the following scheme:
 * 
 * Grade is A if score is >= best - 10
 * Grade is B if score is >= best - 20;
 * Grade is C if score is >= best - 30;
 * Grade is D if score is >= best - 40;
 * Grade is F otherwise.
 * 
 * The program prompts the user to enter the total number of students, then prompts
 * the user to enter all of the scores, and concludes by displaying the grades. Here
 * is a sample run:
 * 
 * ----------------------------------------------------------
 * Enter the number of students: 4 [ENTER]
 * Enter 4 scores: 40 55 70 58 [ENTER]
 * Student 0 score is 40 and grade is C
 * Student 1 score is 55 and grade is B
 * Student 2 score is 70 and grade is A
 * Student 3 score is 58 and grade is B
 * ----------------------------------------------------------
 * 
 * Commentary: I will need to create an array based on user input size and elements.
 * I will pass the array through a getMax method to retrieve highest score. I will then
 * need to pass each score through a getGrade method and return grade character. I will
 * then print output as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/14/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.1
 */

import java.util.Scanner;

public class EX01_AssignGrades {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // get student count to size the array
        System.out.print("Enter the number of students: ");
        int studentCount = input.nextInt();
        int[] scores = new int[studentCount];
        
        // assign user input to array
        System.out.print("Enter " + studentCount + " scores: ");
        for (int i = 0; i < scores.length; i++)
            scores[i] = input.nextInt();
        
        // get max score
        int max = getMax(scores);
        
        // print output as shown in sample run
        for (int i = 0; i < scores.length; i++) {
            char grade = getGrade(scores[i], max);  // get grade to each score
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
    
    // method to determine max value within array
    public static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i])
                max = scores[i];
        }
        return max;
    }
    
    // method to determine grade based on formula provided in problem statement
    public static char getGrade(int score, int max) {
        if (score >= max - 10)
            return 'A';
        else if (score >= max - 20)
            return 'B';
        else if (score >= max - 30)
            return 'C';
        else if (score >= max - 40)
            return 'D';
        else
            return 'F';
    }
}

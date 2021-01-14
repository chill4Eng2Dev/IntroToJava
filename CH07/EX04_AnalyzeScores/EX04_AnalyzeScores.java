/**
 * (Analyze scores) Write a program that reads an unspecified number of scores and
 * determines how many scores are above or equal to the average and how many
 * scores are below the average. Enter a negative number to signify the end of the
 * input. Assume that the maximum number of scores is 100.
 * 
 * Commentary: 
 *
 * Author: chill4Eng2Dev 
 * Date: 10/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.4
 */

import java.util.Scanner;

public class EX04_AnalyzeScores {

    public static void main(String[] args) {
        
        // create scanner and array
        Scanner input = new Scanner(System.in);
        int[] grades = new int[100];
        
        // while loop to assign user input grades to array within values of 0 - 100
        System.out.print("\nEnter scores, enter negative integer to terminate: ");
        int value = 1, sum = 0, i = 0;
        while (value >= 0) {
            value = input.nextInt();
            if (value <= 100 && value >= 0) {
                grades[i] = value;
                sum = sum + grades[i];
                i++;
            }
        }
        
        double average = (double)sum / i; // calculate average
        
        // use for loop to count entries within array compared to average
        int countAbove = 0, countBelow = 0;
        for (int j = 0; j < i; j++) {
            if (grades[j] >= average)
                countAbove++;
            else
                countBelow++;
        }
        
        // print output as stated in problem statement
        System.out.println("Average is " + average);
        System.out.println("Number of grades above the average is " + countAbove);
        System.out.println("Number of grades below the average is " + countBelow);
    }
}

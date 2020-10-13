/**
 * (Sort three numbers) Write a method with the following header to display three
 * numbers in increasing order:
 * 
 *  public static void displaySortedNumbers(double num1, double num2, double num3)
 * 
 * Commentary: I assume user input is probably good for this program. I will compare
 * the numbers within the method and return the values sorted in ascending order as
 * stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.5
 */

import java.util.Scanner;

public class EX05_SortThreeNumbers {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user inputs to variables
        System.out.print("\nEnter three numbers to be sorted: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        // print output as stated in problem statement
        System.out.print("The values sorted in ascending order are: ");
        displaySortedNumbers(num1, num2, num3);
        
    }
    
    // sort the values in ascending order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        
        if (num1 < num2 && num1 < num3) {
            if (num2 < num3)
                System.out.print(num1 + ", " + num2 + ", " + num3);
            else
                System.out.print(num1 + ", " + num3 + ", " + num2);
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3)
                System.out.print(num2 + ", " + num1 + ", " + num3);
            else
                System.out.print(num2 + ", " + num3 + ", " + num1);
        } else {
            if (num1 < num2)
                System.out.print(num3 + ", " + num1 + ", " + num2);
            else
                System.out.print(num3 + ", " + num2 + ", " + num1);
        }
        
    }
      

}

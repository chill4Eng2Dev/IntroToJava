/**
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the same
 * value.
 * 
 * public static boolean isConsecutiveFour(int[] values)
 * 
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size i.e., the number of
 * values in the series. Here are sample runs:
 * 
 * --------------------------------------------
 * Enter the number of values: 8 [ENTER]
 * Enter the values: 3 4 5 5 5 5 4 5 [ENTER]
 * The list has consecutive fours
 * --------------------------------------------
 * 
 * --------------------------------------------
 * Enter the number of values: 9
 * Enter the values: 3 4 5 5 6 5 5 4 5
 * The list has no consecutive fours
 * --------------------------------------------
 *
 * Commentary: I will need to compare each element to a current element that is being evaluated
 * and count the amount of times the comparison is equal. Should the element not have a similar 
 * consecutive element, a new element is assigned to be compared and a counter is restarted to 1. 
 * I will print output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 10/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.30
 */

import java.util.Scanner;

public class EX30_ConsecutiveFourEqualNums {
    
    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // get values from user and assign to list to be evaluated
        int[] values = getValues(input);
        
        // print output as shown in sample run and call isConsecutiveFour method
        System.out.println("The list has " + (isConsecutiveFour(values) ? "" : "no ") + "consecutive fours");
    }
    
    // method getvalues to retrieve user inputs and assign to array
    public static int[] getValues(Scanner input) {
        System.out.print("Enter the number of values: ");
        int[] list = new int[input.nextInt()];
        
        System.out.print("Enter the values: ");
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        
        return list;
    }
    
    // method to check if the elements are in consecutive order and to count how many times
    public static boolean isConsecutiveFour(int[] values) {
        int counter = 1;
        int valueCompare = values[0];   // start with first element
        
        for (int i = 1; i < values.length; i++) {
            if (valueCompare == values[i]) {
                counter++;
                if (counter == 4)   // break for loop should four consecutives are found
                    return true;
            } else {    // reset the element to be checked and counter
                counter = 1;
                valueCompare = values[i];
            }
        }
        
        return false;
    }
                

}

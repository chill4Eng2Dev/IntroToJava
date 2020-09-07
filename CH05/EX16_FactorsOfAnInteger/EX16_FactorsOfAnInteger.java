/**
 * (Find the factors of an integer) Write a program that reads an integer and displays
 * all its smallest factors in increasing order. For example, if the input integer is
 * 120, the output should be as follows: 2, 2, 2, 3, 5.
 * 
 * Commentary: I will use a while loop and check the entry and make sure it is not 1.
 * The value will be evaluated with an incremented divisor, and the value will be divided
 * by the divisor to force an eventual termination. I will print the output as shown in 
 * the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/6/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.16
 */

import java.util.Scanner;

public class EX16_FactorsOfAnInteger {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to value
        System.out.print("Enter a number: ");
        int value = input.nextInt();
        
        // starting divisor
        int divisor = 2;
        
        // while loop will run until divisor is 1
        while (value != 1) {
            if (value % divisor == 0) {         // check if factor of value
                System.out.print(divisor + " "); // print divisor
                value = value / divisor;    // reduce value by divisor
            } else {
                divisor++;  // check next divisor
            }
        }
            
        System.out.println();
    }

}

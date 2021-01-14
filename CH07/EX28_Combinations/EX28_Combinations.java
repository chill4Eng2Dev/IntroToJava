/**
 * (Math: combinations) Write a program that prompts the user to enter 10 integers
 * and displays all combinations of picking two numbers from the 10.
 *
 * Commentary: Combinations, by definition, does not consider order when numbers are
 * concerned. Permutations do care about order and are unique sets. Therefore, I will 
 * assume duplicates are not allowed. What that means is (2, 1) vs (1, 2), only one of 
 * these two permutations should be printed. Additionally, # = # or (2, 2) should not 
 * be printed. I will add a combination counter to back check my assumption using the
 * formula: 
 * 
 *      Combinations = n! / [r! x (n - r)!]
 *      
 *      Where:
 *      n = amount in set, 10
 *      r = amount in each sub-set, 2
 *      
 *      Therefore:
 *      Combinations = 10! / [2! x (10 - 2)!] = 45
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/9/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.28
 */

import java.util.Scanner;

public class EX28_Combinations {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        
        // assign user inputs to list
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();
        
        // print out the combinations from the list
        System.out.println("The combinations are: ");
        printCombinations(values);       
        
    }
    
    // determine combinations from list and print, give total combination count to verify assumption
    public static void printCombinations(int[] list) {
        int combinations = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (j != i) {
                    System.out.printf("%d, %d\n", list[i], list[j]);
                    combinations++;
                }
            }
        }

        System.out.println("The number of combinations is: " + combinations);     
    }
}

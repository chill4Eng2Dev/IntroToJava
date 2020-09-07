/**
 * (Perfect number) A positive integer is called a perfect number if it is equal to
 * the sum of all of its positive divisors, excluding itself. For example, 6 is the first
 * perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. 
 * There are four perfect numbers less than 10,000. Write a program to find all
 * these four numbers.
 * 
 * Commentary: I will need to use a nested for loop to cycle through the values between
 * 6 and 10000. I will need the other for loop to check the sum of the modulus of 0 of 
 * all values up to the potential perfect number being checked. I will compare the sum 
 * of these values to the potential perfect number. I will print the output as stated 
 * in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.33
 */

public class EX33_PerfectNumber {

    public static void main(String[] args) {
        
        // for loop to increment the number to check if perfect number
        for (int i = 6; i < 10000; i++) {
            int sum = 0;
            // for loop to check modulus of all numbers leading up to perfect number
            for (int j = 1; j < i; j++) { 
                if (i % j == 0)
                    sum = sum + j;  // sum modulus of check if 0
            }
            
            // if sum equals value checked, print value
            if (sum == i)
                System.out.print(i + " ");
        }
        
        System.out.println();
    }
}

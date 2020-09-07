/**
 * (Find numbers divisible by 5 or 6, but not both) Write a program that displays
 * all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
 * both. Numbers are separated by exactly one space.
 * 
 * Commentary: I will need to use a for loop and increment by 1 and use a XOR operator when
 * comparing modulus of 5 and 6. I will have a variable to control how many times a number 
 * is printed per a row. I will print the output as stated in the problem. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/1/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.11
 */

public class EX11_NumsDivBy5Or6 {

    public static void main(String[] args) {
        
        // declare and initialize variables
        final int MAX_DISPLAYS = 10;
        int count = 0;
        
        // use for loop to go through range stated in problem
        for (int i = 100; i <= 200; i++ ) {
            
            // check if i is divisible by both 5 or 6 but not both
            if (i % 5 == 0 ^ i % 6 == 0) {
                                
                if(count % MAX_DISPLAYS == 0)   // print as stated in problems statement
                    System.out.printf("\n%-6d", i);
                else
                    System.out.printf("%-6d", i);
                    
                count++;    // increment count
            }
                
        }
        
    }
}


/**
 * (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
 * from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
 * separated by exactly one space.
 * 
 * Commentary: I will need to use a for loop and increment by 5 as 5 and 6 do not have a
 * common divisor so iterations of 5 X 6 are the only times the numbers will share the 5 and
 * 6 divisor. I will have a variable to control how many times a number is printed per a row.
 * I will print the output as stated in the problem. 
 *
 * Author: chill4Eng2Dev 
 * Date: #/##/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.10
 */

public class EX10_NumsDivisibleBy5And6 {
    
    public static void main(String[] args) {
        
        // declare and initialize variables
        final int MAX_DISPLAYS = 10;
        int count = 0;
        
        // use for loop to go through range stated in problem, increment by 5 as there is no common divisor
        for (int i = 100; i <= 1000; i += 5 ) {
            
            // check if i is divisible by both 5 and 6
            if (i % 5 == 0 && i % 6 == 0) {
                                
                if(count % MAX_DISPLAYS == 0)   // print as stated in problems statement
                    System.out.printf("\n%-6d", i);
                else
                    System.out.printf("%-6d", i);
                    
                count++;    // increment count
            }
                
        }
        
    }
}

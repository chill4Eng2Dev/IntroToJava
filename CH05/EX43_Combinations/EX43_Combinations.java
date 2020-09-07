/**
 * (Math: combinations) Write a program that displays all possible combinations
 * for picking two numbers from integers 1 to 7. Also display the total number of
 * all combinations.
 * 
 * -------------------------------------------
 *  1 2
 *  1 3
 *  ...
 *  ...
 *  The total number of all combinations is 21
 * -------------------------------------------
 * 
 * Commentary: Based on the pattern provided in the sample run, I am going to assume
 * the combinations cannot be equal numbers such as 1 1 or 2 2. In addition, I assume
 * the combinations cannot be numbers already used but reversed such as 2 3 versus 3 2.
 * This is the only way I will be able to achieve the total combinations shown in the
 * sample run. I will use a nested for loop to cycle through 1 through 7 and print the
 * combinations as long as i != j and j > i. I will print output as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.43
 */


public class EX43_Combinations {
    
    public static void main(String[] args) {
        
        // initialize counter
        int count = 0;
        
        // nested for loop to cycle through all of the combinations
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j || i > j)    // if numbers are equal or i greater than j, do not print
                    continue;
                
                System.out.printf("%2d %2d\n", i, j);   // print values as shown in sample
                count++;
            }
        }
        
        // print output of combination count
        System.out.println("The total number of all combinates is " + count);
    }
    
    

}

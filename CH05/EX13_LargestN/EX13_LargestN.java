/**
 * (Find the largest n such that n^3 < 12,000) Use a while loop to find the largest
 * integer n such that n^3 is less than 12,000.
 * 
 * Commentary: I will use a while loop to iterate through all possible values of n and
 * display the result.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/1/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.13
 */

public class EX13_LargestN {
    
    public static void main(String[] args) {
        
        // initialize n at 1
        int n = 0;
        
        // create while loop and cycle through values of n
        while (Math.pow(n, 3) < 12000) {
            n++;
        }
        
        // print n after while loop has terminated
        System.out.println("The smallest value of n such that n^3 is less than 12,000 is " + (n - 1));
    }

}

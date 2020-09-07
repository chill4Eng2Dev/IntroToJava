/**
 * (Find the smallest n such that n^2 > 12,000) Use a while loop to find the smallest
 * integer n such that n^2 is greater than 12,000.
 * 
 * Commentary: I will use a while loop to iterate through all possible values of n and
 * display the result.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/1/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.12
 */

public class EX12_SmallestN {
    
    public static void main(String[] args) {
        
        // initialize n at 1
        int n = 1;
        
        // create while loop and cycle through values of n
        while (Math.pow(n, 2) < 12000) {
            n++;
        }
        
        // print n after while loop has terminated
        System.out.println("The smallest value of n such that n^2 is greater than 12,000 is " + n);
    }

}

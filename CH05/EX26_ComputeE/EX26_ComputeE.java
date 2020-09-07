
/**
 * (Compute e) You can approximate e using the following series:
 * 
 *      e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
 *  
 * Write a program that displays the e value for i = 10000, 20000, …, and
 * 100000. (Hint: Because i! = i * (i - 1) * ... * 2 * 1, then
 * 
 *                   1/i! is 1/(i(i-1)!)
 * 
 * Initialize e and item to be 1 and keep adding a new item to e. The new item is
 * the previous item divided by i for i = 2, 3, 4, . . . .)
 * 
 * Commentary: I will use two for loops to cycle through the ranges provided and
 * I will initialize variables per the problem statement hints. I will print the
 * output table per the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.26
 */

public class EX26_ComputeE {
    
    public static void main(String[] args) {
        
        // print header for table
        System.out.printf("\n%-15s  %-15s\n", "e value", "i value");
        System.out.println("-----------------------------");
        
        // use for loop and increment every 10000 
        for (int i = 10000; i <= 100000; i += 10000) {
            double e = 1.0;         // initialize e per the hint
            double item = 1.0;      // initialize item per the hint
            for (int n = 2; n <= i; n++) {
                e = e + item;       // add item to e per the hint
                item = item / n;    // divide the previous item by n continuous per the hint
            }
            System.out.printf("%-15.12f  %-15d\n", e, i);   // print out the table
        }
        
    }

}

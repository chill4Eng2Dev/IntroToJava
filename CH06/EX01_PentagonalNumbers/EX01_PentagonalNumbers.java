/**
 * (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
 * n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
 * Write a method with the following header that returns a pentagonal number:
 * 
 *      public static int getPentagonalNumber(int n)
 * 
 * Write a test program that uses this method to display the first 100 pentagonal
 * numbers with 10 numbers on each line.
 * 
 * Commentary: I will use the provided formula and create the method. I will use a
 * for loop to cycle through all of the pentagonal numbers and print 10 per row
 * per the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.1
 */

public class EX01_PentagonalNumbers {

    public static void main(String[] args) {
        
        // output message stating the number of numbers to be printed
        System.out.print("\nThe first 100 pentagonal numbers are: ");
        
        // for loop to print values, 10 per row
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0)
                System.out.printf("\n%-7d ", getPentagonalNumber(i + 1));
            else
                System.out.printf("%-7d ", getPentagonalNumber(i + 1));
        }
        
    }
    
    // method to calculate pentagonal number using provided formula
    public static int getPentagonalNumber(int n) {
        return n * ( 3 * n - 1) / 2;
    }

}

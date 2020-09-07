/**
 * (Display numbers in a pyramid pattern) Write a nested for loop that prints the
 * following output:
 * 
 * ------------------------------------------------------------------------
 *                                      1
 *                                    1 2 1
 *                                  1 2 4 2 1
 *                                1 2 4 8 4 2 1
 *                             1 2 4 8 16 8 4 2 1
 *                          1 2 4 8 16 32 16 8 4 2 1
 *                       1 2 4 8 16 32 64 32 16 8 4 2 1
 *                   1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 * ------------------------------------------------------------------------
 *                              
 * Commentary: I will need to increment (x2) or decrement (/2) the pyramid for every
 * for loop in some capacity. I will have a major for loop for the row count. I will
 * create another for loop for generating white space. Another for loop for the ascending
 * numbers. A final for loop to generate the descending numbers. I will print output
 * as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/6/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.19
 */

public class EX19_NumbersInPyramidPattern {

    public static void main(String[] args) {
        
        // for loop to cycle through rows, i value multiplied by 2 each iteration
        for (int i = 1; i <= 128; i *= 2) {
            
            // print white space before number print outs, each iteration divided by 2
            for (int j = 128 / i; j >= 1; j /= 2)
                System.out.printf("%4s"," ");
                
            // for loop to print out ascending numbers (*2)
            for (int k = 1; k <= i; k *= 2)
                System.out.printf("%3d ",k);
            
            // for loop to print out numbers on same row for descending values (/2)
            for (int j = i / 2; j > 0; j /= 2)
                System.out.printf("%3d ",j);

            System.out.println();
        }

                
    }
}

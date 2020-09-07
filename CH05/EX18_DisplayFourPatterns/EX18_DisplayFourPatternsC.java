/**
 * (Display four patterns using loops) Use nested loops that display the following
 * patterns in four separate programs:
 * 
 * ------------------------------------------------------------------------
 * Pattern A        Pattern B       Pattern C       Pattern D
 * 1                1 2 3 4 5 6             1     1 2 3 4 5 6
 * 1 2              1 2 3 4 5             2 1       1 2 3 4 5
 * 1 2 3            1 2 3 4             3 2 1         1 2 3 4
 * 1 2 3 4          1 2 3             4 3 2 1           1 2 3
 * 1 2 3 4 5        1 2             5 4 3 2 1             1 2
 * 1 2 3 4 5 6      1             6 5 4 3 2 1               1
 * ------------------------------------------------------------------------
 *                              
 * Commentary: I will write a for loop that will start at 1 and and increment 6, this will
 * be for the rows. I will then have a nested for loop to print white space and decrement
 * the amount of white space printed per row. I will then print values for columns
 * based on row count. I will print the output as shown in the sample runs.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.18(c)
 */

public class EX18_DisplayFourPatternsC {

    public static void main(String[] args) {
        
        // for loop to cycle through rows
        for (int i = 1; i <= 6; i++) {
            
            // print white space before number print outs
            for (int j = 6 - i; j > 0; j--)
                System.out.print("  ");
                
            // for loop to print out numbered columns
            for (int k = i; k > 0; k--)
                System.out.print(k + " ");
            
            System.out.println();
    
        }
    }
    
}

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
 * Commentary: I will write a for loop that will start at 1 and end at 6, this will
 * be for the rows. I will then have a nested for loop for the column print out. I
 * will print the output as shown in the sample runs.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.18(a)
 */

public class EX18_DisplayFourPatternsA {
    
    public static void main(String[] args) {
        
        // for loop to cycle through rows
        for (int i = 1; i <= 6; i++) {
            
            // for loop to print out columns
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            
            System.out.println();
    
        }
    }
}


/**
 * (Print a table) Write a program that displays the following table. Cast floating-
 * point numbers into integers. 
 * 
 *  a        b       pow(a, b)
 *  1        2       1
 *  2        3       8
 *  3        4       81
 *  4        5       1024
 *  5        6       15625
 * 
 * Commentary: The pattern for a is incremented each row, so is b and is always one
 * digit above a. Math.pow will likely need the floating-point number cast to int. Spacing
 * will be arbitrarily decided to match sample output.  
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.18
 */

public class EX18_PrintTable {
    
    public static void main(String[] args) {
        
        // declare and initialize variables
        int a = 1, b = a + 1;
        
        /** Headers will be printed first. Then the first row using the initialized
        values for a and b. Each row after the first row will have a and b incremented
        by 1 and then recalculate Math.pow(a, b). This pattern will continue until the
        fifth row. */
        
        // headers
        System.out.println("a        b       pow(a, b)");
        // first row
        System.out.println(a + "        " + b + "       " + (int)Math.pow(a, b));
        // second row
        a++;
        b++;
        System.out.println(a + "        " + b + "       " + (int)Math.pow(a, b));
        // third row
        a++;
        b++;
        System.out.println(a + "        " + b + "       " + (int)Math.pow(a, b));
        // fourth row
        a++;
        b++;
        System.out.println(a + "        " + b + "       " + (int)Math.pow(a, b));
        // fifth row
        a++;
        b++;
        System.out.println(a + "        " + b + "       " + (int)Math.pow(a, b));
    }

}

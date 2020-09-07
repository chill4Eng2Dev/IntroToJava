/**
 * (Conversion from kilograms to pounds) Write a program that displays the following
 * table (note that 1 kilogram is 2.2 pounds):
 * 
 *      Kilograms    Pounds
 *      1               2.2
 *      3               6.6
 *      ...
 *      197           433.4
 *      199           437.8
 * 
 * Commentary: I will need to create a for loop that uses a printf output to control
 * how the table will print out as to match the sample. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/31/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.3
 */

public class EX03_KilogramsToPounds {

    public static void main(String[] args) {
        
        // print out heads first
        System.out.printf("%-10s%10s\n", "Kilograms", "Pounds");
        
        // print pounds and kilograms in for loop using printf method.
        for(int i = 1; i < 200; i++) {
           System.out.printf("%-10d%10.1f\n", i, i * 2.2);
        }
        
    }
            
}

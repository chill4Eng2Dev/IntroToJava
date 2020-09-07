/**
 * (Conversion from miles to kilometers) Write a program that displays the following
 * table (note that 1 mile is 1.609 kilometers):
 *      
 *      Miles   Kilometers
 *      1       1.609
 *      2       3.218
 *      ...
 *      9       14.481
 *      10      16.090
 * 
 * Commentary: I will need to create a for loop that uses a printf output to control
 * how the table will print out as to match the sample. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/31/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.4
 */

public class EX04_MilesToKilometers {

    public static void main(String[] args) {
        
        // print headers to table
        System.out.printf("%-10s%-10s\n","Miles","Kilometers");
        
        // print miles and kilometers with for loop and printf to format the table
        for(int i = 1; i <= 10; i++)
            System.out.printf("%-10d%-10.3f\n", i, i * 1.609);
            
    }
}

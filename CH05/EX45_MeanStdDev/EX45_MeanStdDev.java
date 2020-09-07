/**
 * (Statistics: compute mean and standard deviation) In business applications, you
 * are often asked to compute the mean and standard deviation of data. The mean is
 * simply the average of the numbers. The standard deviation is a statistic that tells
 * you how tightly all the various data are clustered around the mean in a set of data.
 * For example, what is the average age of the students in a class? How close are the
 * ages? If all the students are the same age, the deviation is 0.
 * 
 * Write a program that prompts the user to enter ten numbers, and displays the
 * mean and standard deviations of these numbers using the following formula:
 * 
 * <<<<SEE PHOTO IN FOLDER>>>>
 * 
 * Here is a sample run:
 * ---------------------------------------------
 *  Enter ten numbers: 1 2 3 4.5 5.6 6 7 8 9 10
 *  The mean is 5.61
 *  The standard deviation is 2.99794
 * ---------------------------------------------
 * 
 * Commentary: I will need to use a for loop to gather user inputs and calculate
 * a summation and the squared value of each entry and store the summation of this
 * input. I will then calculate mean and standard deviation using the formula from
 * the problem statement and print output as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.45
 */

import java.util.Scanner;

public class EX45_MeanStdDev {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // initialize variables
        final int MAX_ENTRIES = 10;
        double nums = 0, sum = 0, sumSquared = 0, deviation, mean;
        
        System.out.print("Enter ten numbers: ");
        // gather inputs from user and calculate the summation and the squared sum of each entry
        for (int i = 1; i <= MAX_ENTRIES; i++) {
            nums = input.nextDouble();
            sum = sum + nums;
            sumSquared = sumSquared + Math.pow(nums, 2);
        }
        
        // calculate mean and standard deviation using the supplied formulas
        mean = sum / MAX_ENTRIES;
        deviation = Math.sqrt((sumSquared - Math.pow(sum, 2) / MAX_ENTRIES) / (MAX_ENTRIES - 1));
        
        // print output as shown in sample run
        System.out.printf("The mean is %-2.2f\nThe standard deviation is %-2.5f\n", mean, deviation);
        
    }
        
        

}

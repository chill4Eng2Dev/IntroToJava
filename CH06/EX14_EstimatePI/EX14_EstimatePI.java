/**
 * (Estimate PI) PI can be computed using the following series:
 * 
 * 
 * m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + (-1)^(i + 1) / (2*i - 1))
 * 
 * Write a method that returns m(i) for a given i and write a test program that displays
 * the following table:
 * 
 *      i           m(i)
 *      --------------------
 *      1           4.0000
 *      101         3.1515
 *      201         3.1466
 *      301         3.1449
 *      401         3.1441
 *      501         3.1436
 *      601         3.1433
 *      701         3.1430
 *      801         3.1428
 *      901         3.1427
 *  
 * Commentary: I will create a method that returns m(i) as double for each value 
 * of i. I will need to use a for loop to print the table while calling the sumSeries
 * method. I will print output to match the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.14
 */

public class EX14_EstimatePI {
    
    public static void main(String[] args) {
        
        // print header
        System.out.printf("\n%-10s%-10s\n", "i", "m(i)");
        System.out.println("-----------------");
        
        // print table and call estPI method
        for (int i = 1; i <= 901; i += 100)
            System.out.printf("%-10d%-10.4f\n", i, estPI(i));
            
    }
    
    // method to calculate PI based on the iterations entered
    public static double estPI(int iterations) {
        double sumPI = 0;
        
        for (int i = 1; i <= iterations; i++)
            sumPI = sumPI + 4.0 * (Math.pow(-1.0, i + 1) / (2.0 * i - 1.0));
        
        return sumPI;
    }

}

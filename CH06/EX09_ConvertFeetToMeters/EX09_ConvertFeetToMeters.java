/**
 * (Conversions between feet and meters) Write a class that contains the following
 * two methods:
 * 
 * // Convert from feet to meters 
 * public static double footToMeter(double foot)
 * 
 * // Convert from meters to feet
 * public static double meterToFoot(double meter)
 * 
 * The formula for the conversion is:
 * 
 * meter = 0.305 * foot
 * foot = 3.279 * meter
 * 
 * Write a test program that invokes these methods to display the following tables:
 * 
 *      Feet         Meters      |       Meters      Feet
 *      ----------------------------------------------------
 *      1.0          0.305       |       20.0        65.574
 *      2.0          0.610       |       25.0        81.967
 *      ...
 *      9.0          2.745       |       60.0        196.721
 *      10.0         3.050       |       65.0        213.115
 *  
 * Commentary: I will use the provided formulas to calculate meters and feet utilizing
 * methods. I will print the table as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.9
 */

public class EX09_ConvertFeetToMeters {
    
    public static void main(String[] args) {
        
        // print headers for table
        System.out.printf("%-10s%-10s     |     %-13s%-10s\n","Feet", "Meters", "Meters", "Feet");
        System.out.println("------------------------------------------------------");
        
        // use i for celsius to fahr, j for fahr to celsius
        for(double i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5)
            System.out.printf("%-10.1f%-10.3f     |     %-13.1f%-10.3f\n", i, footToMeter(i), j, meterToFoot(j));
        
    }

    // convert ft to m
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    
    // convert m to ft, formula provided does not convert as shown in table
    public static double meterToFoot(double meter) {
        return meter / 0.305;
        
    }
}

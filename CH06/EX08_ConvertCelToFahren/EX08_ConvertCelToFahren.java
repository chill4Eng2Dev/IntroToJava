/**
 * (Conversions between Celsius and Fahrenheit) Write a class that contains the following
 * two methods:
 * 
 * // Convert from Celsius to Fahrenheit
 * public static double celsiusToFahrenheit(double celsius)
 * 
 * // Convert from Fahrenheit to Celsius 
 * public static double fahrenheitToCelsius(double fahrenheit)
 * 
 * The formula for the conversion is:
 * 
 * fahrenheit = (9.0 / 5) * celsius + 32
 * celsius = (5.0 / 9) * (fahrenheit – 32)
 * 
 * Write a test program that invokes these methods to display the following tables:
 * 
 * Celsius      Fahrenheit      |       Fahrenheit      Celsius
 * ------------------------------------------------------------
 * 40.0         104.0           |       120.0           48.89
 * 39.0         102.2           |       110.0           43.33
 * ...
 * 32.0         89.6            |       40.0            4.44
 * 31.0         87.8            |       30.0            -1.11
 * 
 * 
 * 
 * Commentary: I will use the provided formulas to calculate fahrenheit and celsius utilizing
 * methods. I will print the table as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.8
 */


public class EX08_ConvertCelToFahren {
    
    public static void main(String[] args) {
            
        // print headers for table
        System.out.printf("%-10s%-10s     |     %-13s%-10s\n","Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("------------------------------------------------------");
        
        // use i for celsius to fahr, j for fahr to celsius
        for(double i = 40, j = 120; i >= 31 && j >= 30; i--, j -= 10)
            System.out.printf("%-10.1f%-10.1f     |     %-13.1f%-10.2f\n", i, celsiusToFahrenheit(i), j, fahrenheitToCelsius(j));
        
        
    }
    
    // method to convert C to F
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }
    
    // method to convert F to C
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}

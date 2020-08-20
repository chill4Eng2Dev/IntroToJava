
/**
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone
 * is not enough to provide the answer. Other factors including wind speed, relative
 * humidity, and sunshine play important roles in determining coldness outside.
 * In 2001, the National Weather Service (NWS) implemented the new wind-chill
 * temperature to measure the coldness using temperature and wind speed. The formula
 * is
 * 
 *      twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
 * 
 * where ta is the outside temperature measured in degrees Fahrenheit and v is the
 * speed measured in miles per hour, twc is the wind-chill temperature. The formula
 * cannot be used for wind speeds below 2 mph or temperatures below -58F or above
 * 41F.
 * Write a program that prompts the user to enter a temperature between -58F and
 * 41F and a wind speed greater than or equal to 2 and displays the wind-chill 
 * temperature. Use Math.pow(a, b) to compute v^0.16. Here is a sample run:
 *  
 * ---------------------------------------------------------------------
 * Enter the temperature in Fahrenheit between -58F and 41F: 5.3 [ENTER]
 * Enter the wind speed (>=2) in miles per hour: 6 [ENTER]
 * The wind chill index is -5.56707
 * ---------------------------------------------------------------------
 * 
 * Commentary: I will need to create a few variables of type double. I will need to 
 * use the math class and calculate wind chill using the provided formula. I don't
 * know, at this time, how to have a "degree" symbol added into the text so that will
 * be omitted at ths time. I will show my output as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.17
 */

import java.util.Scanner;

public class EX17_WindChillTemp {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double twc, ta, v;
        
        // initialize variable with user input
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        ta = input.nextDouble();
        
        // initialize variable with user input
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        v = input.nextDouble();
        
        // calculate wind-chill per the provided equation
        twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
        
        // print output of wind chill as shown in sample run
        System.out.println("The wind chill index is " + twc);
        
    }
}

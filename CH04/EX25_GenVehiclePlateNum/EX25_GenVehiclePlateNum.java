/**
 * (Generate vehicle plate numbers) Assume a vehicle plate number consists of three
 * uppercase letters followed by four gits. Write a program to generate a plate number.
 * 
 * Commentary: I will need to generate three random integers between 65 to 90 (inclusive).
 * I will then need to generate a random integer between 1000 to 9999. I will then print
 * the output as stated in the problem.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.25
 */

public class EX25_GenVehiclePlateNum {
    
    public static void main(String[] args) {
        
        // generate a random values between 65 and 90 (inclusive)
        int value1 = (int)(65 + Math.random() * 26);
        int value2 = (int)(65 + Math.random() * 26);
        int value3 = (int)(65 + Math.random() * 26);
        
        // generate a random value between 1000 to 9999 (inclusive) - four digits
        int value4 = (int)(1000 + Math.random() * 9000);
        
        // cast integer into a character
        char ch1 = (char)value1;
        char ch2 = (char)value2;
        char ch3 = (char)value3;
        
        // print character as stated in the problem statement
        System.out.println("The random license plate number is: " + ch1 + ch2 + ch3 + value4); 
    
    }
}

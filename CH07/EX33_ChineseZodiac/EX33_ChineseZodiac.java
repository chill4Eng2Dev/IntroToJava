/**
 * (Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
 * the animal names.
 * 
 * Commentary: I will migrate the switch statement from Listing 3.9 over to a string
 * array. I will test and print output as shown in the sample runs from Listing 3.9.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/10/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.33
 */

import java.util.Scanner;

public class EX33_ChineseZodiac {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // string with zodiac names
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        
        // assign user input to variable
        System.out.print("\nEnter a year: ");
        int year = input.nextInt();
        
        // print zodiac based on user input
        System.out.println(zodiac[year % 12]);
        
    }

}

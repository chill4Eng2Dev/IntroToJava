/**
 * (Order three cities) Write a program that prompts the user to enter three cities and
 * displays them in ascending order. Here is a sample run:
 * 
 * ----------------------------------------------------------------------
 * Enter the first city: Chicago [ENTER]
 * Enter the second city: Los Angeles [ENTER]
 * Enter the third city: Atlanta [ENTER]
 * The three cities in alphabetical order are Atlanta Chicago Los Angeles
 * ----------------------------------------------------------------------
 *  
 * Commentary: I will need to use compareTo() method to compare the three strings to each
 * other. I would treat the organization of these comparison as if I was sort numbers
 * in an ascending pattern. I will use Listing 4.2 as a good foundation starting point
 * to this coding exercise. I will print the output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.24
 */

import java.util.Scanner;

public class EX24_OrderThreeCities {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        
        // multiway nested if-else statement to check the compareTo method
        System.out.print("The three cities in alphabetical order are ");
        if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
            if (city2.compareTo(city3) < 0)
                System.out.println(city1 + " " + city2 + " " + city3);
            else
                System.out.println(city1 + " " + city3 + " " + city2);
        } else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
            if (city1.compareTo(city3) < 0)
                System.out.println(city2 + " " + city1 + " " + city3);
            else
                System.out.println(city2 + " " + city3 + " " + city1);
        } else {
            if (city1.compareTo(city2) < 0)
                System.out.println(city3 + " " + city1 + " " + city2);
            else
                System.out.println(city3 + " " + city2 + " " + city1);
        }
                
    }
                
}

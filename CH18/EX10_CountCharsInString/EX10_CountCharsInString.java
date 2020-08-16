/**
 * (Occurrences of a specified character in a string) Write a recursive method that
 * finds the number occurrences of a specified letter in a string using the following
 * method header:
 *
 * public static int count(String str, char a)
 *
 * For exmaple, count("Welcome", 'e') returns 2. Write a test program
 * that prompts the user to enter a string and and a character, and displays the number
 * of occurences for the character in the string.
 *
 * Commentary: I will need to use a substring to lessen the string length
 * so that the recursion has a base case. I will compare the letter of the
 * string with the test char and increment a counter that will return the
 * total count.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.10
 */
 
import java.util.Scanner;
 
public class EX10_CountCharsInString {

   /** main method */
   public static void main(String[] args) {
      
      // create scanner
      Scanner input = new Scanner(System.in);
      
      // gather string information from user
      System.out.println("Enter in a string: ");
      String str = input.nextLine();
      
      // gather character to count from user
      System.out.println("Enter a character to be counted: ");
      char a = input.nextLine().charAt(0);
   
      // output the inputs and character count using recursion
      System.out.print("The number of times " + a + " is found in " + str + " is: ");
      
      // convert string and char to lower case so that the values are counted regardless if capitalized 
      System.out.print(count(str.toLowerCase(), Character.toLowerCase(a)));
   
   }
 
   public static int count(String str, char a) {
      
      int countFound = 0; // initial count is 0 and is incremented to 1 in each recursion if char found
      
      if (str.length() > 0) {   // base case is when length is 0
         if (a == str.charAt(str.length() - 1)) {     // compare string char to user input char
            countFound++;   // if char found, increment count by 1
            return countFound + count(str.substring(0, str.length() - 1), a); // add count (1) to each new recursion call
         } else {
            return count(str.substring(0, str.length() - 1), a); // count is still (0), just use recursion for next char check
         }
      }
      return countFound;
   
   }
 
}
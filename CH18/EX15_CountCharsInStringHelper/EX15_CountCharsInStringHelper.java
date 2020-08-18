/**
 * (Occurrences of a specified character in a string) Rewrite Programming 
 * Exercise 18.10 using a helper method to pass the substring high index to 
 * the method. The helper method header is:
 *
 * public static int count(String str, char a, int high)
 *
 * Commentary: I will need to use a helper method to count and increment the number
 * of times an upper case letter is found. I will need another helper to be the index
 * of the string and check each character individually. The base case will be when
 * the array index is less than 0.  
 *
 * Author: chill4Eng2Dev 
 * Date: 8/17/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.15
 */
 
 
import java.util.Scanner;
 
public class EX15_CountCharsInStringHelper {

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
 
   // use this recursive call to extend a parameter, "high"
   public static int count(String str, char a) {
      int high = str.length() - 1;
      return count(str, a, high);
   }
   
   public static int count(String str, char a, int high) {
      
      int countFound = 0; // initial count is 0 and is incremented to 1 in each recursion if char found
      
      if (high < 0)   // base case is when high is less than 0
         return countFound;
      else if (a == str.charAt(high)) {               // compare string char to user input char
         countFound++;                                // if char found, increment count by 1
         return countFound + count(str, a, high - 1); // add count (1) to each new recursion call
      } else {
         return count(str, a, high - 1); // char not match, count still 0, use recursion to compare next char
      }
      
   
   }
 
}
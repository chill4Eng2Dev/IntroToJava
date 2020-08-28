/**
 * (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following characters are used to denote the majors:
 * 
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 * 
 * Here is a sample run:
 * --------------------------------
 * Enter two characters: M1 [ENTER]
 * MAthematics Freshman
 * --------------------------------
 * --------------------------------
 * Enter two characters: C3 [ENTER]
 * Computer Science Junior
 * --------------------------------
 * --------------------------------
 * Enter two characters: T3 [ENTER]
 * Invalid input
 * --------------------------------
 * 
 * Commentary: I will need to extract the first and second character of the input and
 * use a switch-case statment to print output. I will print the output as shown in the 
 * sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.18
 */

import java.util.Scanner;

public class EX18_StudentMajorStatus {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to string
        System.out.print("Enter two characters: ");
        String str = input.nextLine();
        
        // check string length and exit program if not 2
        if (!(str.length() == 2)) {
            System.out.println("Invalid input. Entry must be two characters.");
            System.exit(1);
        }
        
        // extract characters from string
        char ch0 = Character.toUpperCase(str.charAt(0));
        char ch1 = str.charAt(1);
        
        // if statement to confirm entry is valid
        if ((ch0 == 'M' || ch0 == 'C' || ch0 == 'I') && (ch1 >= '1' && ch1 <= '4')) {
            // use switch statement to cycle through characters and print corresponding title
            switch (ch0) {
                case 'M': System.out.print("Mathematics "); break;
                case 'C': System.out.print("Computer Science "); break;
                case 'I': System.out.print("Information Technology "); break;
            }
                
            // use switch statement to cycle through characters and print corresponding title
            switch (ch1) {
                case '1': System.out.println("Freshman"); break;
                case '2': System.out.println("Sophomore"); break;
                case '3': System.out.println("Junior"); break;
                case '4': System.out.println("Senior");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
                
}


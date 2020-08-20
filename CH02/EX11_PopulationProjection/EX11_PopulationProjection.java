/**
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer. Here is a sample run of the program:
 * 
 * --------------------------------------
 * Enter the number of years: 5 [ENTER]
 * The population in 5 years is 325932970
 * --------------------------------------
 * 
 * Commentary: I will need to calculate seconds per year, then all of the other rates of
 * growth and store those outcomes into variables. I will print the outputs as shown in 
 * the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.11
 */

import java.util.Scanner;

public class EX11_PopulationProjection {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables
        final int SECONDS_PER_YEAR = 365 * 24 * 60 * 60;
        int population = 312032486, years, totalPop;
        double birthPop, deathPop, immigrantPop;
        
        // gather user input and initialize variable
        System.out.print("Enter the number of years: ");
        years = input.nextInt();
        
        // calculate birth, death, and immigrant population growth
        birthPop = SECONDS_PER_YEAR / 7.0;
        deathPop = SECONDS_PER_YEAR / 13.0;
        immigrantPop = SECONDS_PER_YEAR / 45.0;
        
        // calculate the total population after X years, casted down to int type
        totalPop = (int)(population + (birthPop - deathPop + immigrantPop) * years);
        
        // print output as shown in sample run
        System.out.println("The population in " + years + " years is " + totalPop);
        
   }
}


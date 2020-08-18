/**
 * (Population projection) The U.S. Census Bureau projects population based on the
 * following assumptions:
 *
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume
 * the current population is 312,032,486 and one year has 365 days. Hint: In Java, if
 * two integers perform division, the result is an integer. The fractional part is
 * truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an
 * accurate result with the fractional part, one of the values involved in the division
 * must be a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is
 * 2.5.
 *
 * Commentary: I will show the formulas first, then the calculation. I'm not sure if I
 * should show the values of population as a rate of growth but using a new base population
 * every calculated year or just use the base population for each year.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 1.11
 */
 
public class EX11_PopulationProjection {
 
   public static void main(String[] args) {
   
      System.out.println("I will calculate redundant values shown below. Then will comment the answer ");
      System.out.println("and will use those values in subsequent calculations when necessary.");
      System.out.println();
   
      System.out.println("Population Project = Population + (Births - Deaths + Immigrant) X Years");
      System.out.println();
      System.out.println("Year (sec) = 365 day x 24 h / day X 60 min / h x 60 sec / min");
      System.out.println(365 * 24 * 60 * 60);   // 31536000
      System.out.println("Births per year = Year (sec) X (1 Birth / 7 sec)");
      System.out.println(31536000 / 7.0);       // 4505143
      System.out.println("Deaths per year = Year (sec) X (1 Death / 13 sec)");
      System.out.println(31536000 / 13.0);      // 2425846
      System.out.println("Immigrants per year = Year (sec) X (1 immigrant / 45 sec)");
      System.out.println(31536000 / 45.0);      // 700800
      
      System.out.println();
      System.out.println("Year 1 (Population): " + (312032486 + (4505142 - 2425846 + 700800) * 1));
      System.out.println("Year 2 (Population): " + (312032486 + (4505142 - 2425846 + 700800) * 2)); 
      System.out.println("Year 3 (Population): " + (312032486 + (4505142 - 2425846 + 700800) * 3)); 
      System.out.println("Year 4 (Population): " + (312032486 + (4505142 - 2425846 + 700800) * 4)); 
      System.out.println("Year 5 (Population): " + (312032486 + (4505142 - 2425846 + 700800) * 5)); 
  
      
   
   }
}
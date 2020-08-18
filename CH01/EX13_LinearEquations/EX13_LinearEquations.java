/**
 * (Algebra: solve 2 X 2 linear equations) You can use Cramer's rule to solve the
 * following 2 X 2 system of linear equations:
 *
 *       ax + by = e    x = (ed - bf) / (ad - bc)
 *       cx + dy = f    y = (af - ec) / (ad - bc)
 * 
 * Write a program that solves the following equation and displays the value for x
 * an y:
 *
 *          3.4x + 50.2y = 44.5
            2.1x + .55y = 5.9
 *
 * Commentary: I will show the formulas first, then the calculation. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 1.13
 */
 
public class EX13_LinearEquations {
 
   public static void main(String[] args) {
   
      System.out.println("The two linear equations to solve are shown below:");
      System.out.println("3.4x + 50.2y = 44.5");
      System.out.println("2.1x + .55y = 5.9");
      System.out.println();
      System.out.println("x = (ed - bf) / (ad - bc)");
      System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
      System.out.println("y = (af - ec) / (ad - bc)");
      System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
   
   
   }
}
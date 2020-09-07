/**
 * (Financial application: compute future tuition) Suppose that the tuition for a university
 * is $10,000 this year and increases 5% every year. In one year, the tuition
 * will be $10,500. Write a program that computes the tuition in ten years and the
 * total cost of four years’ worth of tuition after the tenth year.
 * 
 * Commentary: I am going to take the phrase "... and the total cost of four years' worth of
 * tuition after the tenth year." to exclude the tenth year and I'll need to sum years 11
 * through 14. In addition, I will assume I am to continue calculating compound growth after
 * the 10th year and add said values together. No required outputs were stated in the problem
 * so I will print the four year tuition calculation.
 *
 * Author: chill4Eng2Dev 
 * Date: #/##/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.7
 */

public class EX07_ComputeFutureTuition {
    
    public static void main(String[] args) {
        
        // initialize variables
        double tuition = 10000;
        double interestRate = 1.05;
        double tuitionAfterTenYears = 0;
        
        // use a for loop to calculation compound growth of the tuition
        for(int i = 1; i <= 14; i++) {
            
            tuition *= interestRate;
            
            // once i is 11, start summing the tuition up to year 14
            if(i > 10)
                tuitionAfterTenYears += tuition;
                
        }
        
        // print the output of four years of tuition
        System.out.printf("Total of four years of tuition after tenth year: $%-6.2f\n", tuitionAfterTenYears);
            
    }
}

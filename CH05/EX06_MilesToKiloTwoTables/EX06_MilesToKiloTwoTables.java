/**
 * (Conversion from miles to kilometers) Write a program that displays the following
 * two tables side by side:
 * 
 * Miles    Kilometers  |   Kilometers    Miles
 * 1        1.609       |   20            12.430
 * 2        3.218       |   25            15.538
 * ...
 * 9        14.481      |   60            37.290
 * 10       16.090      |   65            40.398
 * 
 * Commentary: I will need to use multiple variables and loop continuation conditions
 * in this for loop. I will print the outputs using printf to control the table size
 * and match the sample table output. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/31/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.6
 */

public class EX06_MilesToKiloTwoTables {
    
    public static void main(String[] args) {
        
        // print header using printf to control format
        System.out.printf("%-10s%-10s   |   %-13s%-10s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        
        // for loop with i is miles to kilometers, j is kilometers to miles, printf to print table and control size
        for(int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) 
            System.out.printf("%-10d%-10.3f   |   %-13d%-10.3f\n", i, i * 1.609, j, j / 1.609);
            
    }

}

/**
 * (Conversion from kilograms to pounds and pounds to kilograms) Write a program
 * that displays the following two tables side by side:
 * 
 * Kilograms Pounds     |   Pounds Kilograms
 * 1            2.2     |   20          9.09
 * 3            6.6     |   25         11.36
 * ...
 * 197        433.4     |   510       231.82
 * 199        437.8     |   515       234.09
 * 
 * Commentary: I will need to use multiple variables and loop continuation conditions
 * in this for loop. I will print the outputs using printf to control the table size
 * and match the sample table output. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/31/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.5
 */

public class EX05_KiloToPoundsTwoTables {
    
    public static void main(String[] args) {
        
        // print headers for table
        System.out.printf("%-10s%10s     |     %-10s%10s\n","Kilograms", "Pounds", "Pounds", "Kilograms");
        
        // use i for kilos to lbs, j for pounds to kilograms and use printf for output formatting and table size
        for(int i = 1, j = 20; i < 200 && j <= 515; i += 2, j += 5)
            System.out.printf("%-10d%10.1f     |     %-10d%10.2f\n", i, i * 2.2, j, j / 2.2);
        
        
    }
            

}

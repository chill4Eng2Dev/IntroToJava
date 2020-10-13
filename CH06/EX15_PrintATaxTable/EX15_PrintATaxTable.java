/**
 * (Financial application: print a tax table) Listing 3.5 gives a program to compute
 * tax. Write a method for computing tax using the following header:
 * 
 *      public static double computeTax(int status, double taxableIncome)
 * 
 * Use this method to write a program that prints a tax table for taxable income from
 * $50,000 to $60,000 with intervals of $50 for all the following statuses:
 * 
 * Taxable       Single        Married Joint      Married        Head of 
 * Income                      or Qualifying      Separate       a House
 *                             Widow(er)   
 * -------------------------------------------------------------------------
 * 50000         8688          6665               8688           7353
 * 50050         8700          6673               8700           7365
 * ...
 * 59950         11175         8158               11175          9840
 * 60000         11188         8165               11188          9853
 * 
 * Hint: round the tax into integers using Math.round (i.e., Math
 * .round(computeTax(status, taxableIncome)).
 * 
 * Commentary: I think using Exercise 3.13 is more appropriate for this question as it
 * is more fleshed out with the other status tax parameters. I will also keep the complete
 * tax ranges even though these tax ranges could be cut down drastically due to only
 * checking an income range of 50,000 to 60,000. I will use a for loop to print the
 * table and call the computeTax for each static option.
 *
 * Author: chill4Eng2Dev 
 * Date: 6/10/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.15
 */

public class EX15_PrintATaxTable {
    
    public static void main(String[] args) {
        
        // print headers for the table
        System.out.printf("\n%-18s%-18s%-18s%-18s%-18s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-18s%-18s%-18s%-18s%-18s\n", "Income", " ", "or Qualifying", "Separate", "a House");
        System.out.printf("%-18s%-18s%-18s%-18s%-18s\n", " ", " ", "Widow(er)", " ", " ");
        System.out.println("-----------------------------------------------------------------------------");
        
        // nested for loop to print the table and call the computeTax method
        for (int i = 50000; i <= 60000; i += 50) {
            System.out.printf("%-18d", i);
            for (int j = 0; j <= 3; j++) {
                System.out.printf("%-18d", Math.round(computeTax(j, (double)i)));
            }
            System.out.println();
        }
    }
    
    // computeTax method with Exercise 3.13 income tax calculation if-else statements
    public static double computeTax(int status, double income) {
       double tax = 0;
        
       if (status == 0) { // Compute tax for single filers
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }
       else if (status == 1) { // compute tax for married filing jointly or widow
           if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                (income - 67900) * 0.25;
            else if (income <= 208850)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
            else if (income <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                (income - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
            }
       else if (status == 2) { // Compute tax for married separately
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 68525)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                (income - 33950) * 0.25;
            else if (income <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
            else if (income <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                (income - 104425) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
            }
       else if (status == 3) { // Compute tax for head of household
            if (income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
            else if (income <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                (income - 45500) * 0.25;
            else if (income <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
            else if (income <= 372950)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                (income - 190200) * 0.33;
            else
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
            }
       else {
            System.out.println("Error: invalid status");
            System.exit(1);
       }
        
       return tax;
    }
}

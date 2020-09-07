/**
 * (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
 * the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
 * per line. Numbers are separated by exactly one space.
 *                              
 * Commentary: Start with Listing 5.15 and modify to a for loop. Clean up or remove
 * some of the unnecessary variables as used in Listing 5.15. I will print the output
 * as shown in Listing 5.15.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/1/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.20
 */

public class EX20_PrimeNums2To1000 {

    public static void main(String[] args) {
        
        final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 10 per line
        int count = 0; // Count the number of prime numbers

        System.out.println("\nThe prime numbers between the ranges of 2 to 1000 are \n");

        // Repeatedly find prime numbers
        for (int number = 2; number <= 1000; number++) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {
                
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and advance to the new line
                    System.out.print("\n" + number + " ");
                }
                else
                    System.out.print(number + " ");
                
                count++; // Increase the count
            }

        }
    }

}


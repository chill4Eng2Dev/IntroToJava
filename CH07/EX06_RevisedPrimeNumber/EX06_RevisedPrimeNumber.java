/**
 * (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
 * n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
 * is found, n is not prime. A more efficient approach is to check whether any of the
 * prime numbers less than or equal to SQRT(n) can divide n evenly. If not, n is prime.
 * Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
 * You need to use an array to store the prime numbers and later use them to check
 * whether they are possible divisors for n.
 * 
 * 
 * Commentary: I will need to create an array that stores the prime values and uses these
 * prime values to be checked again the new potential prime number in question. Listing 5.15
 * for loop will be adjusted to cycle through the array of stored primes and to check against
 * the square root of the number in question. I will print output as shown in the listing sample
 * run.
 *
 *
 * Author: chill4Eng2Dev 
 * Date: 10/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.6
 */

public class EX06_RevisedPrimeNumber {

    public static void main(String[] args) {
                
        final int NUMBER_OF_PRIMES = 50; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        
        int[] primes = new int[NUMBER_OF_PRIMES]; // create array size with number of primes constant
        primes[0] = number;  // the first prime at index 0, also avoids divide by zero issue;
                        
        System.out.println("The first 50 prime numbers are \n");
        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?
        
            // Test whether number is prime
            for (int i = 0; primes[i] <= Math.sqrt(number); i++) {
                if (number % primes[i] == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }
        
            // Display the prime number and increase the count
            if (isPrime) {
                primes[count] = number;
                count++; // Increase the count
                
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and advance to the new line
                    System.out.println(number);
                } else
                    System.out.print(number + " ");
            }
        
            // Check if the next number is prime
            number++;
        }
        
    }
}


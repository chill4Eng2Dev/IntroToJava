/**
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 * isPrime(int number) method for testing whether a number is prime. Use this
 * method to find the number of prime numbers less than 10000.
 *  
 * Commentary: I will use Listing 6.7 as base code and remove printing function
 * of the base code. I will convert the print method into a counting method. I
 * will then print output of total number of prime numbers between 1 and 10000.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.10
 */

public class EX10_UsePrimeMethod {
    
    public static void main(String[] args) {
        System.out.println("There are " + countPrimeNumbers(10000) + " prime numbers between the values of 1 and 10000!");
    }

    public static int countPrimeNumbers(int numberOfPrimes) {
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (number < numberOfPrimes) {
                // count each prime number when found
                if (isPrime(number)) {
                    count++; // Increase the count
                }
                // Check whether the next number is prime
                number++;
        }
        
        return count;
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }


}

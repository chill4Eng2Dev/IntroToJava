/**
 * (Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example,
 * 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
 * Write a program to find all twin primes less than 1,000. Display the output as follows:
 * 
 *      (3, 5)
 *      (5, 7)
 *      ...
 * 
 * Commentary: I will call isTwinPrime method to check the current number, and the number + 2
 * if prime by calling the isPrime method for each check. I will then print the number and
 * number + 2 as shown in problem statement should the check be valid.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/11/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.29
 */

public class EX29_TwinPrimes {
    
    public static void main(String[] args) {
        
        // print table if the number is prime
        for (int number = 2; number <= 1000; number++) {
            if (isTwinPrime(number)) 
                System.out.println("(" + number + ", " + (number + 2) + ")");
        }
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
    
    /** Check if the current number and the number + 2 are prime */
    public static boolean isTwinPrime(int number) {
        return isPrime(number) && isPrime(number + 2);
    }

}

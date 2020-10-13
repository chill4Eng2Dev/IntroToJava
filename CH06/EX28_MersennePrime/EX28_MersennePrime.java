/**
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * in the form 2^p - 1 for some positive integer p. Write a program that finds all
 * Mersenne primes with p <= 31 and displays the output as follows:
 * 
 *      p           2^p –1
 *      --------------------
 *      2           3
 *      3           7
 *      5           31
 *      ...
 * 
 * Commentary: I will use the isPrime method from Exercise 6.10 and create a new method
 * to calculate the mersennePrime number. I will check the number p if prime and calculate
 * Mersenne prime if number is prime. I will print table as shown in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/11/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.28
 */

public class EX28_MersennePrime {
    
    public static void main(String[] args) {
        
        System.out.println("The Mersenne Prime numbers up to a maximum p of 31 are: ");
       
        // print headers for table
        System.out.printf("%-10s%-10s\n", "p", "2^p-1");        
        
        // print table if the number is prime
        for (int number = 2; number <= 31; number++) {
            if (isPrime(number)) 
                System.out.printf("%-10d%-10d\n", number, mersennePrime(number));
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
    
    /** calculate mersennePrime number */
    public static int mersennePrime(int number) {
        return (int)(Math.pow(2, number) - 1);
    }

}

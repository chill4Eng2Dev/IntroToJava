
/**
 * (Palindromic prime) A palindromic prime is a prime number and also palindromic.
 * For example, 131 is a prime and also a palindromic prime, as are 313 and
 * 757. Write a program that displays the first 100 palindromic prime numbers. Display
 * 10 numbers per line, separated by exactly one space, as follows:
 * 
 *      2 3 5 7 11 101 131 151 181 191
 *      313 353 373 383 727 757 787 797 919 929
 *      ...
 * 
 * Commentary: I will use Exercise 6.3 for the reverse method and Exercise 6.10 for the
 * prime method. I will compare the reversed value to the original value should the
 * original value be a prime number. I will then print output as stated in problem
 * statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/11/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.26
 */

public class EX26_PalindromicPrime {

    
    public static void main(String[] args) {
        
        System.out.println("The first 100 palindromic prime numbers are: ");
        
        // initialize counter and the number to evaluate
        int count = 1;
        int number = 2;
                
        while (!(count > 100)) {
            
            if (isPrime(number)) {  // check if number is prime
                if (reverse(number) == number) { // check if palindromic prime
                    if (count % 10 == 0)
                        System.out.println(number);
                    else
                        System.out.print(number + " ");
                        
                    count++;
                }
            }
            
            number++;
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
    
    /** Reverse the prime number */
    public static int reverse(int number) {
        String reversedValue = ""; // use string to build reversed string
        
        while (number != 0) {
            reversedValue = reversedValue + (number % 10); 
            number = number / 10;
        }
        
        return Integer.parseInt(reversedValue); // parseInt string to return as int
    }
}

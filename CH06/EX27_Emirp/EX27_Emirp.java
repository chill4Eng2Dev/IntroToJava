/**
 * (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
 * whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
 * and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
 * numbers per line, separated by exactly one space, as follows:
 * 
 * 
 *      13 17 31 37 71 73 79 97 107 113
 *      149 157 167 179 199 311 337 347 359 389
 *      ...
 * 
 * Commentary: This exercise is very close to the same exercise as Exercise 26 except
 * with a modified if statement boolean. I will modify the code from Example 26 and
 * print output as shown in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/11/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.27
 */

public class EX27_Emirp {
    
    public static void main(String[] args) {
        
        System.out.println("The first 100 'Emirp' prime numbers are: ");
        
        // initialize counter and the number to evaluate
        int count = 1;
        int number = 2;
                
        while (!(count > 100)) {
            
            if (isPrime(number)) {  // check if number is prime
                if (isPrime(reverse(number)) && reverse(number) != number) { // check if reversed number is prime AND not palindromic
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

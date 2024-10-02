/* Write a program which displays the sum of 
the strict divisors of an integer given by the user */
package Loops;
import java.util.Scanner;

public class StrictDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int n = scanner.nextInt();
        int sum = 0;
        
        // Loop through all numbers from 1 to n/2
        for (int i = 1; i <= n / 2; i++) {
            // Check if i is a divisor of n
            if (n % i == 0) {
                sum += i;  // Add the divisor to the sum
            }
        }

        // Output the sum of strict divisors
        System.out.println("Sum of strict divisors: " + sum);
    }
}

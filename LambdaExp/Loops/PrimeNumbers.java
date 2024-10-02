/* Write a program which prints the positive 
number N from the  user then indicates if N
is a prime number or not */

package Loops;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 1;
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum == 1 ? "prime" : "is not a prime number" );

        for (int b = 2; b <= n/2; b++){
            if(n % b == 0){
                System.out.print("Not prime");
                break;
            }
        }
//Here is another method
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            boolean isPrime = true;
            
            // Check for factors from 2 to the square root of n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;  // No need to check further if a divisor is found
                }
            }
            
            // Output whether the number is prime or not
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
    }
    }

    
}

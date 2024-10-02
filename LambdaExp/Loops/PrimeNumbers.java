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
    }
}

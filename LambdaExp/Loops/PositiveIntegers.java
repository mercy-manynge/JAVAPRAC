package Loops;
import java.util.Scanner;

public class PositiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = scanner.nextInt();
        int max = n;
        int min = n;

        if (n >= 0){
            while(true){
                n = scanner.nextInt();//Reading the number entered by the user
                if(n < 0)//If n is neagtive then break out from the loop
                break;

                if(n > max)//If is is not negative we want to update our aximum and minimum as necessary
                max = n;

                if(n < min)
                min = n;
                
            }
            System.out.println("min = " + min + " , max = "+ max);//print the maimaum and the minimum
        } else {
            System.out.println(n +" is invalid");
        }
    }
}

package Loops;
import java.util.Scanner;
public class WhileLoops {
    public static void main(String [] args){
        int a = 0;
        while(a < 10){// Curly braces are required because there are two statements after the loop 
            System.out.println("a is " + a);// First iteration a is 0
            a++;/*Here a is increamented to 1 then it returns a while loops to check for the condito as 1
            1<10 one is less that 10 its true so the loop continues until the condition is false then breaks out */
        }
        System.out.println("Finished Loop");//this is now printed

        while(a < 10){// Curly braces are required because there are two statements after the loop 
            System.out.println("a is " + a);// First iteration a is 10 so nothing is ging to be printed since the condition is false already, 10< 10 is false
            a++;
        }
        System.out.println("Finished second while loop");//this is only printed

        /* Write a program which reads a sequence of integers 
        from the user and stops by displaying "Done" 
        when the sum of these values exceeds 100 */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){//infinite loop
            System.out.println("Enter a number: ");// Tell the user to enter a number
            sum += scanner.nextInt();//Read the number from the user and add it to the variable sum
            if(sum > 100)// Check if sum is greater than 100
            break;//Break out of the loop when the when the sum is greater than 100
        }
        System.out.println("Done" + sum);// Print done and entered sum

        //You can also use a do/while loop
        do {
            System.out.println("Enter a number: ");
            sum += scanner.nextInt();
        } while (sum <= 100);
        System.out.println("Done "+ sum);
    }
}

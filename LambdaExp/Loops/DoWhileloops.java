package Loops;

public class DoWhileloops {
    public static void main(String[] args) {
        int a = 10;
        do{
            System.out.println("a is " + a);// this will be executed regardless
            a++;
        }
        while (a < 10);//The semi collon is required when the curly braces are not there
        System.out.println("finished the do/while loop");
    }
}// The loop will run once before it realises that the contion is false 

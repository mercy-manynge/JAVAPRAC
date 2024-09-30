package Loops;

public class WhileLoops {
    public static void main(String [] args){
        int a = 0;
        while(a < 10){// Curly braces are required because there are two statements after the loop 
            System.out.println("a is " + a);// First iteration a is 0
            a++;/*Here a is increamented to 1 then it returns a while loops to check for the condito as 1
            1<10 one is less that 10 its true so the loop continues until the condition is false then breaks out */
        }
        System.out.println("Finished Loop");//this is now printed
    }
}

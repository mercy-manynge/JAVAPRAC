package Loops;

public class ForLoops {
    public static void main(String [] args) {
        int x = 12;// Class variable
        for (int a = 0; a < 10; a++){// the variable created here is limited to the scope of the for loop body only
        System.out.println("a is " + a);
    }
        System.out.println("The end of the for loop " + x);// x can be accessed here
    }
    
    }


package Loops;

public class ForLoops {
    public static void main(String [] args) {
        int c = 12;// Class variable
        for (int a = 0; a < 10; a++){// the variable created here is limited to the scope of the for loop body only
        System.out.println("a is " + a);
    }
        System.out.println("The end of the for loop " + c);// c can be accessed here

        for ( ; c < 20; ) {
            System.out.println("a is " + c++);
        }
        System.out.println("FINISHED THE SECOND FOR LOOP");
        for ( ; ; ) {
            System.out.println("c is "+ c++);
            if(c > 25){ // if we comment out this code the loop is not going to break and will infinitely execute
                break;
            }
        }
        System.out.println("finished the third for loop");//Therefore ths code will be unreachable
    }
    
    }


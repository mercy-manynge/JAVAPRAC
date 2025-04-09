package Exceptions;

public class Exceptions {
    public static void main(String [] args) {
        //  Float pi = new Float(3.14f);
        //  if (pi > 3) {// JAVA DOES NOT ALLOW COMPAROZON BETWEEN FLOAT AND INT USE .floatValue() instead
        //      System.out.print("pi is bigger than 3.");
        //  }
        //  else {
        //     System.out.print("pi is not bigger than 3.");
        //  }
        // finally { //THE FINALLY BLOCK CAN NOT BE USED WITHOUT A TRY BLOCK OR A CATCH BLOCK
        //    System.out.println("Have a nice day.");
        // }
           Float pi = new Float(3.14f);
           if  (pi.floatValue() > 3){
                System.out.println("pi is bigger than 3.");
           } else {
                System.out.println("pi is not bigger than 3.");
           }
        System.out.println("Have a nice day.");
    }
   
}
//Overridden method can not throw a checked exception that is not declared in the parent class
//Overridden method can throw a checked exception that is a subclass of the exception thrown by the parent class
//Overridden method can throw a runtime exception
//Overridden method can throw an error
//Overridden method can throw a checked exception that is declared in the parent class
//Overridden method can not throw a checked exception that is a superclass of the exception thrown by the parent class
//Overridden method can throw a checked exception that is a superclass of the exception thrown by the parent class
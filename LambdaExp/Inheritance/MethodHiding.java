package Inheritance;

public class MethodHiding {
    public final static void money(){
        System.out.println("Hide my money f ");
    }
}
class Bank extends MethodHiding {
    public static void money(){//This will not compile because a final method can not be overridden 
        System.out.println("Hide my money from thieves ");
    }
public static void main (String [] args) {
    Bank b = new Bank();
   //b.money(); //This does not compile 
   MethodHiding.money();
}
}
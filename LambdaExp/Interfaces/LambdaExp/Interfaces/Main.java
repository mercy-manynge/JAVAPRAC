
//Class method overrides default methods
//Let's say you have an interface and a class that implements a same methods with same name 
//The class method will override the default method from the interface
//Here is an example 

package LambdaExp.Interfaces;

interface mercy{
    default void show(){
        System.out.println("Hello");
    }
}

class mercyClass {
    public void show(){
        System.out.println("Hello");
    }
}

class bothClasses extends mercyClass implements mercy{  //If there is an interface and a class like this 
    //the class is extended first then the interface is implemented.
   //No need to override shiow() because mercyClass method wins
}

public class Main{
    public static void main(String []args){
        bothClasses b = new bothClasses();
        b.show();
    }
}
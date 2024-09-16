package Inheritance;

public abstract class AbstractMC {
    int a = 7;
    int b = 8;
    abstract String book();
    abstract int say();

    public int books() {
        return a + b;
    }
}
final abstract class Apple extends AbstractMC{}// this will throw an excepton because final and bract can not be used in the same class 
//A class can be either final or abtract not both
 abstract class MyBook extends AbstractMC{//Compiles because abtract classes can only be extended by abtract classes and are not required to inherit any abstract methods from the parent
     public int say(){
        return 2;
     }
     
 }
class Addition extends MyBook{// This is a concrete class and is required to inherit all methods of the abstract class
    //private String book(){//This does not compile because it reduces the visibility form the parent class
        //System.out.println("this is my book");
    //}
    protected String book(){
        return "My book is covered";
    }
}
// A non abstract class should not contain an abstract method
//The concrete class Addition is not required to provide an implementation for an abstract method if an intermediate abstract class provides the method
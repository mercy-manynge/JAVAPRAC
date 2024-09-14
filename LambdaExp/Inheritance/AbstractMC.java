package Inheritance;

public abstract class AbstractMC {
    int a = 7;
    int b = 8;
    abstract String book();

    public int books() {
        return a + b;
    }
}
final abstract class Apple extends AbstractMC{}// this will throw an excepton because final and bract can not be used in the same class 
//A class can be either final or abtract not both
class abstract MyBook extends AbstractMC{}// this class will not compile because abstract methods can not extend themselves 
class Addition extends AbstractMC{
    //private String book(){//This does not compile because it reduces the visibility form the parent class
        //System.out.println("this is my book");
    //}
    protected String book(){
        return "My book is covered";
    }
}
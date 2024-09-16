package Inheritance;

public interface Interfaces {
    public abstract int getTailLength();
}
interface MyCountry{
    public String country();
}
interface Town extends Interfaces, MyCountry{//Because this is abstract, it is not required to implement all methods in its definition

}
interface Province implements MyCountry{}// an interface can not implement another interface but can only extend it
class District extends Interfaces{//A class can not extend and interface so the code does not compile

}
class Village implements Interfaces, MyCountry{}//A class can implement an interface but can't extend it
/*  the above class doesn't compile because the class is a concrete class and is required to implents all methods in it's definition
 * It would compile if it was an abstract or if it was named interface
 */
class City implements Interfaces, MyCountry{//This concrete class provides all the interface methods in its definition
    public int getTailLength(){
        return 5;
    }
    public String country(){
        return "Zimbabwe";
    }
    public static void main(String[] args) {
        City b = new City();
        b.getTailLength();//This doesn't print anything because this calls a method using  refence variable but not storing or using the variable 
        //or using the returned value.
        System.out.println("My country: " + b.country());
        System.out.println("tail length: " + b.getTailLength());
    }
}

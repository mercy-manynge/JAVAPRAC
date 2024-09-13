package Inheritance;

public class Gardgets {
    private String name;
    private int price;
    
    public int getPrice(){
        return price;
    }
    public Gardgets(String name) {
        super();//this is a call to the parent constructor which takes no arguments and is defined in java.lang.Object
        this.name = name;
    }
}

class Television extends Gardgets{
    public Television (String name){
        super(name);//this is a call to the parent constructor which takes one argument and is defined in Gardgets
    }
    public Television(){
        this("We need a new television");//this is a call to the constructor which takes one argument and is defined in Television
        super();// Doesn't compile because super() must be the first statement in the constructor
        super.getPrice();
    }
   

}

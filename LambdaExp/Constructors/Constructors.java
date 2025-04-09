package Constructors;

public class Constructors {
    public static void main(){
        Vehicle y = new Vehicle();//Vehicle() is also a constructor of Vehicle class
        System.out.println(y.x);
    }
}

class Vehicle{
    int x;
    Vehicle(){
        this(10);
    }

    Vehicle(int x){
        this.x =  x;
    }
}

class Car extends Vehicle{
    int y;
    Car(){
        super();
        // this(20); //This will throw an error because super() should be the first statement in the constructor and contructor should have only one explicit call to super() or this()
        this.y = 20;
    }

    Car(int y){
        this.y = y;
    }

    public String toString(){
        return super.x + ":" + this.y;
    }
}
package StaticaAndInstanceVariables;

public class StaticMethods {
    public static void main (String[] args){
        Testing ts = new Testing();
        ts.brand = "Apple";
        ts.price = 1000;
        ts.name = "Iphone";
        Testing.show(ts); // Here we are passing the object of the class Testing to the static method show so that it can be used as argument in show method
    }
}
class Testing{
    String brand;
    int price;
    String name;

    public static void show(Testing ts){
        //This will throw an error because static methods can't access instance variables
        // System.out.println(brand + " " + price + " " + name);/
        //However to access instance variables, we can make the staic methos show accept an object of testing as an argument
        System.out.println(ts.brand + " " + ts.price + " " + ts.name);
    }
}
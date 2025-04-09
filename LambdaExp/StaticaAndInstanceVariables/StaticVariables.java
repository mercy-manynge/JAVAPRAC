package StaticaAndInstanceVariables;

public class StaticVariables {
    public static void main(String[] args){
        //Create an object of a class mobile
        Mobile obj = new Mobile();
        obj.brand = "SUMSUNG";
        obj.price = 1500;
        obj.name = "Prime";
        /* This will print the values of the instance variables one by one, yet we don't want to waste time */
        // System.out.println(obj.brand);
        // System.out.println(obj.price);
        // System.out.println(obj.name);
        
        //NOW WE JUST CALL THE SHOW METHOD
        obj.show();//here name still has the value prime
        

        Mobile obj2 = new Mobile();
        obj2.brand = "NOKIA";
        obj2.price = 1000;
        obj2.name = "Lumia";

        Mobile.name = "phone";//Arrangement matters 
        obj.show(); //now name has the value prime because name is static and shared by all the objects
        obj2.show();

    }
}

class Mobile{
    //Define 3 insatnce variables
    String brand;
    int price;
    // String name;
    static String name;//This is a static variable, it is shared by all the objects of the class
    //Here in Mobile class create a method to print the values of the instance variables so that we don't have to print that everytime and save our time
    public void show(){
        System.out.println(brand + " " + price + " " + name);// The empty strings between the instance variables are for spaces when the values are printed
    }
} // i want the name to be same for all the objects
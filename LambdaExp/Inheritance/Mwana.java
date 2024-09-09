package Inheritance;
//No need for the import statement when the two classes that are inheriting each other are in the smae package

public class Mwana extends Mai{
    public static void main(String[] args) {
        Mai uy = new Mai();//Mai is accessible here because it has a default access
        uy.Age();
    }
}

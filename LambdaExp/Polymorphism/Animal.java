package Polymorphism;

public class Animal {
    public void makeSound(){
        System.out.println("Grr..");
    }
}

class Cat extends Animal{
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
class Cellphone {
    public String phone(String phone){
        return"Tecno";
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}
class Huawei extends Cellphone{
    public String phone(String phone){
        return "Iphone";
    }
}
class Print{
    public static void main(String[] args) {
        Cellphone c = new Huawei();//Accessing the method using the object of a super
        Animal a = new Dog();
        Animal b = new Cat();
        System.out.println(c.phone(""));
        a.makeSound();
        b.makeSound();
    }
}
//In polymorphism objets are created by referencing a superclass but instantiating a subclass
//In Method Overridding objects are creaed directly as intsances of their respective class
//Method Overridding is also known as runtime polymorphism
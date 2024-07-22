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

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}
class Print{
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound();
    }
}
//In polymorphism objets are created by referencing a superclass but instantiating a subclass
//In Method Overridding objects are creaed directly as intsances of their respective class
//Method Overridding is also known as runtime polymorphism
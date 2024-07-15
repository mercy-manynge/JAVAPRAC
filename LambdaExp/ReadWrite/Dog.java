package ReadWrite;

public class Dog {
   String name;
   int age;
   //Create  a custom constructor, the name of the custom constructor should always be the same as the class and also don't have any return type not even void
   public Dog(String name, int age){
    //name = "Puppy"; We need to customize every name 
    this.name = name;
    this.age = age;
   }
   public static void main(String[] args) {
    Dog myDog = new Dog("Jimmy", 3);//Pass the name as a parameter to our Dog constructor
    System.out.println(myDog.name + " " + myDog.age);
   } 
}

package Polymorphism;

 public class AnotherExample {
    public String getName() {
      return "Animal";
    }
  }
   class Gorilla extends AnotherExample {
    protected String getName() {  // DOES NOT COMPILE because it reduces the visibility
      return "Gorilla";
    }
  }
   class ZooKeeper {
    public static void main(String[] args) {
      AnotherExample animal = new Gorilla();
      System.out.println(animal.getName());
    }
  } 

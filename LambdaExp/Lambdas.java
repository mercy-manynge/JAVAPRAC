@FunctionalInterface

interface Greeting {
     void greet(String message);
}
public class Lambdas{
    public static void main(String[] args) {
        Greeting grt = message -> {System.out.println("Hello " + message);};//Message is the parameter
        grt.greet("Mercy");
    }
}
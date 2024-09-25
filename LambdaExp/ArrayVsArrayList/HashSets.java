package ArrayVsArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(); //Removes the duplicate names
        names.add("Thabiso");
        names.add("John");
        names.add("Jane");
        names.add("Mike");
        names.add("John");
        
        boolean hasMike = names.contains("Mike");
        System.out.println(hasMike);
        System.out.println(names);//John is printed only once because it is a duplicate
    }
}

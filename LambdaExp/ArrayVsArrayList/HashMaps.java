package ArrayVsArrayList;
import java.util.HashMap;
import java.util.Map;
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> names = new HashMap<>();//HashMaps can return two types like what is shown here
        names.put("Thandekayo", 23);//This is the key and the value hence supporting the key value pair
        names.put("John", 25);
        names.put("Thembiso", 7);
        System.out.println("These are the names and ages of the people in the HashMap: " + names);
    }//Real life example of the use of hashmap is dictionary where you can look up the meaning of a word the meaning should be mapped to the word
}


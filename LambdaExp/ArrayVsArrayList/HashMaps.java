package ArrayVsArrayList;
import java.util.HashMap;
import java.util.Map;
public class HashMaps {
    public static void main(String[] args) {
        Map<String, Integer> names = new HashMap<>();//HashMaps can return two types like what is shown here
        names.put("Thandekayo", 23);//This is the key and the value hence supporting the key value pair
        names.put("John", 25);
        names.put("Thembiso", 7);
        names.put("Mike", 15);
        names.put("Jane", 10);
        for (String name : names.keySet()) {
        System.out.println("Name: " + name + ", Age: " + names.get(name));//This will print giving the name and the age of the person
        }

        System.out.println("XXX XXX XXX" );
        
        //This is the other way of printing the hashmap
        for (Map.Entry<String, Integer> entry : names.entrySet()){
            System.out.println("Name: " + entry.getKey() + "Age : " + entry.getValue());
        }

        System.out.println("These are the names and ages of the people in the HashMap: " + names);//This will print using = e.g Thembiso=7
    }//Real life example of the use of hashmap is dictionary where you can look up the meaning of a word the meaning should be mapped to the word
}


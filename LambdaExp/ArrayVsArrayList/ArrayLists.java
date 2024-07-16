package ArrayVsArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayLists {
    public static void main(String[] args) {
        //ArrayList<String> name = new ArrayList<String>();//Arraylist has no fixed size
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("John", "Mona", "Tumelo", "Tapiwa"));
        names.add("Mercy");//Adding an elements to an arraylist
        names.set(2, "Makiwa");//changing the value of the element at index 2 from tumelo to Makiwa
        names.remove("Mona");// Remove an element from an arraylist
        System.out.println(names.get(1));//getting the index of an array
        System.out.println(names.size());//getting the size of an arraylist
        System.out.println(names);
        int [][] numbers = {
            {20, 22, 23},
            {24, 25, 26},
            {27, 28, 29},
        };
        for (int i = 0; i < 3; i++){
            System.out.println(numbers[i][i]);
            System.out.println(numbers[2][2]);
            for(int j = 0; j < 3; j++){
            System.out.println(numbers[i][j]);
            }
        }
    }
}

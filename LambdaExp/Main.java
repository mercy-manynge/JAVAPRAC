import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        // Using a lambda expression to output each number in the list
        number.forEach((mickey) -> System.out.println(mickey));
        // The forEach method iterates over each element in the 'number' list
        // For each element (referred to as 'mickey'), it prints the element
        number.forEach(mickey ->{
            if (mickey % 2 != 0);
            System.out.println(mickey);
        });
    }
}

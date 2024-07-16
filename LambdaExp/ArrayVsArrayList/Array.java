package ArrayVsArrayList;

public class Array {
    public static void main(String[] args) {
        //String[] name = new String[4];//Array with aninitialised fixed size
        String[] name2 = {"Mickeillah", "Antony", "Mickael", "Jabu"};//Array with initialised values
        name2[3] = "Eliot";//changing the element at index 3 from jabu to Eliot
        System.out.println(name2[3]);//finding the index of an array
        System.out.println(name2.length);//finging the length of the array
        System.out.println(name2);
    }
}

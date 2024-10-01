package Loops;

public class NestedLoops {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 2 ==0)
            System.out.println(i + "");//prints even numbers from 2 to 100
        }
        for(int i = 100; i >= 1; i--){// print the even numbers from 100 to 2
            if(i % 2 ==0)
            System.out.println(i + "");
        }
        
    }
}

package Loops;

public class Circus {
    final static int x2 = 7;
    final static Integer x4 = 8;//An integer can't be used in a switch statement
    public static void main(String [] args) {
        Integer x1 = 5;
        String s = "a";
        if (x1 < 9) s += "a";
        switch (x1) {
            case 5: s+= "c";
            case x2: s += "d";
            case x4: s += "e";//this line causes a compile error 
        }
        System.out.println(s);
    }
}

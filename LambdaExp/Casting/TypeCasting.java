package Casting;

public class TypeCasting {
    public static void main(String [] args){
        int a = 4;
        Long b = 400L;
        short c = 5;
        byte d = 6;
        String s1 = (String) (a);//Can not typecast an int to a string because they are two different types a primitive and an object.
        String s2 = (String ) (b);
        String s3 = (String) (c);
        String s4 = (String) (d);
        System.out.println(d + "");
   }
}

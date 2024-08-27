package Strings;

public class StringDemo {
    public static void main(String [] args){
        // String s = "Mercy";
        // s+= "Tariro";// this is possible beacause we stored the string in a variamble which is s
    //   String  b = "Manyange";
    //     System.out.println(s + b);
    //     System.out.println(s);

        String s = "purr";
 s+=s.toUpperCase();
 s+=s.trim();
s+=s.substring(1, 3);
s+= " two";
System.out.println(s.length());
    }
}

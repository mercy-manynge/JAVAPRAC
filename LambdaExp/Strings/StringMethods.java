package Strings;
public class StringMethods{
    public static void main(String[] args){
        String m = "manyange";
        System.out.println(m.indexOf("a", 4));//This means that search for charactor a starting from index 4
        System.out.println(m.indexOf("g", 7));// When you pass a charactor or a string and it is not present in that string it will return a -1
        System.out.println(m.indexOf('g'));

        System.out.println("Substring Method");
        System.out.println(m.substring(m.indexOf('n')));//This finds the index of n first and then finds the substring of n till the end of the string
        System.out.println(m.substring(2, 4));//This says take part of the string from index 2 but exclude the last index
        System.out.println(m.substring(3, 3));//This returns an empty line 
        System.out.println(m.substring(3, 2));//Returns an excerption because starting index can not be greater thn the ending index
        System.out.println(m.substring(3, 10));//Returns exception because the ending index is out ou bound
    }
}
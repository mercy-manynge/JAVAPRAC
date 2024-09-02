package House;

public class Glider2 {
    public static String glide(String s) {
        return "1";
        }
        public static String glide(String... s) {//takes as many parameters as it wants so it matches abc
        return "2";
        }
        public static String glide(Object o) {//An object is a parent of all classes so it can store all reference types
        return "3";
        }
        public static String glide(String s, String t) {//Takes two string parameters so it matches ab
        return "4";
        }
        public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
        }
}

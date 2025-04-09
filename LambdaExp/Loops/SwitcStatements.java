package Loops;

public class SwitcStatements {
    public static void main(String[] args)
{
    String s = "_";
    switch (TimeZone.CST){
        case EST: s += "e";
        case CST: s += "c";// if there is no break statement, it will continue to execute the next case
        case MST: s += "m";
        default: s += "X";
        case PST: s += "p";
    }
    System.out.println(s);
}    
}
enum TimeZone {EST, CST, MST, PST}

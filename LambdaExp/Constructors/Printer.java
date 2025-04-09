package Constructors;

public class Printer {
    int inkLevel;
}
class LaserPrinter extends Printer {
    int pagesPerMin;
    public static void main (String [] args){
        Printer printer = new Printer ();
        // System.out.println((LaserPrinter)myPrinter.pagesPerMin); This will not compile because printer cannot be cast to LaserPrinter
        System.out.println(((LaserPrinter)printer).pagesPerMin);
    }
}
package ReadWrite;
import java.io.*;
public class ReadWrite {

public static void main(String[] args) {
 String result;
 int l = 0;
 int w = 0;
 String sl = "";
 String sw = "";
 BufferedReader br;
br = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the length");
try {
 sl = br.readLine();
 } catch (IOException e) {
 System.out.println("Error in input");
System.exit(2);
 }
System.out.println("Enter the width");
try {
sw = br.readLine();
} catch (IOException e) {
System.out.println("Error in input");
System.exit(2);
}
try {
l = Integer.parseInt(sl);
 w = Integer.parseInt(sw);

} catch (NumberFormatException e) {
System.out.println("Unable to convert");
System.exit(2);
}

result = String.valueOf(l * w);
 System.out.println("result is: " + result);
 System.out.println("-------------------");
 }
}
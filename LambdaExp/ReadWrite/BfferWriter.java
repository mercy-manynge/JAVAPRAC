package ReadWrite;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class BfferWriter {
    public static void main(String[] args) {
    String content = "This is the content of the file\nThis is the second line of the file";
    try(BufferedWriter writer = new BufferedWriter(new FileWriter("zvandada.txt"))){
        writer.write(content);
        System.out.println("File written successfully");
    } catch (IOException e){
        e.printStackTrace();
    }
    try(BufferedReader reader = new BufferedReader(new FileReader("zvandada.txt"))){
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }

    }catch (IOException e){
        e.printStackTrace();
    }
}
}
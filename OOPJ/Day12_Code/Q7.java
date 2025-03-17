import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Q7 {
    public static void main(String[] args) { 
        try{
			String fileName = "xyz.txt";
			FileReader fileReader = new FileReader(fileName);
			int line = fileReader.read();
            System.out.println("File content: " + line);
			
        } catch (FileNotFoundException e) {
            System.out.println("Caught an Exception: FileNotFoundException.");
        }
    }
}


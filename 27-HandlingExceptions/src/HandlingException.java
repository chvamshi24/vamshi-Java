import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingException {
    public static void main(String[] args) {
        File file = new File("C:/Users/10824916/Desktop/latest_aks.txt");
        try {
            FileReader fr = new FileReader(file);
            // this will not throw an exception
            System.out.println("Continuing ....");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }
        System.out.println("Finished.");
    }
}

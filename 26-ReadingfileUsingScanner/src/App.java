import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:/Users/10824916/Desktop/latest_aks.txt";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);
//        int value = in.nextInt();
//        System.out.println("Read value: " + value);
        int count = 2;
        while (in.hasNextLine()){
            String line = in.nextLine();

            System.out.println(count + ": " + line);
            count++;
        }
        in.close();

        /*try {
            Scanner in = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}

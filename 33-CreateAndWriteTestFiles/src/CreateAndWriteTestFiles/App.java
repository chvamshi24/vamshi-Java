package CreateAndWriteTestFiles;

import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("test1.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write("This is line one");
            bw.newLine();
            bw.write("This is line two");
            bw.newLine();
            bw.write("This is line three");
            bw.newLine();
            bw.write("Last line.");

        } catch (IOException e) {
            System.out.println("Unable to write file " + file.toString());
        }
    }
}

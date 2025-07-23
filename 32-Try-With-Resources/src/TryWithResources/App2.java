package TryWithResources;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("c:\\Users\\10824916\\Documents\\vamshi-Java\\32-Try-With-Resources\\src\\TryWithResources\\test.txt");


        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cann't find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to Read File " + file.toString());
        }
    }
}

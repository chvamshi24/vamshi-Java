package FileReader;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("c:\\Users\\10824916\\Documents\\vamshi-Java\\31-ReadingFilesWithFileReader\\src\\FileReader\\test.txt");

        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while ( (line = br.readLine()) != null ) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not Found " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NullPointerException ex) {

            }
        }
    }
}

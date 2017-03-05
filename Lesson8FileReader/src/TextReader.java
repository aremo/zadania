import java.io.*;
import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("test.txt");
             BufferedReader bfr = new BufferedReader(fileReader);) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Plik nie istnieje");
        }
        System.out.println();

        File file = new File("test.txt");
        try (Scanner scan = new Scanner(file);) {
            while (scan.hasNextLine()) {
                String nextLine = scan.nextLine();
                System.out.println(nextLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Plik nie istnieje");
        }
    }

}

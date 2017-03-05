import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Product[] tab = new Product[3];

        tab[0] = new Product("nazwa1", "producent1", 2.50);
        tab[1] = new Product("nazwa2", "producent2", 4.50);
        tab[2] = new Product("nazwa2", "producent2", 6.50);

        FileWriter fileWriter = new FileWriter("plik.txt");
        BufferedWriter bfw = new BufferedWriter(fileWriter);

        for (int i = 0; i < tab.length; i++) {
            bfw.write(tab[i].toString());
            bfw.newLine();

        }
        bfw.close(); //ważne

    }
}

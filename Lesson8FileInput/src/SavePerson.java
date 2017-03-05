import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SavePerson {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("person.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Person person = new Person("Maciej", "Nowak", 27, 1234567890);
        oos.writeObject(person);
        oos.close();

    }
}

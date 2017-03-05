import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadPerson {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object readObject = ois.readObject();
        Person person = (Person) readObject;
        System.out.println(person);
        ois.close();
    }
}

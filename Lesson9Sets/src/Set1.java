import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) throws IOException {
        TreeSet<Integer> set = new TreeSet<>();

        FileReader fileReader = new FileReader("numbers.txt");
        BufferedReader bfr = new BufferedReader(fileReader);
        String line = null;
        int elements = 0;
        while ((line = bfr.readLine()) != null) {
//            System.out.println(line);
            Integer integer = Integer.valueOf(line);
            set.add(integer);
            elements++;
        }
        bfr.close();

        System.out.println("Ilość liczb w pliku: " + elements);

        int size = set.size();
        System.out.println("Ilość unikalnych liczb: " + size);

        int first = set.first();
        System.out.println("Najmniejsza: " + first);

        int last = set.last();
        System.out.println("Największa: " + last);

        System.out.println("\nIterator z while\nLiczby unikalne od najmniejszej do największej: ");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nfor each\nLiczby unikalne od najmniejszej do największej: ");

        for (Integer num : set) {
            System.out.println(num);
        }


    }
}

import org.omg.CosNaming.NameHolder;

public class NameTester {
    public static void main(String[] args) {
        NamesHolder nameHolder = new NamesHolder();
        try {
            nameHolder.add("Jan");
            nameHolder.add("Asia");
            nameHolder.add("Bartek");
            nameHolder.add("Jan");
        } catch (DuplicateException e) {
            System.out.println(e.getMessage());
            System.err.println();
        }

        System.out.println(nameHolder.contains("Jan"));
        System.out.println(nameHolder.size());

    }
}

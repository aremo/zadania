
public class Zad31 {
    public static void main(String[] args) {

        int i = 0;
        double k = 0;

        System.out.println("while \n");
        while (k < 3.0) {
            k = i * 0.1;
            i++;
            System.out.println(k);
        }

        i = 0;
        k = 0;

        System.out.println("\ndo while \n");
        do {
            k = i * 0.1;
            i++;
            System.out.println(k);

        } while (k < 3);

    }
}


public class Zad32 {
    public static void main(String[] args) {
        double[] tablica = new double[31];

        int i = 0;
        double k = 0;

        System.out.println("while\n");
        while (i < tablica.length) {
            tablica[i] = k;
            System.out.println(k);
            k = k + 0.1;
            i++;
        }

        System.out.println("\ndo while\n");

        i = 0;
        k = 0;

        do {
            tablica[i] = k;
            System.out.println(k);
            k = k + 0.1;
            i++;
        } while (i < tablica.length);
    }
}
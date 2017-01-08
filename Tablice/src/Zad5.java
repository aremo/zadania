/**
 * Created by aremo on 1/8/2017.
 */
public class Zad5 {
    public static void main(String[] args) {
        int[] tablica = new int[101];
        int i = 0;
        int sum = 0;

        while (i < tablica.length) {
            if (i % 2 == 0) {
                tablica[i] = i;
                System.out.println(i);

            }
            sum = sum + tablica[i];
            i++;

        }
        System.out.println(sum + " to suma końcowa");


    }
}

import java.util.Scanner;

/**
 * Created by aremo on 1/10/2017.
 */
public class Cwiczenie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy");
        int size = input.nextInt();

        double[] numbers = new double[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Podaj liczbę " + i);
            numbers[i] = input.nextDouble();

        }
        double sum = 0;
        for (double number: numbers) {
           sum = sum + number*number;

        }
        System.out.println(sum);
    }
}

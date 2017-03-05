import java.util.Scanner;

/**
 * Created by aremo on 1/8/2017.
 */
public class Zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Podaj liczbę");
        int liczba = input.nextInt();

        while (liczba % 3 == 0) {
            if (liczba < 100) {
                System.out.println("Podana liczba jest za mała\nPodaj liczbę");
                input.nextLine();
                liczba = input.nextInt();
            } else if (liczba > 200) {
                System.out.println("Podana liczba jest za duża\nPodaj liczbę");
                input.nextLine();
                liczba = input.nextInt();
            }
        }

//        System.out.println("Podana liczba jest OK");

        input.close();
    }
}
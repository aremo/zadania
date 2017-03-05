import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić?");
        int size = -1;
        try {
            size = scan.nextInt();
        } catch(InputMismatchException e) {
            System.out.printf("Podałeś nieprawidłową wartość, koniec programu");
            return; //kończy wykonywanie metody main
        }
        double[] numbers = new double[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę " + (i+1));
            try {
                numbers[i] = scan.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Podałeś błędną wartość");
                scan.nextLine(); //usuwamy z bufora błędną wartość, która nadal tam jest,
                //bo wystąpił wyjątek
                i--; //ważne jeśli nie chcemy mieć miejsc w tablicy z zerami,
                //tylko chcemy powtórzyć wczytywanie tej samej liczby
            }
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        System.out.println("Suma podanych liczb wynosi " + sum);
    }
}
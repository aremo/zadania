import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj trzy słowa: ");
        String [] words = new String[3];

        words[0] = sc.nextLine();
        words[1] = sc.nextLine();
        words[2] = sc.nextLine();
        System.out.println("Poniżej lista podanych przez Ciebie słów: ");

        for (String word:words) {
            System.out.println(word);
        }
        System.out.println("Podaj nr indeksu słowa, które chcesz wyświetlić: ");


        try{
            int index = sc.nextInt();
            System.out.println(words[index]);
            System.out.println("Indeks prawidłowy");

        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Zły indeks tablicy");

        } catch(InputMismatchException ex) {
            System.out.println("Wprowadź liczbę");

        }
    }
}


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aremo on 1/10/2017.
 */
public class ForLoops {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E"};

//        int i = 0;
//        while (i < letters.length) {
//            System.out.println(letters[i]);
//            i++;
//        }
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        for (String letter : letters) {  //zmienna musi być tego samego typu co tablica
            System.out.println(letter);
        }

        int[] numbers = new int[3];
        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Podaj " + i);
//            numbers[i] = scan.nextInt();
//        }

        for (int number : numbers) { //tylko wyswietlanie nie modyfikowanie kolekcji
            System.out.println("Podaj liczbe");
            number = scan.nextInt(); // number = numbers[1]

        }

        System.out.println(Arrays.toString(numbers));
    }
}

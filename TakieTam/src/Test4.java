import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15};
        Scanner scan = new Scanner(System.in);

        try {
            int index = scan.nextInt();
            System.out.println(numbers[index]);
            System.out.println("Indeks prawidłowy");
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Zły indeks tablicy");
        } catch(InputMismatchException ex) {
            System.out.println("Wprowadź liczbę");
        }
    }

}

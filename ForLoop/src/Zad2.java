import java.util.Random;

public class Zad2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);

        }

        int biggerThan50 = 0;
        int smallerThan50 = 0;
        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number < 50) {
                biggerThan50++;
            } else if (number > 50) {
                smallerThan50++;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Liczby większe od 50: " + biggerThan50);
        System.out.println("Liczby mniejsze od 50: " + smallerThan50);
        System.out.println("Liczby parzyste: " + even);
        System.out.println("Liczby nieparzyste: " + odd);
    }
}
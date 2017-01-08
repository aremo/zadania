import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        double[] numbers = new double[3];

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        numbers[0] = input.nextDouble();

        System.out.println("Podaj drugą liczbę");
        numbers[1] = input.nextDouble();

        System.out.println("Podaj trzecią liczbę");
        numbers[2] = input.nextDouble();

        double sum = numbers[0] + numbers[1] + numbers[2];
        System.out.println(numbers[0] + " + " + numbers[1] + " + " + numbers[2] + " = " + sum);

    }
}

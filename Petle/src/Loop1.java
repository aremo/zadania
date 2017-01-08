import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[5];
        int i = 0;
        int sum = 0;

        System.out.println(sum);
        while (i < numbers.length) {
            System.out.println("podaj liczbę");
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
            i++;

            System.out.println("suma liczb: " + sum);

        }

        System.out.println(sum + " to suma końcowa");

        input.close();

    }
}

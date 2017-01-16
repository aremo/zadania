package zad3;

import java.util.Scanner;

public class DirectionsTest {
    public static void main(String[] args) {

        for (Directions direction : Directions.values()) {
            System.out.println("Eng: " + direction + " Pol: " + direction.getTranslation());
        }

        System.out.print("Podaj Kierunek geograficzny: ");

        Scanner scanner = new Scanner(System.in);
        String moveDirection = scanner.next();

        System.out.println("Idziemy na " + Directions.convertInput(moveDirection));

        for (int i = 0; i < 5; i++) {
            System.out.println(Directions.convert(i));
        }
    }
}

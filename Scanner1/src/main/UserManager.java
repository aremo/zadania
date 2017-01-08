package main;
import data.User;

import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        User user1 = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pesel");
        String pesel1 = scanner.nextLine();
        user1.setPesel(pesel1);
//      user1.setPesel(scanner.nextLine());

        System.out.println("Podaj wiek");
        int wiek1 = scanner.nextInt();
        user1.setWiek(wiek1);

        scanner.nextLine();

        System.out.println("Podaj imię");
        String imię1 = scanner.nextLine();
        user1.setImię(imię1);

        System.out.println("Podaj nazwisko");
        String nazwisko1 = scanner.nextLine();
        user1.setImię(nazwisko1);

        scanner.close();

        System.out.println("Imię: " + imię1);
        System.out.println("Nazwisko: " + nazwisko1);
        System.out.println("Wiek:" + wiek1);
        System.out.println("Pesel: " + pesel1);







    }
}

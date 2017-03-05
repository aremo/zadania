import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = scan.nextInt();
        scan.nextLine(); //pozbywamy się "\n"

        System.out.println("Podaj napis:");
        String napis = scan.nextLine();

        System.out.println("Podaj liczbę");
        int liczba1 = scan.nextInt();

        System.out.println("Podaj liczbę");
        int liczba2 = scan.nextInt();

        System.out.println("Podaj napis:");
        String napis1 = scan.nextLine();
        scan.nextLine();

        System.out.println("Podaj napis:");
        String napis2 = scan.nextLine();

        System.out.println(liczba + " " + napis);
    }
}

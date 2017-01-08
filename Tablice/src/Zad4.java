import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj X róźny od 0");
        int x = input.nextInt();
        System.out.println("Podaj Y różny od 0");
        int y = input.nextInt();
        input.close();

        String cwiartka = null;

        if (x > 0 && y > 0) {
            cwiartka = "I";
        } else if (x < 0 && y > 0) {
            cwiartka = "II";
        } else if (x < 0 && y < 0) {
            cwiartka = "III";
        } else {
            cwiartka = "IV";
        }
        System.out.println("Punkt (" + x + "," + y + ") leży w " + cwiartka + " ćwiartce układu współrzędnych");

    }
}

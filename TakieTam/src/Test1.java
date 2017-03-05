import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNo;

        do {
            System.out.println("Wprowadz numer dnia tygodnia od 1 do 7, lub 0 zeby zakonczyc");
            dayNo = sc.nextInt();
            switch (dayNo) {
                case 1:
                    System.out.println("Poniedzialek");
                    break;
                case 2:
                    System.out.println("Wtorek");
                    break;
                case 3:
                    System.out.println("Sroda");
                    break;
                case 4:
                    System.out.println("Czwartek");
                    break;
                case 5:
                    System.out.println("Piatek");
                    break;
                case 6:
                    System.out.println("Sobota");
                    break;
                case 7:
                    System.out.println("Niedziela");
                default:
                    System.out.println("Nie ma takiego dnia tygodnia");
            }
        } while (dayNo != 0);
    }
}

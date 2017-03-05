import java.util.Scanner;

public class SpeedTest {
    public static void main(String[] args) {
        Speed[] values = Speed.values();
        for (Speed value : values) {
            System.out.println(value);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz prędkość");
        String text = sc.nextLine();
        //NORMAL
        Speed userSpeed = Speed.valueOf(text);

        System.out.println("Poruszasz się z prędkością "
                + userSpeed + ", która wynosi " + userSpeed.getSpeed());
    }
}
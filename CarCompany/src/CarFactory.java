import java.util.Scanner;

public class CarFactory {

    private static final Scanner INPUT = new Scanner (System.in);

    public static Car createCar () {
        System.out.println("Podaj nazwe");
        String name = INPUT.nextLine();

        System.out.println("Podaj spalanie");
        double consumption = INPUT.nextDouble();
        INPUT.nextLine();

        System.out.println("Podaj max speed");
        int maxSpeed = INPUT.nextInt();
        INPUT.nextLine();

        Car car = new Car (name, consumption, maxSpeed);
        return car;
    }
}

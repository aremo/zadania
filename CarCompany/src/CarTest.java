
public class CarTest {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar();
        Car car2 = CarFactory.createCar();

//        Car car1 = new Car("BMW", 12,250);
//        Car car2 = new Car("Audi", 10, 220);

        System.out.println(car1.getName());
        System.out.println(car2.getName());
//        System.out.println(car1.carsNumber);
//        System.out.println(car2.carsNumber);
        System.out.println("Liczba samochodow " + Car.carsNumber); // odwolujemy sie do obiektu poniewaz carsNumber jest statycznym polem obiektu
    }
}

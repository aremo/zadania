
public class Car {
    private String name;
    private double consumption;
    private int speedLimit;
    public static int carsNumber = 0;

    public Car(String name, double consumption, int speedLimit) {
        this.name = name;
        this.consumption = consumption;
        this.speedLimit = speedLimit;
        carsNumber++; //przy każdym nowym obiekcie wywołującym konstruktor będzie sie zwiekszac o 1 carsNumber
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}

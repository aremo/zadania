
public class RentableCar extends Car implements Rentable {

    private Person rentTo;

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
    }

    @Override
    public boolean isRent() {
        return rentTo != null;
    }

    @Override
    public void rent(String firstName, String lastName, int id) {
        rentTo = new Person(firstName, lastName, id);
    }

    @Override
    public void handOver() {
        rentTo = null;
    }

    @Override
    public String toString() {
        return "RentableCar [rentTo=" + rentTo + ", getSeats()=" + getSeats() + ", getName()=" + getName()
                + ", getYear()=" + getYear() + ", getDirection()=" + getDirection() + "]";
    }


}

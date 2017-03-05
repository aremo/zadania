
public abstract class Vehicle implements Movable {
    private String name;
    private int year;
    private String direction;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        direction = Movable.LEFT;
    }

    @Override
    public void turnRight() {
        direction = Movable.RIGHT;
    }

    @Override
    public void goForward() {
        direction = Movable.FORWARD;
    }

    @Override
    public void goBack() {
        direction = Movable.BACK;
    }
}

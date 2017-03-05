/**
 * Created by aremo on 1/13/2017.
 */
public enum Speed {
    SLOW(30),
    NORMAL(90),
    FAST(150);

    private final int speed;

    Speed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}


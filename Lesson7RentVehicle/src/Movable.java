
public interface Movable {
    String FORWARD = "forward";
    String BACK = "back";
    String RIGHT = "prawo";
    String LEFT = "left";

    void turnLeft();
    void turnRight();
    void goForward();
    void goBack();
}

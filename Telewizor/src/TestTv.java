
public class TestTv {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.displayStatus();
        televisor.turnOn();
        televisor.displayStatus();
        televisor.turnOff();
        televisor.displayStatus();
    }
}

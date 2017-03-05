
public class CalcTest {
    public static void main(String[] args) {
        try {
            Calculator.divide(5,0);
        } catch (DivideByZeroException e) {
            System.out.println("Dzielenie przez 0 nonono"); //nigdy nie zapisywac pustego catcha
        }
    }
}

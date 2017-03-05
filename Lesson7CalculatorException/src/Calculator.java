
public class Calculator {

    public static double divide(double x, double y) throws DivideByZeroException{
        if (y == 0)
            throw new DivideByZeroException();
        return x/y;
    }
}

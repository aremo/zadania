public class Square
{
    double dLength;
    double dArea;

    public Square (double dLengthIn)
    {
        dLength = dLengthIn;
    }

    public void CalculateArea()
    {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        dArea = shapeCalc.CalcSquareArea(this);

        // dArea = new ShapeCalculator().CalcSquareArea(this);
    }
}
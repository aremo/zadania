public class Circle
{
    double dRadius;
    double dArea;

    public Circle(double dRadiusIn)
    {
        dRadius = dRadiusIn;
    }

    public void CalculateArea()
    {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        dArea = shapeCalc.CalcCircleArea(this);

        // dArea = new ShapeCalculator().CalcCircleArea(this);
    }
}
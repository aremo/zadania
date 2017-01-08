public class Triangle {
    double dSideA;
    double dSideB;
    double dSideC;
    double dPerimeter;

    public Triangle(double dSideAIn, double dSideBIn, double dSideCIn) {
        dSideA = dSideAIn;
        dSideB = dSideBIn;
        dSideC = dSideCIn;
    }

    public void CalculatePerimeter() {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        dPerimeter = shapeCalc.CalcTrianglePerimeter(this);

        // dPerimeter = new ShapeCalculator().CalcTrianglePerimeter(this);
    }
}
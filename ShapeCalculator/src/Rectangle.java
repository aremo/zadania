public class Rectangle {
    double dLength;
    double dWidth;
    double dPerimeter;

    public Rectangle(double dLengthIn, double dWidthIn) {
        dLength = dLengthIn;
        dWidth = dWidthIn;
    }

    public void CalculatePerimeter() {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        dPerimeter = shapeCalc.CalcRectanglePerimeter(this);

        // uzywajac anonimowego obiektu
        // dPerimeter = new ShapeCalculator().CalcRectanglePerimeter(this);
    }

}
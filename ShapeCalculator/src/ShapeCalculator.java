public class ShapeCalculator
{
    public double CalcSquareArea(Square square)
    {
        return  square.dLength * square.dLength;
    }

    public double CalcRectanglePerimeter(Rectangle rectangle)
    {
        return (rectangle.dLength * 2) + (rectangle.dWidth * 2);
    }

    public double CalcTrianglePerimeter(Triangle triangle)
    {
        return triangle.dSideA + triangle.dSideB + triangle.dSideC;
    }

    public double CalcCircleArea(Circle circle)
    {
        return (circle.dRadius * circle.dRadius) * Math.PI;
    }
}
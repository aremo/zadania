public class Main
{
    public static void main(String[]args)
    {
        Square mySquare = new Square(10);
        mySquare.CalculateArea();
        System.out.println(mySquare.dArea);

        Rectangle myRectangle = new Rectangle(5, 2);
        myRectangle.CalculatePerimeter();
        System.out.println(myRectangle.dPerimeter);

        Triangle myTriangle = new Triangle (1,2,3);
        myTriangle.CalculatePerimeter();
        System.out.println(myTriangle.dPerimeter);

        Circle myCircle = new Circle(5);
        myCircle.CalculateArea();
        System.out.println(myCircle.dArea);

    }
}
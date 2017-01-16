package zad1;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(2);


        for (Shape shape : shapes) {
            System.out.println(shape.calculatePerimeter() + " m");
            System.out.println(shape.calculateArea() + " m2" + "\n");

        }
    }

}

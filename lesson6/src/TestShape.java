
public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(2);


        for (Shape shape : shapes) {
            System.out.println(shape.calculatePerimeter());
            System.out.println(shape.calculateArea()+ "\n");

        }
    }

}

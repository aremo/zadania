public class CalculatorTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 10.0);
        Circle circle = new Circle(20);

        double circleArea = ShapeCalculator.calculateArea(circle);
        double rectArea = ShapeCalculator.calculateArea(rect);
        double circlePerimeter = ShapeCalculator.calculatePerimeter(circle);
        double rectPerimeter = ShapeCalculator.calculatePerimeter(rect);
        System.out.printf("Pole koła o promieniu %.2f to %.2f\n", circle.getR(), circleArea);
        System.out.printf("Obwód koła o promieniu %.2f to %.2f\n", circle.getR(), circlePerimeter);
        System.out.printf("Pole prostokąta o bokach %.2f x %.2f to %.2f\n",
                rect.getA(), rect.getB(), rectArea);
        System.out.printf("Obwód prostokąta o bokach %.2f x %.2f to %.2f\n",
                rect.getA(), rect.getB(), rectPerimeter);
    }
}
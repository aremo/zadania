public class ShapeCalculator {

    public static double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.getR(), 2);
    }

    public static double calculateArea(Rectangle rect) {
        return rect.getB() * rect.getB();
    }

    public static double calculatePerimeter(Circle circle) {
        return Math.PI * circle.getR() * 2;
    }

    public static double calculatePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getA() + rectangle.getB());
    }

}
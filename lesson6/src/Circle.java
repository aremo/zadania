
public class Circle extends Shape {
    private double radius;
    private double circleArea;
    private double circlePerimeter;

    //Konstruktor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Gettery i Settery
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return circleArea;
    }

    public void setCircleArea(double circleArea) {
        this.circleArea = circleArea;
    }

    public double getCirclePerimeter() {
        return circlePerimeter;
    }

    public void setCirclePerimeter(double circlePerimeter) {
        this.circlePerimeter = circlePerimeter;
    }

    //Metody
    @Override
    public double calculateArea() {
        System.out.println("Pole powierzchni koła to: ");
        circleArea = Math.PI * Math.pow(radius, 2);
        return circleArea;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód koła to: ");
        circlePerimeter = 2 * Math.PI * radius;
        return circlePerimeter;
    }
}

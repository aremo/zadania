package zad1;

public class Circle extends Shape {
    private double radius;

    //Konstruktor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Metody
    @Override
    public double calculateArea() {
        System.out.println("Pole powierzchni koła to: ");
        double circleArea = Math.PI * Math.pow(radius, 2);
        return circleArea;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód koła to: ");
        double circlePerimeter = 2 * Math.PI * radius;
        return circlePerimeter;
    }
}

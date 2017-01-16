package zad1;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    //Konstruktor
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //Metody
    @Override
    public double calculateArea() {
        System.out.println("Pole powierzchni prostokąta to: ");
        double rectArea = sideA * sideB;
        return rectArea;

    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód prostokąta to: ");
        double rectPerimeter = (2 * sideA) + (2 * sideB);
        return rectPerimeter;
    }
}

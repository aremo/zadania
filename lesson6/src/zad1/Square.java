package zad1;

public class Square extends Shape {
    private double sideA;

    //Konstruktor
    public Square(double sideA) {
        this.sideA = sideA;
    }

    //Metody
    @Override
    public double calculateArea() {
        System.out.println("Pole powierzchni kwadratu to: ");
        double squareArea = sideA * sideA;
        return squareArea;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód kwadratu to: ");
        double squarePerimeter = 4 * sideA;
        return squarePerimeter;
    }
}

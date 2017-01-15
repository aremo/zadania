
public class Square extends Shape {
    private double sideA;
    private double squareArea;
    private double squarePerimeter;

    //Konstruktor
    public Square(double sideA) {
        this.sideA = sideA;
    }

    //Gettery i Settery
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(double squareArea) {
        this.squareArea = squareArea;
    }

    public double getSquarePerimeter() {
        return squarePerimeter;
    }

    public void setSquarePerimeter(double squarePerimeter) {
        this.squarePerimeter = squarePerimeter;
    }

    //Metody
    @Override
    public double calculateArea() {
        System.out.println("Pole powierzchni kwadratu to: ");
        squareArea = sideA * sideA;
        return squareArea;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód kwadratu to: ");
        squarePerimeter = 4 * sideA;
        return squarePerimeter;
    }
}

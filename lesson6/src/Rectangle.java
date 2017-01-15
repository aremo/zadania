
public class Rectangle extends Shape {
    private double sideA;
    private double sideB;
    private double rectArea;
    private double rectPerimeter;

    //Konstruktor
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //Gettery i Settery
//    public double getSideA() {
//        return sideA;
//    }
//
//    public void setSideA(double sideA) {
//        this.sideA = sideA;
//    }
//
//    public double getSideB() {
//        return sideB;
//    }
//
//    public void setSideB(double sideB) {
//        this.sideB = sideB;
//    }
//
//    public double getRectArea() {
//        return rectArea;
//    }
//
//    public void setRectArea(double rectArea) {
//        this.rectArea = rectArea;
//    }
//
//    public double getRectPerimeter() {
//        return rectPerimeter;
//    }
//
//    public void setRectPerimeter(double rectPerimeter) {
//        this.rectPerimeter = rectPerimeter;
//    }

    //Metody
    @Override
    public double calculateArea() {
        System.out.println("Pole powierzchni prostokąta to: ");
        rectArea = sideA * sideB;
        return rectArea;

    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Obwód prostokąta to: ");
        rectPerimeter = (2 * sideA) + (2 * sideB);
        return rectPerimeter;
    }
}

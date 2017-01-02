public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(90, 45, 45);
        Logic triangleCheck = new Logic();

        if (triangleCheck.isRightTriangle(triangle1)) {
            System.out.println("Triangle is right!");
        } else {
            System.out.println("Triangle is not right or the shape isn't a triangle!");
        }
    }
}
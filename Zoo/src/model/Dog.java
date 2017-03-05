package model;

public class Dog extends Animal {

    private double tail; //lenght

    public Dog(String name, String color, double tail) {
        super(name, color);
        System.out.println("Tworze Dog");
        this.tail = tail;
    }

    public double getTail() {
        return tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

//    void showInfo() {
//        System.out.println(name + color + tail);
//    }


    @Override
    public void showInfo() {
        System.out.println("Pies " + getName() + " o kolorze " + getColor() + " i ogonie " + getTail() + " cm");
    }
}

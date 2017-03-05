package model;

public class Elephant extends Animal {

    private double trunk; //lenght

    public Elephant(String name, String color, double trunk) {
        super(name, color);
        this.trunk = trunk;
        System.out.println("Tworze Elephant");
    }

    public double getTrunk() {
        return trunk;
    }

    public void setTrunk(double trunk) {
        this.trunk = trunk;
    }

//    void showInfo() {
//        System.out.println(name + color + trunk);
//    }

    @Override //adnotacja- nadpisuje metode z klasy nadrzednej
    public void showInfo() {
        System.out.println(trunk);
    }

}

package model;

public abstract class Animal {

    private String name;
    private String color;

    public Animal() {

    }

    public Animal(String name, String color) {
        super();
        System.out.println("Tworze Animal");
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public abstract void showInfo();

}

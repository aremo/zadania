package pl.javastart.model;

public class Product {
    private String name; //pola klasy
    private String producer;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Zła cena");
        } else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, String producer, double price, int quantity) { //konstruktor
        this(name, producer, quantity);
        this.price = price;
    }

    public Product(String name, String producer, int quantity) {
        this.name = name;
        this.producer = producer;
        this.quantity = quantity;
        //koniec this
    }

//    void promo () {
//        price = 0.75 * price;
//    }

    public void show() {
        System.out.println(name);
        System.out.println(producer);
        System.out.println(price);
        System.out.println(quantity);
    }


}

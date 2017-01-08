package pl.javastart.main;

import pl.javastart.logic.PromoAssistant;
import pl.javastart.model.Product;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
//        Product[] products = new Product[10];

        Product[] products = new Product[5];
        products[0] = new Product("Banany", "chiquita", 4.20, 30); //product1 to referencja do obiektu Product
        products[1] = new Product("Marchew", "Marwit", 2.20, 50);
        products[2] = new Product("Cebula", "Cebulex", 100);
        products[3] = new Product("Czekolada", "Wedel", 5.00, 100);

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj nazwę produktu");
        String name = input.nextLine();
        System.out.println("Podaj nazwę producenta");
        String producer = input.nextLine();
        System.out.println("Podaj cenę");
        double price = input.nextDouble();
        System.out.println("Podaj ilość");
        int quantity = input.nextInt();
        products[4] = new Product(name, producer, price, quantity);

        System.out.println("All products: ");
        int i = 0;

        while (i < products.length) {
            if (products[i] != null) {
                products[i].show();
            }
            i++;
        }


        PromoAssistant promo = new PromoAssistant();
        i = 0;
        while (i < products.length) {
            if (i % 2 == 0) {
                promo.basicPromo(products[i]);
            }
            i++;
        }

        products[4].show();

    }
}

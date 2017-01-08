package pl.javastart.logic;

import pl.javastart.model.Product;

public class PromoAssistant {

    public void basicPromo(Product product) {
//        product.price = 0.75 * product.price;

//        double price = product.getPrice();
//        product.setPrice(0.75*price);
        if (product != null)
            product.setPrice(0.75 * product.getPrice());
    }
}

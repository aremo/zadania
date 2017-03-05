package pl.javastart.springshop;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }


}

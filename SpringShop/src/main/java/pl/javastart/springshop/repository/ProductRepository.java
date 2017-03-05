package pl.javastart.springshop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.javastart.springshop.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> productList;

    public ProductRepository() {
        productList = new ArrayList<>();

        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Maslo");
        product1.setPrice(BigDecimal.valueOf(3.5));
        productList.add(product1);

        productList.add(new Product(2L, "Coca cola", BigDecimal.valueOf(5.5)));
        productList.add(new Product(3L, "Chleb", BigDecimal.valueOf(3.29)));
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product findById(Long id) {
        return null;
    }
}

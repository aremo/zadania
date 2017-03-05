package pl.javastart.springshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.javastart.springshop.Product;
import pl.javastart.springshop.repository.ProductRepository;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {


    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("")
//    @GetMapping("/products")
    public String productList(Model model) {
        List<Product> allProducts = productRepository.getAllProducts();
        model.addAttribute("products", allProducts);
        model.addAttribute("title", "Super produkty");
        return "productList";
    }

    @GetMapping("/add")
    public String newProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "productNew";
    }

    @PostMapping("/add")
    public String addNewProduct(Product product) {
        productRepository.addProduct(product);
        return "productNew";
    }
}

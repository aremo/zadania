package pl.javastart.springshop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.springshop.Cart;
import pl.javastart.springshop.Product;
import pl.javastart.springshop.repository.ProductRepository;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private Cart cart;

    @GetMapping("/cart/add")
    public String addToCart(@RequestParam("id") Long id) {

        Product productToAdd = productRepository.findById(id);

        cart.add(productToAdd);

        // przekierowanie do wyświetlania zawartości koszyka zakupów
        return null;
    }

}

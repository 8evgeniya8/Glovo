package com.example.glovo.controller;

import com.example.glovo.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final List<Product> products = new ArrayList<>();
    private final AtomicInteger productIdSequence = new AtomicInteger();

    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        product.setId(productIdSequence.incrementAndGet());
        products.add(product);
        return product;
    }
}

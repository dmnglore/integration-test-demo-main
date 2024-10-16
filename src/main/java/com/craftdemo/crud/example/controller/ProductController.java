package com.craftdemo.crud.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.craftdemo.crud.example.entity.Product;
import com.craftdemo.crud.example.service.ProductService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        product = service.saveProduct(product);
        return product;
    }


    @GetMapping
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }


    @PutMapping("/update/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable int id) {
        return service.updateProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}

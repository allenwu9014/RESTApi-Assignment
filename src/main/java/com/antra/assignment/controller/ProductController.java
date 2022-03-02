package com.antra.assignment.controller;

import com.antra.assignment.domain.Product;
import com.antra.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    private ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/product/{productId}")
    public Product getProduct(@PathVariable Integer productId) {
        return productService.getProduct(productId);
    }

    @GetMapping(value = "/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/product")
    public void createProduct(@RequestParam("productId") Integer id, @RequestParam("productName") String name) {
        System.out.println("id: " + id + " name: " + name);
        productService.createProduct(id, new Product(id, name));
        System.out.println(productService.getAllProducts());
    }

    @DeleteMapping("/product/{productId}")
    public void deleteStay(@PathVariable Integer productId) {
        productService.deleteProduct(productId);
    }

    @PatchMapping("/product")
    public void updateProduct(@RequestParam("productId") Integer id, @RequestParam("productName") String name) {
        productService.updateProduct(id, new Product(id, name));
    }

}

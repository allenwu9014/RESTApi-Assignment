package com.antra.assignment.service;

import com.antra.assignment.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {


//    @Qualifier("ProductStorage")
    private Map<Integer, Product> productRepository;

    @Autowired
    public ProductService(Map<Integer, Product> productRepository) {
        this.productRepository = productRepository;

    }

    public Product getProduct(Integer id) {
        return productRepository.get(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.values().stream().collect(Collectors.toList());
        //do exception
    }

    public void deleteProduct(Integer id) {
        if (!productRepository.containsKey(id)) {
            return; // do exception
        }
        productRepository.remove(id);

    }

    public void updateProduct(Integer id, Product product) {
        if (!productRepository.containsKey(id)) {
            return; // do exception
        }
        productRepository.put(id, product);
    }
    public void createProduct(Integer id, Product product) {
        if (productRepository.containsKey(id)) {
            return; // do exception
        }
        productRepository.put(id, product);
    }

}

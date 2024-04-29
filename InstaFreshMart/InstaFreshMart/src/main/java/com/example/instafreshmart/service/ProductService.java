package com.example.instafreshmart.service;

import com.example.instafreshmart.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    void deleteProduct(String id);

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> getProductById(String id);

//    List<Product> findByText(String text);
}

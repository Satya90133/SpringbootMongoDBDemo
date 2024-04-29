package com.example.instafreshmart.service.Impl;

import com.example.instafreshmart.model.Product;
import com.example.instafreshmart.repository.ProductRepository;
import com.example.instafreshmart.service.ProductService;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}

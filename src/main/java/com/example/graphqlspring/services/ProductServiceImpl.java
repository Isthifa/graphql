package com.example.graphqlspring.services;

import com.example.graphqlspring.entity.Product;
import com.example.graphqlspring.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long id,Float price) {
        Product existingProduct = productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        existingProduct.setPrice(price);
        return productRepo.save(existingProduct);
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<Product> getByCategoryName(String category) {
        return productRepo.findByCategory(category);
    }
}

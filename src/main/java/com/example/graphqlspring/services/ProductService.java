package com.example.graphqlspring.services;

import com.example.graphqlspring.entity.Product;

import java.util.List;

public interface ProductService {
     List<Product> getAllProducts();
     Product getProductById(Long id);
     Product saveProduct(Product product);
     Product updateProduct(Long id,Float price);
     void deleteProduct(Long id);

     List<Product> getByCategoryName(String category);
}

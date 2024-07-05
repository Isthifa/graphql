package com.example.graphqlspring.controller;

import com.example.graphqlspring.entity.Product;
import com.example.graphqlspring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;


    @QueryMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @QueryMapping
    public List<Product> getByCategoryName(@Argument String category){
        return productService.getByCategoryName(category);
    }

    @MutationMapping
    public Product updateProductPrice(@Argument Long id, @Argument Float price){
        return productService.updateProduct(id,price);
    }



}

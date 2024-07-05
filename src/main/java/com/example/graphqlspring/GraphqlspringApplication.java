package com.example.graphqlspring;

import com.example.graphqlspring.entity.Product;
import com.example.graphqlspring.repository.ProductRepo;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphqlspringApplication {

    Logger log = LoggerFactory.getLogger(GraphqlspringApplication.class);
  /*  @Autowired
    private ProductRepo productRepo;

    @PostConstruct
    public void initDB(){
        log.info("Loading Data into H2 Database");
        List<Product> product1 = Stream.of(
                new Product("Laptop", 1000.0, "Electronics"),
                new Product("Mobile", 500.0, "Electronics"),
                new Product("TV", 2000.0, "Electronics"),
                new Product("Watch", 100.0, "Fashion"),
                new Product("Shirt", 50.0, "Fashion"),
                new Product("Shoe", 80.0, "Fashion"),
                new Product("Book", 5.0, "Stationary"),
                new Product("Pen", 2.0, "Stationary"),
                new Product("Pencil", 1.0, "Stationary")
        ).collect(Collectors.toList());
        log.info("Product: "+product1);
        productRepo.saveAll(product1);
    } */

    public static void main(String[] args) {
        SpringApplication.run(GraphqlspringApplication.class, args);
    }

}

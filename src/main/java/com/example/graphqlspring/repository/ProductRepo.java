package com.example.graphqlspring.repository;

import com.example.graphqlspring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

    List<Product> findByCategory(String category);
}

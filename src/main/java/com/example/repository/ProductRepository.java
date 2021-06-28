package com.example.repository;

import com.example.enity.Product;
import com.example.enity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

package com.javaminds.product.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaminds.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}

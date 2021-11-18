package com.romulopereira.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romulopereira.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

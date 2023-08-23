package com.app.prav.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.prav.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

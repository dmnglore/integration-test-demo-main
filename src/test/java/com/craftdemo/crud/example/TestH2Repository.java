package com.craftdemo.crud.example;

import org.springframework.data.jpa.repository.JpaRepository;

import com.craftdemo.crud.example.entity.Product;

public interface TestH2Repository extends JpaRepository<Product,Integer> {
}

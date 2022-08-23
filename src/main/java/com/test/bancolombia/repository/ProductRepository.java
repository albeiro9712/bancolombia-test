package com.test.bancolombia.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.test.bancolombia.domain.Product;

@EnableScan
public interface ProductRepository extends CrudRepository<Product, Integer> {
    
}

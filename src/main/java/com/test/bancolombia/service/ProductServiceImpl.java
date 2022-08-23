package com.test.bancolombia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.bancolombia.domain.Product;
import com.test.bancolombia.repository.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ProductServiceImpl implements IProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Flux<Product> getAllProducts() {
        return Flux.fromIterable(productRepository.findAll())
        .switchIfEmpty(Flux.empty());
    }

    @Override
    public Mono<Product> addProduct(Product newProduct) {
        return Mono.justOrEmpty(productRepository.save(newProduct));
    }
   
}

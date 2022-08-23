package com.test.bancolombia.service;

import com.test.bancolombia.domain.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {
    
    Flux<Product> getAllProducts();
    Mono<Product> addProduct(Product newProduct);
    
}

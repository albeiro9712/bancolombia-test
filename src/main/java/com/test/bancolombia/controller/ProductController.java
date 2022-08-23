package com.test.bancolombia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.bancolombia.domain.Product;
import com.test.bancolombia.service.IProductService;

import reactor.core.publisher.Mono;

@RestController
public class ProductController {
    
    private IProductService iProductService;

    @Autowired
    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    @PostMapping("/product")
    public Mono<Product> addNewProduct(@RequestBody Product newProduct) {
        return iProductService.addProduct(newProduct);
    }
    
}

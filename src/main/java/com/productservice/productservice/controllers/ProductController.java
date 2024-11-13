package com.productservice.productservice.controllers;

import com.productservice.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId){
        return new Product();
    }
    @GetMapping
    public List<Product> getAllProduct(){
        return new ArrayList<>();
    }
    @PostMapping
    public Product createProduct(){
        return new Product();
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long productId){

    }
    @PutMapping("/{id}")
    public void replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }
    @PatchMapping("/{id}")
    public void updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }

}

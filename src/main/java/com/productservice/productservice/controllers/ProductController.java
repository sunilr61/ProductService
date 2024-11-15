package com.productservice.productservice.controllers;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.services.FakeStoreProductService;
import com.productservice.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId){
        return productService.getSingleProduct(productId);
    }

    @GetMapping
    public List<Product> getAllProduct(){

        return productService.getAllProduct();
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

package com.productservice.productservice.services;

import com.productservice.productservice.exceptions.ProductNotFoundException;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repositories.CategoryRepository;
import com.productservice.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Primary
public class SelfProductService implements ProductService{
    private ProductRepository productRepository;
    //private CategoryRepository categoryRepository;
    @Autowired
    public SelfProductService(ProductRepository productRepository
                              //CategoryRepository categoryRepository
                              ){
        this.productRepository=productRepository;
        //this.categoryRepository=categoryRepository;
    }
    @Override
    public Product getSingleProduct(Long productId)  {
        Optional<Product> productOptional = productRepository.findById(productId);
        if(productOptional.isEmpty()){
            throw new RuntimeException("Product not found");
        }
        Product product = productOptional.get();
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    @Override
    public Product createProduct(Product Product) {
        return null;
    }

    @Override
    public void DeleteProduct(Long ProductId) {

    }
}

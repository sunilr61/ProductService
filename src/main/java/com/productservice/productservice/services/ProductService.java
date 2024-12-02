package com.productservice.productservice.services;

import com.productservice.productservice.exceptions.ProductNotFoundException;
import com.productservice.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public interface ProductService {
    public Product getSingleProduct(Long productId);
    public List<Product> getAllProduct();
    public Product createProduct(@RequestBody Product Product);
    public void DeleteProduct(Long ProductId);

}

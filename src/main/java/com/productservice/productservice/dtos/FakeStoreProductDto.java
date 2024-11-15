package com.productservice.productservice.dtos;

import com.productservice.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long Id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String imageURL;
}
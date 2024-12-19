package com.scaler.productservicejune24.controllers;

import com.scaler.productservicejune24.models.Product;
import com.scaler.productservicejune24.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    // instead of direct fakestoreservice we use productService here
    private ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/products/10
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }


    public List<Product> getAllProducts() {
        return new ArrayList<>();
//        return productService.getAllProducts();

    }

}
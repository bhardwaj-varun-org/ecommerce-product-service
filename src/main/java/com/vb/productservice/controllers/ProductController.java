package com.vb.productservice.controllers;

import com.vb.productservice.Constants;
import com.vb.productservice.models.Product;
import com.vb.productservice.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(Constants.PRODUCTS_ENDPOINT)
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAllProducts();
    }

}

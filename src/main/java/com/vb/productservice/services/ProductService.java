package com.vb.productservice.services;

import com.vb.productservice.models.Product;
import com.vb.productservice.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }
}

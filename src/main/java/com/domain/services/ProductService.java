package com.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.models.entities.Product;
import com.domain.models.repos.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired    
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product); // productRepo adalah sebuat object repository
    }

    public Product findOne(Long id) {
        return productRepo.findById(id).get(); // productRepo adalah sebuat object repository
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll(); // productRepo adalah sebuat object repository
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }
}

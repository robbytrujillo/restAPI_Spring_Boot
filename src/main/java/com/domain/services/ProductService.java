package com.domain.services;

import java.util.List;
import java.util.Optional;

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
        Optional<Product> product = productRepo.findById(id);
        if(!product.isPresent()) {
            return null;
        }
        return product.get(); // productRepo adalah sebuat object repository
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll(); // productRepo adalah sebuat object repository
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }

    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }
}

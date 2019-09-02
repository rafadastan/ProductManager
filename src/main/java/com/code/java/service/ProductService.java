package com.code.java.service;

import com.code.java.model.Product;
import com.code.java.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository repo;

    public List<Product> listAll(){
        return repo.findAll();
    }
    public void save(Product product){
        repo.save(product);
    }

    public Product get(Long id){
        return repo.findById(id).get();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}

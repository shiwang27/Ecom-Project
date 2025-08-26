package com.WebProject.Ecom_Project.Service;

import com.WebProject.Ecom_Project.Repository.ProductRepo;
import com.WebProject.Ecom_Project.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product>  getAllProducts() {
        return repo.findAll();
    }
}

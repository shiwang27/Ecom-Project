package com.WebProject.Ecom_Project.Controller;

import com.WebProject.Ecom_Project.Service.ProductService;
import com.WebProject.Ecom_Project.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet() {
        return "Hello World!";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();

    }
}

package com.ibm.spring.core.annotations.streotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class OrderService {

    //Field Injection: No setter and Getter is necessary
    @Autowired
    private ProductService productService;

    public List<String> findAll() {
        return List.of("order1", "Order2");
    }

    public List<String> getProducts() {
        return productService.findAllProducts();
    }
}

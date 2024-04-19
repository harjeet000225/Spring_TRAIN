package com.ibm.spring.core.annotations.streotypes;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class ProductService {

    public List<String> findAllProducts() {
        return List.of("Product1", "Product2", "Product3");
    }
}

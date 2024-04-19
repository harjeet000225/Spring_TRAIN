package com.ibm.spring.core.javaconfig;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public String getCustomer() {
        return "Customer!!!";
    }
}

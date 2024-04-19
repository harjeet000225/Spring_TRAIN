package com.ibm.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class CustomerConfig {
    @Bean
    public  CustomerService createCustomerService(){
        return  new CustomerService();
    }
}

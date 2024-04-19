package com.ibm.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class OrderConfig {

    @Bean
    public OrderService createOrderService() {
        return new OrderService();
    }
}

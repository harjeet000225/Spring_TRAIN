package com.ibm.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //beans
@Import({HelloConfig.class, CustomerConfig.class, OrderConfig.class})
public class AppConfig {

    //<bean id="hello" class="com.ibm.spring.core.javaconfig.Hello"/>
//    @Bean
//    public Hello createHello() {
//        return new Hello();
//    }
//
//    @Bean
//    public CustomerService createCustomer() {
//        return new CustomerService();
//    }
//
//    @Bean
//    public OrderService createOrderService() {
//        return new OrderService();
//    }
}

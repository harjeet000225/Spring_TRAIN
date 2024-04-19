package com.ibm.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ibm")
public class AppConfig {

    //Bean
    @Bean
    public User createUser(){
        return  new User();
    }
}

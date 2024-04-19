package com.ibm.spring.core.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    public String sayHello() {
        return "Hello";
    }
}

package com.ibm.springbootbasics.beans;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello() {
        return "Hello";
    }
}

package com.ibm.web.api.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private Environment environment;

    public String sayHello() {
        return environment.getProperty("hello.message", "How are you");
    }
}

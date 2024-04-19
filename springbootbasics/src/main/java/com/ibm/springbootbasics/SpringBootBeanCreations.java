package com.ibm.springbootbasics;

import com.ibm.springbootbasics.beans.HelloService;
import com.ibm.springbootbasics.beans.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBeanCreations {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootBeanCreations.class);
        var hello = context.getBean(HelloService.class);
        System.out.println(hello.sayHello());
        var user = context.getBean(User.class);
        System.out.println(user);
    }
}

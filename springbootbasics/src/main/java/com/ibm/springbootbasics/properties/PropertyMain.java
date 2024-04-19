package com.ibm.springbootbasics.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertyMain {
    public static void main(String[] args) {
        var context = SpringApplication.run(PropertyMain.class);
        var greeter = context.getBean(Greeter.class);
        System.out.println(greeter.getMessage());
        System.out.println(greeter.getInfo());

        System.out.println(greeter.getConfig());

    }
}

package com.ibm.springbootbasics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineInterfaceDemo implements CommandLineRunner {
    public static void main(String[] args) {
        var context = SpringApplication.run(CommandLineInterfaceDemo.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("something... is being initalized");
    }
}

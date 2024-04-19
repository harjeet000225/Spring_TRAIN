package com.ibm.springbootbasics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class CommandLineRunnerBean {
    public static void main(String[] args) {
        var context = SpringApplication.run(CommandLineRunnerBean.class);

    }

    @Bean
    public CommandLineRunner runner() {
        return args -> System.out.println("Bean runner is initialized");
    }
}

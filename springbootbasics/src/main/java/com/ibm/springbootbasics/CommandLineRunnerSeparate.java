package com.ibm.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerSeparate {
    public static void main(String[] args) {
        var context = SpringApplication.run(CommandLineRunnerSeparate.class);
    }
}

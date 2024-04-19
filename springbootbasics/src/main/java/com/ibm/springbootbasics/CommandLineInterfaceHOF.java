package com.ibm.springbootbasics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineInterfaceHOF {
    public static void main(String[] args) {
        var context = SpringApplication.run(CommandLineRunnerSeparate.class);
        try {
            runner().run("");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //separate method
    public static  CommandLineRunner runner() {
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                System.out.println("runner is initialized");
//            }
//        };
        //lambda version
        return args -> System.out.println("runner is initialized");
    }
}

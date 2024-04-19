package com.ibm.springbootbasics.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineInterfaceFunctionalStyle {
    public static void main(String[] args) throws Exception {
        var context = SpringApplication.run(CommandLineInterfaceFunctionalStyle.class);

//        var r=new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                System.out.println("something is initalized");
//               System.out.println(args);
//            }
//        };
//        r.run("hello , run");
//        new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                System.out.println("something is initalized");
//                System.out.println(args);
//            }
//        }.run();
        //r.run("hello , run");
        ((CommandLineRunner) args1 -> {
            System.out.println("something is initalized");
            System.out.println(args1);
        }).run();

    }
}

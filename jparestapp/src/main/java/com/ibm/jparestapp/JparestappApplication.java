package com.ibm.jparestapp;

import com.ibm.jparestapp.entity.Customer;
import com.ibm.jparestapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JparestappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JparestappApplication.class, args);
    }

    @Bean
    public CommandLineRunner create(CustomerRepository repository) {
        return (args) -> {
            repository.save(new Customer("Subramaian", "Murugan"));
            repository.save(new Customer("Murugan", "Palanisamy"));
            repository.save(new Customer("Geetha", "Subramaian"));
        };
    }
}

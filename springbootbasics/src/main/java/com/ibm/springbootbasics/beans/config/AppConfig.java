package com.ibm.springbootbasics.beans.config;

import com.ibm.springbootbasics.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("1", "Subramanian");
    }
}

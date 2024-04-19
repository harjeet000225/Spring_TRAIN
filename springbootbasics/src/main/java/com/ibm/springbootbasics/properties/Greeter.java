package com.ibm.springbootbasics.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Greeter {

    @Value("${greeter.message}")
    private String message;

    @Value("${greeter.name}")
    private String name;

    @Autowired
    private Environment environment;

    //Inject Configuration class
    @Autowired
    private AppConfiguration appConfiguration;

    public String getMessage() {
        return message + name;
    }

    public String getInfo() {
        return environment.getProperty("greeter.message", "Hey");
    }

    public String getConfig() {
        return appConfiguration.getName() + " " + appConfiguration.getAuthor();
    }
}

package com.ibm.spring.core.beans.lifecycles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycles {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans-lifecycle.xml");
//        context.getBean(DatabaseConnection.class);

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans-lifecycle.xml");
        context.getBean(DatabaseConnection.class);

        context.registerShutdownHook();
    }
}

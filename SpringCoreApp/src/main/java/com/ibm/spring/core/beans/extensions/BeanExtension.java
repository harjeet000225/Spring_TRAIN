package com.ibm.spring.core.beans.extensions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanExtension {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-extensions.xml");
        Hello hello = context.getBean(Hello.class);

    }
}

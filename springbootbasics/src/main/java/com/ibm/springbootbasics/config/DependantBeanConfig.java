package com.ibm.springbootbasics.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependantBeanConfig {

    @Bean
    public OptionalBean optionalBean() {
        return new OptionalBean();
    }

    @Bean
    //@ConditionalOnMissingBean(OptionalBean.class)
    @ConditionalOnBean(OptionalBean.class)
    //create this bean(DependantBean only if  Optional Bean is Avaliable, if not dont create
    public DependantBean dependantBean() {
        return new DependantBean();
    }


}

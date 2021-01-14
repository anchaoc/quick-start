package com.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author anchao
 */
@Configuration
public class PersonConfig {


    @Bean(name="person")
    public Person person(){
        return new Person();
    }
}

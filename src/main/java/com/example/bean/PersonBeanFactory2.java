package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author anchao
 */
@Component
public class PersonBeanFactory2 implements ApplicationContextAware {
    private static ApplicationContext application;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        application = applicationContext;
    }

    public static Person getPerson(){
        return (Person) application.getBean("person");
    }

}

package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author anchao
 */
@Component
public class PersonBeanFactory3 implements ApplicationListener<ContextRefreshedEvent> {
   private static ApplicationContext applicationContext;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        applicationContext = event.getApplicationContext();
    }

    public static Person getPerson(){
        return (Person) applicationContext.getBean("person");
    }

}

package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

@Component
public class PersonBeanFactory implements BeanFactoryAware {

    private static BeanFactory bean;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        bean = beanFactory;
    }

    public static Person getPerson(){
        return (Person) bean.getBean("person");
    }


}

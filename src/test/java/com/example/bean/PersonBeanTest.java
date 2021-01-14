package com.example.bean;

import com.example.BaseTest;
import org.junit.jupiter.api.Test;

public class PersonBeanTest extends BaseTest {

    @Test
    public void test(){
        Person person = PersonBeanFactory.getPerson();
        System.out.println(person);
    }
    @Test
    public void test2(){
        Person person = PersonBeanFactory2.getPerson();
        System.out.println(person);
    }
}

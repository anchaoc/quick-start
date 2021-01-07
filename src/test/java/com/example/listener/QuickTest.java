package com.example.listener;

import com.example.QuickStartApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = QuickStartApplication.class)
public class QuickTest {

    @Resource
    ApplicationContext applicationContext;

    @Test
    public void test() throws InterruptedException {
        HelloEvent helloEvent = new HelloEvent("hello", "spring");
        applicationContext.publishEvent(helloEvent);
        applicationContext.publishEvent(helloEvent);
        applicationContext.publishEvent(helloEvent);
        System.out.println("ok");
        Thread.sleep(5000);
    }
}

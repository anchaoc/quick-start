package com.example.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class QuickListener implements ApplicationListener<HelloEvent> {

    @Override
    public void onApplicationEvent(HelloEvent event) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("QuickListener event:{}",event.toString());
    }
}

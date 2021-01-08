package com.example.thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AsyncService {

    @Async
    public void asyncTask(){
        log.info("线程名称：{}",Thread.currentThread().getName());
    }
}

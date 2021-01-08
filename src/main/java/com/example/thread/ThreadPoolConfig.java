package com.example.thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
@Slf4j
@Configuration
public class ThreadPoolConfig {

    @Value("${qs.threadPool.coreSize}")
    private int coreSize;
    @Value("${qs.threadPool.maxSize}")
    private int maxSize;
    @Value("${qs.threadPool.name}")
    private String name;


    @Bean(name="qsThreadPoolExecutor")
    public Executor getThreadPoolTaskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(coreSize);
        executor.setMaxPoolSize(maxSize);
        executor.setQueueCapacity(100);
        executor.setKeepAliveSeconds(2);
        executor.setThreadNamePrefix(name);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        log.info("线程池:{}初始化完成," +
                "coreSize:{},maxSize:{}",name,coreSize,maxSize);
        return executor;
    }
}

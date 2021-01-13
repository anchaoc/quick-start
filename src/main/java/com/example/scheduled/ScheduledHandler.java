package com.example.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author anchao
 */
@Slf4j
public class ScheduledHandler {

    @Scheduled(cron = "*/5 * * * * ?")
    public void test(){
        log.info("ScheduledHandler 每 5秒 执行一次");
    }


}

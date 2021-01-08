package com.example.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RetryService {

    private int num;

    /**
     * 重试业务
     * @return
     */
    @Retryable(value = {IllegalArgumentException.class},maxAttempts = 5,backoff = @Backoff(delay = 1000L, multiplier = 1))
    public int call(){
        num++;
        log.info("第：{}次重试",num);
        throw new IllegalArgumentException(String.valueOf(num));
    }

    @Recover
    public int recover(IllegalArgumentException illegalArgumentException){
        log.error("重试次数:{}已使用完，重试失败",illegalArgumentException.getMessage(),illegalArgumentException);
        return this.num;
    }
}

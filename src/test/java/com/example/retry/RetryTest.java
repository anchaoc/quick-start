package com.example.retry;

import com.example.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

public class RetryTest extends BaseTest {

    @Resource
    RetryService retryService;

    @Test
    public void test(){
        retryService.call();
    }

}

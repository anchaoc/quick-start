package com.example.thread;

import com.example.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

public class AsyncServiceTest extends BaseTest {
    @Resource
    AsyncService asyncService;

    @Test
    public void test(){
        asyncService.asyncTask();
    }
}

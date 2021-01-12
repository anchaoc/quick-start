package com.example.test;

import org.junit.Test;

/**
 * 跳出循环测试
 */
public class LoopTest {

    @Test
    public void testForLoop() {
        long timeOutTime=2000L;
        long startTime = System.currentTimeMillis();
        for (;;){
            long endTime = System.currentTimeMillis();
            long timeDifference = endTime-startTime;
            if (timeDifference>timeOutTime) {
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testWhileLoop(){
        long timeOutTime=2000L;
        long startTime = System.currentTimeMillis();
        long timeDifference=0;
        while (timeDifference<timeOutTime){
            long endTime2 = System.currentTimeMillis();
             timeDifference = endTime2-startTime;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

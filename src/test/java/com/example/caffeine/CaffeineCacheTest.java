package com.example.caffeine;

import org.junit.Test;

public class CaffeineCacheTest {



    @Test
    public void test(){
        CaffeineCache caffeineCache = new CaffeineCache();
        Object acObject = caffeineCache.manulOperator("ac");
        System.out.println(acObject);
    }
}

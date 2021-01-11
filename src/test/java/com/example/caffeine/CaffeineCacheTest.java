package com.example.caffeine;

import com.example.exception.CaffeineException;
import com.example.exception.ExceptionEnum;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CaffeineCacheTest {



    @Test
    public void test() throws ExecutionException, InterruptedException {
        CaffeineCache caffeineCache = new CaffeineCache();
        Object acObject = caffeineCache.asyncOperator("ac");
        if ((acObject instanceof CompletableFuture)) {
            CompletableFuture<String> completableFuture = ((CompletableFuture<String>) acObject);
            completableFuture.thenApply(String::toUpperCase).thenAccept(System.out::println);
        }
        System.out.println(acObject);
        Thread.sleep(1000L);
        throw new CaffeineException(ExceptionEnum.FAIL);
    }
}

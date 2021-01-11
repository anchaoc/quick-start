package com.example.caffeine;

import com.github.benmanes.caffeine.cache.AsyncLoadingCache;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Caffeine Cache提供了三种缓存填充策略：手动、同步加载和异步加载。
 */
public class CaffeineCache {

    /**
     * 手动加载
     * @param key
     * @return
     */
    public Object manulOperator(String key) {
        Cache<String, Object> cache = Caffeine.newBuilder()
                .expireAfterWrite(1, TimeUnit.SECONDS)
                .expireAfterAccess(1, TimeUnit.SECONDS)
                .maximumSize(10)
                .build();
        //如果一个key不存在，那么会进入指定的函数生成value
        Object value = cache.get(key, t -> setValue(key).apply(key));
        cache.put("hello",value);

        //判断是否存在如果不存返回null
        Object ifPresent = cache.getIfPresent(key);
        //移除一个key
        cache.invalidate(key);
        return value;
    }

    public Function<String, Object> setValue(String key){
        return t -> key + "value";
    }



    /**
     * 同步加载
     * @param key
     * @return
     */
    public Object syncOperator(String key){
        LoadingCache<String, Object> cache = Caffeine.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .build(k -> setValue2(key).apply(key));
        return cache.get(key);
    }

    public Function<String, Object> setValue2(String key){
        return t -> key + "value";
    }



    /**
     * 异步加载
     *
     * @param key
     * @return
     */
    public Object asyncOperator(String key){
        AsyncLoadingCache<String, Object> cache = Caffeine.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .buildAsync(k -> setAsyncValue(key).get());

        return cache.get(key);
    }

    public CompletableFuture<Object> setAsyncValue(String key){
        return CompletableFuture.supplyAsync(() -> {
            return key + "value";
        });
    }
}

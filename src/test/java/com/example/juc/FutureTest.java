package com.example.juc;

import java.util.concurrent.CompletableFuture;

/**
 * TODO
 *
 * @author anchao
 * @since 1.0
 */
public class FutureTest {

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        new Thread(()->{
            try {
                Thread.sleep(1000L);
                completableFuture.complete("result");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        completableFuture.whenComplete((s,ex)->{
            System.out.println("s:"+s);
            System.out.println("ex"+ex.getMessage());
        });
        System.out.println("ok");
    }
}

package com.example.test;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * TODO
 *
 * @author anchao
 * @since 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        HashMap<Integer, BigDecimal> hashMap = new HashMap<>();
        hashMap.put(1, BigDecimal.ONE);
        BigDecimal value = hashMap.get(Long.valueOf(1).intValue());
        System.out.println(value);
    }
}

package com.example.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorStreamTest {

    /**
     * 排序去重复转链表
     */
    @Test
    public  void test1() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 100; i >0; i--) {
            integerArrayList.add(i);
        }
        LinkedList<Integer> orderList = integerArrayList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toCollection(()
                        -> new TreeSet<Integer>(Comparator.naturalOrder())), LinkedList::new));
        System.out.println(orderList);

    }

    /**
     * 测试流累加
     */
    @Test
    public void test2(){
        int sumNumber = IntStream.iterate(1, x -> x + 1).limit(500000000).reduce(0,Integer::sum);
        System.out.println(sumNumber);
    }

    /**
     * 测试for累加
     */
    @Test
    public void test3(){
        int sumNumber=0;
        for (int i = 1; i <=500000000 ; i++) {
            sumNumber+=i;
        }
        System.out.println(sumNumber);
    }

}

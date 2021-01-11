package com.example.test;

import cn.hutool.core.collection.CollUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorStreamTest {

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

    @Test
    public void test2(){
        ArrayList<Integer> arrayList = CollUtil.newArrayList(1, 3, 4, 5, 2, 8);
    }

}

package com.example.quick;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 100; i >0; i--) {
            integerArrayList.add(i);
        }
        LinkedList<Integer> orderList = integerArrayList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<Integer>(Comparator.naturalOrder())), LinkedList::new));
        System.out.println(orderList);

    }
}

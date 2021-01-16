package com.example.bean.map;

import com.example.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class InterfaceTest extends BaseTest {

    @Autowired
    Map<String,Interface> interfaceMap;

    @Test
    public void test(){
        if (interfaceMap ==null) {
            System.out.println("null");
        }
        Interface a = interfaceMap.get("b");
        System.out.println("b:"+a);
    }
}
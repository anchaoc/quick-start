package com.example.test;

public class RewriteTestChild extends RewriteTest{

    @Override
    protected Object A() {
        System.out.println("执行子类重写的A方法");
        return new Object();
    }
}

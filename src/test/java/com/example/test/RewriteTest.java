package com.example.test;

import org.junit.Test;

/**
 * 重写测试
 */
public class RewriteTest {

    @Test
    public void test(){
        RewriteTest rewriteTest = new RewriteTestChild();
        Object a = rewriteTest.A();
        System.out.println("result:"+a);
    }




    protected Object A(){
        System.out.println("执行父类A方法");
        return null;
    }



}

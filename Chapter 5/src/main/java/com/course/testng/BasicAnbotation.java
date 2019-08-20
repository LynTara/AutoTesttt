package com.course.testng;

import org.testng.annotations.*;

public class BasicAnbotation {
    //最基本的注解，用来标记方法为测试部分
    @Test
    public void testCase1(){
       System.out.println("这是测试用例1");
       System.out.printf("Thread ID: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMthod是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("Beforeclass是在类运行之前运行的");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("AfterClass是在类运行之后运行的");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("AfterSuite测试套件");

    }



}

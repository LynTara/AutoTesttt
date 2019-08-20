package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端租的测试方法1111111111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端租的测试方法22222222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端租的测试方法333333333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端租的测试方法444444444444");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnServer(){
        System.out.println("这是客户端运行之前的测试方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnServer(){
        System.out.println("这是客户端运行之后的测试方法!!!!!!!!!");

    }

}

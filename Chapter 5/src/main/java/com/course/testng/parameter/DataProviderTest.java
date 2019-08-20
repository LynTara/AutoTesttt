package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider="data")
    public void testDataProvider(String name,int age){
        System.out.println("name=" + name + "; age=" + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object [][] AA = new Object[][]{
                {"xiaoyi",10},
                {"xiaoer",20}
        };
        return AA;
    }

    @Test(dataProvider="methodData")
    public void test3(String name,int age){
        System.out.println("test1111方法 name=" + name + ";  age=" + age);
    }
    @Test(dataProvider="methodData")
    public void test4(String name,int age){
        System.out.println("test2222方法 name=" + name + ";  age=" + age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"linzhu",25},
                    {"shazhu",26}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"keaizhu",27},
                    {"shahuz",30}
            };
        }else{
            result = new Object[][]{
                    {"没找到指定test方法",100}
            };
        }
        return result;
    }
}

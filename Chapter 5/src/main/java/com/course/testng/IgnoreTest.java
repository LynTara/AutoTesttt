package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test(enabled = true)
    public void Ignore1(){
        System.out.println("Ignore1执行");
    }
    @Test(enabled = false)
    public void Ignore2(){
        System.out.println("Ignore2执行");
    }
    @Test(enabled = true)
    public void Ignore3(){
        System.out.println("Ignore3执行");
    }
}

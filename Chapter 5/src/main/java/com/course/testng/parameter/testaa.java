package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testaa {
    @Test
    @Parameters("color")
    public void test1(String color){
        System.out.println(color+"11111111111111");
    }
}

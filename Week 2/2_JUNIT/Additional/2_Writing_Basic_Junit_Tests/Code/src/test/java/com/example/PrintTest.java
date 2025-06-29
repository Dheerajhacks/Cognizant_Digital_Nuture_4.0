package com.example;

import org.junit.Test;

public class PrintTest {
    Print obj = new Print();

    @Test
    public void testPrint(){
        String res = obj.print("hello");
        System.out.println(res);
    }

    @Test
    public void testToUpper(){
        String res = obj.toUpper("Hello WOrld.!!");
        System.out.println(res);
    }

    @Test
    public void testToLower(){
        String res = obj.toLower("Hello WoRld.!!");
        System.out.println(res);
    }

    @Test
    public void testLength(){
        int len = obj.length("Hello world..!!");
        System.out.println(len);
    }
}

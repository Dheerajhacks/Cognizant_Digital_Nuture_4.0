package com.example;

import org.junit.Test;

public class PrintTest {

    @Test
     public void testPrint() {
        Print printer = new Print();
        String result = printer.print("Hello");
        System.out.println(result);
    }
}

package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrintFixtureTest {

    private Print p;

    @Before
    public void setUp() {
        p = new Print();
        System.out.println("Setup executed");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown executed");
    }

    @Test
    public void testPrint_AAA() {
        
        String input = "JUnit";

        String result = p.print(input);

        assertEquals("JUnit", result);
    }
}

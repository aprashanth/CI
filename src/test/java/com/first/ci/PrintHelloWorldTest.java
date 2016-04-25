package com.first.ci;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by vadulasp on 3/30/16.
 */
public class PrintHelloWorldTest {


    @Test
    public void testPrintHelloWorld(){
        PrintHelloWorld p  = new PrintHelloWorld();
        String  s = p.print();
        assertNotNull(s);
        assertEquals("HelloWorld1", s);
    }
}

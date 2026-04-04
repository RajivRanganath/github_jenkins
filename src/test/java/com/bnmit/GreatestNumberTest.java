package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class GreatestNumberTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    void testGreatest() {
        GreatestNumber obj=new GreatestNumber();
        assertEquals(10,obj.findGreatest(10,5));
    }
}

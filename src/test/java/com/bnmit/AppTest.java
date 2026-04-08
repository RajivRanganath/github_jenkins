package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    void great() {
        App obj=new App();
        assertEquals(10,obj.find(5,10));
    }
}

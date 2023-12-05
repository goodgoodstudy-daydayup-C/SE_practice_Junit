package com.example.junit_lab_1;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeConditionTest {
//if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
    @Test
    // Test for the condition in Triang method
    public void testConditionInTriang1() {
        int result = Tritype.Triang(0, 0, 0);
        assertEquals(4, result);
    }

    @Test
    // Test for the condition in Triang method
    public void testConditionInTriang2() {
        int result = Tritype.Triang(0, 0, 1);
        assertEquals(4, result);
    }

    @Test
    // Test for the condition in Triang method
    public void testConditionInTriang3() {
        int result = Tritype.Triang(0, 1, 0);
        assertEquals(4, result);
    }

    @Test
    // Test for the condition in Triang method
    public void testConditionInTriang4() {
        int result = Tritype.Triang(1, 0, 0);
        assertEquals(4, result);
    }

    @Test
    // Test for the condition in Triang method
    public void testConditionInTriang5() {
        int result = Tritype.Triang(0, 1, 1);
        assertEquals(4, result);
    }

    @Test
    // Test for the condition in Triang method
    public void testConditionInTriang6() {
        int result = Tritype.Triang(1, 0, 1);
        assertEquals(4, result);
    }

    @Test
    // Test for the condition in Triang method
    public void testConditionInTriang7() {
        int result = Tritype.Triang(1, 1, 0);
        assertEquals(4, result);
    }

    @Test
    // Test for the condition in Triang method
    public void testConditionInTriang8() {
        int result = Tritype.Triang(1, 1, 1);
        assertEquals(3, result);
    }
}

package com.example.junit_lab_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeMCDCTest {

    @Test
    // Test for MC/DC coverage in Triang method
    public void testMCDCInTriang1() {
        int result;

        // else if (triOut == 1 && Side1+Side2 > Side3)
        result = Tritype.Triang(3, 3, 2);
        assertEquals(2, result);

        }
    @Test
    // Test for MC/DC coverage in Triang method
    public void testMCDCInTriang2() {
        int result;

        // else if (triOut == 1 && Side1+Side2 > Side3)
        result = Tritype.Triang(3, 3, 6);
        assertEquals(4, result);

    }

    @Test
    // Test for MC/DC coverage in Triang method
    public void testMCDCInTriang3() {
        int result;

        // else if (triOut == 1 && Side1+Side2 > Side3)
        result = Tritype.Triang(3, 4, 10);
        assertEquals(4, result);

    }
}

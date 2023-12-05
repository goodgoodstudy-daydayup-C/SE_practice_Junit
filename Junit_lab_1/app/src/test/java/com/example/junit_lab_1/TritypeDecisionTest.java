package com.example.junit_lab_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeDecisionTest {
    //    if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 ||
//    Side1+Side3 <= Side2)
    @Test
    // Test for the decision in the main method
    public void testDecisionInMain() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
    }

    @Test
    // Test for the decision in the main method
    public void testDecisionInMain2() {
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}

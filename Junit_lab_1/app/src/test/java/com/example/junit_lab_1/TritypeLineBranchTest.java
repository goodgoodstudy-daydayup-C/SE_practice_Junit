package com.example.junit_lab_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeLineBranchTest {

    @Test
    public void testTriangScalene() {
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    }

    @Test
    public void testTriangIsosceles() {
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(3, 3, 4));
    }

    @Test
    public void testTriangEquilateral() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
    }

    @Test
    public void testTriangNotATriangle() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
    }

    // 添加更多的测试用例以涵盖其他情况
}

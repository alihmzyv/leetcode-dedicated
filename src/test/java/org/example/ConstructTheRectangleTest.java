package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructTheRectangleTest {
    ConstructTheRectangle constructTheRectangle = new ConstructTheRectangle();

    @Test
    void constructRectangle() {
        int area = 4;
        int[] expected = new int[]{2, 2};
        int[] actual = constructTheRectangle.constructRectangle(area);
        assertArrayEquals(expected, actual);
    }

    @Test
    void constructRectangle2() {
        int area = 37;
        int[] expected = new int[]{37, 1};
        int[] actual = constructTheRectangle.constructRectangle(area);
        assertArrayEquals(expected, actual);
    }

    @Test
    void constructRectangle3() {
        int area = 122122;
        int[] expected = new int[]{427, 286};
        int[] actual = constructTheRectangle.constructRectangle(area);
        assertArrayEquals(expected, actual);
    }
}
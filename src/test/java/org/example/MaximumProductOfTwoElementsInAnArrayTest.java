package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductOfTwoElementsInAnArrayTest {
    MaximumProductOfTwoElementsInAnArray maximumProductOfTwoElementsInAnArray = new MaximumProductOfTwoElementsInAnArray();

    @Test
    void maxProductTest1() {
        int[] nums = {3, 4, 5, 2};
        int expected = 12;
        int actual = maximumProductOfTwoElementsInAnArray.maxProduct(nums);
        assertEquals(expected, actual);
    }
}
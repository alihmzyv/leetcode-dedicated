package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestContinuousIncreasingSubsequenceTest {
    LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequenceTest = new LongestContinuousIncreasingSubsequence();

    @Test
    void findLengthOfLCISTest1() {
        int[] nums = {1, 3, 5, 4, 7};
        int expected = 3;
        int actual = longestContinuousIncreasingSubsequenceTest.findLengthOfLCIS(nums);
        assertEquals(expected, actual);
    }
}
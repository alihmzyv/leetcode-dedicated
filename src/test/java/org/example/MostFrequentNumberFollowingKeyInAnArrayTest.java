package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MostFrequentNumberFollowingKeyInAnArrayTest {
    MostFrequentNumberFollowingKeyInAnArray mostFrequentNumberFollowingKeyInAnArray = new MostFrequentNumberFollowingKeyInAnArray();

    @Test
    void mostFrequentTest1() {
        int[] nums = {1, 100, 200, 1, 100};
        int key = 1;
        int expected = 100;
        int actual = mostFrequentNumberFollowingKeyInAnArray.mostFrequent(nums, key);
        assertEquals(expected, actual);
    }

    @Test
    void mostFrequentTest2() {
        int[] nums = {2, 2, 2, 2, 3};
        int key = 2;
        int expected = 2;
        int actual = mostFrequentNumberFollowingKeyInAnArray.mostFrequent(nums, key);
        assertEquals(expected, actual);
    }

    @Test
    void mostFrequentTest3() {
        int[] nums = {1, 1000, 2};
        int key = 1000;
        int expected = 2;
        int actual = mostFrequentNumberFollowingKeyInAnArray.mostFrequent(nums, key);
        assertEquals(expected, actual);
    }
}
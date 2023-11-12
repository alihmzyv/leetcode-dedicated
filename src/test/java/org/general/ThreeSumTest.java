package org.general;

import org.general.leetcode.ThreeSum;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    void threeSum() {
        int[] nums = {1, -1, -1, 0};
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertEquals(List.of(List.of(-1,0,1)), actual);
    }
}
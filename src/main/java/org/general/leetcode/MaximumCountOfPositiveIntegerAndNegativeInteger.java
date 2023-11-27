package org.general.leetcode;

import java.util.Arrays;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int len = nums.length;
        int numOfPos;
        int numOfNeg;
        int indexOfLastNegative = Arrays.binarySearch(nums, -1);
        int indexOfFirstPositive = Arrays.binarySearch(nums, 1);
        numOfNeg = Math.abs(indexOfLastNegative + 1);
        if (indexOfFirstPositive >= 0) {
            numOfPos = len - indexOfFirstPositive;
        } else {
            numOfPos = len + (indexOfFirstPositive + 1);
        }
        return Math.max(numOfPos, numOfNeg);
    }
}

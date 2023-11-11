package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestContinuousIncreasingSubsequence {
    // TODO: 11.11.23 search more
    public int findLengthOfLCIS(int[] nums) {
        int maxLengthOfContinuousIncreasingSubsequence = 0;
        int lengthOfCurrContinuousIncreasingSubsequence = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                maxLengthOfContinuousIncreasingSubsequence = 1;
                lengthOfCurrContinuousIncreasingSubsequence = 1;
            } else {
                int num = nums[index];
                int numBefore = nums[index - 1];
                if (num > numBefore) {
                    ++lengthOfCurrContinuousIncreasingSubsequence;
                    if (lengthOfCurrContinuousIncreasingSubsequence > maxLengthOfContinuousIncreasingSubsequence) {
                        maxLengthOfContinuousIncreasingSubsequence = lengthOfCurrContinuousIncreasingSubsequence;
                    }
                } else {
                    lengthOfCurrContinuousIncreasingSubsequence = 1;
                }
            }
        }
        return maxLengthOfContinuousIncreasingSubsequence;
    }
}

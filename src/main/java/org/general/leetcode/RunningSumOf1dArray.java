package org.general.leetcode;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int index = 0; index < nums.length; index++) {
            sum += nums[index];
            runningSum[index] = sum;
        }
        return runningSum;
    }
}

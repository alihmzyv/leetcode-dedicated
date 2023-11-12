package org.general.leetcode;

public class MaximumProductOfTwoElementsInAnArray {
    // TODO: 11.11.23 search why space complexity is high
    public int maxProduct(int[] nums) {
        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > greatest) {
                int tempGreatest = greatest;
                greatest = num;
                secondGreatest = tempGreatest;
            } else if (num > secondGreatest) {
                secondGreatest = num;
            }
        }
        return (greatest - 1) * (secondGreatest - 1);
    }
}

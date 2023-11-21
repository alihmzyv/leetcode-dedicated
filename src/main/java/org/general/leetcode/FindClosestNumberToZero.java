package org.general.leetcode;

public class FindClosestNumberToZero {
    public int findClosestNumber(int[] nums) {
        int closestNumberToZero = nums[0];
        int shortestDistanceToZero = Math.abs(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int distanceToZero = Math.abs(num);
            if (distanceToZero < shortestDistanceToZero) {
                closestNumberToZero = num;
                shortestDistanceToZero = distanceToZero;
            } else if (distanceToZero == shortestDistanceToZero) {
                if (num > closestNumberToZero) {
                    closestNumberToZero = num;
                }
            }
        }
        return closestNumberToZero;
    }
}

package org.general.leetcode;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int firstMax = nums[0];
        Integer secondMax = null;
        Integer thirdMax = null;

        for (int num : nums) {
            if (num > firstMax) {
                int tempFirstMax = firstMax;
                Integer tempSecondMax = secondMax;
                firstMax = num;
                secondMax = tempFirstMax;
                thirdMax = tempSecondMax;
            } else if (num < firstMax && (secondMax == null || num > secondMax)) {
                Integer tempSecondMax = secondMax;
                secondMax = num;
                thirdMax = tempSecondMax;
            } else if ((secondMax != null && num < secondMax) && (thirdMax == null || num > thirdMax)) {
                thirdMax = num;
            }
        }

        return thirdMax == null ? firstMax : thirdMax;
    }
}

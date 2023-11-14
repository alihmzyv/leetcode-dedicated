package org.general;

import java.util.*;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        int sumOfUnique = 0;
        Arrays.sort(nums);
        for (int index = 0; index < len; index++) {
            int num = nums[index];
            boolean numOccursOnce;
            if (index == 0) {
                numOccursOnce = num != nums[index + 1];
            } else if (index == len - 1) {
                numOccursOnce = nums[index - 1] != num;
            } else {
                numOccursOnce = nums[index - 1] != num && num != nums[index + 1];
            }

            if (numOccursOnce) {
                sumOfUnique += num;
            }
        }
        return sumOfUnique;
    }
}

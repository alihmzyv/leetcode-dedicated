package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> indexByNum = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            int complementary = target - num;
            Integer indexFound = indexByNum.get(complementary);
            if (indexFound == null) {
                indexByNum.put(num, index);
            } else {
                indices[0] = index;
                indices[1] = indexFound;
            }
        }
        return indices;
    }
}

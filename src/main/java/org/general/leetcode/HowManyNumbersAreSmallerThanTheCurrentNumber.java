package org.general.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        Map<Integer, Integer> numOfSmallerNumbersByNum = new HashMap<>();
        int[] numsCopy = Arrays.copyOf(nums, nums.length); //n
        Arrays.sort(numsCopy); //nlogn
        for (int index = 0; index < numsCopy.length; index++) { //n
            numOfSmallerNumbersByNum.putIfAbsent(numsCopy[index], index);
        }
        for (int index = 0; index < nums.length; index++) { //n
            result[index] = numOfSmallerNumbersByNum.get(nums[index]);
        }
        return result;
    }
}

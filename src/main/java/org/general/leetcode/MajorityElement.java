package org.general.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int majorityEl = 0;
        Map<Integer, Integer> numToOccurrence = new HashMap<>();
        for (int num : nums) {
            Integer occurrence = numToOccurrence.getOrDefault(num, 0);
            numToOccurrence.put(num, ++occurrence);
        }
        for (Map.Entry<Integer, Integer> numToOccurrenceEntry : numToOccurrence.entrySet()) {
            Integer occurrence = numToOccurrenceEntry.getValue();
            if (occurrence > len / 2) {
                majorityEl = numToOccurrenceEntry.getKey();
                break;
            }
        }
        return majorityEl;
    }

    public int majorityElementV2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

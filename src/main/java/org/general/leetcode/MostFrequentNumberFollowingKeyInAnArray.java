package org.general.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberFollowingKeyInAnArray {
    // TODO: 10.11.23 find more efficient solutions
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> countFollowingKeyByTarget = new HashMap<>();
        int maxFollowingTarget = Integer.MIN_VALUE;
        int maxFollowingCount = Integer.MIN_VALUE;

        for (int index = 0; index <= nums.length - 2; index++) {
            if (maxFollowingCount > nums.length - index) {
                return maxFollowingTarget;
            }
            int num = nums[index];
            if (num == key) {
                int target = nums[index + 1];
                int countFollowingBefore = countFollowingKeyByTarget.getOrDefault(target, 0);
                int countFollowingNow = ++countFollowingBefore;
                if (countFollowingNow > maxFollowingCount) {
                    maxFollowingTarget = target;
                    maxFollowingCount = countFollowingNow;
                }
                countFollowingKeyByTarget.put(target, countFollowingNow);
            }
        }

        return maxFollowingTarget;
    }
}

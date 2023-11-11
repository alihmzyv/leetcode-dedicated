package org.example;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new LinkedList<>();

        for (int index = 0; index <= nums.length - 3; index++) {
            int num = nums[index];
            if (num > 0) {
                break;
            };
            if (index > 0 && num == nums[index - 1]) {
                continue;
            }

            int leftPointer = index + 1;
            int rightPointer = nums.length - 1;

            while (leftPointer < rightPointer) {
                int leftVal = nums[leftPointer];
                int rightVal = nums[rightPointer];
                int sum = num + leftVal + rightVal;
                if (sum == 0) {
                    triplets.add(List.of(num, leftVal, rightVal));
                    ++leftPointer;
                    // TODO: 11.11.23 duplicate code, improve
                    while (leftPointer < rightPointer && nums[leftPointer] == leftVal) {
                        ++leftPointer;
                    }
                    --rightPointer;
                    while (leftPointer < rightPointer && nums[rightPointer] == rightVal) {
                        --rightPointer;
                    }
                } else if (sum < 0) {
                    ++leftPointer;
                    while (leftPointer < rightPointer && nums[leftPointer] == leftVal) {
                        ++leftPointer;
                    }
                } else {
                    --rightPointer;
                    while (leftPointer < rightPointer && nums[rightPointer] == rightVal) {
                        --rightPointer;
                    }
                }
            }
        }

        return triplets;
    }
}

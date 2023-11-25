package org.general.leetcode;

import java.util.*;
import java.util.stream.Stream;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new LinkedList<>();
        Map<Integer, Integer> numOfOccurrencesByNum1 = getNumOfOccurrencesByNum(nums1);
        for (int num : nums2) {
            Integer occurrenceInNums1 = numOfOccurrencesByNum1.getOrDefault(num, 0);
            if (occurrenceInNums1 != 0) {
                intersection.add(num);
                numOfOccurrencesByNum1.put(num, --occurrenceInNums1);
            }
        }
        return getArr(intersection);
    }

    //if arrays are sorted
    public int[] intersectV2(int[] nums1, int[] nums2) {
            int len1 = nums1.length;
            int len2 = nums2.length;
            List<Integer> intersection = new LinkedList<>();
//            Arrays.sort(nums1);
//            Arrays.sort(nums2);

            for (int pnt1 = 0, pnt2 = 0; pnt1 < len1 && pnt2 < len2; ) {
                int num1 = nums1[pnt1];
                int num2 = nums2[pnt2];
                if (num2 > num1) {
                    pnt1++;
                } else if (num1 > num2) {
                    pnt2++;
                } else {
                    intersection.add(num1);
                    pnt1++;
                    pnt2++;
                }
            }
            return getArr(intersection);
    }

    private Map<Integer, Integer> getNumOfOccurrencesByNum(int[] nums) {
        Map<Integer, Integer> numOfOccurrencesByNum = new HashMap<>();
        for (int num : nums) {
            numOfOccurrencesByNum.put(num, numOfOccurrencesByNum.getOrDefault(num, 0) + 1);
        }
        return numOfOccurrencesByNum;
    }

    private int[] getArr(List<Integer> list) {
        int[] result = new int[list.size()];
        int index = 0;
        for (Integer num : list) {
            result[index++] = num;
        }
        return result;
    }
}

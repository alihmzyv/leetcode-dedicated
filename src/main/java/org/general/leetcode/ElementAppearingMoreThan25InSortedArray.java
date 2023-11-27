package org.general.leetcode;

public class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int specialInteger = arr[0];
        for (int index = 0; index < len - 1;) {
            int from = index;
            int num = arr[index];
            while (index < len - 1 && arr[++index] == num);
            double fracOfOccurrence;
            if (arr[index] != num) {
                fracOfOccurrence = (double) (index - from) / len;
            } else {
                fracOfOccurrence = (double) (index - from + 1) / len;
            }
            if (fracOfOccurrence > 0.25) {
                specialInteger = num;
                break;
            }
        }
        return specialInteger;
    }
}

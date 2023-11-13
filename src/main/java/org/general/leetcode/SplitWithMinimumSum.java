package org.general.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SplitWithMinimumSum {
    public int splitNum(int num) {
        Integer[] digitsOfNum = getDigitsOf(num);
        int numOfDigits = digitsOfNum.length;
        Arrays.sort(digitsOfNum);
        int num1 = 0;
        int num2 = 0;
        for (int index = numOfDigits - 1, multiplier1 = 1, multiplier2 = 1; index >= 0; index--) {
            int digit = digitsOfNum[index];
            if (digit == 0) {
                break;
            }
            if (index % 2 == 0) {
                num1 += digit * multiplier1;
                multiplier1 *= 10;
            } else {
                num2 += digit * multiplier2;
                multiplier2 *= 10;
            }
        }
        return num1 + num2;
    }

    private Integer[] getDigitsOf(int num) {
        List<Integer> digits = new LinkedList<>();
        while (num != 0) {
            int digit = num % 10;
            digits.add(digit);
            num /= 10;
        }
        return digits.toArray(Integer[]::new);
    }
}

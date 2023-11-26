package org.general.leetcode;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> ROMAN_SYMBOL_TO_DECIMAL_DIGIT = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int decimal = 0;
        int len = s.length();
        if (len == 1) {
            return ROMAN_SYMBOL_TO_DECIMAL_DIGIT.get(s.charAt(0));
        } else {
            for (int index = 0; index < len; index++) {
                char romanSymbol = s.charAt(index);
                Integer decimalDigit = ROMAN_SYMBOL_TO_DECIMAL_DIGIT.get(romanSymbol);
                if (index < len - 1) {
                    char nextRomanSymbol = s.charAt(index + 1);
                    Integer nextDecimalDigit = ROMAN_SYMBOL_TO_DECIMAL_DIGIT.get(nextRomanSymbol);
                    if (nextDecimalDigit > decimalDigit) {
                        decimal -= decimalDigit;
                    }
                    else {
                        decimal += decimalDigit;
                    }
                } else {
                    decimal += decimalDigit;
                }
            }
        }
        return decimal;
    }
}

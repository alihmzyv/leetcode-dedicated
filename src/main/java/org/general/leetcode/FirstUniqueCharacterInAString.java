package org.general.leetcode;

import java.util.*;

public class FirstUniqueCharacterInAString {
    private static final char FIRST_LOWERCASE_ENGLISH_LETTER = 'a';

    public int firstUniqChar(String s) {
        int[] countOfOccurrence = new int[26];
        int len = s.length();

        for (int index = 0; index < len; index++) {
            char letter = s.charAt(index);
            ++countOfOccurrence[letter - FIRST_LOWERCASE_ENGLISH_LETTER];
        }

        for (int index = 0; index < len; index++) {
            if (countOfOccurrence[s.charAt(index) - FIRST_LOWERCASE_ENGLISH_LETTER] == 1) {
                return index;
            }
        }
        return - 1;
    }
}

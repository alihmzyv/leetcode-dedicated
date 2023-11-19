package org.general.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allowedUniqueSortedChars = getChars(allowed);
        for (String word : words) {
            int index = 0;
            for (; index < word.length(); index++) {
                if (!allowedUniqueSortedChars.contains(word.charAt(index))) {
                    break;
                }
            }
            if (index == word.length()) {
                count++;
            }
        }
        return count;
    }

    private Set<Character> getChars(String word) {
        Set<Character> chars = new HashSet<>();
        for (int index = 0; index < word.length(); index++) {
            chars.add(word.charAt(index));
        }
        return chars;
    }
}

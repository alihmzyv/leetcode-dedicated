package org.general.leetcode;

public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int pointer1 = 0;
        int pointer2 = len / 2;
        int countVowelsFirstHalf = 0;
        int countVowelsSecondHalf = 0;

        while (pointer1 < len / 2 && pointer2 < len) {
            char ch1 = s.charAt(pointer1);
            char ch2 = s.charAt(pointer2);
            if (isVowel(ch1)) {
                countVowelsFirstHalf++;
            }
            if (isVowel(ch2)) {
                countVowelsSecondHalf++;
            }
            if (countVowelsFirstHalf - countVowelsSecondHalf > len - pointer2 - 1 ||
                    countVowelsSecondHalf - countVowelsFirstHalf > len / 2 - pointer1 - 1) {
                return false;
            }
            pointer1++;
            pointer2++;
        }
        return countVowelsFirstHalf == countVowelsSecondHalf;
    }


    private boolean isVowel(char ch) {
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
}

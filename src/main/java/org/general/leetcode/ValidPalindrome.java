package org.general.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        for (int pnt1 = 0, pnt2 = s.length() - 1; pnt1 < pnt2; pnt1++, pnt2--) {
            char chPnt1 = s.charAt(pnt1);
            while (!isAlphaNumeric(chPnt1)) {
                if (pnt1 < pnt2) {
                    chPnt1 = s.charAt(++pnt1);
                } else {
                    return true;
                }
            }
            char chPnt2 = s.charAt(pnt2);
            while (!(isAlphaNumeric(chPnt2))) {
                if (pnt2 > pnt1) {
                    chPnt2 = s.charAt(--pnt2);
                } else {
                    return true;
                }
            }

            if (!equalsIgnoreCase(chPnt1, chPnt2)) {
                return false;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char ch) {
        return Character.isDigit(ch) || Character.isAlphabetic(ch);
    }

    private boolean equalsIgnoreCase(char ch1, char ch2) {
        return Character.toLowerCase(ch1) == Character.toLowerCase(ch2);
    }
}

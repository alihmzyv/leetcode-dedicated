package org.general.leetcode;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder shorterWordBuilder = new StringBuilder();
        StringBuilder longerWordBuilder = new StringBuilder();
        int word1ArrLen = word1.length;
        int word2ArrLen = word2.length;
        int longerArrLen = Math.max(word1ArrLen, word2ArrLen);
        int shorterArrLen = Math.min(word1ArrLen, word2ArrLen);
        String[] longerWordArr = longerArrLen == word1ArrLen ? word1 : word2;
        String[] shorterWordArr = longerArrLen == word1ArrLen ? word2 : word1;

        for (int index = 0; index < longerArrLen; index++) {
            String longerWordPart = longerWordArr[index];
            longerWordBuilder.append(longerWordPart);
            if (index < shorterArrLen) {
                String shorterWordPart = shorterWordArr[index];
                shorterWordBuilder.append(shorterWordPart);
            }
            if (shorterWordBuilder.length() == longerWordBuilder.length() && !(shorterWordBuilder.compareTo(longerWordBuilder) == 0)) {
                return false;
            }
            if (!(shorterWordBuilder.indexOf(longerWordBuilder.toString()) != -1 || longerWordBuilder.indexOf(shorterWordBuilder.toString()) != -1)) {
                return false;
            }
        }

        return shorterWordBuilder.compareTo(longerWordBuilder) == 0;
    }
}

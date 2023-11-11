package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CheckIfAStringIsAnAcronymOfWords {
    // TODO: 11.11.23 search space complexity
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        //faster way using for loop
        for (int index = 0; index < words.size(); index++) {
            if (words.get(index).charAt(0) != s.charAt(index)) {
                return false;
            }
        }
        return true;

//clean way using streams
//        long countMatchingLetters = IntStream.rangeClosed(0, words.size() - 1)
//                .takeWhile(index -> words.get(index).charAt(0) == s.charAt(index))
//                .count();
//        return countMatchingLetters == s.length();
    }
}

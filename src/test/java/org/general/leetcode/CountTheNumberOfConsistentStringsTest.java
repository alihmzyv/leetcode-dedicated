package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountTheNumberOfConsistentStringsTest {
    CountTheNumberOfConsistentStrings countTheNumberOfConsistentStrings = new CountTheNumberOfConsistentStrings();

    public static Stream<Arguments> getAllowedAndWordsAndExpectedResult() {
        return Stream.of(
                Arguments.of("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getAllowedAndWordsAndExpectedResult")
    void countConsistentStrings(String allowed, String[] words, int expectedResult) {
        int actualResult = countTheNumberOfConsistentStrings.countConsistentStrings(allowed, words);
        assertEquals(expectedResult, actualResult);
    }
}
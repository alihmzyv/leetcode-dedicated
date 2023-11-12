package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfTwoStringArraysAreEquivalentTest {
    CheckIfTwoStringArraysAreEquivalent checkIfTwoStringArraysAreEquivalent = new CheckIfTwoStringArraysAreEquivalent();

    public static Stream<Arguments> provideWordsAndExpectedResult() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true),
                Arguments.of(new String[]{"a", "cb"}, new String[]{"ab", "c"}, false),
                Arguments.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true),
                Arguments.of(new String[]{"fvnzyxfmvtsezl"}, new String[]{"f", "v", "nzyx", "fmvt", "sez", "l"}, true),
                Arguments.of(new String[]{"wxgdwznoledlfeoilewsjziotnncyebhwpdnnimcorzovuiig", "lycfb"}, new String[]{"wxgdwznoledlfeoilewsjzio","tnncyebhwpdnnimcor","iigl","yc","f","b","hnjm"}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideWordsAndExpectedResult")
    void arrayStringsAreEqual(String[] word1, String[] word2, boolean expectedResult) {
        boolean actualResult = checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2);
        assertEquals(expectedResult, actualResult);
    }
}
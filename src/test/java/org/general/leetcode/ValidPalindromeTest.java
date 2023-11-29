package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    ValidPalindrome validPalindrome = new ValidPalindrome();

    public static Stream<Arguments> getStrAndExpectedResult() {
        return Stream.of(
                Arguments.of(".,", true),
                Arguments.of("A man, a plan, a canal: Panama", true)
        );
    }

    @ParameterizedTest
    @MethodSource("getStrAndExpectedResult")
    void isPalindrome(String str, boolean expectedResult) {
        boolean actualResult = validPalindrome.isPalindrome(str);
        assertEquals(actualResult, expectedResult);
    }
}
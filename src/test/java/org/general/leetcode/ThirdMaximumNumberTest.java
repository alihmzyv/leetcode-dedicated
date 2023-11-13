package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMaximumNumberTest {
    ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

    public static Stream<Arguments> provideNumsAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, -2147483648}, -2147483648)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumsAndExpectedResult")
    void thirdMax(int[] nums, int expectedResult) {
        int actualResult = thirdMaximumNumber.thirdMax(nums);
        assertEquals(expectedResult, actualResult);
    }
}
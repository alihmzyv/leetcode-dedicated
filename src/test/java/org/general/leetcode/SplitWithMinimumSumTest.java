package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SplitWithMinimumSumTest {
    SplitWithMinimumSum splitWithMinimumSum = new SplitWithMinimumSum();

    public static Stream<Arguments> provideNumAndExpectedResult() {
        return Stream.of(
                Arguments.of(4325, 59),
                Arguments.of(687, 75),
                Arguments.of(10, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumAndExpectedResult")
    void splitNum(int num, int expectedResult) {
        int actualResult = splitWithMinimumSum.splitNum(num);
        assertEquals(expectedResult, actualResult);
    }
}
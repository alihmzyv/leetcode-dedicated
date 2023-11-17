package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeSumOfArrayAfterKNegationsTest {
    MaximizeSumOfArrayAfterKNegations maximizeSumOfArrayAfterKNegations = new MaximizeSumOfArrayAfterKNegations();

    public static Stream<Arguments> provideNumsAndKeyAndExpectedResult() {
        return Stream.of(/*Arguments.of(new int[]{4, 2, 3}, 1, 5),
                Arguments.of(new int[]{3, -1, 0, 2}, 3, 6),
                Arguments.of(new int[]{2, -3, -1, 5, -4}, 2, 13),
                Arguments.of(new int[]{4, 2, 3}, 1, 5),
                Arguments.of(new int[]{-4, -6, 9, -2, 2}, 4, 19),
                Arguments.of(new int[]{-8, 3, -5, -3, -5, -2}, 6, 22),*/
                Arguments.of(new int[]{-4, -2, -3}, 4, 5));
    }

    @ParameterizedTest
    @MethodSource("provideNumsAndKeyAndExpectedResult")
    void largestSumAfterKNegations(int[] nums, int k, int expectedResult) {
        int actualResult = maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(nums, k);
        assertEquals(expectedResult, actualResult);
    }
}
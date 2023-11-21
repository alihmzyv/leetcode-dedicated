package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestNumberToZeroTest {
    FindClosestNumberToZero findClosestNumberToZero = new FindClosestNumberToZero();

    public static Stream<Arguments> getNumsAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{-4, -2, 1, 4, 8}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getNumsAndExpectedResult")
    void findClosestNumber(int[] nums, int expectedResult) {
        int actualResult = findClosestNumberToZero.findClosestNumber(nums);
        assertEquals(expectedResult, actualResult);
    }
}
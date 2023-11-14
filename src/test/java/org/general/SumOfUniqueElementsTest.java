package org.general;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfUniqueElementsTest {
    SumOfUniqueElements sumOfUniqueElements = new SumOfUniqueElements();

    public static Stream<Arguments> provideNumsAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 2}, 4),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumsAndExpectedResult")
    void sumOfUnique(int[] nums, int expectedResult) {
        int actualResult = sumOfUniqueElements.sumOfUnique(nums);
        assertEquals(expectedResult, actualResult);
    }
}
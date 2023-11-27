package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ElementAppearingMoreThan25InSortedArrayTest {
    ElementAppearingMoreThan25InSortedArray elementAppearingMoreThan25InSortedArray = new ElementAppearingMoreThan25InSortedArray();

    public static Stream<Arguments> getArrAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getArrAndExpectedResult")
    void findSpecialInteger(int[] arr, int expectedResult) {
        int actualResult = elementAppearingMoreThan25InSortedArray.findSpecialInteger(arr);
        assertEquals(expectedResult, actualResult);
    }
}
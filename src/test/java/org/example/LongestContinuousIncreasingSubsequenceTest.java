package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestContinuousIncreasingSubsequenceTest {
    LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequenceTest = new LongestContinuousIncreasingSubsequence();

    @ParameterizedTest
    @MethodSource("provideNumsAndExpectedLength")
    void givenNumsThenMaxIncreasingSubsequenceLengthShouldBe(int[] nums, int expectedMaxIncreasingSubsequenceLength) {
        int actual = longestContinuousIncreasingSubsequenceTest.findLengthOfLCIS(nums);
        assertEquals(expectedMaxIncreasingSubsequenceLength, actual);
    }

    public static Stream<Arguments> provideNumsAndExpectedLength() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 4, 7}, 3)
        );
    }
}
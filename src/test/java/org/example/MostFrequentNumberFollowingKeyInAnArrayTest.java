package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MostFrequentNumberFollowingKeyInAnArrayTest {
    MostFrequentNumberFollowingKeyInAnArray mostFrequentNumberFollowingKeyInAnArray = new MostFrequentNumberFollowingKeyInAnArray();

    @ParameterizedTest
    @MethodSource("provideNumsAndKeyAndExpectedTarget")
    void givenNumsAndKeysThenMostFrequentTargetFollowingKeyShouldBe(int[] nums, int key, int expectedTarget) {
        int actual = mostFrequentNumberFollowingKeyInAnArray.mostFrequent(nums, key);
        assertEquals(expectedTarget, actual);
    }

    static Stream<Arguments> provideNumsAndKeyAndExpectedTarget() {
        return Stream.of(
                Arguments.of(new int[]{1, 100, 200, 1, 100}, 1, 100),
                Arguments.of(new int[]{2, 2, 2, 2, 3}, 2, 2),
                Arguments.of(new int[]{1, 1000, 2}, 1000, 2)
        );
    }
}
package org.general;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SlowestKeyTest {
    SlowestKey slowestKey = new SlowestKey();

    public static Stream<Arguments> provideReleaseTimesAndKeysPressedAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{9, 29, 49, 50}, "cbcd", "c")
        );
    }

    @ParameterizedTest
    @MethodSource("provideReleaseTimesAndKeysPressedAndExpectedResult")
    void slowestKey(int[] releaseTimes, String keysPressed, char expectedResult) {
        char actualResult = slowestKey.slowestKey(releaseTimes, keysPressed);
        assertEquals(expectedResult, actualResult);
    }
}
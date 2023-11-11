package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    @ParameterizedTest
    @MethodSource("provideRangesAndPickedNumbers")
    void givenRangeAndPickedNumberThenAnswerShouldBe(int range, int pickedNum) {
        GuessNumberHigherOrLower guessNumberHigherOrLower = new GuessNumberHigherOrLower(pickedNum);
        int actual = guessNumberHigherOrLower.guessNumber(range);
        assertEquals(pickedNum, actual);
    }

    public static Stream<Arguments> provideRangesAndPickedNumbers() {
        return Stream.of(
                Arguments.of(10, 6),
                Arguments.of(2, 2),
                Arguments.of(2126753390, 1702766719)
        );
    }
}
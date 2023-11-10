package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    @Test
    void guessNumber() {
        GuessNumberHigherOrLower guessNumberHigherOrLower = new GuessNumberHigherOrLower(6);
        int expected = 6;
        int actual = guessNumberHigherOrLower.guessNumber(10);
        assertEquals(expected, actual);
    }

    @Test
    void guessNumberTest2() {
        GuessNumberHigherOrLower guessNumberHigherOrLower = new GuessNumberHigherOrLower(2);
        int expected = 2;
        int actual = guessNumberHigherOrLower.guessNumber(2);
        assertEquals(expected, actual);
    }

    @Test
    void guessNumberTest3() {
        GuessNumberHigherOrLower guessNumberHigherOrLower = new GuessNumberHigherOrLower(1702766719);
        int expected = 1702766719;
        int actual = guessNumberHigherOrLower.guessNumber(2126753390);
        assertEquals(expected, actual);
    }
}
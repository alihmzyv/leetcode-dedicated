package org.general.leetcode;

public class GuessNumberHigherOrLower {
    // TODO: 10.11.23 what is problem with space?
    private final int pickedNum;

    public GuessNumberHigherOrLower(int pickedNum) {
        this.pickedNum = pickedNum;
    }

    public int guessNumber(int n) {
        long lowerBoundary = 1;
        long upperBoundary = n;

        do {
            long guessedNum = (lowerBoundary + upperBoundary) / 2;
            int guessResult = guess((int) guessedNum);
            if (guessResult == -1) {
                upperBoundary = (guessedNum - 1);
            } else if (guessResult == 1) {
                lowerBoundary = (guessedNum + 1);
            } else {
                return (int) guessedNum;
            }
        } while (true);
    }

    public int guessNumberRecursive(int n) {
        return guessNumberBetweenBounds(1, n);
    }

    public int guessNumberBetweenBounds(int lowerBoundary, int upperBoundary) {
        long guessedNum = (lowerBoundary + upperBoundary) / 2;
        int guessResult = guess((int) guessedNum);
        if (guessResult == -1) {
            return guessNumberBetweenBounds(lowerBoundary, ++upperBoundary);
        } else if (guessResult == 1) {
            return guessNumberBetweenBounds(++lowerBoundary, upperBoundary);
        } else {
            return (int) guessedNum;
        }
    }

    private int guess(int num) {
        return Integer.compare(pickedNum, num);
    }
}

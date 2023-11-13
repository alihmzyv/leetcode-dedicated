package org.general;

import java.util.*;

public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        //can use map to avoid iterating array twice
        int[] durations = getDurations(releaseTimes);
        int maxDuration = Arrays.stream(durations)
                .max()
                .orElse(Integer.MAX_VALUE);
        return getLargestKeyWithMaxDuration(durations, keysPressed, maxDuration);
    }

    private int[] getDurations(int[] releaseTimes) {
        int numOfKeysPressed = releaseTimes.length;
        int[] durations = new int[numOfKeysPressed];
        for (int index = 0; index < numOfKeysPressed; index++) {
            int duration;
            if (index == 0) {
                duration = releaseTimes[0];
            } else {
                duration = releaseTimes[index] - releaseTimes[index - 1];
            }
            durations[index] = duration;
        }
        return durations;
    }

    private char getLargestKeyWithMaxDuration(int[] durations, String keysPressed, int maxDuration) {
        char largestKeyWithMaxDuration = Character.MIN_VALUE;
        int numOfKeysPressed = durations.length;
        for (int index = 0; index < numOfKeysPressed; index++) {
            if (durations[index] == maxDuration) {
                char key = keysPressed.charAt(index);
                if (key > largestKeyWithMaxDuration) {
                    largestKeyWithMaxDuration = key;
                }
            }
        }
        return largestKeyWithMaxDuration;
    }
}

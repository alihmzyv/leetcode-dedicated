package org.general.leetcode;

public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = Integer.MIN_VALUE;
        char largestKeyWithMaxDuration = Character.MIN_VALUE;

        int numOfKeysPressed = keysPressed.length();
        for (int index = 0; index < numOfKeysPressed; index++) {
            char key = keysPressed.charAt(index);
            int duration;
            if (index == 0) {
                duration = releaseTimes[index];
            } else {
                duration = releaseTimes[index] - releaseTimes[index - 1];
            }
            if (duration > maxDuration) {
                maxDuration = duration;
                largestKeyWithMaxDuration = key;
            } else if (duration == maxDuration) {
                if (key > largestKeyWithMaxDuration) {
                    largestKeyWithMaxDuration = key;
                }
            }
        }
        return largestKeyWithMaxDuration;
    }
}

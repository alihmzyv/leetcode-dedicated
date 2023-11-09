package org.example;

public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        //using Sieve of Eratosthenes method
        int leastDifferenceBetweenLengthAndWidth = area - 1;
        int[] dimensions = {area, 1};

        double sqrtOfNum = Math.sqrt(area);
        for (int i = 2; i <= sqrtOfNum; i++) {
            int multiplier = i;
            int factorOfI = i * multiplier;

            while (factorOfI <= area) {
                if (factorOfI == area && multiplier - i < leastDifferenceBetweenLengthAndWidth) {
                    leastDifferenceBetweenLengthAndWidth = multiplier - i;
                    dimensions[0] = multiplier;
                    dimensions[1] = i;
                }
                multiplier++;
                factorOfI = i * multiplier;
            }
        }

        return dimensions;
    }
}

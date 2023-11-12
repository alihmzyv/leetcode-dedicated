package org.general.leetcode;

import org.general.leetcode.extra.DoubleUtil;

public class ConstructTheRectangle {
    // TODO: 09.11.23 research on the most efficient solutions for this problem.
    public int[] constructRectangle(int area) {
        int length = 0;
        int width = 0;
        double sqrtOfArea = Math.sqrt(area);

        if (DoubleUtil.isInteger(sqrtOfArea)) {
            length = (int) sqrtOfArea;
            width = (int) sqrtOfArea;
        } else {
            int downNearestSqrtOfArea = (int) Math.floor(sqrtOfArea);
            int starting;
            int step;

            if (area % 2 == 0) {
                starting = downNearestSqrtOfArea;
                step = 1;
            } else {
                starting = downNearestSqrtOfArea % 2 != 0 ? downNearestSqrtOfArea : downNearestSqrtOfArea - 1;
                step = 2;
            }

            for (int i = starting; i >= 1; i -= step) {
                if (area % i == 0) {
                    width = i;
                    length = area / i;
                    break;
                }
            }
        }

        return new int[]{length, width};
    }
}

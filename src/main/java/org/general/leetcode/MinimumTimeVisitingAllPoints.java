package org.general.leetcode;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int index = 0; index < points.length - 1; index++) {
            int[] point1 = points[index];
            int[] point2 = points[index + 1];
            int deltaXAbs = Math.abs(point1[0] - point2[0]);
            int deltaYAbs = Math.abs(point2[1] - point1[1]);
            if (deltaXAbs == 0) {
                time += deltaYAbs;
            } else if (deltaYAbs == 0) {
                time += deltaXAbs;
            } else if (deltaXAbs == deltaYAbs) {
                time += deltaXAbs;
            } else {
                time += Math.max(deltaXAbs, deltaYAbs);
            }
        }
        return time;
    }


}

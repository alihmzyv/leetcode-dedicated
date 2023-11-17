package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeVisitingAllPointsTest {
    MinimumTimeVisitingAllPoints minimumTimeVisitingAllPoints = new MinimumTimeVisitingAllPoints();

    public static Stream<Arguments> providePointsAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[][]{new int[]{1, 1}, new int[]{3, 4}, new int[]{-1, 0}}, 7),
                Arguments.of(new int[][]{new int[]{3, 2}, new int[]{-2, 2}}, 5),
                        Arguments.of(new int[][] {
                                new int[] {559, 511},
                                new int[] {932, 618},
                                new int[] {-623, -443},
                                new int[] {431, 91},
                                new int[] {838, -127},
                                new int[] {773, -917},
                                new int[] {-500, -910},
                                new int[] {830, -417},
                                new int[] {-870, 73},
                                new int[] {-864, -600},
                                new int[] {450, 535},
                                new int[] {-479, -370},
                                new int[] {856, 573},
                                new int[] {-549, 369},
                                new int[] {529, -462},
                                new int[] {-839, -856},
                                new int[] {-515, -447},
                                new int[] {652, 197},
                                new int[] {-83, 345},
                                new int[] {-69, 423},
                                new int[] {310, -737},
                                new int[] {78, -201},
                                new int[] {443, 958},
                                new int[] {-311, 988},
                                new int[] {-477, 30},
                                new int[] {-376, -153},
                                new int[] {-272, 451},
                                new int[] {322, -125},
                                new int[] {-114, -214},
                                new int[] {495, 33},
                                new int[] {371, -533},
                                new int[] {-393, -224},
                                new int[] {-405, -633},
                                new int[] {-693, 297},
                                new int[] {504, 210},
                                new int[] {-427, -231},
                                new int[] {315, 27},
                                new int[] {991, 322},
                                new int[] {811, -746},
                                new int[] {252, 373},
                                new int[] {-737, -867},
                                new int[] {-137, 130},
                                new int[] {507, 380},
                                new int[] {100, -638},
                                new int[] {-296, 700},
                                new int[] {341, 671},
                                new int[] {-944, 982},
                                new int[] {937, -440},
                                new int[] {40, -929},
                                new int[] {-334, 60},
                                new int[] {-722, -92},
                                new int[] {-35, -852},
                                new int[] {25, -495},
                                new int[] {185, 671},
                                new int[] {149, -452}
                        }, 49088)
        );
    }

    @ParameterizedTest
    @MethodSource("providePointsAndExpectedResult")
    void minTimeToVisitAllPoints(int[][] points, int expectedResult) {
        int actualResult = minimumTimeVisitingAllPoints.minTimeToVisitAllPoints(points);
        assertEquals(expectedResult, actualResult);
    }
}
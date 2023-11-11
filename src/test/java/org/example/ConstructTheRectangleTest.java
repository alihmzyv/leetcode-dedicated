package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConstructTheRectangleTest {
    ConstructTheRectangle constructTheRectangle = new ConstructTheRectangle();

    @ParameterizedTest
    @MethodSource("provideAreasAndExpectedDimensions")
    void givenAreaThenDimensionsShouldBe(int area, int[] expectedDimensions) {
        int[] actualDimensions = constructTheRectangle.constructRectangle(area);
        assertArrayEquals(expectedDimensions, actualDimensions);
    }

    static Stream<Arguments> provideAreasAndExpectedDimensions() {
        return Stream.of(
                Arguments.of(4, new int[]{2, 2}),
                Arguments.of(37, new int[]{37, 1}),
                Arguments.of(122122, new int[]{427, 286})
        );
    }
}
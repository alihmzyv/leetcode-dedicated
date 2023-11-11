package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductOfTwoElementsInAnArrayTest {
    MaximumProductOfTwoElementsInAnArray maximumProductOfTwoElementsInAnArray = new MaximumProductOfTwoElementsInAnArray();

    @ParameterizedTest
    @MethodSource("provideNumsAndExpectedMaxProduct")
    void givenNumsThenMaxProductShouldBe(int[] nums, int expectedMaxProduct) {
        int actual = maximumProductOfTwoElementsInAnArray.maxProduct(nums);
        assertEquals(expectedMaxProduct, actual);
    }

    static Stream<Arguments> provideNumsAndExpectedMaxProduct() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 2}, 12)
        );
    }
}
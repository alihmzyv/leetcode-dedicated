package org.general.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    public static Stream<Arguments> getPricesAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 6, 5, 0, 3}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getPricesAndExpectedResult")
    void maxProfit(int[] prices, int expectedResult) {
        int actualResult = bestTimeToBuyAndSellStock.maxProfit(prices);
        assertEquals(expectedResult, actualResult);
    }
}
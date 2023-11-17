package org.general.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DestinationCityTest {
    DestinationCity destinationCity = new DestinationCity();

    public static Stream<Arguments> providePathsAndExpectedResult() {
        return Stream.of(
                Arguments.of(List.of(List.of("B","C"), List.of("D","B"), List.of("C","A")), "A")
////                Arguments.of(List.of(List.of("London", "New York"), List.of("New York", "Lima"), List.of("Lima", "Sao Paulo")), "Sao Paulo"),
//                Arguments.of(List.of(List.of("jMgaf WaWA", "iinynVdmBz"), List.of(" QCrEFBcAw", "wRPRHznLWS"), List.of("iinynVdmBz", "OoLjlLFzjz"), List.of("OoLjlLFzjz", " QCrEFBcAw"), List.of("IhxjNbDeXk", "jMgaf WaWA"), List.of("jmuAYy vgz", "IhxjNbDeXk")), "wRPRHznLWS")
        );
    }

    @ParameterizedTest
    @MethodSource("providePathsAndExpectedResult")
    void destCity(List<List<String>> paths, String expectedResult) {
        String actualResult = destinationCity.destCity(paths);
        assertEquals(expectedResult, actualResult);
    }
}
package org.general.leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> citiesThatCannotBeDestination = new HashSet<>();
        Set<String> citiesThatCanBeDestination = new HashSet<>();
        for (List<String> path : paths) {
            String fromCity = path.get(0);
            String toCity = path.get(1);
            citiesThatCannotBeDestination.add(fromCity);
            citiesThatCanBeDestination.remove(fromCity);
            if (!citiesThatCannotBeDestination.contains(toCity)) {
                citiesThatCanBeDestination.add(toCity);
            }
        }
        return citiesThatCanBeDestination.iterator().next();
    }
}
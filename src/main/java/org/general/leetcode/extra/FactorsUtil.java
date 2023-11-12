package org.general.leetcode.extra;

import java.util.HashSet;
import java.util.Set;

public class FactorsUtil {
    /**
     *
     * @param num - the number whose all factors to be found
     * @return - set of factors of num
     * time complexity - O(sqrt(n))
     */
    public static Set<Integer> getAllFactors(int num) {
        HashSet<Integer> factors = new HashSet<>(num);
        int step = num % 2 == 0 ? 1 : 2;
        for (int i = 1; i <= Math.sqrt(num); i += step) {
            if (num % i == 0) {
                factors.add(i);
                factors.add(num / i);
            }
        }

        return factors;
    }
}

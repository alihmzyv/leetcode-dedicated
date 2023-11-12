package org.general.leetcode.extra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumberUtil {
    /**
     * @param num - number to find the prime numbers till, inclusive
     * @return - the list containing all the prime numbers until num, including num itself
     * Based on Sieve of Eratosthenes algorithm
     */
    public static List<Integer> findPrimeNumbersUntil(int num) {
        boolean[] bool = getArray(num);
        return IntStream.rangeClosed(2, num)
                .boxed()
                .filter(index -> bool[index])
                .toList();
    }

    public static boolean isPrime(int num) {
        boolean[] bool = getArray(num);
        return bool[num];
    }

    private static boolean[] getArray(int num) {
        boolean[] bool = new boolean[num + 1];
        Arrays.fill(bool, true);

        double sqrtOfNum = Math.sqrt(num);
        for (int i = 2; i <= sqrtOfNum; i++) {
            if (bool[i]) {
                for (int j = i * i; j <= num; j = j + i) {
                    bool[j] = false;
                }
            }
        }
        return bool;
    }
}

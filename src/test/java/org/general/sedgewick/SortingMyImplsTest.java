package org.general.sedgewick;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingMyImplsTest {

    @Test
    void selectionSortTest() {
        int[] arr = {0, -1, 2, 1, 0, 3, -5, 6, 1, -1, 11, 0};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        SortingMyImpls.selectionSort(arr);
        System.out.println("Arr: " + Arrays.toString(arr));
        System.out.println("Arr copy: " + Arrays.toString(arrCopy));
        assertArrayEquals(arrCopy, arr);
    }

    @Test
    void insertionSortTest() {
        int[] arr = {0, -1, 2, 1, 0, 3, -5, 6, 1, -1, 11, 0};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        SortingMyImpls.insertionSort(arr);
        System.out.println("Arr: " + Arrays.toString(arr));
        System.out.println("Arr copy: " + Arrays.toString(arrCopy));
        assertArrayEquals(arrCopy, arr);
    }

    @Test
    void mergeSortTest() {
        int[] arr = {0, -1, 2, 3};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        SortingMyImpls.mergeSort(arr);
        System.out.println("Arr sorted: " + Arrays.toString(arr));
        System.out.println("Arr copy: " + Arrays.toString(arrCopy));
        assertArrayEquals(arrCopy, arr);
    }

    @Test
    void quickSortTest() {
        int[] arr = {0, -1, 2, 1, 0, 3, -5, 6, 1, -1};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        SortingMyImpls.quickSort(arr);
        System.out.println("Actual: " + Arrays.toString(arr));
        System.out.println("Expected: " + Arrays.toString(arrCopy));
        assertArrayEquals(arrCopy, arr);
    }
}
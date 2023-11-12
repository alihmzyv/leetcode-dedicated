package org.general.sedgewick;

import java.util.Arrays;

public class SortingMyImpls {
    public static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int index = 0; index < length; index++) {
            int minIndex = index;
            for (int indexInner = index + 1; indexInner < length; indexInner++) {
                int num = arr[indexInner];
                if (num < arr[minIndex]) {
                    minIndex = indexInner;
                }
            }
            exch(minIndex, index, arr);
        }
    }

    public static void insertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                exch(j, j - 1, arr);
            }
        }
    }

    private static void exch(int i, int j, int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void mergeSort(int[] arr) {
        int[] aux = Arrays.copyOf(arr, arr.length);
        sort(arr, aux, 0, arr.length - 1);
    }


    private static void sort(int[] arr, int[] aux, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        sort(arr, aux, low, mid);
        sort(arr, aux, mid + 1, high);
        if (arr[mid] > arr[mid + 1]) {
            merge(arr, aux, low, mid, high);
        }
    }

    private static void merge(int[] arr, int[] aux, int low, int mid, int high) {
        int leftPointer = low;
        int rightPointer = mid + 1;
        for (int mergePointer = low; mergePointer <= high; mergePointer++) {
            if (leftPointer > mid) arr[mergePointer] = aux[rightPointer++];
            else if (rightPointer > high) arr[mergePointer] = aux[leftPointer++];
            else if (arr[rightPointer] < arr[leftPointer]) arr[mergePointer] = aux[rightPointer++];
            else arr[mergePointer] = arr[leftPointer++];
        }
    }
}

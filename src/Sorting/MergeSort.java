package Sorting;

import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 2, 5, 1, 8, 9, 11, 12, 18 };
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        
        // it may be possible that there are some elements remaining in either of the
        // arrays
        // add all the remaining elements in the array
        // only one of the below loops will be true and run
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
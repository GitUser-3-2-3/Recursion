package Sorting;

import java.util.Arrays;

/**
 * InPlaceMergeSort
 */
public class InPlaceMergeSort {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 5, 4, 3, 2, 1 };
        inPlaceMergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void inPlaceMergeSort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = s + (e - s) / 2;

        inPlaceMergeSort(arr, s, mid);
        inPlaceMergeSort(arr, mid, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that there are some elements remaining in either of the
        // arrays
        // add all the remaining elements in the array
        // only one of the below loops will be true and run
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
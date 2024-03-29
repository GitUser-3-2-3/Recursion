package Sorting;

import java.util.Arrays;

/**
 * SelectionSort
 */
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 4, 1, 5, 2, 3 };
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

        System.out.println();
    }

    private static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }
}
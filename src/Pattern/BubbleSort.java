package Pattern;

import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 4, 1, 5, 2, 3 };
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

        System.out.println();
    }

    static void bubble(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            if (arr[j] > arr[j + 1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubble(arr, i, j + 1);
        } else {
            bubble(arr, i - 1, 0);
        }
    }
}
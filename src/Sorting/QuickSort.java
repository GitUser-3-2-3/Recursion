package Sorting;

import java.util.Arrays;

/**
 * QuickSort
 */
public class QuickSort {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 5, 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            // also a reason why if its already sorted it will not swap
            while (nums[start] < pivot) {
                start++;
            }
            while (pivot < nums[end]) {
                end--;
            }

            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index now sort the two halves now
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }
}
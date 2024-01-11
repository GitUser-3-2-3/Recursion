package Arrays;

import java.util.ArrayList;
import java.util.List;

/** * LinearSearch */
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 2, 4, 32, 111, 4, 123, 999 };
        System.out.println(findAllIndex2(arr, 4, 0));
        System.out.println();
    }

    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }

    static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return searchIndex(arr, target, index + 1);
    }

    static List<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    // the better approach
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    // not the most optimized approach but questions might use this approach
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        // this will contain ans for that function call only
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}

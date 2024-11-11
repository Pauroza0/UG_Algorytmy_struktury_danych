package algorithms.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class InsertionSort {
    public static void sort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    public static void sort(int[] arr) {
        int arrSize = arr.length;
        for (int i = 1; i < arrSize; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

package algorithms.sorting;

import java.util.List;

public class SelectionSort {
    public static void sort(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            int indexOfMin = i;

            for (int j = i + 1; j < size; j++) {
                if (list.get(j) < list.get(indexOfMin)) {
                    indexOfMin = j;
                }
            }
            int temp = list.get(indexOfMin);
            list.set(indexOfMin, list.get(i));
            list.set(i, temp);
        }
    }

    public static void sort(int[] arr) {
        int arrSize = arr.length;
        for (int i = 0; i < arrSize - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < arrSize; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
    }
}

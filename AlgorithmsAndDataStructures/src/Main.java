import algorithms.heap.HeapSort;
import algorithms.heap.MaxHeap;
import algorithms.heap.MinHeap;
import algorithms.sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 1, 3, 5, 6, 4};
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

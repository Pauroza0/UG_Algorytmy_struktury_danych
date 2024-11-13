package algorithms.heap;

public class HeapSort {
    public static void sort(int[] arr) {
        int size = arr.length;
        MaxHeap maxHeap = new MaxHeap(arr);
        for (int i = size - 1; i > 0; i--) {
            maxHeap.swap(0, i);
            maxHeap.numberOfElements -= 1;
            maxHeap.heapify(0);
        }
    }
}

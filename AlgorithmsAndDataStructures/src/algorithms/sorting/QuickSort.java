package algorithms.sorting;

public class QuickSort {
    public static void sort(int[] arr,int beginIndex,int endIndex){
        if(beginIndex < endIndex){
            int pivotIndex = partition(arr, beginIndex ,endIndex);
            sort(arr, beginIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
        }
    }

    private static int partition(int[] arr, int beginIndex, int endIndex) {
        int pivot = arr[endIndex];
        int indexofSmaller = beginIndex;
        for(int i = beginIndex; i < endIndex; i++){
            if(arr[i] <= pivot){
                swap(arr, i, indexofSmaller);
                indexofSmaller++;
            }
        }
        swap(arr, indexofSmaller, endIndex);
        return indexofSmaller;
    }
    private static void swap(int[] arr, int indexOne, int indexTwo){
        int temp =  arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
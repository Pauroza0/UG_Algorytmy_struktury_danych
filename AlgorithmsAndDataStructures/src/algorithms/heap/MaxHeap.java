package algorithms.heap;

public class MaxHeap extends Heap{
    public MaxHeap(int size) {
        super(size);
    }
    public MaxHeap(int[] arr){
        super(arr.length);
        this.numberOfElements = arr.length;
        this.heap = buildHeap(arr);
    }

    private void maxHeapify(int startIndex){
        int largest = startIndex;
        int leftChild = getLeftChildIndex(largest);
        int rightChild = getRightChildIndex(largest);

        if(leftChild < numberOfElements && heap[leftChild] > heap[largest]){
            largest = leftChild;
        }
        if(rightChild < numberOfElements && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }
        if(largest != startIndex){
            swap(startIndex, largest);
            maxHeapify(largest);
        }
    }
    private void heapifyUp(int index) {
        while(hasParent(index) && heap[index] > heap[getParentIndex(index)]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }
    private void heapifyDown(int index){
        while(hasLeftChild(index)) {
            int largerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] > heap[largerChildIndex]) {
                break;
            } else {
                swap(index, largerChildIndex);
            }
            index = largerChildIndex;
        }
    }
    public void insert(int value){
        ensureSize();
        heap[numberOfElements++] = value;
        heapifyUp(numberOfElements - 1);
    }
    public int poll(){
        int item = heap[0];
        swap(0, numberOfElements - 1);
        numberOfElements--;
        heapifyDown(0);
        return item;
    }
    private int[] buildHeap(int[] arr){
        for(int i = (numberOfElements - 2) / 2; i >= 0; i--){
            maxHeapify(i);
        }
        return arr;
    }
}
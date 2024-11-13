package algorithms.heap;

public class MinHeap extends Heap{
    public MinHeap(int size) {
        super(size);
    }
    public MinHeap(int[] arr){
        super(arr.length);
        this.numberOfElements = arr.length;
        buildHeap(arr);
    }

    @Override
    protected void heapifyUp(int index) {
        while(hasParent(index) && parent(index) > heap[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    @Override
    protected void heapifyDown(int index) {
        while(hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] < heap[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    @Override
    protected void heapify(int startIndex) {
        int smallest = startIndex;
        int leftChild = getLeftChildIndex(smallest);
        int rightChild = getRightChildIndex(smallest);

        if(leftChild < numberOfElements && heap[leftChild] < heap[smallest]){
            smallest = leftChild;
        }
        if(rightChild < numberOfElements && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }
        if(smallest != startIndex){
            swap(startIndex, smallest);
            heapify(smallest);
        }
    }

    @Override
    public void insert(int value) {
        ensureSize();
        heap[numberOfElements + 1] = value;
        numberOfElements++;
        heapifyUp(numberOfElements - 1);

    }

    @Override
    public int poll() {
        int value = heap[numberOfElements];
        swap(0, numberOfElements - 1);
        numberOfElements--;
        heapifyDown(0);
        return value;
    }

    @Override
    protected void buildHeap(int[] arr) {
        this.heap = arr;
        for(int i = (numberOfElements - 2) / 2; i >= 0; i--){
            heapify(i);
        }
    }
}

package algorithms.heap;

import java.util.Arrays;

public abstract class Heap {
    protected int[] heap;
    protected int size;
    protected int numberOfElements;

    public Heap(int size){
        this.size = size;
        this.heap = new int[size];
        this.numberOfElements = 0;
    }
    protected int getParentIndex(int index){ return (index - 1) / 2; }
    protected int getLeftChildIndex(int index){ return 2 * index + 1; }
    protected int getRightChildIndex(int index){ return 2 * index + 2; }

    protected boolean hasParent(int index) { return getParentIndex(index) >= 0; }
    protected boolean hasLeftChild(int index) { return getLeftChildIndex(index) < numberOfElements; }
    protected boolean hasRightChild(int index) { return getRightChildIndex(index) < numberOfElements; }

    protected int parent(int index) { return heap[getParentIndex(index)]; }
    protected int leftChild(int index) { return heap[getLeftChildIndex(index)]; }
    protected int rightChild(int index) { return heap[getRightChildIndex(index)]; }

    protected void ensureSize() {
        if (numberOfElements == size){
            heap = Arrays.copyOf(heap, size * 2);
            size *= 2;
        }
    }
    protected void swap(int indexOne, int indexTwo){
        int temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }
}
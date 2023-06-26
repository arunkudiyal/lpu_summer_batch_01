package com.company;

public class MaxHeap {
    private final int[] Heap;
    private final int maxSize;            // The total size of the Heap array.
    private int size;               // The total number of elements the Heap contains at a given moment.
    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        Heap = new int[maxSize];
        this.size = 0;
    }
    private int parent(int index) { return (index - 1) / 2; }
    private int left(int index) { return (2 * index) + 1; }
    private int right(int index) { return (2 * index) + 2; }
    private void swap(int f_pos, int s_pos) {
        int temp;
        temp = Heap[f_pos];
        Heap[f_pos] = Heap[s_pos];
        Heap[s_pos] = temp;
    }
    public boolean isLeaf(int pos) {
        if(pos > size/2 && pos <= size) return true;
        return false;
    }
    public int getMax() {
        return Heap[0];
    }
    public void insert(int element) {
        int pos = size;
        Heap[pos] = element;
        // Check for the heap property
        while(Heap[pos] > Heap[parent(pos)]) {
            swap(pos, parent(pos));
            pos = parent(pos);
        }
        ++size;
    }
    private void maxHeapify(int pos) {
        if(isLeaf(pos)) return;
        if(Heap[pos] < Heap[left(pos)] || Heap[pos] < Heap[right(pos)]) {
            if(Heap[left(pos)] > Heap[right(pos)]) {
                swap(pos, left(pos));
                maxHeapify(left(pos));
            } else {
                swap(pos, right(pos));
                maxHeapify(right(pos));
            }
        }
    }
    public int exactMax() {
        int deleted = Heap[0];
        Heap[0] = Heap[--size];
        // check and manage if the properties of the heap are satisfied
        maxHeapify(0);
        return deleted;
    }
    public void display() {
        // 7/2 = 3; i = 0, 1, 2
        for(int i=0; i < (size/2); i++) {
            System.out.print("Parent Element - " + Heap[i] + " | ");
            if(left(i) < size) { System.out.print("Left Child - " + Heap[left(i)] + " | " ); }
            if(right(i) < size) { System.out.print("Right Child - " + Heap[right(i)]); }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(50);
        heap.insert(10);
        heap.insert(15);
        heap.insert(20);
        heap.insert(25);
        heap.insert(30);
        heap.insert(35);
        System.out.println("Max element from heap is - " + heap.getMax());      // 35
        heap.display();
        heap.exactMax();
        heap.display();
        System.out.println("Max element from heap is - " + heap.getMax());      // 30
    }
}

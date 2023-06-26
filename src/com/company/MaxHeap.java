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
        heap.display();
    }
}

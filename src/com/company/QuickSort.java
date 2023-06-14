package com.company;

import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pi = start;
        for(int i=start; i < end; i++) {
            if(arr[i] <= pivot) {
                // swap(arr[i], arr[pi]
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        // swap(arr[end], arr[pi])
        int temp = arr[end];
        arr[end] = arr[pi];
        arr[pi] = temp;

        return pi;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            // pi indicates the index of the pivot element after the partition.
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi-1);
            quickSort(arr, pi+1, end);
        }
    }
    public static void printArray(int[] arr) {
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        // print the data before sorting
        printArray(arr);
        // sort using quick sort
        quickSort(arr, 0, n-1);
        // print the data after sorting
        printArray(arr);
    }
}

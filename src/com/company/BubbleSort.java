package com.company;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int n, int[] arr) {
        for(int i=0; i < n; i++) {
            for(int j=1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]) {
                    // swap(arr[j-1], arr[j])
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
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
        // print the elements before sorting
        printArray(arr);
        // sort the data using bubble sort
        bubbleSort(n, arr);
        // print the data after sorting
        printArray(arr);
    }
}

package com.company;

import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = (mid - start) + 1;
        int n2 = end - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copy the data from arr to L and R
        for(int i=0; i < n1; i++)
            L[i] = arr[start + i];
        for(int i=0; i < n2; i++)
            R[i] = arr[(mid+1) + i];
        // Merge the solutions
        int i=0; int j=0; int k=start;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) { arr[k] = L[i]; i++; k++; }
        while(j < n2) { arr[k] = R[j]; j++; k++; }
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            // I have the find the mid-value, and break the array into two parts which left (0 to mid) & right (mid+1 to n)
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
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
        // Print the array before sorting
        printArray(arr);
        mergeSort(arr, 0, n-1);
        printArray(arr);
    }
}

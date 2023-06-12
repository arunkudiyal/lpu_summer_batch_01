package com.company;

import java.util.Scanner;

public class BinarySearch {
    public static int binary_search_recursive(int n, int[] arr, int target, int start, int end) {
        if(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) return binary_search_recursive(n, arr, target, 0, mid-1);
            else return binary_search_recursive(n, arr, target, mid+1, end);
        }
        return -1;
    }

    public static int standard_binary_search(int n, int[] arr, int target) {
        return binary_search_recursive(n, arr, target, 0, n-1);
    }

    public static int binary_search(int n, int[] arr, int target) {
        int start = 0; int end = n-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid -1;
            else start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int index = standard_binary_search(n, arr, k);
        System.out.println(index);
    }
}

package com.company;

import java.util.Scanner;

public class SlidingWindow {
    public int maxSumSubArray(int[] arr, int k) {
        int maxSum = 0; int n = arr.length;
        for(int i=0; i < k; i++)
            maxSum += arr[i];
        int possibleAns = maxSum;
        for(int i=k; i < n; i++) {
            possibleAns += arr[i] - arr[i-k];
            maxSum = Integer.max(maxSum, possibleAns);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        SlidingWindow sw = new SlidingWindow();
        int maxSum = sw.maxSumSubArray(arr, k);
        System.out.println(maxSum);
    }
}

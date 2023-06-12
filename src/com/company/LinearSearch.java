package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static int standard_liner_search(int n, int[] arr, int target) {
        for(int i=0; i < n; i++) if(arr[i] == target) return i;
        return -1;
    }
    // Seraches for a value and print all the occurances of the target
    public static void linear_search(int n, int[] arr, int target) {
        // 3 4 7 9 4 4 13
        // i = 0 1 2 3 4 5 6
        // k = 4
        // The first occurance of the target is returned.
        // 1 4 5
        for(int i=0; i < n; i++) if(arr[i] == target) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   // cin >> n;
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();              // cin >> arr[i];
        int k = sc.nextInt();
        linear_search(n, arr, k);
        // System.out.println(index);              // cout << index;
    }
}

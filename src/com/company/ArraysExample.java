package com.company;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // I did not pass ant default vaues.
        for(int i=0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();                       // 0 0 0 0 0
    }
}
